package com.bbva.glomohybrid.base.usecase.version;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IsWebViewVersionValidUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0004"}, d2 = {"compareVersionWith", "", "", "version", "Base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIsWebViewVersionValidUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IsWebViewVersionValidUseCase.kt\ncom/bbva/glomohybrid/base/usecase/version/IsWebViewVersionValidUseCaseKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,50:1\n1549#2:51\n1620#2,3:52\n1549#2:55\n1620#2,3:56\n*S KotlinDebug\n*F\n+ 1 IsWebViewVersionValidUseCase.kt\ncom/bbva/glomohybrid/base/usecase/version/IsWebViewVersionValidUseCaseKt\n*L\n38#1:51\n38#1:52,3\n39#1:55\n39#1:56,3\n*E\n"})
public final class IsWebViewVersionValidUseCaseKt {
    public static final int compareVersionWith(@NotNull String str, @NotNull String version) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(version, "version");
        if (str.length() > 0 && version.length() > 0) {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{Constant.DOT_STRING}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default, 10));
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
            }
            List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) version, new String[]{Constant.DOT_STRING}, false, 0, 6, (Object) null);
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default2, 10));
            Iterator it2 = listSplit$default2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(Integer.parseInt((String) it2.next())));
            }
            int iMax = Math.max(arrayList.size(), arrayList2.size());
            int i10 = 0;
            while (i10 < iMax) {
                int iIntValue = i10 < arrayList.size() ? ((Number) arrayList.get(i10)).intValue() : 0;
                int iIntValue2 = i10 < arrayList2.size() ? ((Number) arrayList2.get(i10)).intValue() : 0;
                if (iIntValue < iIntValue2) {
                    return -1;
                }
                if (iIntValue > iIntValue2) {
                    return 1;
                }
                i10++;
            }
        }
        return 0;
    }
}
