package com.salesforce.marketingcloud.storage;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface d {
    int a();

    void a(@NonNull com.salesforce.marketingcloud.analytics.stats.b bVar, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception;

    void c(@NonNull String[] strArr);

    void d(@NonNull String[] strArr);

    @NonNull
    List<com.salesforce.marketingcloud.analytics.stats.b> i(@NonNull com.salesforce.marketingcloud.util.c cVar);

    int j();

    @NonNull
    List<com.salesforce.marketingcloud.analytics.stats.b> o(@NonNull com.salesforce.marketingcloud.util.c cVar);

    @NonNull
    List<com.salesforce.marketingcloud.analytics.stats.b> p(@NonNull com.salesforce.marketingcloud.util.c cVar);
}
