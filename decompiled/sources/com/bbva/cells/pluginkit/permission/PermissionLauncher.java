package com.bbva.cells.pluginkit.permission;

import android.app.Activity;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PermissionLauncher.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J-\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/bbva/cells/pluginkit/permission/PermissionLauncher;", "", "request", "Lcom/bbva/cells/pluginkit/permission/PermissionReport;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "permissions", "", "", "(Landroid/app/Activity;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public interface PermissionLauncher {
    @Nullable
    Object request(@NotNull Activity activity, @NotNull String[] strArr, @NotNull Continuation<? super PermissionReport> continuation);
}
