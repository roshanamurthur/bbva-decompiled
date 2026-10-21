package mx.openpay.library.data.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CommonUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"Lmx/openpay/library/data/util/CommonUtils;", "", "()V", "hexToAscii", "", "hexString", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCommonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonUtils.kt\nmx/openpay/library/data/util/CommonUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,12:1\n1549#2:13\n1620#2,3:14\n*S KotlinDebug\n*F\n+ 1 CommonUtils.kt\nmx/openpay/library/data/util/CommonUtils\n*L\n8#1:13\n8#1:14,3\n*E\n"})
public final class CommonUtils {

    @NotNull
    public static final CommonUtils INSTANCE = new CommonUtils();

    @NotNull
    public final String hexToAscii(@NotNull String hexString) {
        Intrinsics.checkNotNullParameter(hexString, "hexString");
        List<String> listChunked = StringsKt___StringsKt.chunked(hexString, 2);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listChunked, 10));
        Iterator<T> it = listChunked.iterator();
        while (it.hasNext()) {
            arrayList.add(Character.valueOf((char) Integer.parseInt((String) it.next(), CharsKt.checkRadix(16))));
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }
}
