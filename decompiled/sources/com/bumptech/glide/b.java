package com.bumptech.glide;

import androidx.tracing.Trace;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.util.GlideSuppliers;
import java.util.List;

/* JADX INFO: compiled from: RegistryFactory.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b implements GlideSuppliers.GlideSupplier<Registry> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f38062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Glide f38063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f38064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppGlideModule f38065d;

    public b(Glide glide, List list, AppGlideModule appGlideModule) {
        this.f38063b = glide;
        this.f38064c = list;
        this.f38065d = appGlideModule;
    }

    @Override // com.bumptech.glide.util.GlideSuppliers.GlideSupplier
    public final Registry get() {
        if (this.f38062a) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        Trace.beginSection("Glide registry");
        this.f38062a = true;
        try {
            return c.a(this.f38063b, this.f38064c, this.f38065d);
        } finally {
            this.f38062a = false;
            Trace.endSection();
        }
    }
}
