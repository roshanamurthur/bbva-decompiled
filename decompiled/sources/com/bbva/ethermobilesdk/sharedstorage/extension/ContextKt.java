package com.bbva.ethermobilesdk.sharedstorage.extension;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Build;
import androidx.annotation.RequiresApi;
import bk.g;
import com.bbva.ethermobilesdk.plugin.command.hash.HashCommand;
import com.bbva.ethermobilesdk.sharedstorage.model.AppSignature;
import dk.e;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000\u001a\"\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000\u001a\u001c\u0010\u000f\u001a\u00020\n*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0001H\u0001¨\u0006\u0010"}, d2 = {"Landroid/content/Context;", "", "group", "", "Lcom/bbva/ethermobilesdk/sharedstorage/model/AppSignature;", "allowedApps", "Landroid/content/pm/ProviderInfo;", "queryContentProvider", "Landroid/content/pm/ApplicationInfo;", "info", "", "hasAValidSignature", "", "uid", HashCommand.ID, "hasSigningCertificate", "shared-storage_release"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Context.kt\ncom/bbva/ethermobilesdk/sharedstorage/extension/ContextKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n766#2:64\n857#2,2:65\n1045#2:67\n766#2:68\n857#2,2:69\n766#2:71\n857#2,2:72\n1603#2,9:74\n1855#2:83\n1856#2:85\n1612#2:86\n1360#2:87\n1446#2,5:88\n1747#2,3:93\n1747#2,3:96\n1#3:84\n*S KotlinDebug\n*F\n+ 1 Context.kt\ncom/bbva/ethermobilesdk/sharedstorage/extension/ContextKt\n*L\n20#1:64\n20#1:65,2\n21#1:67\n22#1:68\n22#1:69,2\n23#1:71\n23#1:72,2\n27#1:74,9\n27#1:83\n27#1:85\n27#1:86\n34#1:87\n34#1:88,5\n41#1:93,3\n51#1:96,3\n27#1:84\n*E\n"})
public final class ContextKt {
    public static final boolean hasAValidSignature(@NotNull Context context, @NotNull ApplicationInfo info, @NotNull List<AppSignature> allowedApps) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(allowedApps, "allowedApps");
        boolean z10 = true;
        if (Build.VERSION.SDK_INT >= 28) {
            List<AppSignature> list = allowedApps;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (hasSigningCertificate(context, info.uid, ((AppSignature) it.next()).getSha256())) {
                        return true;
                    }
                }
            }
            return false;
        }
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(info.packageName, 64);
        if (packageInfo.signatures.length > 1) {
            return false;
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(packageInfo.signatures[0].toByteArray());
            List<AppSignature> list2 = allowedApps;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                z10 = false;
            } else {
                for (AppSignature appSignature : list2) {
                    Intrinsics.checkNotNull(bArrDigest);
                    if (Intrinsics.areEqual(ByteArrayKt.toHex(bArrDigest), appSignature.getSha256())) {
                    }
                }
                z10 = false;
            }
            return z10;
        } catch (Exception unused) {
            return false;
        }
    }

    @RequiresApi(28)
    public static final boolean hasSigningCertificate(@NotNull Context context, int i10, @NotNull String hash) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(hash, "hash");
        return context.getPackageManager().hasSigningCertificate(i10, ByteArrayKt.toHexStringToByteArray(hash), 1);
    }

    @NotNull
    public static final List<ProviderInfo> queryContentProvider(@NotNull Context context, @NotNull String group, @NotNull List<AppSignature> allowedApps) {
        ApplicationInfo applicationInfo;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(allowedApps, "allowedApps");
        ArrayList<ApplicationInfo> arrayList = new ArrayList();
        Iterator<T> it = allowedApps.iterator();
        while (it.hasNext()) {
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(((AppSignature) it.next()).getApplicationId(), 128);
            } catch (PackageManager.NameNotFoundException unused) {
                applicationInfo = null;
            }
            if (applicationInfo != null) {
                arrayList.add(applicationInfo);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (ApplicationInfo applicationInfo2 : arrayList) {
            List<ProviderInfo> listQueryContentProviders = context.getPackageManager().queryContentProviders(applicationInfo2.processName, applicationInfo2.uid, 128);
            if (listQueryContentProviders == null) {
                listQueryContentProviders = CollectionsKt__CollectionsKt.emptyList();
            } else {
                Intrinsics.checkNotNull(listQueryContentProviders);
            }
            g.addAll(arrayList2, listQueryContentProviders);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (ProviderInfoKt.hasGroup((ProviderInfo) obj, group)) {
                arrayList3.add(obj);
            }
        }
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList3, new Comparator() { // from class: com.bbva.ethermobilesdk.sharedstorage.extension.ContextKt$queryContentProvider$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return e.compareValues(((ProviderInfo) t10).authority, ((ProviderInfo) t11).authority);
            }
        });
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : listSortedWith) {
            ApplicationInfo applicationInfo3 = ((ProviderInfo) obj2).applicationInfo;
            Intrinsics.checkNotNullExpressionValue(applicationInfo3, "applicationInfo");
            if (hasAValidSignature(context, applicationInfo3, allowedApps)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : arrayList4) {
            if (!ProviderInfoKt.isOwnedBy((ProviderInfo) obj3, context)) {
                arrayList5.add(obj3);
            }
        }
        return arrayList5;
    }
}
