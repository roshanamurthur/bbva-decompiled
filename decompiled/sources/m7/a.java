package m7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import bk.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Provider.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends c {
    @Override // m7.c
    @SuppressLint({"QueryPermissionsNeeded"})
    @NotNull
    public final List<ProviderInfo> b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(8);
        Intrinsics.checkNotNullExpressionValue(installedPackages, "context.packageManager\n            .getInstalledPackages(PackageManager.GET_PROVIDERS)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : installedPackages) {
            if (((PackageInfo) obj).providers != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ProviderInfo[] providerInfoArr = ((PackageInfo) it.next()).providers;
            Intrinsics.checkNotNullExpressionValue(providerInfoArr, "it.providers");
            g.addAll(arrayList2, ArraysKt___ArraysKt.toList(providerInfoArr));
        }
        return arrayList2;
    }
}
