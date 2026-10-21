package com.bbva.ethermobilesdk.token.model;

import androidx.camera.core.impl.a;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/ethermobilesdk/token/model/EtherTokenResult;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "Error", "Success", "Lcom/bbva/ethermobilesdk/token/model/EtherTokenResult$Error;", "Lcom/bbva/ethermobilesdk/token/model/EtherTokenResult$Success;", "ethertoken_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class EtherTokenResult<T> {

    /* JADX INFO: compiled from: Model.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/bbva/ethermobilesdk/token/model/EtherTokenResult$Error;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/ethermobilesdk/token/model/EtherTokenResult;", "Lcom/bbva/ethermobilesdk/token/model/EtherTokenError;", "component1", "value", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/ethermobilesdk/token/model/EtherTokenError;", "getValue", "()Lcom/bbva/ethermobilesdk/token/model/EtherTokenError;", "<init>", "(Lcom/bbva/ethermobilesdk/token/model/EtherTokenError;)V", "ethertoken_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Error<T> extends EtherTokenResult<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final EtherTokenError value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull EtherTokenError value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public static /* synthetic */ Error copy$default(Error error, EtherTokenError etherTokenError, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                etherTokenError = error.value;
            }
            return error.copy(etherTokenError);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final EtherTokenError getValue() {
            return this.value;
        }

        @NotNull
        public final Error<T> copy(@NotNull EtherTokenError value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Error<>(value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.value, ((Error) other).value);
        }

        @NotNull
        public final EtherTokenError getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(value=" + this.value + ")";
        }
    }

    /* JADX INFO: compiled from: Model.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0003\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u0001HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0005\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u0015"}, d2 = {"Lcom/bbva/ethermobilesdk/token/model/EtherTokenResult$Success;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/ethermobilesdk/token/model/EtherTokenResult;", "component1", "()Ljava/lang/Object;", "value", "copy", "(Ljava/lang/Object;)Lcom/bbva/ethermobilesdk/token/model/EtherTokenResult$Success;", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/Object;", "getValue", "<init>", "(Ljava/lang/Object;)V", "ethertoken_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Success<T> extends EtherTokenResult<T> {

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
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.value, ((Success) other).value);
        }

        public final T getValue() {
            return this.value;
        }

        public int hashCode() {
            T t10 = this.value;
            if (t10 == null) {
                return 0;
            }
            return t10.hashCode();
        }

        @NotNull
        public String toString() {
            return a.e(new StringBuilder("Success(value="), this.value, ")");
        }
    }

    public EtherTokenResult() {
    }

    public /* synthetic */ EtherTokenResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
