package com.bbva.component.dm.singlesignon.model;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.h0;
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

/* JADX INFO: compiled from: SSOEmptyContentException.kt */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB#\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J!\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aHÇ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/bbva/component/dm/singlesignon/model/SSOEmptyContentException;", "", "seen1", "", "message", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "component-dm-singlesignon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final /* data */ class SSOEmptyContentException extends Throwable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String message;

    /* JADX INFO: compiled from: SSOEmptyContentException.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/dm/singlesignon/model/SSOEmptyContentException$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/dm/singlesignon/model/SSOEmptyContentException;", "component-dm-singlesignon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<SSOEmptyContentException> serializer() {
            return SSOEmptyContentException$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SSOEmptyContentException() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ SSOEmptyContentException copy$default(SSOEmptyContentException sSOEmptyContentException, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sSOEmptyContentException.getMessage();
        }
        return sSOEmptyContentException.copy(str);
    }

    @JvmStatic
    public static final void write$Self(@NotNull SSOEmptyContentException self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && Intrinsics.areEqual(self.getMessage(), "SSO content data it's empty")) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.getMessage());
    }

    @Nullable
    public final String component1() {
        return getMessage();
    }

    @NotNull
    public final SSOEmptyContentException copy(@Nullable String message) {
        return new SSOEmptyContentException(message);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SSOEmptyContentException) && Intrinsics.areEqual(getMessage(), ((SSOEmptyContentException) other).getMessage());
    }

    @Override // java.lang.Throwable
    @Nullable
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        if (getMessage() == null) {
            return 0;
        }
        return getMessage().hashCode();
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return h0.b("SSOEmptyContentException(message=", getMessage(), ")");
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ SSOEmptyContentException(int i10, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            this.message = "SSO content data it's empty";
        } else {
            this.message = str;
        }
    }

    public /* synthetic */ SSOEmptyContentException(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "SSO content data it's empty" : str);
    }

    public SSOEmptyContentException(@Nullable String str) {
        this.message = str;
    }
}
