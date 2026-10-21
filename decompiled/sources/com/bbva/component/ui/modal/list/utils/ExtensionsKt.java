package com.bbva.component.ui.modal.list.utils;

import com.bbva.component.ui.modal.list.model.Item;
import com.bbva.component.ui.modal.list.model.ItemData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Extensions.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000*\b\u0012\u0004\u0012\u00020\u00040\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¨\u0006\b"}, d2 = {"", "Lcom/bbva/component/ui/modal/list/model/ItemData;", "", "selectByDefault", "Lcom/bbva/component/ui/modal/list/model/Item;", "toItems", "selectedItemTag", "select", "component-ui-modal_release"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\ncom/bbva/component/ui/modal/list/utils/ExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,33:1\n1559#2:34\n1590#2,4:35\n1864#2,3:39\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\ncom/bbva/component/ui/modal/list/utils/ExtensionsKt\n*L\n8#1:34\n8#1:35,4\n20#1:39,3\n*E\n"})
public final class ExtensionsKt {
    @NotNull
    public static final List<Item> select(@NotNull List<Item> list, @Nullable String str) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Item item = (Item) obj;
            item.setSelected((i10 == 0 && str == null) ? true : Intrinsics.areEqual(str, item.getTag()));
            i10 = i11;
        }
        return list;
    }

    @NotNull
    public static final List<Item> toItems(@NotNull List<ItemData> list, @Nullable String str) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<ItemData> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        int i10 = 0;
        for (Object obj : list2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            ItemData itemData = (ItemData) obj;
            arrayList.add(new Item(itemData.getTag(), itemData.getText(), itemData.getAccessibleText(), itemData.getAccessibleTextOnClick(), i10, (i10 == 0 && str == null) ? true : Intrinsics.areEqual(str, itemData.getTag())));
            i10 = i11;
        }
        return arrayList;
    }
}
