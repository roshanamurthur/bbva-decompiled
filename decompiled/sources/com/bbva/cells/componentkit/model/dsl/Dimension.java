package com.bbva.cells.componentkit.model.dsl;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.noknok.android.client.metrics.Tabulator;
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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Settings.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B)\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b-\u0010.B9\b\u0017\u0012\u0006\u0010/\u001a\u00020\u0017\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b-\u00102J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003J4\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\r\"\u0004\b%\u0010&R$\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00065"}, d2 = {"Lcom/bbva/cells/componentkit/model/dsl/Dimension;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "Lcom/bbva/cells/componentkit/model/dsl/ResourceId;", "component1", "", "component2", "()Ljava/lang/Float;", "Lcom/bbva/cells/componentkit/model/dsl/UnitType;", "component3", "id", "value", Tabulator.KEY_UNIT, "copy", "(Lcom/bbva/cells/componentkit/model/dsl/ResourceId;Ljava/lang/Float;Lcom/bbva/cells/componentkit/model/dsl/UnitType;)Lcom/bbva/cells/componentkit/model/dsl/Dimension;", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/cells/componentkit/model/dsl/ResourceId;", "getId", "()Lcom/bbva/cells/componentkit/model/dsl/ResourceId;", "setId", "(Lcom/bbva/cells/componentkit/model/dsl/ResourceId;)V", "b", "Ljava/lang/Float;", "getValue", "setValue", "(Ljava/lang/Float;)V", "c", "Lcom/bbva/cells/componentkit/model/dsl/UnitType;", "getUnit", "()Lcom/bbva/cells/componentkit/model/dsl/UnitType;", "setUnit", "(Lcom/bbva/cells/componentkit/model/dsl/UnitType;)V", "<init>", "(Lcom/bbva/cells/componentkit/model/dsl/ResourceId;Ljava/lang/Float;Lcom/bbva/cells/componentkit/model/dsl/UnitType;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/bbva/cells/componentkit/model/dsl/ResourceId;Ljava/lang/Float;Lcom/bbva/cells/componentkit/model/dsl/UnitType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "componentkit_release"}, k = 1, mv = {1, 6, 0})
@Serializable
public final /* data */ class Dimension {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ResourceId id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Float value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public UnitType unit;

    /* JADX INFO: compiled from: Settings.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/cells/componentkit/model/dsl/Dimension$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/cells/componentkit/model/dsl/Dimension;", "componentkit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<Dimension> serializer() {
            return Dimension$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Dimension(int i10, ResourceId resourceId, Float f6, UnitType unitType, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, Dimension$$serializer.INSTANCE.getDescriptor());
        }
        this.id = resourceId;
        if ((i10 & 2) == 0) {
            this.value = null;
        } else {
            this.value = f6;
        }
        if ((i10 & 4) == 0) {
            this.unit = null;
        } else {
            this.unit = unitType;
        }
    }

    public static /* synthetic */ Dimension copy$default(Dimension dimension, ResourceId resourceId, Float f6, UnitType unitType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            resourceId = dimension.id;
        }
        if ((i10 & 2) != 0) {
            f6 = dimension.value;
        }
        if ((i10 & 4) != 0) {
            unitType = dimension.unit;
        }
        return dimension.copy(resourceId, f6, unitType);
    }

    @JvmStatic
    public static final void write$Self(@NotNull Dimension self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeNullableSerializableElement(serialDesc, 0, ResourceId$$serializer.INSTANCE, self.id);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.value != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, FloatSerializer.INSTANCE, self.value);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.unit == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, UnitType$$serializer.INSTANCE, self.unit);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ResourceId getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Float getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UnitType getUnit() {
        return this.unit;
    }

    @NotNull
    public final Dimension copy(@Nullable ResourceId id, @Nullable Float value, @Nullable UnitType unit) {
        return new Dimension(id, value, unit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Dimension)) {
            return false;
        }
        Dimension dimension = (Dimension) other;
        return Intrinsics.areEqual(this.id, dimension.id) && Intrinsics.areEqual((Object) this.value, (Object) dimension.value) && this.unit == dimension.unit;
    }

    @Nullable
    public final ResourceId getId() {
        return this.id;
    }

    @Nullable
    public final UnitType getUnit() {
        return this.unit;
    }

    @Nullable
    public final Float getValue() {
        return this.value;
    }

    public int hashCode() {
        ResourceId resourceId = this.id;
        int iHashCode = (resourceId == null ? 0 : resourceId.hashCode()) * 31;
        Float f6 = this.value;
        int iHashCode2 = (iHashCode + (f6 == null ? 0 : f6.hashCode())) * 31;
        UnitType unitType = this.unit;
        return iHashCode2 + (unitType != null ? unitType.hashCode() : 0);
    }

    public final void setId(@Nullable ResourceId resourceId) {
        this.id = resourceId;
    }

    public final void setUnit(@Nullable UnitType unitType) {
        this.unit = unitType;
    }

    public final void setValue(@Nullable Float f6) {
        this.value = f6;
    }

    @NotNull
    public String toString() {
        return "Dimension(id=" + this.id + ", value=" + this.value + ", unit=" + this.unit + RootService.CLOSE_BRACKET;
    }

    public Dimension(@Nullable ResourceId resourceId, @Nullable Float f6, @Nullable UnitType unitType) {
        this.id = resourceId;
        this.value = f6;
        this.unit = unitType;
    }

    public /* synthetic */ Dimension(ResourceId resourceId, Float f6, UnitType unitType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(resourceId, (i10 & 2) != 0 ? null : f6, (i10 & 4) != 0 ? null : unitType);
    }
}
