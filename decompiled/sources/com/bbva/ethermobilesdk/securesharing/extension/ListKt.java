package com.bbva.ethermobilesdk.securesharing.extension;

import android.content.ContentValues;
import com.bbva.ethermobilesdk.securesharing.model.Entry;
import com.bbva.ethermobilesdk.securesharing.model.ProviderInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: List.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001d\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0002\u0010\u0005\u001a\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00070\u0003H\u0000¢\u0006\u0002\u0010\u0005¨\u0006\b"}, d2 = {"toContentValue", "", "Landroid/content/ContentValues;", "", "Lcom/bbva/ethermobilesdk/securesharing/model/Entry;", "(Ljava/util/List;)[Landroid/content/ContentValues;", "toContentValues", "Lcom/bbva/ethermobilesdk/securesharing/model/ProviderInfo;", "securesharing_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ListKt {
    @NotNull
    public static final ContentValues[] toContentValue(@NotNull List<Entry> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<Entry> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Entry) it.next()).toContentValues());
        }
        Object[] array = arrayList.toArray(new ContentValues[0]);
        if (array != null) {
            return (ContentValues[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @NotNull
    public static final ContentValues[] toContentValues(@NotNull List<ProviderInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<ProviderInfo> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProviderInfo) it.next()).toContentValues());
        }
        Object[] array = arrayList.toArray(new ContentValues[0]);
        if (array != null) {
            return (ContentValues[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
