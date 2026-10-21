package com.bbva.glomohybrid.base.extensions;

import com.bbva.glomohybrid.base.cells.helper.PageReactionDelegator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PageDelegatorExtensions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"configureAll", "", "", "Lcom/bbva/glomohybrid/base/cells/helper/PageReactionDelegator;", "Base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPageDelegatorExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageDelegatorExtensions.kt\ncom/bbva/glomohybrid/base/extensions/PageDelegatorExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,8:1\n1855#2,2:9\n*S KotlinDebug\n*F\n+ 1 PageDelegatorExtensions.kt\ncom/bbva/glomohybrid/base/extensions/PageDelegatorExtensionsKt\n*L\n6#1:9,2\n*E\n"})
public final class PageDelegatorExtensionsKt {
    public static final void configureAll(@NotNull List<? extends PageReactionDelegator> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((PageReactionDelegator) it.next()).configure();
        }
    }
}
