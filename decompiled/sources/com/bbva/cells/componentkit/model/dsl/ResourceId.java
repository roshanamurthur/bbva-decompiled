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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Settings.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\"\u0010#B/\b\u0017\u0012\u0006\u0010$\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b\"\u0010'J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0012\u001a\u00020\tHÖ\u0001J\t\u0010\u0013\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010!¨\u0006*"}, d2 = {"Lcom/bbva/cells/componentkit/model/dsl/ResourceId;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "()Ljava/lang/Integer;", "value", "androidId", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/bbva/cells/componentkit/model/dsl/ResourceId;", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "b", "Ljava/lang/Integer;", "getAndroidId", "setAndroidId", "(Ljava/lang/Integer;)V", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "componentkit_release"}, k = 1, mv = {1, 6, 0})
@Serializable
public final /* data */ class ResourceId {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Integer androidId;

    /* JADX INFO: compiled from: Settings.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/cells/componentkit/model/dsl/ResourceId$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/cells/componentkit/model/dsl/ResourceId;", "componentkit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<ResourceId> serializer() {
            return ResourceId$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResourceId() {
        this((String) null, (Integer) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ ResourceId copy$default(ResourceId resourceId, String str, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = resourceId.value;
        }
        if ((i10 & 2) != 0) {
            num = resourceId.androidId;
        }
        return resourceId.copy(str, num);
    }

    @JvmStatic
    public static final void write$Self(@NotNull ResourceId self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.value != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.value);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.androidId == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.androidId);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getAndroidId() {
        return this.androidId;
    }

    @NotNull
    public final ResourceId copy(@Nullable String value, @Nullable Integer androidId) {
        return new ResourceId(value, androidId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResourceId)) {
            return false;
        }
        ResourceId resourceId = (ResourceId) other;
        return Intrinsics.areEqual(this.value, resourceId.value) && Intrinsics.areEqual(this.androidId, resourceId.androidId);
    }

    @Nullable
    public final Integer getAndroidId() {
        return this.androidId;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.value;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.androidId;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final void setAndroidId(@Nullable Integer num) {
        this.androidId = num;
    }

    public final void setValue(@Nullable String str) {
        this.value = str;
    }

    @NotNull
    public String toString() {
        return "ResourceId(value=" + ((Object) this.value) + ", androidId=" + this.androidId + RootService.CLOSE_BRACKET;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ ResourceId(int i10, String str, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.value = null;
        } else {
            this.value = str;
        }
        if ((i10 & 2) == 0) {
            this.androidId = null;
        } else {
            this.androidId = num;
        }
    }

    public ResourceId(@Nullable String str, @Nullable Integer num) {
        this.value = str;
        this.androidId = num;
    }

    public /* synthetic */ ResourceId(String str, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : num);
    }
}
