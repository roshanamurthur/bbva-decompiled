package androidx.emoji2.text;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: EmojiCompatInitializer.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends EmojiCompat.MetadataRepoLoaderCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EmojiCompat.MetadataRepoLoaderCallback f21313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f21314b;

    public c(EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback, ThreadPoolExecutor threadPoolExecutor) {
        this.f21313a = metadataRepoLoaderCallback;
        this.f21314b = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
    public final void onFailed(@Nullable Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.f21314b;
        try {
            this.f21313a.onFailed(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
    public final void onLoaded(@NonNull MetadataRepo metadataRepo) {
        ThreadPoolExecutor threadPoolExecutor = this.f21314b;
        try {
            this.f21313a.onLoaded(metadataRepo);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
