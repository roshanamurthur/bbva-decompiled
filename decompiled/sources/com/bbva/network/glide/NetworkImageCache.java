package com.bbva.network.glide;

import androidx.appcompat.app.i;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NetworkImageCache.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/bbva/network/glide/NetworkImageCache;", "", "Lcom/bbva/network/glide/ImageCacheStrategy;", "component1", "", "component2", "component3", "strategy", "skipMemoryCache", "onlyRetrieveFromCache", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Lcom/bbva/network/glide/ImageCacheStrategy;", "getStrategy", "()Lcom/bbva/network/glide/ImageCacheStrategy;", "b", "Z", "getSkipMemoryCache", "()Z", "c", "getOnlyRetrieveFromCache", "<init>", "(Lcom/bbva/network/glide/ImageCacheStrategy;ZZ)V", "network-image_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class NetworkImageCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ImageCacheStrategy strategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean skipMemoryCache;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean onlyRetrieveFromCache;

    public NetworkImageCache() {
        this(null, false, false, 7, null);
    }

    public static /* synthetic */ NetworkImageCache copy$default(NetworkImageCache networkImageCache, ImageCacheStrategy imageCacheStrategy, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            imageCacheStrategy = networkImageCache.strategy;
        }
        if ((i10 & 2) != 0) {
            z10 = networkImageCache.skipMemoryCache;
        }
        if ((i10 & 4) != 0) {
            z11 = networkImageCache.onlyRetrieveFromCache;
        }
        return networkImageCache.copy(imageCacheStrategy, z10, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ImageCacheStrategy getStrategy() {
        return this.strategy;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSkipMemoryCache() {
        return this.skipMemoryCache;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getOnlyRetrieveFromCache() {
        return this.onlyRetrieveFromCache;
    }

    @NotNull
    public final NetworkImageCache copy(@NotNull ImageCacheStrategy strategy, boolean skipMemoryCache, boolean onlyRetrieveFromCache) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        return new NetworkImageCache(strategy, skipMemoryCache, onlyRetrieveFromCache);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkImageCache)) {
            return false;
        }
        NetworkImageCache networkImageCache = (NetworkImageCache) other;
        return this.strategy == networkImageCache.strategy && this.skipMemoryCache == networkImageCache.skipMemoryCache && this.onlyRetrieveFromCache == networkImageCache.onlyRetrieveFromCache;
    }

    public final boolean getOnlyRetrieveFromCache() {
        return this.onlyRetrieveFromCache;
    }

    public final boolean getSkipMemoryCache() {
        return this.skipMemoryCache;
    }

    @NotNull
    public final ImageCacheStrategy getStrategy() {
        return this.strategy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = this.strategy.hashCode() * 31;
        boolean z10 = this.skipMemoryCache;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int i10 = (iHashCode + r3) * 31;
        boolean z11 = this.onlyRetrieveFromCache;
        return i10 + (z11 ? 1 : z11);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkImageCache(strategy=");
        sb2.append(this.strategy);
        sb2.append(", skipMemoryCache=");
        sb2.append(this.skipMemoryCache);
        sb2.append(", onlyRetrieveFromCache=");
        return i.c(sb2, this.onlyRetrieveFromCache, ")");
    }

    public NetworkImageCache(@NotNull ImageCacheStrategy strategy, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.strategy = strategy;
        this.skipMemoryCache = z10;
        this.onlyRetrieveFromCache = z11;
    }

    public /* synthetic */ NetworkImageCache(ImageCacheStrategy imageCacheStrategy, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? ImageCacheStrategy.AUTOMATIC : imageCacheStrategy, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11);
    }
}
