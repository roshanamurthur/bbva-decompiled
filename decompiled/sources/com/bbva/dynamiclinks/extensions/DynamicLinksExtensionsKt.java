package com.bbva.dynamiclinks.extensions;

import android.net.Uri;
import android.os.Bundle;
import bk.q;
import com.bbva.dynamiclinks.model.DynamicLinkData;
import com.bbva.dynamiclinks.model.UtmData;
import com.google.firebase.dynamiclinks.PendingDynamicLinkData;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DynamicLinksExtensions.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0000\u001a\u0016\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u0003\u001a\u0016\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u0003¨\u0006\b"}, d2 = {"Lcom/google/firebase/dynamiclinks/PendingDynamicLinkData;", "Lcom/bbva/dynamiclinks/model/DynamicLinkData;", "toModel", "Landroid/net/Uri;", "", "", "queryToMap", "fragmentToMap", "dynamiclinks_release"}, k = 2, mv = {1, 6, 0})
public final class DynamicLinksExtensionsKt {
    public static final String a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string != null && (!l.isBlank(string))) {
            return string;
        }
        return null;
    }

    @NotNull
    public static final Map<String, String> fragmentToMap(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        String fragment = uri.getFragment();
        Map<String, String> mapExtractAllValues$default = fragment != null ? StringExtensionsKt.extractAllValues$default(fragment, null, 1, null) : null;
        return mapExtractAllValues$default == null ? q.emptyMap() : mapExtractAllValues$default;
    }

    @NotNull
    public static final Map<String, String> queryToMap(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "queryParameterNames");
        ArrayList arrayList = new ArrayList();
        for (String str : queryParameterNames) {
            String queryParameter = uri.getQueryParameter(str);
            Pair pair = queryParameter == null ? null : TuplesKt.to(str, queryParameter);
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return q.toMap(arrayList);
    }

    @Nullable
    public static final DynamicLinkData toModel(@Nullable PendingDynamicLinkData pendingDynamicLinkData) {
        Bundle utmParameters;
        String strA;
        String strA2;
        String strA3;
        Uri link;
        Pair pair;
        UtmData utmData = (pendingDynamicLinkData == null || (utmParameters = pendingDynamicLinkData.getUtmParameters()) == null || (strA = a(utmParameters, "utm_campaign")) == null || (strA2 = a(utmParameters, "utm_medium")) == null || (strA3 = a(utmParameters, "utm_source")) == null) ? null : new UtmData(strA, strA2, strA3);
        if (pendingDynamicLinkData == null || (link = pendingDynamicLinkData.getLink()) == null) {
            pair = null;
        } else {
            String query = link.getQuery();
            if (query == null || l.isBlank(query)) {
                String fragment = link.getFragment();
                pair = (fragment == null || l.isBlank(fragment)) ? TuplesKt.to(link, q.emptyMap()) : TuplesKt.to(link, fragmentToMap(link));
            } else {
                pair = TuplesKt.to(link, queryToMap(link));
            }
        }
        if (pair == null) {
            return null;
        }
        return new DynamicLinkData((Uri) pair.component1(), (Map) pair.component2(), utmData);
    }
}
