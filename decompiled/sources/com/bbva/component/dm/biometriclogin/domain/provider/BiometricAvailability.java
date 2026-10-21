package com.bbva.component.dm.biometriclogin.domain.provider;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BiometricAvailability.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/domain/provider/BiometricAvailability;", "", "()V", "toType", "", "Success", "Unavailable", "Lcom/bbva/component/dm/biometriclogin/domain/provider/BiometricAvailability$Success;", "Lcom/bbva/component/dm/biometriclogin/domain/provider/BiometricAvailability$Unavailable;", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class BiometricAvailability {

    /* JADX INFO: compiled from: BiometricAvailability.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/domain/provider/BiometricAvailability$Success;", "Lcom/bbva/component/dm/biometriclogin/domain/provider/BiometricAvailability;", "", "component1", "type", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Success extends BiometricAvailability {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull String type) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = success.type;
            }
            return success.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        public final Success copy(@NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new Success(type);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.type, ((Success) other).type);
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("Success(type="), this.type, ")");
        }
    }

    /* JADX INFO: compiled from: BiometricAvailability.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/domain/provider/BiometricAvailability$Unavailable;", "Lcom/bbva/component/dm/biometriclogin/domain/provider/BiometricAvailability;", "()V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Unavailable extends BiometricAvailability {

        @NotNull
        public static final Unavailable INSTANCE = new Unavailable();

        public Unavailable() {
            super(null);
        }
    }

    public BiometricAvailability() {
    }

    public /* synthetic */ BiometricAvailability(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final String toType() {
        return this instanceof Success ? ((Success) this).getType() : "";
    }
}
