package com.bbva.component.dm.biometriclogin.domain.model;

import ad.d;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BiometryAuthResult.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthResult;", "", "()V", "AuthError", "Success", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthResult$AuthError;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthResult$Success;", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class BiometryAuthResult {

    /* JADX INFO: compiled from: BiometryAuthResult.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0003J\u001b\u0010\u0006\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001f\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthResult$AuthError;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthResult;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "component1", "ex", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/Exception;", "getEx", "()Ljava/lang/Exception;", "<init>", "(Ljava/lang/Exception;)V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class AuthError extends BiometryAuthResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Exception ex;

        /* JADX WARN: Multi-variable type inference failed */
        public AuthError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ AuthError copy$default(AuthError authError, Exception exc, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                exc = authError.ex;
            }
            return authError.copy(exc);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Exception getEx() {
            return this.ex;
        }

        @NotNull
        public final AuthError copy(@Nullable Exception ex) {
            return new AuthError(ex);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AuthError) && Intrinsics.areEqual(this.ex, ((AuthError) other).ex);
        }

        @Nullable
        public final Exception getEx() {
            return this.ex;
        }

        public int hashCode() {
            Exception exc = this.ex;
            if (exc == null) {
                return 0;
            }
            return exc.hashCode();
        }

        @NotNull
        public String toString() {
            return "AuthError(ex=" + this.ex + ")";
        }

        public AuthError(@Nullable Exception exc) {
            super(null);
            this.ex = exc;
        }

        public /* synthetic */ AuthError(Exception exc, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : exc);
        }
    }

    /* JADX INFO: compiled from: BiometryAuthResult.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthResult$Success;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthResult;", "", "component1", Constants.backendRequestUserId, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Success extends BiometryAuthResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String userId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull String userId) {
            super(null);
            Intrinsics.checkNotNullParameter(userId, "userId");
            this.userId = userId;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = success.userId;
            }
            return success.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        @NotNull
        public final Success copy(@NotNull String userId) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            return new Success(userId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.userId, ((Success) other).userId);
        }

        @NotNull
        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            return this.userId.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("Success(userId="), this.userId, ")");
        }
    }

    public BiometryAuthResult() {
    }

    public /* synthetic */ BiometryAuthResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
