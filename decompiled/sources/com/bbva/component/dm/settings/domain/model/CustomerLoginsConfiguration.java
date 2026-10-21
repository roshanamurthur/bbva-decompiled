package com.bbva.component.dm.settings.domain.model;

import androidx.camera.camera2.internal.h0;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CustomerLoginsConfiguration.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/CustomerLoginsConfiguration;", "", "", "component1", "regex", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getRegex", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class CustomerLoginsConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("exceptionRegularExpression")
    @NotNull
    private final String regex;

    public CustomerLoginsConfiguration(@NotNull String regex) {
        Intrinsics.checkNotNullParameter(regex, "regex");
        this.regex = regex;
    }

    public static /* synthetic */ CustomerLoginsConfiguration copy$default(CustomerLoginsConfiguration customerLoginsConfiguration, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = customerLoginsConfiguration.regex;
        }
        return customerLoginsConfiguration.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRegex() {
        return this.regex;
    }

    @NotNull
    public final CustomerLoginsConfiguration copy(@NotNull String regex) {
        Intrinsics.checkNotNullParameter(regex, "regex");
        return new CustomerLoginsConfiguration(regex);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CustomerLoginsConfiguration) && Intrinsics.areEqual(this.regex, ((CustomerLoginsConfiguration) other).regex);
    }

    @NotNull
    public final String getRegex() {
        return this.regex;
    }

    public int hashCode() {
        return this.regex.hashCode();
    }

    @NotNull
    public String toString() {
        return h0.b("CustomerLoginsConfiguration(regex=", this.regex, ")");
    }
}
