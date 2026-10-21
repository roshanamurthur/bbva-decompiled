package com.bbva.ethermobilesdk.securesharing.model;

import bc.org.bouncycastle.math.ec.custom.sec.a;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Fingerprint.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u001b\u0010\u001cB-\b\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u0010\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001b\u0010 J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u0019\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lcom/bbva/ethermobilesdk/securesharing/model/SharedConfiguration;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "Lcom/bbva/ethermobilesdk/securesharing/model/Fingerprint;", "component1", "fingerprints", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/util/List;", "getFingerprints", "()Ljava/util/List;", "getFingerprints$annotations", "()V", "<init>", "(Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "securesharing_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class SharedConfiguration {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Fingerprint> fingerprints;

    /* JADX INFO: compiled from: Fingerprint.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/ethermobilesdk/securesharing/model/SharedConfiguration$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/ethermobilesdk/securesharing/model/SharedConfiguration;", "securesharing_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<SharedConfiguration> serializer() {
            return SharedConfiguration$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ SharedConfiguration(int i10, @SerialName("fingerprintList") List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, SharedConfiguration$$serializer.INSTANCE.getDescriptor());
        }
        this.fingerprints = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SharedConfiguration copy$default(SharedConfiguration sharedConfiguration, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = sharedConfiguration.fingerprints;
        }
        return sharedConfiguration.copy(list);
    }

    @JvmStatic
    public static final void write$Self(@NotNull SharedConfiguration self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeSerializableElement(serialDesc, 0, new ArrayListSerializer(Fingerprint$$serializer.INSTANCE), self.fingerprints);
    }

    @NotNull
    public final List<Fingerprint> component1() {
        return this.fingerprints;
    }

    @NotNull
    public final SharedConfiguration copy(@NotNull List<Fingerprint> fingerprints) {
        Intrinsics.checkNotNullParameter(fingerprints, "fingerprints");
        return new SharedConfiguration(fingerprints);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SharedConfiguration) && Intrinsics.areEqual(this.fingerprints, ((SharedConfiguration) other).fingerprints);
    }

    @NotNull
    public final List<Fingerprint> getFingerprints() {
        return this.fingerprints;
    }

    public int hashCode() {
        return this.fingerprints.hashCode();
    }

    @NotNull
    public String toString() {
        return a.c(new StringBuilder("SharedConfiguration(fingerprints="), this.fingerprints, RootService.CLOSE_BRACKET);
    }

    public SharedConfiguration(@NotNull List<Fingerprint> fingerprints) {
        Intrinsics.checkNotNullParameter(fingerprints, "fingerprints");
        this.fingerprints = fingerprints;
    }

    @SerialName("fingerprintList")
    public static /* synthetic */ void getFingerprints$annotations() {
    }
}
