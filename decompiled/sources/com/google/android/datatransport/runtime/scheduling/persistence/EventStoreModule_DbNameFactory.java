package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes9.dex */
public final class EventStoreModule_DbNameFactory implements Factory<String> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EventStoreModule_DbNameFactory f43863a = new EventStoreModule_DbNameFactory();
    }

    public static EventStoreModule_DbNameFactory create() {
        return a.f43863a;
    }

    public static String dbName() {
        return (String) Preconditions.checkNotNull("com.google.android.datatransport.events", "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public String get() {
        return dbName();
    }
}
