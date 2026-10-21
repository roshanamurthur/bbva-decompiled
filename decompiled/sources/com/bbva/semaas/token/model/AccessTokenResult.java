package com.bbva.semaas.token.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.semaas.model.AccessToken;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AccessTokenResult.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/semaas/token/model/AccessTokenResult;", "", "()V", "Error", "Success", "Lcom/bbva/semaas/token/model/AccessTokenResult$Error;", "Lcom/bbva/semaas/token/model/AccessTokenResult$Success;", "semaas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AccessTokenResult {

    /* JADX INFO: compiled from: AccessTokenResult.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/bbva/semaas/token/model/AccessTokenResult$Error;", "Lcom/bbva/semaas/token/model/AccessTokenResult;", "value", "Lcom/bbva/semaas/token/model/AccessTokenError;", "(Lcom/bbva/semaas/token/model/AccessTokenError;)V", "getValue", "()Lcom/bbva/semaas/token/model/AccessTokenError;", "component1", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "semaas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Error extends AccessTokenResult {

        @NotNull
        private final AccessTokenError value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull AccessTokenError value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public static /* synthetic */ Error copy$default(Error error, AccessTokenError accessTokenError, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                accessTokenError = error.value;
            }
            return error.copy(accessTokenError);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AccessTokenError getValue() {
            return this.value;
        }

        @NotNull
        public final Error copy(@NotNull AccessTokenError value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Error(value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && this.value == ((Error) other).value;
        }

        @NotNull
        public final AccessTokenError getValue() {
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

    /* JADX INFO: compiled from: AccessTokenResult.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/bbva/semaas/token/model/AccessTokenResult$Success;", "Lcom/bbva/semaas/token/model/AccessTokenResult;", "value", "Lcom/bbva/semaas/model/AccessToken;", "(Lcom/bbva/semaas/model/AccessToken;)V", "getValue", "()Lcom/bbva/semaas/model/AccessToken;", "component1", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "semaas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Success extends AccessTokenResult {

        @NotNull
        private final AccessToken value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull AccessToken value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public static /* synthetic */ Success copy$default(Success success, AccessToken accessToken, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                accessToken = success.value;
            }
            return success.copy(accessToken);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AccessToken getValue() {
            return this.value;
        }

        @NotNull
        public final Success copy(@NotNull AccessToken value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Success(value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.value, ((Success) other).value);
        }

        @NotNull
        public final AccessToken getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "Success(value=" + this.value + ")";
        }
    }

    private AccessTokenResult() {
    }

    public /* synthetic */ AccessTokenResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
