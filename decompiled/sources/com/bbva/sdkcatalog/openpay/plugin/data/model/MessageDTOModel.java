package com.bbva.sdkcatalog.openpay.plugin.data.model;

import ad.d;
import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MessageDTOModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002,-B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J0\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001J%\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\b+R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006."}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/data/model/MessageDTOModel;", "", "success", "", "code", "", "message", "", "<init>", "(ZLjava/lang/Integer;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLjava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSuccess", "()Z", "setSuccess", "(Z)V", "getCode", "()Ljava/lang/Integer;", "setCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "(ZLjava/lang/Integer;Ljava/lang/String;)Lcom/bbva/sdkcatalog/openpay/plugin/data/model/MessageDTOModel;", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$openpay_plugin_release", "$serializer", "Companion", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MessageDTOModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private Integer code;

    @Nullable
    private String message;
    private boolean success;

    /* JADX INFO: compiled from: MessageDTOModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/data/model/MessageDTOModel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/sdkcatalog/openpay/plugin/data/model/MessageDTOModel;", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<MessageDTOModel> serializer() {
            return MessageDTOModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MessageDTOModel(int i10, boolean z10, Integer num, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i10 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i10, 7, MessageDTOModel$$serializer.INSTANCE.getDescriptor());
        }
        this.success = z10;
        this.code = num;
        this.message = str;
    }

    public static /* synthetic */ MessageDTOModel copy$default(MessageDTOModel messageDTOModel, boolean z10, Integer num, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = messageDTOModel.success;
        }
        if ((i10 & 2) != 0) {
            num = messageDTOModel.code;
        }
        if ((i10 & 4) != 0) {
            str = messageDTOModel.message;
        }
        return messageDTOModel.copy(z10, num, str);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$openpay_plugin_release(MessageDTOModel self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.success);
        output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.code);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.message);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final MessageDTOModel copy(boolean success, @Nullable Integer code, @Nullable String message) {
        return new MessageDTOModel(success, code, message);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageDTOModel)) {
            return false;
        }
        MessageDTOModel messageDTOModel = (MessageDTOModel) other;
        return this.success == messageDTOModel.success && Intrinsics.areEqual(this.code, messageDTOModel.code) && Intrinsics.areEqual(this.message, messageDTOModel.message);
    }

    @Nullable
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int i10 = (this.success ? 1231 : 1237) * 31;
        Integer num = this.code;
        int iHashCode = (i10 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.message;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setCode(@Nullable Integer num) {
        this.code = num;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }

    public final void setSuccess(boolean z10) {
        this.success = z10;
    }

    @NotNull
    public String toString() {
        boolean z10 = this.success;
        Integer num = this.code;
        String str = this.message;
        StringBuilder sb2 = new StringBuilder("MessageDTOModel(success=");
        sb2.append(z10);
        sb2.append(", code=");
        sb2.append(num);
        sb2.append(", message=");
        return d.f(sb2, str, ")");
    }

    public MessageDTOModel(boolean z10, @Nullable Integer num, @Nullable String str) {
        this.success = z10;
        this.code = num;
        this.message = str;
    }
}
