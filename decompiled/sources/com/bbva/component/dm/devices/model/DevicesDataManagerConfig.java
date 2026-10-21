package com.bbva.component.dm.devices.model;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DevicesDataManagerConfig.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0003)(*B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\"\u0010#B9\b\u0017\u0012\u0006\u0010$\u001a\u00020\u0013\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b\"\u0010'J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\fHÆ\u0001J\t\u0010\u0012\u001a\u00020\tHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006+"}, d2 = {"Lcom/bbva/component/dm/devices/model/DevicesDataManagerConfig;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "Lcom/bbva/component/dm/devices/model/DevicesDataManagerConfig$EngineType;", "component3", "host", "appId", "engineType", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getHost", "()Ljava/lang/String;", "b", "getAppId", "c", "Lcom/bbva/component/dm/devices/model/DevicesDataManagerConfig$EngineType;", "getEngineType", "()Lcom/bbva/component/dm/devices/model/DevicesDataManagerConfig$EngineType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/bbva/component/dm/devices/model/DevicesDataManagerConfig$EngineType;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/bbva/component/dm/devices/model/DevicesDataManagerConfig$EngineType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "EngineType", "component-dm-devices_release"}, k = 1, mv = {1, 6, 0})
@Serializable
public final /* data */ class DevicesDataManagerConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String host;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String appId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final EngineType engineType;

    /* JADX INFO: compiled from: DevicesDataManagerConfig.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/dm/devices/model/DevicesDataManagerConfig$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/dm/devices/model/DevicesDataManagerConfig;", "component-dm-devices_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<DevicesDataManagerConfig> serializer() {
            return DevicesDataManagerConfig$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: DevicesDataManagerConfig.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/component/dm/devices/model/DevicesDataManagerConfig$EngineType;", "", "DEFAULT", "HORIZON", "component-dm-devices_release"}, k = 1, mv = {1, 6, 0})
    public static final class EngineType {
        private static final /* synthetic */ EngineType[] $VALUES;
        public static final EngineType DEFAULT;
        public static final EngineType HORIZON;

        static {
            EngineType engineType = new EngineType("DEFAULT", 0);
            DEFAULT = engineType;
            EngineType engineType2 = new EngineType("HORIZON", 1);
            HORIZON = engineType2;
            $VALUES = new EngineType[]{engineType, engineType2};
        }

        public EngineType() {
            throw null;
        }

        public static EngineType valueOf(String str) {
            return (EngineType) Enum.valueOf(EngineType.class, str);
        }

        public static EngineType[] values() {
            return (EngineType[]) $VALUES.clone();
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ DevicesDataManagerConfig(int i10, String str, String str2, EngineType engineType, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i10 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 7, DevicesDataManagerConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.host = str;
        this.appId = str2;
        this.engineType = engineType;
    }

    public static /* synthetic */ DevicesDataManagerConfig copy$default(DevicesDataManagerConfig devicesDataManagerConfig, String str, String str2, EngineType engineType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = devicesDataManagerConfig.host;
        }
        if ((i10 & 2) != 0) {
            str2 = devicesDataManagerConfig.appId;
        }
        if ((i10 & 4) != 0) {
            engineType = devicesDataManagerConfig.engineType;
        }
        return devicesDataManagerConfig.copy(str, str2, engineType);
    }

    @JvmStatic
    public static final void write$Self(@NotNull DevicesDataManagerConfig self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.host);
        output.encodeStringElement(serialDesc, 1, self.appId);
        output.encodeSerializableElement(serialDesc, 2, new EnumSerializer("com.bbva.component.dm.devices.model.DevicesDataManagerConfig.EngineType", EngineType.values()), self.engineType);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EngineType getEngineType() {
        return this.engineType;
    }

    @NotNull
    public final DevicesDataManagerConfig copy(@NotNull String host, @NotNull String appId, @NotNull EngineType engineType) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(engineType, "engineType");
        return new DevicesDataManagerConfig(host, appId, engineType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DevicesDataManagerConfig)) {
            return false;
        }
        DevicesDataManagerConfig devicesDataManagerConfig = (DevicesDataManagerConfig) other;
        return Intrinsics.areEqual(this.host, devicesDataManagerConfig.host) && Intrinsics.areEqual(this.appId, devicesDataManagerConfig.appId) && this.engineType == devicesDataManagerConfig.engineType;
    }

    @NotNull
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    public final EngineType getEngineType() {
        return this.engineType;
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    public int hashCode() {
        return this.engineType.hashCode() + n1.c(this.appId, this.host.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        return "DevicesDataManagerConfig(host=" + this.host + ", appId=" + this.appId + ", engineType=" + this.engineType + RootService.CLOSE_BRACKET;
    }

    public DevicesDataManagerConfig(@NotNull String host, @NotNull String appId, @NotNull EngineType engineType) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(engineType, "engineType");
        this.host = host;
        this.appId = appId;
        this.engineType = engineType;
    }
}
