package com.bbva.component.dm.naturalauth.domain.model;

import com.bbva.component.dm.headers.interceptor.AccessToken;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ServiceType.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u000e\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/bbva/component/dm/naturalauth/domain/model/ServiceType;", "", "", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "type", "Lcom/bbva/component/dm/naturalauth/domain/model/Version;", "b", "Lcom/bbva/component/dm/naturalauth/domain/model/Version;", "getVersion", "()Lcom/bbva/component/dm/naturalauth/domain/model/Version;", "version", "AsoServiceType", "JwtServiceType", "Lcom/bbva/component/dm/naturalauth/domain/model/ServiceType$AsoServiceType;", "Lcom/bbva/component/dm/naturalauth/domain/model/ServiceType$JwtServiceType;", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
public abstract class ServiceType {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Version version;

    /* JADX INFO: compiled from: ServiceType.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/bbva/component/dm/naturalauth/domain/model/ServiceType$AsoServiceType;", "Lcom/bbva/component/dm/naturalauth/domain/model/ServiceType;", "", "component1", "Lcom/bbva/component/dm/naturalauth/domain/model/Version;", "component2", "type", "version", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "c", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "d", "Lcom/bbva/component/dm/naturalauth/domain/model/Version;", "getVersion", "()Lcom/bbva/component/dm/naturalauth/domain/model/Version;", "<init>", "(Ljava/lang/String;Lcom/bbva/component/dm/naturalauth/domain/model/Version;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class AsoServiceType extends ServiceType {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String type;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Version version;

        public /* synthetic */ AsoServiceType(String str, Version version, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "aso" : str, version);
        }

        public static /* synthetic */ AsoServiceType copy$default(AsoServiceType asoServiceType, String str, Version version, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = asoServiceType.type;
            }
            if ((i10 & 2) != 0) {
                version = asoServiceType.version;
            }
            return asoServiceType.copy(str, version);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Version getVersion() {
            return this.version;
        }

        @NotNull
        public final AsoServiceType copy(@NotNull String type, @NotNull Version version) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(version, "version");
            return new AsoServiceType(type, version);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AsoServiceType)) {
                return false;
            }
            AsoServiceType asoServiceType = (AsoServiceType) other;
            return Intrinsics.areEqual(this.type, asoServiceType.type) && Intrinsics.areEqual(this.version, asoServiceType.version);
        }

        @Override // com.bbva.component.dm.naturalauth.domain.model.ServiceType
        @NotNull
        public String getType() {
            return this.type;
        }

        @Override // com.bbva.component.dm.naturalauth.domain.model.ServiceType
        @NotNull
        public Version getVersion() {
            return this.version;
        }

        public int hashCode() {
            return this.version.hashCode() + (this.type.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "AsoServiceType(type=" + this.type + ", version=" + this.version + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AsoServiceType(@NotNull String type, @NotNull Version version) {
            super(type, version, null);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(version, "version");
            this.type = type;
            this.version = version;
        }
    }

    /* JADX INFO: compiled from: ServiceType.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/bbva/component/dm/naturalauth/domain/model/ServiceType$JwtServiceType;", "Lcom/bbva/component/dm/naturalauth/domain/model/ServiceType;", "", "component1", "Lcom/bbva/component/dm/naturalauth/domain/model/Version;", "component2", "type", "version", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "c", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "d", "Lcom/bbva/component/dm/naturalauth/domain/model/Version;", "getVersion", "()Lcom/bbva/component/dm/naturalauth/domain/model/Version;", "<init>", "(Ljava/lang/String;Lcom/bbva/component/dm/naturalauth/domain/model/Version;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class JwtServiceType extends ServiceType {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String type;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Version version;

        public /* synthetic */ JwtServiceType(String str, Version version, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? AccessToken.TYPE_JWT : str, version);
        }

        public static /* synthetic */ JwtServiceType copy$default(JwtServiceType jwtServiceType, String str, Version version, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = jwtServiceType.type;
            }
            if ((i10 & 2) != 0) {
                version = jwtServiceType.version;
            }
            return jwtServiceType.copy(str, version);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Version getVersion() {
            return this.version;
        }

        @NotNull
        public final JwtServiceType copy(@NotNull String type, @NotNull Version version) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(version, "version");
            return new JwtServiceType(type, version);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof JwtServiceType)) {
                return false;
            }
            JwtServiceType jwtServiceType = (JwtServiceType) other;
            return Intrinsics.areEqual(this.type, jwtServiceType.type) && Intrinsics.areEqual(this.version, jwtServiceType.version);
        }

        @Override // com.bbva.component.dm.naturalauth.domain.model.ServiceType
        @NotNull
        public String getType() {
            return this.type;
        }

        @Override // com.bbva.component.dm.naturalauth.domain.model.ServiceType
        @NotNull
        public Version getVersion() {
            return this.version;
        }

        public int hashCode() {
            return this.version.hashCode() + (this.type.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "JwtServiceType(type=" + this.type + ", version=" + this.version + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JwtServiceType(@NotNull String type, @NotNull Version version) {
            super(type, version, null);
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(version, "version");
            this.type = type;
            this.version = version;
        }
    }

    public ServiceType(String str, Version version, DefaultConstructorMarker defaultConstructorMarker) {
        this.type = str;
        this.version = version;
    }

    @NotNull
    public String getType() {
        return this.type;
    }

    @NotNull
    public Version getVersion() {
        return this.version;
    }
}
