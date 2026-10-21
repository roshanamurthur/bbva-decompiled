package com.bbva.document.scanner.plugin.model;

import bk.q;
import com.bbva.document.scanner.ImageTransformation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FiltersParam.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0000¨\u0006\u0004"}, d2 = {"toImageTransformations", "", "Lcom/bbva/document/scanner/ImageTransformation;", "Lcom/bbva/document/scanner/plugin/model/FiltersParam;", "document-scanner-plugin_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFiltersParam.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FiltersParam.kt\ncom/bbva/document/scanner/plugin/model/FiltersParamKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,12:1\n1549#2:13\n1620#2,3:14\n*S KotlinDebug\n*F\n+ 1 FiltersParam.kt\ncom/bbva/document/scanner/plugin/model/FiltersParamKt\n*L\n10#1:13\n10#1:14,3\n*E\n"})
public final class FiltersParamKt {
    @NotNull
    public static final List<ImageTransformation> toImageTransformations(@Nullable List<FiltersParam> list) {
        if (list == null) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        List<FiltersParam> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (FiltersParam filtersParam : list2) {
            String id = filtersParam.getId();
            Map<String, Object> params = filtersParam.getParams();
            if (params == null) {
                params = q.emptyMap();
            }
            arrayList.add(new ImageTransformation(id, params));
        }
        return arrayList;
    }
}
