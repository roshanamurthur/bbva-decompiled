package com.bumptech.glide;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bbva.glomohybrid.GlomoGlideModule;
import com.bumptech.glide.manager.RequestManagerRetriever;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GlomoGlideModule f37975a = new GlomoGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    @NonNull
    public final Set<Class<?>> a() {
        return Collections.emptySet();
    }

    @Override // com.bumptech.glide.module.AppGlideModule
    public final void applyOptions(@NonNull Context context, @NonNull GlideBuilder glideBuilder) {
        this.f37975a.applyOptions(context, glideBuilder);
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    @NonNull
    public final RequestManagerRetriever.RequestManagerFactory b() {
        return new a();
    }

    @Override // com.bumptech.glide.module.AppGlideModule
    public final boolean isManifestParsingEnabled() {
        return this.f37975a.isManifestParsingEnabled();
    }

    @Override // com.bumptech.glide.module.LibraryGlideModule
    public final void registerComponents(@NonNull Context context, @NonNull Glide glide, @NonNull Registry registry) {
        this.f37975a.registerComponents(context, glide, registry);
    }
}
