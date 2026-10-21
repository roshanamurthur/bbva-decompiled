package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;
import javax.inject.Provider;
import yd.c;

/* JADX INFO: loaded from: classes9.dex */
public final class SQLiteEventStore_Factory implements Factory<SQLiteEventStore> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<Clock> f43875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<Clock> f43876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<c> f43877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider<SchemaManager> f43878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider<String> f43879e;

    public SQLiteEventStore_Factory(Provider<Clock> provider, Provider<Clock> provider2, Provider<c> provider3, Provider<SchemaManager> provider4, Provider<String> provider5) {
        this.f43875a = provider;
        this.f43876b = provider2;
        this.f43877c = provider3;
        this.f43878d = provider4;
        this.f43879e = provider5;
    }

    public static SQLiteEventStore_Factory create(Provider<Clock> provider, Provider<Clock> provider2, Provider<c> provider3, Provider<SchemaManager> provider4, Provider<String> provider5) {
        return new SQLiteEventStore_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static SQLiteEventStore newInstance(Clock clock, Clock clock2, Object obj, Object obj2, Provider<String> provider) {
        return new SQLiteEventStore(clock, clock2, (c) obj, (SchemaManager) obj2, provider);
    }

    @Override // javax.inject.Provider
    public SQLiteEventStore get() {
        return newInstance(this.f43875a.get(), this.f43876b.get(), this.f43877c.get(), this.f43878d.get(), this.f43879e);
    }
}
