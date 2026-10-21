package com.bbva.ethermobilesdk.pinning.model.result;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PinningResult.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/model/result/PinningResult;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "Error", "Success", "Lcom/bbva/ethermobilesdk/pinning/model/result/PinningResult$Error;", "Lcom/bbva/ethermobilesdk/pinning/model/result/PinningResult$Success;", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class PinningResult<T> {

    /* JADX INFO: compiled from: PinningResult.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/model/result/PinningResult$Error;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/ethermobilesdk/pinning/model/result/PinningResult;", "type", "Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType;", "cause", "", "(Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getType", "()Lcom/bbva/ethermobilesdk/pinning/model/result/ErrorType;", "component1", "component2", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Error<T> extends PinningResult<T> {

        @Nullable
        private final Throwable cause;

        @NotNull
        private final ErrorType type;

        public /* synthetic */ Error(ErrorType errorType, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(errorType, (i10 & 2) != 0 ? null : th2);
        }

        public static /* synthetic */ Error copy$default(Error error, ErrorType errorType, Throwable th2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                errorType = error.type;
            }
            if ((i10 & 2) != 0) {
                th2 = error.cause;
            }
            return error.copy(errorType, th2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ErrorType getType() {
            return this.type;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        @NotNull
        public final Error<T> copy(@NotNull ErrorType type, @Nullable Throwable cause) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new Error<>(type, cause);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.areEqual(this.type, error.type) && Intrinsics.areEqual(this.cause, error.cause);
        }

        @Nullable
        public final Throwable getCause() {
            return this.cause;
        }

        @NotNull
        public final ErrorType getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            Throwable th2 = this.cause;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @NotNull
        public String toString() {
            return "Error(type=" + this.type + ", cause=" + this.cause + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull ErrorType type, @Nullable Throwable th2) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            this.cause = th2;
        }
    }

    /* JADX INFO: compiled from: PinningResult.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/model/result/PinningResult$Success;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/ethermobilesdk/pinning/model/result/PinningResult;", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Success<T> extends PinningResult<T> {
        private final T value;

        public Success(T t10) {
            super(null);
            this.value = t10;
        }

        public final T getValue() {
            return this.value;
        }
    }

    private PinningResult() {
    }

    public /* synthetic */ PinningResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
