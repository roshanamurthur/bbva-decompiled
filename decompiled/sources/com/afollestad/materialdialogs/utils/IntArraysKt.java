package com.afollestad.materialdialogs.utils;

import bk.g;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IntArrays.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000\u001a\u001a\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¨\u0006\u0006"}, d2 = {"appendAll", "", "values", "", "", "removeAll", "com.afollestad.material-dialogs.core"}, k = 2, mv = {1, 1, 15})
public final class IntArraysKt {

    /* JADX INFO: compiled from: IntArrays.kt */
    public static final class a extends Lambda implements Function1<Integer, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Collection f25552p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Collection collection) {
            super(1);
            this.f25552p0 = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Integer num) {
            return Boolean.valueOf(this.f25552p0.contains(Integer.valueOf(num.intValue())));
        }
    }

    @NotNull
    public static final int[] appendAll(@NotNull int[] iArr, @NotNull Collection<Integer> collection) {
        List<Integer> mutableList = ArraysKt___ArraysKt.toMutableList(iArr);
        mutableList.addAll(collection);
        return CollectionsKt___CollectionsKt.toIntArray(mutableList);
    }

    @NotNull
    public static final int[] removeAll(@NotNull int[] iArr, @NotNull Collection<Integer> collection) {
        List<Integer> mutableList = ArraysKt___ArraysKt.toMutableList(iArr);
        g.removeAll((List) mutableList, (Function1) new a(collection));
        return CollectionsKt___CollectionsKt.toIntArray(mutableList);
    }
}
