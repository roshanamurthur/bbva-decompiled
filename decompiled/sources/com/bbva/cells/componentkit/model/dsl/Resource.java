package com.bbva.cells.componentkit.model.dsl;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Settings.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\"\u0010#B/\b\u0017\u0012\u0006\u0010$\u001a\u00020\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b\"\u0010'J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\tHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\r\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006*"}, d2 = {"Lcom/bbva/cells/componentkit/model/dsl/Resource;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "Lcom/bbva/cells/componentkit/model/dsl/ResourceId;", "component2", "value", "id", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "b", "Lcom/bbva/cells/componentkit/model/dsl/ResourceId;", "getId", "()Lcom/bbva/cells/componentkit/model/dsl/ResourceId;", "setId", "(Lcom/bbva/cells/componentkit/model/dsl/ResourceId;)V", "<init>", "(Ljava/lang/String;Lcom/bbva/cells/componentkit/model/dsl/ResourceId;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/bbva/cells/componentkit/model/dsl/ResourceId;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "componentkit_release"}, k = 1, mv = {1, 6, 0})
@Serializable
public final /* data */ class Resource {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ResourceId id;

    /* JADX INFO: compiled from: Settings.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/cells/componentkit/model/dsl/Resource$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/cells/componentkit/model/dsl/Resource;", "componentkit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<Resource> serializer() {
            return Resource$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Resource() {
        this((String) null, (ResourceId) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ Resource copy$default(Resource resource, String str, ResourceId resourceId, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = resource.value;
        }
        if ((i10 & 2) != 0) {
            resourceId = resource.id;
        }
        return resource.copy(str, resourceId);
    }

    @JvmStatic
    public static final void write$Self(@NotNull Resource self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.value != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.value);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.id == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, ResourceId$$serializer.INSTANCE, self.id);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ResourceId getId() {
        return this.id;
    }

    @NotNull
    public final Resource copy(@Nullable String value, @Nullable ResourceId id) {
        return new Resource(value, id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Resource)) {
            return false;
        }
        Resource resource = (Resource) other;
        return Intrinsics.areEqual(this.value, resource.value) && Intrinsics.areEqual(this.id, resource.id);
    }

    @Nullable
    public final ResourceId getId() {
        return this.id;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.value;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ResourceId resourceId = this.id;
        return iHashCode + (resourceId != null ? resourceId.hashCode() : 0);
    }

    public final void setId(@Nullable ResourceId resourceId) {
        this.id = resourceId;
    }

    public final void setValue(@Nullable String str) {
        this.value = str;
    }

    @NotNull
    public String toString() {
        return "Resource(value=" + ((Object) this.value) + ", id=" + this.id + RootService.CLOSE_BRACKET;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Resource(int i10, String str, ResourceId resourceId, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.value = null;
        } else {
            this.value = str;
        }
        if ((i10 & 2) == 0) {
            this.id = null;
        } else {
            this.id = resourceId;
        }
    }

    public Resource(@Nullable String str, @Nullable ResourceId resourceId) {
        this.value = str;
        this.id = resourceId;
    }

    public /* synthetic */ Resource(String str, ResourceId resourceId, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : resourceId);
    }
}
