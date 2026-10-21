package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes9.dex */
public final class CreationContextFactory_Factory implements Factory<vd.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<Context> f43727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<Clock> f43728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<Clock> f43729c;

    public CreationContextFactory_Factory(Provider<Context> provider, Provider<Clock> provider2, Provider<Clock> provider3) {
        this.f43727a = provider;
        this.f43728b = provider2;
        this.f43729c = provider3;
    }

    public static CreationContextFactory_Factory create(Provider<Context> provider, Provider<Clock> provider2, Provider<Clock> provider3) {
        return new CreationContextFactory_Factory(provider, provider2, provider3);
    }

    public static vd.b newInstance(Context context, Clock clock, Clock clock2) {
        return new vd.b(context, clock, clock2);
    }

    @Override // javax.inject.Provider
    public vd.b get() {
        return newInstance(this.f43727a.get(), this.f43728b.get(), this.f43729c.get());
    }
}
