package com.salesforce.marketingcloud.storage;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import com.salesforce.marketingcloud.messages.Region;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"UnknownNullness"})
public interface l {
    Region a(String str, @NonNull com.salesforce.marketingcloud.util.c cVar);

    @NonNull
    List<Region> a(int i10, com.salesforce.marketingcloud.util.c cVar);

    void a(@NonNull Region region, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception;

    void a(@NonNull String str, boolean z10);

    @NonNull
    List<String> c(@NonNull String str, int i10);

    @NonNull
    List<String> d(int i10);

    void d();

    Region f(@NonNull com.salesforce.marketingcloud.util.c cVar);

    int g(int i10);
}
