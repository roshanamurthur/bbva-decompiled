package com.bbva.cells.pluginkit.permission;

import android.app.Activity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PermissionManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000*\"\u0010\u000b\"\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¨\u0006\f"}, d2 = {"", "", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "", "granted", "Lcom/bbva/cells/pluginkit/permission/Permission;", "toPermissions", "Lkotlin/Function1;", "Lcom/bbva/cells/pluginkit/permission/PermissionReport;", "", "PermissionResultCallback", "pluginkit_release"}, k = 2, mv = {1, 4, 1})
public final class PermissionManagerKt {
    public static final boolean access$isNotGranted(Activity activity, String str) {
        return ContextCompat.checkSelfPermission(activity, str) != 0;
    }

    @NotNull
    public static final List<Permission> toPermissions(@NotNull List<String> toPermissions, @NotNull Activity activity, boolean z10) {
        Intrinsics.checkNotNullParameter(toPermissions, "$this$toPermissions");
        Intrinsics.checkNotNullParameter(activity, "activity");
        List<String> list = toPermissions;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (String str : list) {
            arrayList.add(new Permission(str, z10 ? false : !ActivityCompat.shouldShowRequestPermissionRationale(activity, str)));
        }
        return arrayList;
    }
}
