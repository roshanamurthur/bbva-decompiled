package com.bbva.ethermobilesdk.passchecker.model.internal;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.passchecker.model.api.input.Policy;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ValidationConfig.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/model/internal/ValidationConfig;", "", Constants.policy, "Lcom/bbva/ethermobilesdk/passchecker/model/api/input/Policy;", "password", "", "oldPassword", "(Lcom/bbva/ethermobilesdk/passchecker/model/api/input/Policy;Ljava/lang/String;Ljava/lang/String;)V", "getOldPassword", "()Ljava/lang/String;", "getPassword", "getPolicy", "()Lcom/bbva/ethermobilesdk/passchecker/model/api/input/Policy;", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "passchecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ValidationConfig {

    @NotNull
    private final String oldPassword;

    @NotNull
    private final String password;

    @NotNull
    private final Policy policy;

    public ValidationConfig(@NotNull Policy policy, @NotNull String password, @NotNull String oldPassword) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(oldPassword, "oldPassword");
        this.policy = policy;
        this.password = password;
        this.oldPassword = oldPassword;
    }

    public static /* synthetic */ ValidationConfig copy$default(ValidationConfig validationConfig, Policy policy, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            policy = validationConfig.policy;
        }
        if ((i10 & 2) != 0) {
            str = validationConfig.password;
        }
        if ((i10 & 4) != 0) {
            str2 = validationConfig.oldPassword;
        }
        return validationConfig.copy(policy, str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Policy getPolicy() {
        return this.policy;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOldPassword() {
        return this.oldPassword;
    }

    @NotNull
    public final ValidationConfig copy(@NotNull Policy policy, @NotNull String password, @NotNull String oldPassword) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(oldPassword, "oldPassword");
        return new ValidationConfig(policy, password, oldPassword);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidationConfig)) {
            return false;
        }
        ValidationConfig validationConfig = (ValidationConfig) other;
        return Intrinsics.areEqual(this.policy, validationConfig.policy) && Intrinsics.areEqual(this.password, validationConfig.password) && Intrinsics.areEqual(this.oldPassword, validationConfig.oldPassword);
    }

    @NotNull
    public final String getOldPassword() {
        return this.oldPassword;
    }

    @NotNull
    public final String getPassword() {
        return this.password;
    }

    @NotNull
    public final Policy getPolicy() {
        return this.policy;
    }

    public int hashCode() {
        return this.oldPassword.hashCode() + n1.c(this.password, this.policy.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ValidationConfig(policy=");
        sb2.append(this.policy);
        sb2.append(", password=");
        sb2.append(this.password);
        sb2.append(", oldPassword=");
        return y2.b(sb2, this.oldPassword, RootService.CLOSE_BRACKET);
    }
}
