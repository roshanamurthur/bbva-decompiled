package com.bbva.component.dm.settings.domain.model;

import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoginLowCostConfiguration.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/LoginLowCostConfiguration;", "", "", "component1", "component2", "regex", "valueAap", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getRegex", "()Ljava/lang/String;", "b", "getValueAap", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class LoginLowCostConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("exceptionRegularExpression")
    @NotNull
    private final String regex;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("valueAAP")
    @Nullable
    private final String valueAap;

    public LoginLowCostConfiguration(@NotNull String regex, @Nullable String str) {
        Intrinsics.checkNotNullParameter(regex, "regex");
        this.regex = regex;
        this.valueAap = str;
    }

    public static /* synthetic */ LoginLowCostConfiguration copy$default(LoginLowCostConfiguration loginLowCostConfiguration, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = loginLowCostConfiguration.regex;
        }
        if ((i10 & 2) != 0) {
            str2 = loginLowCostConfiguration.valueAap;
        }
        return loginLowCostConfiguration.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRegex() {
        return this.regex;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValueAap() {
        return this.valueAap;
    }

    @NotNull
    public final LoginLowCostConfiguration copy(@NotNull String regex, @Nullable String valueAap) {
        Intrinsics.checkNotNullParameter(regex, "regex");
        return new LoginLowCostConfiguration(regex, valueAap);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginLowCostConfiguration)) {
            return false;
        }
        LoginLowCostConfiguration loginLowCostConfiguration = (LoginLowCostConfiguration) other;
        return Intrinsics.areEqual(this.regex, loginLowCostConfiguration.regex) && Intrinsics.areEqual(this.valueAap, loginLowCostConfiguration.valueAap);
    }

    @NotNull
    public final String getRegex() {
        return this.regex;
    }

    @Nullable
    public final String getValueAap() {
        return this.valueAap;
    }

    public int hashCode() {
        int iHashCode = this.regex.hashCode() * 31;
        String str = this.valueAap;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return u.g("LoginLowCostConfiguration(regex=", this.regex, ", valueAap=", this.valueAap, ")");
    }
}
