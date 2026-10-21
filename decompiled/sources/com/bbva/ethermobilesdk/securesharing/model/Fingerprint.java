package com.bbva.ethermobilesdk.securesharing.model;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.y2;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Fingerprint.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fB3\b\u0017\u0012\u0006\u0010 \u001a\u00020\u0010\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R \u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u0012\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001c\u0010\u0018¨\u0006&"}, d2 = {"Lcom/bbva/ethermobilesdk/securesharing/model/Fingerprint;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "component1", "component2", "algorithm", "value", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getAlgorithm", "()Ljava/lang/String;", "getAlgorithm$annotations", "()V", "b", "getValue", "getValue$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "securesharing_release"}, k = 1, mv = {1, 5, 1})
@Serializable
public final /* data */ class Fingerprint {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String algorithm;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String value;

    /* JADX INFO: compiled from: Fingerprint.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/ethermobilesdk/securesharing/model/Fingerprint$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/ethermobilesdk/securesharing/model/Fingerprint;", "securesharing_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<Fingerprint> serializer() {
            return Fingerprint$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Fingerprint(int i10, @SerialName("mdAlgorithm") String str, @Serializable(with = SignatureAsStringSerializer.class) String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 3, Fingerprint$$serializer.INSTANCE.getDescriptor());
        }
        this.algorithm = str;
        this.value = str2;
    }

    public static /* synthetic */ Fingerprint copy$default(Fingerprint fingerprint, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = fingerprint.algorithm;
        }
        if ((i10 & 2) != 0) {
            str2 = fingerprint.value;
        }
        return fingerprint.copy(str, str2);
    }

    @JvmStatic
    public static final void write$Self(@NotNull Fingerprint self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.algorithm);
        output.encodeSerializableElement(serialDesc, 1, SignatureAsStringSerializer.INSTANCE, self.value);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAlgorithm() {
        return this.algorithm;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final Fingerprint copy(@NotNull String algorithm, @NotNull String value) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(value, "value");
        return new Fingerprint(algorithm, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Fingerprint)) {
            return false;
        }
        Fingerprint fingerprint = (Fingerprint) other;
        return Intrinsics.areEqual(this.algorithm, fingerprint.algorithm) && Intrinsics.areEqual(this.value, fingerprint.value);
    }

    @NotNull
    public final String getAlgorithm() {
        return this.algorithm;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.algorithm.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Fingerprint(algorithm=");
        sb2.append(this.algorithm);
        sb2.append(", value=");
        return y2.b(sb2, this.value, RootService.CLOSE_BRACKET);
    }

    public Fingerprint(@NotNull String algorithm, @NotNull String value) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(value, "value");
        this.algorithm = algorithm;
        this.value = value;
    }

    @SerialName("mdAlgorithm")
    public static /* synthetic */ void getAlgorithm$annotations() {
    }

    @Serializable(with = SignatureAsStringSerializer.class)
    public static /* synthetic */ void getValue$annotations() {
    }
}
