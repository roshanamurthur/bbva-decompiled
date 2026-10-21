package com.bbva.glomohybrid;

import android.content.Context;
import com.bbva.glomohybrid.initializers.HttpClientFactory;
import com.bbva.network.glide.NetworkWorkerUrlLoader;
import com.bbva.network.glide.extension.RegisterKt;
import com.bbva.network.impl.OkHttpNetworkWorker;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.module.AppGlideModule;
import java.io.InputStream;
import java.net.CookieManager;
import java.net.CookiePolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GlomoGlideModule.kt */
/* JADX INFO: loaded from: classes5.dex */
@GlideModule
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/GlomoGlideModule;", "Lcom/bumptech/glide/module/AppGlideModule;", "Landroid/content/Context;", "context", "Lcom/bumptech/glide/Glide;", "glide", "Lcom/bumptech/glide/Registry;", "registry", "", "registerComponents", "<init>", "()V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class GlomoGlideModule extends AppGlideModule {
    @Override // com.bumptech.glide.module.LibraryGlideModule
    public void registerComponents(@NotNull Context context, @NotNull Glide glide, @NotNull Registry registry) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(glide, "glide");
        Intrinsics.checkNotNullParameter(registry, "registry");
        CookieManager cookieManager = new CookieManager();
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
        Registry registryReplace = registry.replace(GlideUrl.class, InputStream.class, new NetworkWorkerUrlLoader.Factory(new OkHttpNetworkWorker(context, HttpClientFactory.INSTANCE.create(cookieManager), null, cookieManager, null, null, 52, null)));
        Intrinsics.checkNotNullExpressionValue(registryReplace, "replace(...)");
        RegisterKt.svg(registryReplace);
    }
}
