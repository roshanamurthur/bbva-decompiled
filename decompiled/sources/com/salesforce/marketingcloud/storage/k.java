package com.salesforce.marketingcloud.storage;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import com.salesforce.marketingcloud.messages.Message;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"UnknownNullness"})
public interface k {
    int a(@NonNull String str);

    int a(@NonNull String str, int i10);

    Message a(@NonNull String str, @NonNull com.salesforce.marketingcloud.util.c cVar);

    void a(@NonNull Message message, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception;

    int f(int i10);

    @NonNull
    List<Message> j(@NonNull com.salesforce.marketingcloud.util.c cVar);

    @NonNull
    List<Message> k(@NonNull com.salesforce.marketingcloud.util.c cVar);
}
