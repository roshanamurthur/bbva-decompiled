package com.bbva.cells.pluginkit.command.model;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CommandResult.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/cells/pluginkit/command/model/CommandResult;", "", "()V", "Error", "Success", "Lcom/bbva/cells/pluginkit/command/model/CommandResult$Success;", "Lcom/bbva/cells/pluginkit/command/model/CommandResult$Error;", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public abstract class CommandResult {

    /* JADX INFO: compiled from: CommandResult.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002HÆ\u0003J\u0017\u0010\u0005\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u001b\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/cells/pluginkit/command/model/CommandResult$Error;", "Lcom/bbva/cells/pluginkit/command/model/CommandResult;", "Lcom/bbva/cells/pluginkit/command/model/ErrorMessage;", "component1", "value", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/cells/pluginkit/command/model/ErrorMessage;", "getValue", "()Lcom/bbva/cells/pluginkit/command/model/ErrorMessage;", "<init>", "(Lcom/bbva/cells/pluginkit/command/model/ErrorMessage;)V", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
    public static final /* data */ class Error extends CommandResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ErrorMessage<?> value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull ErrorMessage<?> value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Error copy$default(Error error, ErrorMessage errorMessage, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                errorMessage = error.value;
            }
            return error.copy(errorMessage);
        }

        @NotNull
        public final ErrorMessage<?> component1() {
            return this.value;
        }

        @NotNull
        public final Error copy(@NotNull ErrorMessage<?> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Error(value);
        }

        public boolean equals(@Nullable Object other) {
            if (this != other) {
                return (other instanceof Error) && Intrinsics.areEqual(this.value, ((Error) other).value);
            }
            return true;
        }

        @NotNull
        public final ErrorMessage<?> getValue() {
            return this.value;
        }

        public int hashCode() {
            ErrorMessage<?> errorMessage = this.value;
            if (errorMessage != null) {
                return errorMessage.hashCode();
            }
            return 0;
        }

        @NotNull
        public String toString() {
            return "Error(value=" + this.value + ")";
        }
    }

    /* JADX INFO: compiled from: CommandResult.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B%\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0000\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0003\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005HÆ\u0003J4\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u00002\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0004R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/bbva/cells/pluginkit/command/model/CommandResult$Success;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/cells/pluginkit/command/model/CommandResult;", "component1", "()Ljava/lang/Object;", "Lkotlinx/serialization/KSerializer;", "component2", "value", "serializer", "copy", "(Ljava/lang/Object;Lkotlinx/serialization/KSerializer;)Lcom/bbva/cells/pluginkit/command/model/CommandResult$Success;", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/Object;", "getValue", "b", "Lkotlinx/serialization/KSerializer;", "getSerializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "(Ljava/lang/Object;Lkotlinx/serialization/KSerializer;)V", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
    public static final /* data */ class Success<T> extends CommandResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final T value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final KSerializer<T> serializer;

        /* JADX WARN: Multi-variable type inference failed */
        public Success() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, KSerializer kSerializer, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = success.value;
            }
            if ((i10 & 2) != 0) {
                kSerializer = success.serializer;
            }
            return success.copy(obj, kSerializer);
        }

        @Nullable
        public final T component1() {
            return this.value;
        }

        @Nullable
        public final KSerializer<T> component2() {
            return this.serializer;
        }

        @NotNull
        public final Success<T> copy(@Nullable T value, @Nullable KSerializer<T> serializer) {
            return new Success<>(value, serializer);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.areEqual(this.value, success.value) && Intrinsics.areEqual(this.serializer, success.serializer);
        }

        @Nullable
        public final KSerializer<T> getSerializer() {
            return this.serializer;
        }

        @Nullable
        public final T getValue() {
            return this.value;
        }

        public int hashCode() {
            T t10 = this.value;
            int iHashCode = (t10 != null ? t10.hashCode() : 0) * 31;
            KSerializer<T> kSerializer = this.serializer;
            return iHashCode + (kSerializer != null ? kSerializer.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Success(value=" + this.value + ", serializer=" + this.serializer + ")";
        }

        public Success(@Nullable T t10, @Nullable KSerializer<T> kSerializer) {
            super(null);
            this.value = t10;
            this.serializer = kSerializer;
        }

        public /* synthetic */ Success(Object obj, KSerializer kSerializer, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : obj, (i10 & 2) != 0 ? null : kSerializer);
        }
    }

    public CommandResult() {
    }

    public /* synthetic */ CommandResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
