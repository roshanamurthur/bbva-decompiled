package com.salesforce.marketingcloud.storage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes9.dex */
public interface n {
    int a(@NonNull com.salesforce.marketingcloud.events.h hVar);

    int b(@NonNull Collection<String> collection);

    @Nullable
    com.salesforce.marketingcloud.events.h b(@NonNull String str);

    void b(@NonNull com.salesforce.marketingcloud.events.h hVar) throws Exception;

    @NonNull
    List<com.salesforce.marketingcloud.events.h> c(@NonNull String str);

    void c();

    @NonNull
    JSONArray n();
}
