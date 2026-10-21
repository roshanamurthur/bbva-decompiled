package com.veridas.lib.entities.resources.mrz;

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

/* JADX INFO: compiled from: Mrz.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bB3\b\u0011\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001a\u0010 J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÁ\u0001¢\u0006\u0004\b\b\u0010\tR \u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0019\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/veridas/lib/entities/resources/mrz/Mrz;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$common_core_jvm", "(Lcom/veridas/lib/entities/resources/mrz/Mrz;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/veridas/lib/entities/resources/Region;", "a", "Lcom/veridas/lib/entities/resources/Region;", "getRegion", "()Lcom/veridas/lib/entities/resources/Region;", "getRegion$annotations", "()V", "region", "Lcom/veridas/lib/entities/resources/mrz/MrzType;", "b", "Lcom/veridas/lib/entities/resources/mrz/MrzType;", "getType", "()Lcom/veridas/lib/entities/resources/mrz/MrzType;", "getType$annotations", "type", "<init>", "(Lcom/veridas/lib/entities/resources/Region;Lcom/veridas/lib/entities/resources/mrz/MrzType;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/veridas/lib/entities/resources/Region;Lcom/veridas/lib/entities/resources/mrz/MrzType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "common-core-jvm"}, k = 1, mv = {1, 9, 0})
@Serializable
public final class Mrz {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final KSerializer<Object>[] f67212c = {null, MrzType.INSTANCE.serializer()};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Region region;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MrzType type;

    /* JADX INFO: compiled from: Mrz.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/veridas/lib/entities/resources/mrz/Mrz$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/veridas/lib/entities/resources/mrz/Mrz;", "common-core-jvm"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<Mrz> serializer() {
            return Mrz$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Mrz(int i10, @SerialName("r") Region region, @SerialName("t") MrzType mrzType, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 3, Mrz$$serializer.INSTANCE.getDescriptor());
        }
        this.region = region;
        this.type = mrzType;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$common_core_jvm(Mrz self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, Region$$serializer.INSTANCE, self.region);
        output.encodeSerializableElement(serialDesc, 1, f67212c[1], self.type);
    }

    @NotNull
    public final Region getRegion() {
        return this.region;
    }

    @NotNull
    public final MrzType getType() {
        return this.type;
    }

    public Mrz(@NotNull Region region, @NotNull MrzType type) {
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(type, "type");
        this.region = region;
        this.type = type;
    }

    @SerialName("r")
    public static /* synthetic */ void getRegion$annotations() {
    }

    @SerialName("t")
    public static /* synthetic */ void getType$annotations() {
    }
}
