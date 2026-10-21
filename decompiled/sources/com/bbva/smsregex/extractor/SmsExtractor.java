package com.bbva.smsregex.extractor;

import com.bbva.smsregex.extractor.model.Sms;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SmsExtractor.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/bbva/smsregex/extractor/SmsExtractor;", "", "Lcom/bbva/smsregex/extractor/model/Sms;", "sms", "", "", "extract", "patterns", "<init>", "(Ljava/util/List;)V", "smsregex_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSmsExtractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmsExtractor.kt\ncom/bbva/smsregex/extractor/SmsExtractor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,20:1\n1549#2:21\n1620#2,3:22\n766#2:25\n857#2,2:26\n1549#2:28\n1620#2,3:29\n*S KotlinDebug\n*F\n+ 1 SmsExtractor.kt\ncom/bbva/smsregex/extractor/SmsExtractor\n*L\n13#1:21\n13#1:22,3\n14#1:25\n14#1:26,2\n16#1:28\n16#1:29,3\n*E\n"})
public final class SmsExtractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<String> f36822a;

    public SmsExtractor(@NotNull List<String> patterns) {
        Intrinsics.checkNotNullParameter(patterns, "patterns");
        this.f36822a = patterns;
    }

    @NotNull
    public final List<String> extract(@NotNull Sms sms) {
        String strGroup;
        Intrinsics.checkNotNullParameter(sms, "sms");
        List<String> list = this.f36822a;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Pattern.compile((String) it.next()).matcher(sms.getMessage()));
        }
        ArrayList<Matcher> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Matcher) obj).matches()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        for (Matcher matcher : arrayList2) {
            if (matcher.groupCount() <= 0 || (strGroup = matcher.group(1)) == null) {
                strGroup = matcher.group();
            }
            arrayList3.add(strGroup);
        }
        return arrayList3;
    }
}
