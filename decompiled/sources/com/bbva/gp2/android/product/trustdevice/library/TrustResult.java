package com.bbva.gp2.android.product.trustdevice.library;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TrustResult.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/gp2/android/product/trustdevice/library/TrustResult;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "Error", "Result", "Lcom/bbva/gp2/android/product/trustdevice/library/TrustResult$Result;", "Lcom/bbva/gp2/android/product/trustdevice/library/TrustResult$Error;", "payments-trustdevice_release"}, k = 1, mv = {1, 1, 16})
public abstract class TrustResult<T> {

    /* JADX INFO: compiled from: TrustResult.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/gp2/android/product/trustdevice/library/TrustResult$Error;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/gp2/android/product/trustdevice/library/TrustResult;", "error", "Lcom/bbva/gp2/android/product/trustdevice/library/TrustError;", "(Lcom/bbva/gp2/android/product/trustdevice/library/TrustError;)V", "getError", "()Lcom/bbva/gp2/android/product/trustdevice/library/TrustError;", "payments-trustdevice_release"}, k = 1, mv = {1, 1, 16})
    public static final class Error<T> extends TrustResult<T> {

        @NotNull
        private final TrustError error;

        public Error(@NotNull TrustError trustError) {
            super(null);
            this.error = trustError;
        }

        @NotNull
        public final TrustError getError() {
            return this.error;
        }
    }

    /* JADX INFO: compiled from: TrustResult.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/bbva/gp2/android/product/trustdevice/library/TrustResult$Result;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/gp2/android/product/trustdevice/library/TrustResult;", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "payments-trustdevice_release"}, k = 1, mv = {1, 1, 16})
    public static final class Result<T> extends TrustResult<T> {
        private final T value;

        public Result(T t10) {
            super(null);
            this.value = t10;
        }

        public final T getValue() {
            return this.value;
        }
    }

    private TrustResult() {
    }

    public /* synthetic */ TrustResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
