package com.bbva.showinfo.nativemodal.utils;

import com.bbva.showinfo.nativemodal.modal.Item;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Mapper.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u0005"}, d2 = {"", "Lcom/bbva/showinfo/nativemodal/modal/Item;", "", "selectByDefault", "withSelectedItemByDefault", "showinfo_release"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mapper.kt\ncom/bbva/showinfo/nativemodal/utils/MapperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,18:1\n1549#2:19\n1620#2,3:20\n*S KotlinDebug\n*F\n+ 1 Mapper.kt\ncom/bbva/showinfo/nativemodal/utils/MapperKt\n*L\n7#1:19\n7#1:20,3\n*E\n"})
public final class MapperKt {
    @NotNull
    public static final List<Item> withSelectedItemByDefault(@NotNull List<Item> list, @Nullable String str) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<Item> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (Item item : list2) {
            item.setSelected(str == null ? false : Intrinsics.areEqual(str, item.getTag()));
            arrayList.add(item);
        }
        return arrayList;
    }
}
