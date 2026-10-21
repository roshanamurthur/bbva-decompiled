package com.bbva.network.multipart_extensions.response;

import bk.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;
import javax.mail.BodyPart;
import javax.mail.Header;
import javax.mail.MessagingException;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MultipartNetworkResponse.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"network-multipart-extensions_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMultipartNetworkResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartNetworkResponse.kt\ncom/bbva/network/multipart_extensions/response/MultipartNetworkResponseKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n1549#2:62\n1620#2,3:63\n*S KotlinDebug\n*F\n+ 1 MultipartNetworkResponse.kt\ncom/bbva/network/multipart_extensions/response/MultipartNetworkResponseKt\n*L\n58#1:62\n58#1:63,3\n*E\n"})
public final class MultipartNetworkResponseKt {
    public static final Map access$headers(BodyPart bodyPart) throws MessagingException {
        Enumeration<Header> allHeaders = bodyPart.getAllHeaders();
        Intrinsics.checkNotNullExpressionValue(allHeaders, "allHeaders");
        ArrayList<Header> list = Collections.list(allHeaders);
        Intrinsics.checkNotNullExpressionValue(list, "list(this)");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (Header header : list) {
            arrayList.add(TuplesKt.to(header.getName(), header.getValue()));
        }
        return q.toMap(arrayList);
    }
}
