package com.bbva.glomohybrid.base.extensions;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FragmentExtensions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a#\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"removeDialogs", "", "Landroidx/fragment/app/FragmentManager;", "removeFragment", k.a.f65040g, "", "", "(Landroidx/fragment/app/FragmentManager;[Ljava/lang/String;)V", "Base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFragmentExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentExtensions.kt\ncom/bbva/glomohybrid/base/extensions/FragmentExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,28:1\n800#2,11:29\n1855#2,2:40\n*S KotlinDebug\n*F\n+ 1 FragmentExtensions.kt\ncom/bbva/glomohybrid/base/extensions/FragmentExtensionsKt\n*L\n12#1:29,11\n13#1:40,2\n*E\n"})
public final class FragmentExtensionsKt {
    public static final void removeDialogs(@NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        List<Fragment> fragments = fragmentManager.getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof DialogFragment) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((DialogFragment) it.next()).dismissAllowingStateLoss();
        }
    }

    public static final void removeFragment(@NotNull FragmentManager fragmentManager, @NotNull String... tags) {
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        Intrinsics.checkNotNullParameter(tags, "tags");
        for (String str : tags) {
            Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag(str);
            if (fragmentFindFragmentByTag != null) {
                fragmentManager.beginTransaction().remove(fragmentFindFragmentByTag).commitAllowingStateLoss();
            }
        }
    }
}
