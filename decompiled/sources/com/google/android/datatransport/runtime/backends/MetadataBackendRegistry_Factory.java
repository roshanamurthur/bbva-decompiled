package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import javax.inject.Provider;
import vd.c;

/* JADX INFO: loaded from: classes9.dex */
public final class MetadataBackendRegistry_Factory implements Factory<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<Context> f43730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<vd.b> f43731b;

    public MetadataBackendRegistry_Factory(Provider<Context> provider, Provider<vd.b> provider2) {
        this.f43730a = provider;
        this.f43731b = provider2;
    }

    public static MetadataBackendRegistry_Factory create(Provider<Context> provider, Provider<vd.b> provider2) {
        return new MetadataBackendRegistry_Factory(provider, provider2);
    }

    public static c newInstance(Context context, Object obj) {
        return new c(context, (vd.b) obj);
    }

    @Override // javax.inject.Provider
    public c get() {
        return newInstance(this.f43730a.get(), this.f43731b.get());
    }
}
