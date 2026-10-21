package mx.openpay.library.core.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002:\u0002\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lmx/openpay/library/core/model/OpenPayResult;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "Failure", "Success", "Lmx/openpay/library/core/model/OpenPayResult$Failure;", "Lmx/openpay/library/core/model/OpenPayResult$Success;", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class OpenPayResult<T> {
    public static final int $stable = 0;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lmx/openpay/library/core/model/OpenPayResult$Failure;", "Lmx/openpay/library/core/model/OpenPayResult;", "", "Lmx/openpay/library/core/model/OpenPayError;", "a", "Lmx/openpay/library/core/model/OpenPayError;", "getError", "()Lmx/openpay/library/core/model/OpenPayError;", "error", "<init>", "(Lmx/openpay/library/core/model/OpenPayError;)V", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class Failure extends OpenPayResult {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final OpenPayError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@NotNull OpenPayError error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        @NotNull
        public final OpenPayError getError() {
            return this.error;
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u000f\u0012\u0006\u0010\b\u001a\u00028\u0001¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\b\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lmx/openpay/library/core/model/OpenPayResult$Success;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lmx/openpay/library/core/model/OpenPayResult;", "a", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "data", "<init>", "(Ljava/lang/Object;)V", "library_release"}, k = 1, mv = {1, 8, 0})
    public static final class Success<T> extends OpenPayResult<T> {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final T data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull T data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        @NotNull
        public final T getData() {
            return this.data;
        }
    }

    public OpenPayResult() {
    }

    public /* synthetic */ OpenPayResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
