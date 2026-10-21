package com.bbva.component.dm.customer.domain.model;

import androidx.camera.core.impl.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.infoscreen.networkerror.NetworkErrorFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CustomerResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003:\u0002\u0002\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\r\u0010\b\u001a\u0004\u0018\u00018\u0001¢\u0006\u0002\u0010\tJ\r\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\tR\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lcom/bbva/component/dm/customer/domain/model/CustomerResult;", "Success", "Failure", "", "()V", NetworkErrorFragment.IS_SUCCESS, "", "()Z", "getErrorOrNull", "()Ljava/lang/Object;", "getOrNull", "Lcom/bbva/component/dm/customer/domain/model/CustomerResult$Failure;", "Lcom/bbva/component/dm/customer/domain/model/CustomerResult$Success;", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class CustomerResult<Success, Failure> {

    /* JADX INFO: compiled from: CustomerResult.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00020\u0002B\u000f\u0012\u0006\u0010\u0006\u001a\u00028\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0004\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0006\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0005¨\u0006\u0016"}, d2 = {"Lcom/bbva/component/dm/customer/domain/model/CustomerResult$Failure;", "Failure", "Lcom/bbva/component/dm/customer/domain/model/CustomerResult;", "", "component1", "()Ljava/lang/Object;", "error", "copy", "(Ljava/lang/Object;)Lcom/bbva/component/dm/customer/domain/model/CustomerResult$Failure;", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/Object;", "getError", "<init>", "(Ljava/lang/Object;)V", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Failure<Failure> extends CustomerResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final Failure error;

        public Failure(Failure failure) {
            super(null);
            this.error = failure;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Failure copy$default(Failure failure, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = failure.error;
            }
            return failure.copy(obj);
        }

        public final Failure component1() {
            return this.error;
        }

        @NotNull
        public final Failure<Failure> copy(Failure error) {
            return new Failure<>(error);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.areEqual(this.error, ((Failure) other).error);
        }

        public final Failure getError() {
            return this.error;
        }

        public int hashCode() {
            Failure failure = this.error;
            if (failure == null) {
                return 0;
            }
            return failure.hashCode();
        }

        @NotNull
        public String toString() {
            return a.e(new StringBuilder("Failure(error="), this.error, ")");
        }
    }

    /* JADX INFO: compiled from: CustomerResult.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0006\u001a\u00028\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0004\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0006\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0005¨\u0006\u0016"}, d2 = {"Lcom/bbva/component/dm/customer/domain/model/CustomerResult$Success;", "Success", "Lcom/bbva/component/dm/customer/domain/model/CustomerResult;", "", "component1", "()Ljava/lang/Object;", "value", "copy", "(Ljava/lang/Object;)Lcom/bbva/component/dm/customer/domain/model/CustomerResult$Success;", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/Object;", "getValue", "<init>", "(Ljava/lang/Object;)V", "component-dm-customer_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Success<Success> extends CustomerResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final Success value;

        public Success(Success success) {
            super(null);
            this.value = success;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = success.value;
            }
            return success.copy(obj);
        }

        public final Success component1() {
            return this.value;
        }

        @NotNull
        public final Success<Success> copy(Success value) {
            return new Success<>(value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.value, ((Success) other).value);
        }

        public final Success getValue() {
            return this.value;
        }

        public int hashCode() {
            Success success = this.value;
            if (success == null) {
                return 0;
            }
            return success.hashCode();
        }

        @NotNull
        public String toString() {
            return a.e(new StringBuilder("Success(value="), this.value, ")");
        }
    }

    public CustomerResult() {
    }

    public /* synthetic */ CustomerResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public final Failure getErrorOrNull() {
        Failure failure = this instanceof Failure ? (Failure) this : null;
        if (failure != null) {
            return (Failure) failure.getError();
        }
        return null;
    }

    @Nullable
    public final Success getOrNull() {
        Success success = this instanceof Success ? (Success) this : null;
        if (success != null) {
            return (Success) success.getValue();
        }
        return null;
    }

    public final boolean isSuccess() {
        return this instanceof Success;
    }
}
