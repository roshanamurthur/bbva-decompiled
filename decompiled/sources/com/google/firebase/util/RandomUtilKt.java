package com.google.firebase.util;

import androidx.appcompat.widget.g0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RandomUtil.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"Lkotlin/random/Random;", "", "length", "", "nextAlphanumericString", "com.google.firebase-firebase-common"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRandomUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RandomUtil.kt\ncom/google/firebase/util/RandomUtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1#2:43\n1549#3:44\n1620#3,3:45\n*S KotlinDebug\n*F\n+ 1 RandomUtil.kt\ncom/google/firebase/util/RandomUtilKt\n*L\n34#1:44\n34#1:45,3\n*E\n"})
public final class RandomUtilKt {
    @NotNull
    public static final String nextAlphanumericString(@NotNull Random random, int i10) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(g0.c("invalid length: ", i10).toString());
        }
        IntRange intRangeUntil = c.until(0, i10);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            ((IntIterator) it).nextInt();
            arrayList.add(Character.valueOf(StringsKt___StringsKt.random("23456789abcdefghjkmnpqrstvwxyz", random)));
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }
}
