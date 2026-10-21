package com.bbva.component.dm.naturalauth.data.model;

import androidx.camera.core.imagecapture.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ResponseErrorMessage.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fB\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0019\u0010\u001aB+\b\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0010\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0019\u0010\u001eJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u0019\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006!"}, d2 = {"Lcom/bbva/component/dm/naturalauth/data/model/ResponseErrorMessages;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "Lcom/bbva/component/dm/naturalauth/data/model/ErrorMessage;", "component1", "messages", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/util/List;", "getMessages", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
@Serializable
public final /* data */ class ResponseErrorMessages {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final KSerializer<Object>[] f27837b = {new ArrayListSerializer(ErrorMessage$$serializer.INSTANCE)};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<ErrorMessage> messages;

    /* JADX INFO: compiled from: ResponseErrorMessage.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/dm/naturalauth/data/model/ResponseErrorMessages$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/component/dm/naturalauth/data/model/ResponseErrorMessages;", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<ResponseErrorMessages> serializer() {
            return ResponseErrorMessages$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ ResponseErrorMessages(int i10, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 1, ResponseErrorMessages$$serializer.INSTANCE.getDescriptor());
        }
        this.messages = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResponseErrorMessages copy$default(ResponseErrorMessages responseErrorMessages, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = responseErrorMessages.messages;
        }
        return responseErrorMessages.copy(list);
    }

    @NotNull
    public final List<ErrorMessage> component1() {
        return this.messages;
    }

    @NotNull
    public final ResponseErrorMessages copy(@NotNull List<ErrorMessage> messages) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        return new ResponseErrorMessages(messages);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ResponseErrorMessages) && Intrinsics.areEqual(this.messages, ((ResponseErrorMessages) other).messages);
    }

    @NotNull
    public final List<ErrorMessage> getMessages() {
        return this.messages;
    }

    public int hashCode() {
        return this.messages.hashCode();
    }

    @NotNull
    public String toString() {
        return a.c(new StringBuilder("ResponseErrorMessages(messages="), this.messages, ")");
    }

    public ResponseErrorMessages(@NotNull List<ErrorMessage> messages) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        this.messages = messages;
    }
}
