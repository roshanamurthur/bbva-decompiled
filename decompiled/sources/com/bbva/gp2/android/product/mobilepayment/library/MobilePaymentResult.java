package com.bbva.gp2.android.product.mobilepayment.library;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MobilePaymentResult.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/bbva/gp2/android/product/mobilepayment/library/MobilePaymentResult;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "Result", "Error", "Lcom/bbva/gp2/android/product/mobilepayment/library/MobilePaymentResult$Error;", "Lcom/bbva/gp2/android/product/mobilepayment/library/MobilePaymentResult$Result;", "payments-mobilepayment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MobilePaymentResult<T> {

    /* JADX INFO: compiled from: MobilePaymentResult.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/bbva/gp2/android/product/mobilepayment/library/MobilePaymentResult$Error;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/gp2/android/product/mobilepayment/library/MobilePaymentResult;", "error", "Lcom/bbva/gp2/android/product/mobilepayment/library/MobilePaymentError;", "<init>", "(Lcom/bbva/gp2/android/product/mobilepayment/library/MobilePaymentError;)V", "getError", "()Lcom/bbva/gp2/android/product/mobilepayment/library/MobilePaymentError;", "payments-mobilepayment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error<T> extends MobilePaymentResult<T> {

        @NotNull
        private final MobilePaymentError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull MobilePaymentError error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        @NotNull
        public final MobilePaymentError getError() {
            return this.error;
        }
    }

    /* JADX INFO: compiled from: MobilePaymentResult.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/bbva/gp2/android/product/mobilepayment/library/MobilePaymentResult$Result;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/gp2/android/product/mobilepayment/library/MobilePaymentResult;", "value", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "payments-mobilepayment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Result<T> extends MobilePaymentResult<T> {
        private final T value;

        public Result(T t10) {
            super(null);
            this.value = t10;
        }

        public final T getValue() {
            return this.value;
        }
    }

    private MobilePaymentResult() {
    }

    public /* synthetic */ MobilePaymentResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
