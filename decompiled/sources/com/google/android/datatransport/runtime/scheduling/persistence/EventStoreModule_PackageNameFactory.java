package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes9.dex */
public final class EventStoreModule_PackageNameFactory implements Factory<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<Context> f43864a;

    public EventStoreModule_PackageNameFactory(Provider<Context> provider) {
        this.f43864a = provider;
    }

    public static EventStoreModule_PackageNameFactory create(Provider<Context> provider) {
        return new EventStoreModule_PackageNameFactory(provider);
    }

    public static String packageName(Context context) {
        return (String) Preconditions.checkNotNull(context.getPackageName(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public String get() {
        return packageName(this.f43864a.get());
    }
}
