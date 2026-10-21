package com.bbva.cells.pluginkit.provider;

import androidx.camera.core.impl.a;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.cells.pluginkit.command.model.CommandResult;
import com.bbva.cells.pluginkit.command.model.ErrorMessage;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Action.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\b\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/bbva/cells/pluginkit/provider/ActionResult;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "toCommandResult", "Lcom/bbva/cells/pluginkit/command/model/CommandResult;", "serializer", "Lkotlinx/serialization/KSerializer;", "Error", "Success", "Lcom/bbva/cells/pluginkit/provider/ActionResult$Success;", "Lcom/bbva/cells/pluginkit/provider/ActionResult$Error;", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public abstract class ActionResult<T> {

    /* JADX INFO: compiled from: Action.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0013\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0003J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\f\b\u0002\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001b\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/bbva/cells/pluginkit/provider/ActionResult$Error;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/cells/pluginkit/provider/ActionResult;", "Lcom/bbva/cells/pluginkit/command/model/ErrorMessage;", "component1", "value", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/cells/pluginkit/command/model/ErrorMessage;", "getValue", "()Lcom/bbva/cells/pluginkit/command/model/ErrorMessage;", "<init>", "(Lcom/bbva/cells/pluginkit/command/model/ErrorMessage;)V", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
    public static final /* data */ class Error<T> extends ActionResult<T> {

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
        public final Error<T> copy(@NotNull ErrorMessage<?> value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Error<>(value);
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

    /* JADX INFO: compiled from: Action.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0003\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u0001HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0005\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u0015"}, d2 = {"Lcom/bbva/cells/pluginkit/provider/ActionResult$Success;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/cells/pluginkit/provider/ActionResult;", "component1", "()Ljava/lang/Object;", "value", "copy", "(Ljava/lang/Object;)Lcom/bbva/cells/pluginkit/provider/ActionResult$Success;", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/Object;", "getValue", "<init>", "(Ljava/lang/Object;)V", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
    public static final /* data */ class Success<T> extends ActionResult<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final T value;

        public Success(T t10) {
            super(null);
            this.value = t10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = success.value;
            }
            return success.copy(obj);
        }

        public final T component1() {
            return this.value;
        }

        @NotNull
        public final Success<T> copy(T value) {
            return new Success<>(value);
        }

        public boolean equals(@Nullable Object other) {
            if (this != other) {
                return (other instanceof Success) && Intrinsics.areEqual(this.value, ((Success) other).value);
            }
            return true;
        }

        public final T getValue() {
            return this.value;
        }

        public int hashCode() {
            T t10 = this.value;
            if (t10 != null) {
                return t10.hashCode();
            }
            return 0;
        }

        @NotNull
        public String toString() {
            return a.e(new StringBuilder("Success(value="), this.value, ")");
        }
    }

    public ActionResult() {
    }

    public /* synthetic */ ActionResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommandResult toCommandResult$default(ActionResult actionResult, KSerializer kSerializer, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCommandResult");
        }
        if ((i10 & 1) != 0) {
            kSerializer = null;
        }
        return actionResult.toCommandResult(kSerializer);
    }

    @NotNull
    public final CommandResult toCommandResult(@Nullable KSerializer<T> serializer) {
        if (this instanceof Success) {
            return new CommandResult.Success(((Success) this).getValue(), serializer);
        }
        if (this instanceof Error) {
            return new CommandResult.Error(((Error) this).getValue());
        }
        throw new NoWhenBranchMatchedException();
    }
}
