package com.veridas.permissions;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IRationaleConfigurationProvider.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\u0018\u0010\t\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/veridas/permissions/IRationaleConfigurationProvider;", "", "getMessage", "", "permissions", "", "Lcom/veridas/permissions/IPermission;", "getNegativeButtonText", "getPositiveButton", "getTitle", "isRationaleEnabled", "", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface IRationaleConfigurationProvider {
    @Nullable
    String getMessage(@NotNull List<? extends IPermission> permissions);

    @Nullable
    String getNegativeButtonText();

    @NotNull
    String getPositiveButton();

    @Nullable
    String getTitle(@NotNull List<? extends IPermission> permissions);

    boolean isRationaleEnabled();
}
