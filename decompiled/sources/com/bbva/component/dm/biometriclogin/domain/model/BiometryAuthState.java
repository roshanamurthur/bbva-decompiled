package com.bbva.component.dm.biometriclogin.domain.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BiometryAuthState.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0005\u0006\u0007\b\t\nB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u0082\u0001\u0006\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState;", "", "()V", "isAvailable", "", "Available", "Cancelled", "Fraud", "NetworkUnavailable", "NotAvailable", "Retry", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState$Available;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState$Cancelled;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState$Fraud;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState$NetworkUnavailable;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState$NotAvailable;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState$Retry;", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class BiometryAuthState {

    /* JADX INFO: compiled from: BiometryAuthState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState$Available;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState;", "()V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Available extends BiometryAuthState {

        @NotNull
        public static final Available INSTANCE = new Available();

        public Available() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: BiometryAuthState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState$Cancelled;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState;", "()V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Cancelled extends BiometryAuthState {

        @NotNull
        public static final Cancelled INSTANCE = new Cancelled();

        public Cancelled() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: BiometryAuthState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState$Fraud;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState;", "()V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Fraud extends BiometryAuthState {

        @NotNull
        public static final Fraud INSTANCE = new Fraud();

        public Fraud() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: BiometryAuthState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState$NetworkUnavailable;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState;", "()V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NetworkUnavailable extends BiometryAuthState {

        @NotNull
        public static final NetworkUnavailable INSTANCE = new NetworkUnavailable();

        public NetworkUnavailable() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: BiometryAuthState.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0003J\u001b\u0010\u0006\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001f\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState$NotAvailable;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "component1", "ex", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/Exception;", "getEx", "()Ljava/lang/Exception;", "<init>", "(Ljava/lang/Exception;)V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class NotAvailable extends BiometryAuthState {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Exception ex;

        /* JADX WARN: Multi-variable type inference failed */
        public NotAvailable() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NotAvailable copy$default(NotAvailable notAvailable, Exception exc, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                exc = notAvailable.ex;
            }
            return notAvailable.copy(exc);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Exception getEx() {
            return this.ex;
        }

        @NotNull
        public final NotAvailable copy(@Nullable Exception ex) {
            return new NotAvailable(ex);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NotAvailable) && Intrinsics.areEqual(this.ex, ((NotAvailable) other).ex);
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
            return "NotAvailable(ex=" + this.ex + ")";
        }

        public NotAvailable(@Nullable Exception exc) {
            super(null);
            this.ex = exc;
        }

        public /* synthetic */ NotAvailable(Exception exc, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : exc);
        }
    }

    /* JADX INFO: compiled from: BiometryAuthState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState$Retry;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometryAuthState;", "()V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Retry extends BiometryAuthState {

        @NotNull
        public static final Retry INSTANCE = new Retry();

        public Retry() {
            super(null);
        }
    }

    public BiometryAuthState() {
    }

    public /* synthetic */ BiometryAuthState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean isAvailable() {
        return (this instanceof Available) || (this instanceof Cancelled) || (this instanceof Retry);
    }
}
