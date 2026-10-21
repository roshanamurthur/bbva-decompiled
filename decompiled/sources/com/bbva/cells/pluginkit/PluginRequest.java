package com.bbva.cells.pluginkit;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.model.constants.BanxicoConstants;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.Contextual;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PluginManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B+\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b!\u0010\"BE\b\u0017\u0012\u0006\u0010#\u001a\u00020\u000e\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b!\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J3\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e¨\u0006)"}, d2 = {"Lcom/bbva/cells/pluginkit/PluginRequest;", "", "", "component1", "component2", "component3", "Lkotlinx/serialization/json/JsonElement;", "component4", "id", "pluginId", "actionId", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getPluginId", "c", "getActionId", "d", "Lkotlinx/serialization/json/JsonElement;", "getPayload", "()Lkotlinx/serialization/json/JsonElement;", "getPayload$annotations", "()V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
@Serializable
public final /* data */ class PluginRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String pluginId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String actionId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final JsonElement payload;

    /* JADX INFO: compiled from: PluginManager.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/cells/pluginkit/PluginRequest$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/cells/pluginkit/PluginRequest;", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<PluginRequest> serializer() {
            return PluginRequest$$serializer.INSTANCE;
        }
    }

    public PluginRequest(@NotNull String id, @NotNull String pluginId, @NotNull String actionId, @Nullable JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(pluginId, "pluginId");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        this.id = id;
        this.pluginId = pluginId;
        this.actionId = actionId;
        this.payload = jsonElement;
    }

    public static /* synthetic */ PluginRequest copy$default(PluginRequest pluginRequest, String str, String str2, String str3, JsonElement jsonElement, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pluginRequest.id;
        }
        if ((i10 & 2) != 0) {
            str2 = pluginRequest.pluginId;
        }
        if ((i10 & 4) != 0) {
            str3 = pluginRequest.actionId;
        }
        if ((i10 & 8) != 0) {
            jsonElement = pluginRequest.payload;
        }
        return pluginRequest.copy(str, str2, str3, jsonElement);
    }

    @JvmStatic
    public static final void write$Self(@NotNull PluginRequest self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.pluginId);
        output.encodeStringElement(serialDesc, 2, self.actionId);
        JsonElement jsonElement = self.payload;
        if ((!Intrinsics.areEqual(jsonElement, (Object) null)) || output.shouldEncodeElementDefault(serialDesc, 3)) {
            output.encodeNullableSerializableElement(serialDesc, 3, new ContextualSerializer(Reflection.getOrCreateKotlinClass(JsonElement.class), BuiltinSerializersKt.getNullable(JsonElementSerializer.INSTANCE), new KSerializer[0]), jsonElement);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPluginId() {
        return this.pluginId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getActionId() {
        return this.actionId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final JsonElement getPayload() {
        return this.payload;
    }

    @NotNull
    public final PluginRequest copy(@NotNull String id, @NotNull String pluginId, @NotNull String actionId, @Nullable JsonElement payload) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(pluginId, "pluginId");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        return new PluginRequest(id, pluginId, actionId, payload);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PluginRequest)) {
            return false;
        }
        PluginRequest pluginRequest = (PluginRequest) other;
        return Intrinsics.areEqual(this.id, pluginRequest.id) && Intrinsics.areEqual(this.pluginId, pluginRequest.pluginId) && Intrinsics.areEqual(this.actionId, pluginRequest.actionId) && Intrinsics.areEqual(this.payload, pluginRequest.payload);
    }

    @NotNull
    public final String getActionId() {
        return this.actionId;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final JsonElement getPayload() {
        return this.payload;
    }

    @NotNull
    public final String getPluginId() {
        return this.pluginId;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.pluginId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.actionId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        JsonElement jsonElement = this.payload;
        return iHashCode3 + (jsonElement != null ? jsonElement.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PluginRequest(id=" + this.id + ", pluginId=" + this.pluginId + ", actionId=" + this.actionId + ", payload=" + this.payload + ")";
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PluginRequest(int i10, String str, String str2, String str3, @Contextual JsonElement jsonElement, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            throw new MissingFieldException("id");
        }
        this.id = str;
        if ((i10 & 2) == 0) {
            throw new MissingFieldException("pluginId");
        }
        this.pluginId = str2;
        if ((i10 & 4) == 0) {
            throw new MissingFieldException("actionId");
        }
        this.actionId = str3;
        if ((i10 & 8) != 0) {
            this.payload = jsonElement;
        } else {
            this.payload = null;
        }
    }

    public /* synthetic */ PluginRequest(String str, String str2, String str3, JsonElement jsonElement, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : jsonElement);
    }

    @Contextual
    public static /* synthetic */ void getPayload$annotations() {
    }
}
