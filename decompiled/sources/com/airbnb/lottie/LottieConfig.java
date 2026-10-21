package com.airbnb.lottie;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.configurations.reducemotion.ReducedMotionOption;
import com.airbnb.lottie.configurations.reducemotion.SystemReducedMotionOption;
import com.airbnb.lottie.network.LottieNetworkCacheProvider;
import com.airbnb.lottie.network.LottieNetworkFetcher;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class LottieConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final LottieNetworkFetcher f25608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final LottieNetworkCacheProvider f25609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f25610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f25611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f25612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AsyncUpdates f25613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ReducedMotionOption f25614g;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public LottieNetworkFetcher f25615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public LottieNetworkCacheProvider f25616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f25617c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f25618d = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f25619e = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public AsyncUpdates f25620f = AsyncUpdates.AUTOMATIC;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ReducedMotionOption f25621g = new SystemReducedMotionOption();

        public class a implements LottieNetworkCacheProvider {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ File f25622p0;

            public a(File file) {
                this.f25622p0 = file;
            }

            @Override // com.airbnb.lottie.network.LottieNetworkCacheProvider
            @NonNull
            public final File getCacheDir() {
                File file = this.f25622p0;
                if (file.isDirectory()) {
                    return file;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        public class b implements LottieNetworkCacheProvider {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ LottieNetworkCacheProvider f25623p0;

            public b(LottieNetworkCacheProvider lottieNetworkCacheProvider) {
                this.f25623p0 = lottieNetworkCacheProvider;
            }

            @Override // com.airbnb.lottie.network.LottieNetworkCacheProvider
            @NonNull
            public final File getCacheDir() {
                File cacheDir = this.f25623p0.getCacheDir();
                if (cacheDir.isDirectory()) {
                    return cacheDir;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        @NonNull
        public LottieConfig build() {
            return new LottieConfig(this.f25615a, this.f25616b, this.f25617c, this.f25618d, this.f25619e, this.f25620f, this.f25621g);
        }

        @NonNull
        public Builder setDefaultAsyncUpdates(AsyncUpdates asyncUpdates) {
            this.f25620f = asyncUpdates;
            return this;
        }

        @NonNull
        public Builder setDisablePathInterpolatorCache(boolean z10) {
            this.f25619e = z10;
            return this;
        }

        @NonNull
        public Builder setEnableNetworkCache(boolean z10) {
            this.f25618d = z10;
            return this;
        }

        @NonNull
        public Builder setEnableSystraceMarkers(boolean z10) {
            this.f25617c = z10;
            return this;
        }

        @NonNull
        public Builder setNetworkCacheDir(@NonNull File file) {
            if (this.f25616b != null) {
                throw new IllegalStateException("There is already a cache provider!");
            }
            this.f25616b = new a(file);
            return this;
        }

        @NonNull
        public Builder setNetworkCacheProvider(@NonNull LottieNetworkCacheProvider lottieNetworkCacheProvider) {
            if (this.f25616b != null) {
                throw new IllegalStateException("There is already a cache provider!");
            }
            this.f25616b = new b(lottieNetworkCacheProvider);
            return this;
        }

        @NonNull
        public Builder setNetworkFetcher(@NonNull LottieNetworkFetcher lottieNetworkFetcher) {
            this.f25615a = lottieNetworkFetcher;
            return this;
        }

        @NonNull
        public Builder setReducedMotionOption(ReducedMotionOption reducedMotionOption) {
            this.f25621g = reducedMotionOption;
            return this;
        }
    }

    public LottieConfig(LottieNetworkFetcher lottieNetworkFetcher, LottieNetworkCacheProvider lottieNetworkCacheProvider, boolean z10, boolean z11, boolean z12, AsyncUpdates asyncUpdates, ReducedMotionOption reducedMotionOption) {
        this.f25608a = lottieNetworkFetcher;
        this.f25609b = lottieNetworkCacheProvider;
        this.f25610c = z10;
        this.f25611d = z11;
        this.f25612e = z12;
        this.f25613f = asyncUpdates;
        this.f25614g = reducedMotionOption;
    }
}
