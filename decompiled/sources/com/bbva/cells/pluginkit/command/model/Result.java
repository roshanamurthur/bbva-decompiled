package com.bbva.cells.pluginkit.command.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.model.constants.BanxicoConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.Contextual;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PluginResult.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fB\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0019\u0010\u001aB/\b\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0019\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Lcom/bbva/cells/pluginkit/command/model/Result;", "", "", "component1", "Lkotlinx/serialization/json/JsonElement;", "component2", "code", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCode", "()I", "b", "Lkotlinx/serialization/json/JsonElement;", "getPayload", "()Lkotlinx/serialization/json/JsonElement;", "getPayload$annotations", "()V", "<init>", "(ILkotlinx/serialization/json/JsonElement;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
@Serializable
public final /* data */ class Result {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final JsonElement payload;

    /* JADX INFO: compiled from: PluginResult.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/cells/pluginkit/command/model/Result$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/cells/pluginkit/command/model/Result;", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<Result> serializer() {
            return Result$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Result(int i10, int i11, @Contextual JsonElement jsonElement, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 1) == 0) {
            throw new MissingFieldException("code");
        }
        this.code = i11;
        if ((i10 & 2) == 0) {
            throw new MissingFieldException(BanxicoConstants.KEY_HISTORICAL_PAYLOAD);
        }
        this.payload = jsonElement;
    }

    public static /* synthetic */ Result copy$default(Result result, int i10, JsonElement jsonElement, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = result.code;
        }
        if ((i11 & 2) != 0) {
            jsonElement = result.payload;
        }
        return result.copy(i10, jsonElement);
    }

    @JvmStatic
    public static final void write$Self(@NotNull Result self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        output.encodeIntElement(serialDesc, 0, self.code);
        output.encodeNullableSerializableElement(serialDesc, 1, new ContextualSerializer(Reflection.getOrCreateKotlinClass(JsonElement.class), BuiltinSerializersKt.getNullable(JsonElementSerializer.INSTANCE), new KSerializer[0]), self.payload);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JsonElement getPayload() {
        return this.payload;
    }

    @NotNull
    public final Result copy(int code, @Nullable JsonElement payload) {
        return new Result(code, payload);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Result)) {
            return false;
        }
        Result result = (Result) other;
        return this.code == result.code && Intrinsics.areEqual(this.payload, result.payload);
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final JsonElement getPayload() {
        return this.payload;
    }

    public int hashCode() {
        int i10 = this.code * 31;
        JsonElement jsonElement = this.payload;
        return i10 + (jsonElement != null ? jsonElement.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Result(code=" + this.code + ", payload=" + this.payload + ")";
    }

    public Result(int i10, @Nullable JsonElement jsonElement) {
        this.code = i10;
        this.payload = jsonElement;
    }

    @Contextual
    public static /* synthetic */ void getPayload$annotations() {
    }
}
