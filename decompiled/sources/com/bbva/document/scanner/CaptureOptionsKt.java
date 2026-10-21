package com.bbva.document.scanner;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import bk.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CaptureOptions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"document-scanner_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCaptureOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureOptions.kt\ncom/bbva/document/scanner/CaptureOptionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1549#2:79\n1620#2,3:80\n1789#2,2:85\n1791#2:88\n37#3,2:83\n1#4:87\n*S KotlinDebug\n*F\n+ 1 CaptureOptions.kt\ncom/bbva/document/scanner/CaptureOptionsKt\n*L\n22#1:79\n22#1:80,3\n29#1:85,2\n29#1:88\n22#1:83,2\n*E\n"})
public final class CaptureOptionsKt {
    public static final Map access$asMap(Bundle bundle) {
        String str;
        Object obj;
        Map mapPlus;
        if (bundle == null) {
            throw new IllegalArgumentException();
        }
        Set<String> setKeySet = bundle.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet()");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = setKeySet.iterator();
        return (!it.hasNext() || (obj = bundle.get((str = (String) it.next()))) == null || (mapPlus = q.plus(linkedHashMap, TuplesKt.to(str, obj))) == null) ? linkedHashMap : mapPlus;
    }

    public static final Bundle access$toBundle(Map map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(TuplesKt.to(entry.getKey(), entry.getValue()));
        }
        Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        return BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }
}
