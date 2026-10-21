package com.bbva.gp2.android.libs.networking.http.responses;

import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.network.multipart_extensions.ExtensionsKt;
import com.bbva.network.multipart_extensions.response.NetworkBodyPart;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ResponseUtils.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¨\u0006\b"}, d2 = {"createMultiPartMixedOf", "", EventDataKeys.Audience.UUID, "networkBodyPartsToResponseBodyParts", "", "Lcom/bbva/gp2/android/libs/networking/http/responses/ResponseBodyPart;", "networkBodyParts", "Lcom/bbva/network/multipart_extensions/response/NetworkBodyPart;", "gp2-ethermobile-network_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ResponseUtilsKt {
    @NotNull
    public static final String createMultiPartMixedOf(@NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return ExtensionsKt.multipartMixedOf(uuid);
    }

    @NotNull
    public static final List<ResponseBodyPart> networkBodyPartsToResponseBodyParts(@NotNull List<NetworkBodyPart> networkBodyParts) {
        Intrinsics.checkNotNullParameter(networkBodyParts, "networkBodyParts");
        List<NetworkBodyPart> list = networkBodyParts;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ResponseBodyPart(((NetworkBodyPart) it.next()).getString()));
        }
        return arrayList;
    }
}
