package com.bbva.glomoutils;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ListExtensions.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"replaceOrInsert", "", ExifInterface.GPS_DIRECTION_TRUE, "value", "predicate", "Lkotlin/Function1;", "", "(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "gl-utils_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nListExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListExtensions.kt\ncom/bbva/glomoutils/ListExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,14:1\n350#2,7:15\n*S KotlinDebug\n*F\n+ 1 ListExtensions.kt\ncom/bbva/glomoutils/ListExtensionsKt\n*L\n5#1:15,7\n*E\n"})
public final class ListExtensionsKt {
    @NotNull
    public static final <T> List<T> replaceOrInsert(@NotNull List<? extends T> list, T t10, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        List<T> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
        Iterator<? extends T> it = list.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (predicate.invoke(it.next()).booleanValue()) {
                break;
            }
            i10++;
        }
        if (i10 != -1) {
            mutableList.set(i10, t10);
        } else {
            mutableList.add(t10);
        }
        return mutableList;
    }
}
