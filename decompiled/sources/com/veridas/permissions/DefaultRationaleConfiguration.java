package com.veridas.permissions;

import android.content.Context;
import com.veridas.common.core.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DefaultRationaleConfiguration.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0018\u0010\t\u001a\u0004\u0018\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0010"}, d2 = {"Lcom/veridas/permissions/DefaultRationaleConfiguration;", "Lcom/veridas/permissions/IRationaleConfigurationProvider;", "", "isRationaleEnabled", "", "Lcom/veridas/permissions/IPermission;", "permissions", "", "getTitle", "getMessage", "getPositiveButton", "getNegativeButtonText", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "common-core_release"}, k = 1, mv = {1, 9, 0})
public final class DefaultRationaleConfiguration implements IRationaleConfigurationProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f67268a;

    public DefaultRationaleConfiguration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f67268a = context;
    }

    @Override // com.veridas.permissions.IRationaleConfigurationProvider
    @Nullable
    public String getMessage(@NotNull List<? extends IPermission> permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        return this.f67268a.getString(R.string.cc_rationale_message);
    }

    @Override // com.veridas.permissions.IRationaleConfigurationProvider
    @Nullable
    public String getNegativeButtonText() {
        return this.f67268a.getString(R.string.cc_rationale_negative_button);
    }

    @Override // com.veridas.permissions.IRationaleConfigurationProvider
    @NotNull
    public String getPositiveButton() {
        String string = this.f67268a.getString(R.string.cc_rationale_positive_button);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.veridas.permissions.IRationaleConfigurationProvider
    @Nullable
    public String getTitle(@NotNull List<? extends IPermission> permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        return this.f67268a.getString(R.string.cc_rationale_title);
    }

    @Override // com.veridas.permissions.IRationaleConfigurationProvider
    public boolean isRationaleEnabled() {
        return true;
    }
}
