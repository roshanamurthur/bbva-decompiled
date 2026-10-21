package com.salesforce.marketingcloud.storage;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import com.salesforce.marketingcloud.messages.Region;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"UnknownNullness"})
public interface a {
    int a(int i10);

    int a(String[] strArr);

    @NonNull
    List<com.salesforce.marketingcloud.analytics.b> a(@NonNull com.salesforce.marketingcloud.util.c cVar);

    void a(com.salesforce.marketingcloud.analytics.b bVar, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception;

    int b(int i10);

    int b(com.salesforce.marketingcloud.analytics.b bVar, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception;

    @NonNull
    List<com.salesforce.marketingcloud.analytics.b> b(@NonNull Region region, @NonNull com.salesforce.marketingcloud.util.c cVar);

    boolean c(int i10);

    @NonNull
    List<com.salesforce.marketingcloud.analytics.b> d(@NonNull com.salesforce.marketingcloud.util.c cVar);

    int e(int i10);

    int h();

    @NonNull
    List<com.salesforce.marketingcloud.analytics.b> h(@NonNull com.salesforce.marketingcloud.util.c cVar);

    int i();

    @NonNull
    List<com.salesforce.marketingcloud.analytics.b> m(@NonNull com.salesforce.marketingcloud.util.c cVar);

    @NonNull
    List<com.salesforce.marketingcloud.analytics.b> n(@NonNull com.salesforce.marketingcloud.util.c cVar);
}
