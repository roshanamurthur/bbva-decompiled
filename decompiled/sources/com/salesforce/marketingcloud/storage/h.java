package com.salesforce.marketingcloud.storage;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.salesforce.marketingcloud.messages.inbox.InboxMessage;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"UnknownNullness"})
public interface h {

    public enum a {
        UNREAD,
        READ,
        DELETED,
        NOT_DELETED
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final String f65102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f65103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Date f65104c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f65105d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f65106e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f65107f;

        public b(@NonNull String str, @Nullable String str2, @Nullable Date date, boolean z10, boolean z11, boolean z12) {
            this.f65102a = str;
            this.f65103b = str2;
            this.f65104c = date;
            this.f65105d = z10;
            this.f65106e = z11;
            this.f65107f = z12;
        }
    }

    int a(@NonNull a aVar);

    int a(@NonNull List<String> list);

    @Nullable
    InboxMessage a(@NonNull String str, @NonNull com.salesforce.marketingcloud.util.c cVar);

    @NonNull
    List<InboxMessage> a(@NonNull com.salesforce.marketingcloud.util.c cVar, a aVar);

    void a(@NonNull InboxMessage inboxMessage, @NonNull com.salesforce.marketingcloud.util.c cVar);

    void b(@NonNull String[] strArr);

    void d(@NonNull String str);

    void e(@NonNull String str);

    void f();

    boolean f(@NonNull String str);

    @Nullable
    b g(@NonNull String str);

    List<InboxMessage> g(@NonNull com.salesforce.marketingcloud.util.c cVar);

    int k();

    @NonNull
    List<b> l();

    void m();
}
