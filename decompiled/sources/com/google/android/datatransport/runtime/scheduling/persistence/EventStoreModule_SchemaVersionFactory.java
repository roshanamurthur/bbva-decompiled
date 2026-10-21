package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;

/* JADX INFO: loaded from: classes9.dex */
public final class EventStoreModule_SchemaVersionFactory implements Factory<Integer> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EventStoreModule_SchemaVersionFactory f43865a = new EventStoreModule_SchemaVersionFactory();
    }

    public static EventStoreModule_SchemaVersionFactory create() {
        return a.f43865a;
    }

    public static int schemaVersion() {
        return SchemaManager.f43881s0;
    }

    @Override // javax.inject.Provider
    public Integer get() {
        return Integer.valueOf(schemaVersion());
    }
}
