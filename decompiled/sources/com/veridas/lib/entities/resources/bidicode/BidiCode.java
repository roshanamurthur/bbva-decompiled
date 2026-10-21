package com.veridas.lib.entities.resources.bidicode;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.veridas.lib.entities.resources.Region;
import com.veridas.lib.entities.resources.Region$$serializer;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BidiCode.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b*\u0010+B=\b\u0011\u0012\u0006\u0010,\u001a\u00020\u0017\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u0012\u001a\u00020\r\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b*\u0010/J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u000fHÆ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR \u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b$\u0010 \u001a\u0004\b\u0012\u0010#R \u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010 \u001a\u0004\b'\u0010(¨\u00062"}, d2 = {"Lcom/veridas/lib/entities/resources/bidicode/BidiCode;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$common_core_jvm", "(Lcom/veridas/lib/entities/resources/bidicode/BidiCode;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/veridas/lib/entities/resources/bidicode/BidiType;", "component1", "", "component2", "Lcom/veridas/lib/entities/resources/Region;", "component3", "type", "isEncrypted", "region", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Lcom/veridas/lib/entities/resources/bidicode/BidiType;", "getType", "()Lcom/veridas/lib/entities/resources/bidicode/BidiType;", "getType$annotations", "()V", "b", "Z", "()Z", "isEncrypted$annotations", "c", "Lcom/veridas/lib/entities/resources/Region;", "getRegion", "()Lcom/veridas/lib/entities/resources/Region;", "getRegion$annotations", "<init>", "(Lcom/veridas/lib/entities/resources/bidicode/BidiType;ZLcom/veridas/lib/entities/resources/Region;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/veridas/lib/entities/resources/bidicode/BidiType;ZLcom/veridas/lib/entities/resources/Region;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "common-core-jvm"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class BidiCode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final KSerializer<Object>[] f67206d = {BidiType.INSTANCE.serializer(), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final BidiType type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean isEncrypted;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Region region;

    /* JADX INFO: compiled from: BidiCode.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/veridas/lib/entities/resources/bidicode/BidiCode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/veridas/lib/entities/resources/bidicode/BidiCode;", "common-core-jvm"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<BidiCode> serializer() {
            return BidiCode$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ BidiCode(int i10, @SerialName("t") BidiType bidiType, @SerialName("e") boolean z10, @SerialName("r") Region region, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i10 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 7, BidiCode$$serializer.INSTANCE.getDescriptor());
        }
        this.type = bidiType;
        this.isEncrypted = z10;
        this.region = region;
    }

    public static /* synthetic */ BidiCode copy$default(BidiCode bidiCode, BidiType bidiType, boolean z10, Region region, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bidiType = bidiCode.type;
        }
        if ((i10 & 2) != 0) {
            z10 = bidiCode.isEncrypted;
        }
        if ((i10 & 4) != 0) {
            region = bidiCode.region;
        }
        return bidiCode.copy(bidiType, z10, region);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$common_core_jvm(BidiCode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, f67206d[0], self.type);
        output.encodeBooleanElement(serialDesc, 1, self.isEncrypted);
        output.encodeSerializableElement(serialDesc, 2, Region$$serializer.INSTANCE, self.region);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BidiType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsEncrypted() {
        return this.isEncrypted;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Region getRegion() {
        return this.region;
    }

    @NotNull
    public final BidiCode copy(@NotNull BidiType type, boolean isEncrypted, @NotNull Region region) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(region, "region");
        return new BidiCode(type, isEncrypted, region);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BidiCode)) {
            return false;
        }
        BidiCode bidiCode = (BidiCode) other;
        return this.type == bidiCode.type && this.isEncrypted == bidiCode.isEncrypted && Intrinsics.areEqual(this.region, bidiCode.region);
    }

    @NotNull
    public final Region getRegion() {
        return this.region;
    }

    @NotNull
    public final BidiType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.region.hashCode() + (((this.type.hashCode() * 31) + (this.isEncrypted ? 1231 : 1237)) * 31);
    }

    public final boolean isEncrypted() {
        return this.isEncrypted;
    }

    @NotNull
    public String toString() {
        return "BidiCode(type=" + this.type + ", isEncrypted=" + this.isEncrypted + ", region=" + this.region + ")";
    }

    public BidiCode(@NotNull BidiType type, boolean z10, @NotNull Region region) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(region, "region");
        this.type = type;
        this.isEncrypted = z10;
        this.region = region;
    }

    @SerialName("r")
    public static /* synthetic */ void getRegion$annotations() {
    }

    @SerialName("t")
    public static /* synthetic */ void getType$annotations() {
    }

    @SerialName("e")
    public static /* synthetic */ void isEncrypted$annotations() {
    }
}
