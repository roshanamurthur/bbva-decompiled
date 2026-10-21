package com.veridas.lib.entities.resources;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PersonFace.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dB'\b\u0011\u0012\u0006\u0010\u001e\u001a\u00020\u0011\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001c\u0010!J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tJ\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019¨\u0006$"}, d2 = {"Lcom/veridas/lib/entities/resources/PersonFace;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$common_core_jvm", "(Lcom/veridas/lib/entities/resources/PersonFace;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/veridas/lib/entities/resources/Region;", "component1", "region", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/veridas/lib/entities/resources/Region;", "getRegion", "()Lcom/veridas/lib/entities/resources/Region;", "getRegion$annotations", "()V", "<init>", "(Lcom/veridas/lib/entities/resources/Region;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/veridas/lib/entities/resources/Region;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "common-core-jvm"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class PersonFace {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Region region;

    /* JADX INFO: compiled from: PersonFace.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/veridas/lib/entities/resources/PersonFace$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/veridas/lib/entities/resources/PersonFace;", "common-core-jvm"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<PersonFace> serializer() {
            return PersonFace$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ PersonFace(int i10, @SerialName("r") Region region, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, PersonFace$$serializer.INSTANCE.getDescriptor());
        }
        this.region = region;
    }

    public static /* synthetic */ PersonFace copy$default(PersonFace personFace, Region region, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            region = personFace.region;
        }
        return personFace.copy(region);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Region getRegion() {
        return this.region;
    }

    @NotNull
    public final PersonFace copy(@NotNull Region region) {
        Intrinsics.checkNotNullParameter(region, "region");
        return new PersonFace(region);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PersonFace) && Intrinsics.areEqual(this.region, ((PersonFace) other).region);
    }

    @NotNull
    public final Region getRegion() {
        return this.region;
    }

    public int hashCode() {
        return this.region.hashCode();
    }

    @NotNull
    public String toString() {
        return "PersonFace(region=" + this.region + ")";
    }

    public PersonFace(@NotNull Region region) {
        Intrinsics.checkNotNullParameter(region, "region");
        this.region = region;
    }

    @SerialName("r")
    public static /* synthetic */ void getRegion$annotations() {
    }
}
