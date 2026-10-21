package com.bbva.component.dm.biometriclogin.domain.model;

import ad.d;
import com.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginAnalyticsReactions;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BiometricErrorNavigation.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\b\t\n\u000b\f\r\u000e\u000f\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\t\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation;", "", "", "a", "Ljava/lang/String;", "getBiometricType", "()Ljava/lang/String;", BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE, "BlockedPassword", "ExpiredPassword", "Fatal", "FriendlyFraud", "InactiveAccount", "NetworkUnavailable", "NotEnrolled", "Retry", "UserLockOut", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation$BlockedPassword;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation$ExpiredPassword;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation$Fatal;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation$FriendlyFraud;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation$InactiveAccount;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation$NetworkUnavailable;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation$NotEnrolled;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation$Retry;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation$UserLockOut;", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public abstract class BiometricErrorNavigation {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String biometricType;

    /* JADX INFO: compiled from: BiometricErrorNavigation.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation$BlockedPassword;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation;", "", "component1", BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "b", "Ljava/lang/String;", "getBiometricType", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class BlockedPassword extends BiometricErrorNavigation {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String biometricType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BlockedPassword(@NotNull String biometricType) {
            super(biometricType, null);
            Intrinsics.checkNotNullParameter(biometricType, "biometricType");
            this.biometricType = biometricType;
        }

        public static /* synthetic */ BlockedPassword copy$default(BlockedPassword blockedPassword, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = blockedPassword.biometricType;
            }
            return blockedPassword.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBiometricType() {
            return this.biometricType;
        }

        @NotNull
        public final BlockedPassword copy(@NotNull String biometricType) {
            Intrinsics.checkNotNullParameter(biometricType, "biometricType");
            return new BlockedPassword(biometricType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BlockedPassword) && Intrinsics.areEqual(this.biometricType, ((BlockedPassword) other).biometricType);
        }

        @Override // com.bbva.component.dm.biometriclogin.domain.model.BiometricErrorNavigation
        @NotNull
        public String getBiometricType() {
            return this.biometricType;
        }

        public int hashCode() {
            return this.biometricType.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("BlockedPassword(biometricType="), this.biometricType, ")");
        }
    }

    /* JADX INFO: compiled from: BiometricErrorNavigation.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation$ExpiredPassword;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation;", "", "component1", BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "b", "Ljava/lang/String;", "getBiometricType", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class ExpiredPassword extends BiometricErrorNavigation {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String biometricType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExpiredPassword(@NotNull String biometricType) {
            super(biometricType, null);
            Intrinsics.checkNotNullParameter(biometricType, "biometricType");
            this.biometricType = biometricType;
        }

        public static /* synthetic */ ExpiredPassword copy$default(ExpiredPassword expiredPassword, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = expiredPassword.biometricType;
            }
            return expiredPassword.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBiometricType() {
            return this.biometricType;
        }

        @NotNull
        public final ExpiredPassword copy(@NotNull String biometricType) {
            Intrinsics.checkNotNullParameter(biometricType, "biometricType");
            return new ExpiredPassword(biometricType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ExpiredPassword) && Intrinsics.areEqual(this.biometricType, ((ExpiredPassword) other).biometricType);
        }

        @Override // com.bbva.component.dm.biometriclogin.domain.model.BiometricErrorNavigation
        @NotNull
        public String getBiometricType() {
            return this.biometricType;
        }

        public int hashCode() {
            return this.biometricType.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("ExpiredPassword(biometricType="), this.biometricType, ")");
        }
    }

    /* JADX INFO: compiled from: BiometricErrorNavigation.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation$Fatal;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation;", "", "component1", BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "b", "Ljava/lang/String;", "getBiometricType", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Fatal extends BiometricErrorNavigation {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String biometricType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fatal(@NotNull String biometricType) {
            super(biometricType, null);
            Intrinsics.checkNotNullParameter(biometricType, "biometricType");
            this.biometricType = biometricType;
        }

        public static /* synthetic */ Fatal copy$default(Fatal fatal, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = fatal.biometricType;
            }
            return fatal.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBiometricType() {
            return this.biometricType;
        }

        @NotNull
        public final Fatal copy(@NotNull String biometricType) {
            Intrinsics.checkNotNullParameter(biometricType, "biometricType");
            return new Fatal(biometricType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Fatal) && Intrinsics.areEqual(this.biometricType, ((Fatal) other).biometricType);
        }

        @Override // com.bbva.component.dm.biometriclogin.domain.model.BiometricErrorNavigation
        @NotNull
        public String getBiometricType() {
            return this.biometricType;
        }

        public int hashCode() {
            return this.biometricType.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("Fatal(biometricType="), this.biometricType, ")");
        }
    }

    /* JADX INFO: compiled from: BiometricErrorNavigation.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation$FriendlyFraud;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation;", "", "component1", BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "b", "Ljava/lang/String;", "getBiometricType", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class FriendlyFraud extends BiometricErrorNavigation {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String biometricType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FriendlyFraud(@NotNull String biometricType) {
            super(biometricType, null);
            Intrinsics.checkNotNullParameter(biometricType, "biometricType");
            this.biometricType = biometricType;
        }

        public static /* synthetic */ FriendlyFraud copy$default(FriendlyFraud friendlyFraud, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = friendlyFraud.biometricType;
            }
            return friendlyFraud.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBiometricType() {
            return this.biometricType;
        }

        @NotNull
        public final FriendlyFraud copy(@NotNull String biometricType) {
            Intrinsics.checkNotNullParameter(biometricType, "biometricType");
            return new FriendlyFraud(biometricType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FriendlyFraud) && Intrinsics.areEqual(this.biometricType, ((FriendlyFraud) other).biometricType);
        }

        @Override // com.bbva.component.dm.biometriclogin.domain.model.BiometricErrorNavigation
        @NotNull
        public String getBiometricType() {
            return this.biometricType;
        }

        public int hashCode() {
            return this.biometricType.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("FriendlyFraud(biometricType="), this.biometricType, ")");
        }
    }

    /* JADX INFO: compiled from: BiometricErrorNavigation.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation$InactiveAccount;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation;", "", "component1", BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "b", "Ljava/lang/String;", "getBiometricType", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class InactiveAccount extends BiometricErrorNavigation {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String biometricType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InactiveAccount(@NotNull String biometricType) {
            super(biometricType, null);
            Intrinsics.checkNotNullParameter(biometricType, "biometricType");
            this.biometricType = biometricType;
        }

        public static /* synthetic */ InactiveAccount copy$default(InactiveAccount inactiveAccount, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = inactiveAccount.biometricType;
            }
            return inactiveAccount.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBiometricType() {
            return this.biometricType;
        }

        @NotNull
        public final InactiveAccount copy(@NotNull String biometricType) {
            Intrinsics.checkNotNullParameter(biometricType, "biometricType");
            return new InactiveAccount(biometricType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InactiveAccount) && Intrinsics.areEqual(this.biometricType, ((InactiveAccount) other).biometricType);
        }

        @Override // com.bbva.component.dm.biometriclogin.domain.model.BiometricErrorNavigation
        @NotNull
        public String getBiometricType() {
            return this.biometricType;
        }

        public int hashCode() {
            return this.biometricType.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("InactiveAccount(biometricType="), this.biometricType, ")");
        }
    }

    /* JADX INFO: compiled from: BiometricErrorNavigation.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation$NetworkUnavailable;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation;", "", "component1", BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "b", "Ljava/lang/String;", "getBiometricType", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class NetworkUnavailable extends BiometricErrorNavigation {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String biometricType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkUnavailable(@NotNull String biometricType) {
            super(biometricType, null);
            Intrinsics.checkNotNullParameter(biometricType, "biometricType");
            this.biometricType = biometricType;
        }

        public static /* synthetic */ NetworkUnavailable copy$default(NetworkUnavailable networkUnavailable, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = networkUnavailable.biometricType;
            }
            return networkUnavailable.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBiometricType() {
            return this.biometricType;
        }

        @NotNull
        public final NetworkUnavailable copy(@NotNull String biometricType) {
            Intrinsics.checkNotNullParameter(biometricType, "biometricType");
            return new NetworkUnavailable(biometricType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NetworkUnavailable) && Intrinsics.areEqual(this.biometricType, ((NetworkUnavailable) other).biometricType);
        }

        @Override // com.bbva.component.dm.biometriclogin.domain.model.BiometricErrorNavigation
        @NotNull
        public String getBiometricType() {
            return this.biometricType;
        }

        public int hashCode() {
            return this.biometricType.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("NetworkUnavailable(biometricType="), this.biometricType, ")");
        }
    }

    /* JADX INFO: compiled from: BiometricErrorNavigation.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation$NotEnrolled;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation;", "", "component1", BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "b", "Ljava/lang/String;", "getBiometricType", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class NotEnrolled extends BiometricErrorNavigation {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String biometricType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotEnrolled(@NotNull String biometricType) {
            super(biometricType, null);
            Intrinsics.checkNotNullParameter(biometricType, "biometricType");
            this.biometricType = biometricType;
        }

        public static /* synthetic */ NotEnrolled copy$default(NotEnrolled notEnrolled, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = notEnrolled.biometricType;
            }
            return notEnrolled.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBiometricType() {
            return this.biometricType;
        }

        @NotNull
        public final NotEnrolled copy(@NotNull String biometricType) {
            Intrinsics.checkNotNullParameter(biometricType, "biometricType");
            return new NotEnrolled(biometricType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NotEnrolled) && Intrinsics.areEqual(this.biometricType, ((NotEnrolled) other).biometricType);
        }

        @Override // com.bbva.component.dm.biometriclogin.domain.model.BiometricErrorNavigation
        @NotNull
        public String getBiometricType() {
            return this.biometricType;
        }

        public int hashCode() {
            return this.biometricType.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("NotEnrolled(biometricType="), this.biometricType, ")");
        }
    }

    /* JADX INFO: compiled from: BiometricErrorNavigation.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation$Retry;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation;", "", "component1", BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "b", "Ljava/lang/String;", "getBiometricType", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Retry extends BiometricErrorNavigation {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String biometricType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Retry(@NotNull String biometricType) {
            super(biometricType, null);
            Intrinsics.checkNotNullParameter(biometricType, "biometricType");
            this.biometricType = biometricType;
        }

        public static /* synthetic */ Retry copy$default(Retry retry, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = retry.biometricType;
            }
            return retry.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBiometricType() {
            return this.biometricType;
        }

        @NotNull
        public final Retry copy(@NotNull String biometricType) {
            Intrinsics.checkNotNullParameter(biometricType, "biometricType");
            return new Retry(biometricType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Retry) && Intrinsics.areEqual(this.biometricType, ((Retry) other).biometricType);
        }

        @Override // com.bbva.component.dm.biometriclogin.domain.model.BiometricErrorNavigation
        @NotNull
        public String getBiometricType() {
            return this.biometricType;
        }

        public int hashCode() {
            return this.biometricType.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("Retry(biometricType="), this.biometricType, ")");
        }
    }

    /* JADX INFO: compiled from: BiometricErrorNavigation.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation$UserLockOut;", "Lcom/bbva/component/dm/biometriclogin/domain/model/BiometricErrorNavigation;", "", "component1", BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "b", "Ljava/lang/String;", "getBiometricType", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class UserLockOut extends BiometricErrorNavigation {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String biometricType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserLockOut(@NotNull String biometricType) {
            super(biometricType, null);
            Intrinsics.checkNotNullParameter(biometricType, "biometricType");
            this.biometricType = biometricType;
        }

        public static /* synthetic */ UserLockOut copy$default(UserLockOut userLockOut, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = userLockOut.biometricType;
            }
            return userLockOut.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBiometricType() {
            return this.biometricType;
        }

        @NotNull
        public final UserLockOut copy(@NotNull String biometricType) {
            Intrinsics.checkNotNullParameter(biometricType, "biometricType");
            return new UserLockOut(biometricType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UserLockOut) && Intrinsics.areEqual(this.biometricType, ((UserLockOut) other).biometricType);
        }

        @Override // com.bbva.component.dm.biometriclogin.domain.model.BiometricErrorNavigation
        @NotNull
        public String getBiometricType() {
            return this.biometricType;
        }

        public int hashCode() {
            return this.biometricType.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("UserLockOut(biometricType="), this.biometricType, ")");
        }
    }

    public BiometricErrorNavigation(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.biometricType = str;
    }

    @NotNull
    public String getBiometricType() {
        return this.biometricType;
    }
}
