package com.bbva.glomohybrid.base.shortcuts;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ShortcutModel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0002\u0010\u0006*2\u0010\u0007\"\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b0\u00052\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b0\u0005¨\u0006\u000b"}, d2 = {"toIntent", "Landroid/content/Intent;", "Lcom/bbva/glomohybrid/base/shortcuts/Action;", "toIntentArray", "", "", "(Ljava/util/List;)[Landroid/content/Intent;", "JsonActions", "", "", "", "Base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nShortcutModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShortcutModel.kt\ncom/bbva/glomohybrid/base/shortcuts/ShortcutModelKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,51:1\n1549#2:52\n1620#2,3:53\n37#3,2:56\n*S KotlinDebug\n*F\n+ 1 ShortcutModel.kt\ncom/bbva/glomohybrid/base/shortcuts/ShortcutModelKt\n*L\n42#1:52\n42#1:53,3\n42#1:56,2\n*E\n"})
public final class ShortcutModelKt {
    @NotNull
    public static final Intent toIntent(@NotNull Action action) {
        Intrinsics.checkNotNullParameter(action, "<this>");
        Intent intent = new Intent();
        intent.setAction(action.getAction());
        intent.setClassName(action.getTargetPackage(), action.getTargetClass());
        intent.setFlags(268468224);
        return intent;
    }

    @NotNull
    public static final Intent[] toIntentArray(@NotNull List<Action> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<Action> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(toIntent((Action) it.next()));
        }
        return (Intent[]) arrayList.toArray(new Intent[0]);
    }
}
