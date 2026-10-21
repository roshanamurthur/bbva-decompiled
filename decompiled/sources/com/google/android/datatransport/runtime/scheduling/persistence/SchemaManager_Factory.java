package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes9.dex */
public final class SchemaManager_Factory implements Factory<SchemaManager> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<Context> f43885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<String> f43886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<Integer> f43887c;

    public SchemaManager_Factory(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        this.f43885a = provider;
        this.f43886b = provider2;
        this.f43887c = provider3;
    }

    public static SchemaManager_Factory create(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        return new SchemaManager_Factory(provider, provider2, provider3);
    }

    public static SchemaManager newInstance(Context context, String str, int i10) {
        return new SchemaManager(context, str, i10);
    }

    @Override // javax.inject.Provider
    public SchemaManager get() {
        return newInstance(this.f43885a.get(), this.f43886b.get(), this.f43887c.get().intValue());
    }
}
