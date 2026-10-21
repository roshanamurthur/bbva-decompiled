package mx.openpay.library.domain.util;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.model.Error;
import mx.openpay.library.domain.model.ProcessingStep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Result.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002:\u0002\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lmx/openpay/library/domain/util/Result;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "Failure", "Success", "Lmx/openpay/library/domain/util/Result$Failure;", "Lmx/openpay/library/domain/util/Result$Success;", "domain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Result<T> {

    /* JADX INFO: compiled from: Result.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lmx/openpay/library/domain/util/Result$Failure;", "Lmx/openpay/library/domain/util/Result;", "", "Lmx/openpay/library/domain/model/Error;", "a", "Lmx/openpay/library/domain/model/Error;", "getError", "()Lmx/openpay/library/domain/model/Error;", "error", "<init>", "(Lmx/openpay/library/domain/model/Error;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
    public static final class Failure extends Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Error error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@NotNull Error error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        @NotNull
        public final Error getError() {
            return this.error;
        }
    }

    /* JADX INFO: compiled from: Result.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u001d\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0001\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00018\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lmx/openpay/library/domain/util/Result$Success;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lmx/openpay/library/domain/util/Result;", "a", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "data", "Lmx/openpay/library/domain/model/ProcessingStep;", "b", "Lmx/openpay/library/domain/model/ProcessingStep;", "getProcessStep", "()Lmx/openpay/library/domain/model/ProcessingStep;", "processStep", "<init>", "(Ljava/lang/Object;Lmx/openpay/library/domain/model/ProcessingStep;)V", "domain_release"}, k = 1, mv = {1, 8, 0})
    public static final class Success<T> extends Result<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final T data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final ProcessingStep processStep;

        public Success(@Nullable T t10, @Nullable ProcessingStep processingStep) {
            super(null);
            this.data = t10;
            this.processStep = processingStep;
        }

        @Nullable
        public final T getData() {
            return this.data;
        }

        @Nullable
        public final ProcessingStep getProcessStep() {
            return this.processStep;
        }

        public /* synthetic */ Success(Object obj, ProcessingStep processingStep, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i10 & 2) != 0 ? null : processingStep);
        }
    }

    public Result() {
    }

    public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
