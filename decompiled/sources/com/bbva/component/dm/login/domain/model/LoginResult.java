package com.bbva.component.dm.login.domain.model;

import androidx.camera.core.impl.v;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.infoscreen.networkerror.NetworkErrorFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\f\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tJ\r\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/bbva/component/dm/login/domain/model/LoginResult;", "Success", "", "()V", NetworkErrorFragment.IS_SUCCESS, "", "()Z", "getErrorOrNull", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getOrNull", "()Ljava/lang/Object;", "Failure", "Lcom/bbva/component/dm/login/domain/model/LoginResult$Success;", "Lcom/bbva/component/dm/login/domain/model/LoginResult$Failure;", "component-dm-login_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class LoginResult<Success> {

    /* JADX INFO: compiled from: LoginResult.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\u0010\u0006\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\u0007\u001a\u00020\u00002\f\b\u0002\u0010\u0006\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u001b\u0010\u0006\u001a\u00060\u0003j\u0002`\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/bbva/component/dm/login/domain/model/LoginResult$Failure;", "Lcom/bbva/component/dm/login/domain/model/LoginResult;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "component1", "error", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/Exception;", "getError", "()Ljava/lang/Exception;", "<init>", "(Ljava/lang/Exception;)V", "component-dm-login_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Failure extends LoginResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Exception error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@NotNull Exception error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, Exception exc, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                exc = failure.error;
            }
            return failure.copy(exc);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Exception getError() {
            return this.error;
        }

        @NotNull
        public final Failure copy(@NotNull Exception error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Failure(error);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.areEqual(this.error, ((Failure) other).error);
        }

        @NotNull
        public final Exception getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(error=" + this.error + RootService.CLOSE_BRACKET;
        }
    }

    /* JADX INFO: compiled from: LoginResult.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0003\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u0001HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0005\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u0015"}, d2 = {"Lcom/bbva/component/dm/login/domain/model/LoginResult$Success;", "Success", "Lcom/bbva/component/dm/login/domain/model/LoginResult;", "component1", "()Ljava/lang/Object;", "value", "copy", "(Ljava/lang/Object;)Lcom/bbva/component/dm/login/domain/model/LoginResult$Success;", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/Object;", "getValue", "<init>", "(Ljava/lang/Object;)V", "component-dm-login_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Success<Success> extends LoginResult<Success> {

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
            return v.d(new StringBuilder("Success(value="), this.value, RootService.CLOSE_BRACKET);
        }
    }

    public LoginResult() {
    }

    public /* synthetic */ LoginResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public final Exception getErrorOrNull() {
        Failure failure = this instanceof Failure ? (Failure) this : null;
        if (failure == null) {
            return null;
        }
        return failure.getError();
    }

    @Nullable
    public final Success getOrNull() {
        Success success = this instanceof Success ? (Success) this : null;
        if (success == null) {
            return null;
        }
        return (Success) success.getValue();
    }

    public final boolean isSuccess() {
        return this instanceof Success;
    }
}
