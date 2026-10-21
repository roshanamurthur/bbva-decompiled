package m7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import bk.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Provider.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends c {
    @Override // m7.c
    @SuppressLint({"QueryPermissionsNeeded"})
    @NotNull
    public final List<ProviderInfo> b(@NotNull Context context) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
        Intrinsics.checkNotNullExpressionValue(installedPackages, "context.packageManager\n            .getInstalledPackages(0)");
        List<PackageInfo> list = installedPackages;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (PackageInfo packageInfo : list) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(context.getPackageManager().getPackageInfo(packageInfo.packageName, 8));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
                objM5535constructorimpl = null;
            }
            arrayList.add((PackageInfo) objM5535constructorimpl);
        }
        List listFilterNotNull = CollectionsKt___CollectionsKt.filterNotNull(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listFilterNotNull) {
            if (((PackageInfo) obj).providers != null) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ProviderInfo[] providerInfoArr = ((PackageInfo) it.next()).providers;
            Intrinsics.checkNotNullExpressionValue(providerInfoArr, "it.providers");
            g.addAll(arrayList3, ArraysKt___ArraysKt.toList(providerInfoArr));
        }
        return arrayList3;
    }
}
