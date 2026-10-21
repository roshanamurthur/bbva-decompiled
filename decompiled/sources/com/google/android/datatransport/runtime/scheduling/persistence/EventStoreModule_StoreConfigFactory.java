package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import yd.c;

/* JADX INFO: loaded from: classes9.dex */
public final class EventStoreModule_StoreConfigFactory implements Factory<c> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EventStoreModule_StoreConfigFactory f43866a = new EventStoreModule_StoreConfigFactory();
    }

    public static EventStoreModule_StoreConfigFactory create() {
        return a.f43866a;
    }

    public static c storeConfig() {
        return (c) Preconditions.checkNotNull(c.f94771a, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public c get() {
        return storeConfig();
    }
}
