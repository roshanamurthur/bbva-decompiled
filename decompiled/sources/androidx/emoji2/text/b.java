package androidx.emoji2.text;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import v2.f;
import v2.g;

/* JADX INFO: compiled from: EmojiCompat.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends EmojiCompat.MetadataRepoLoaderCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EmojiCompat.a f21312a;

    public b(EmojiCompat.a aVar) {
        this.f21312a = aVar;
    }

    @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
    public final void onFailed(@Nullable Throwable th2) {
        this.f21312a.f21270a.b(th2);
    }

    @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
    public final void onLoaded(@NonNull MetadataRepo metadataRepo) {
        EmojiCompat.a aVar = this.f21312a;
        if (metadataRepo == null) {
            aVar.f21270a.b(new IllegalArgumentException("metadataRepo cannot be null"));
            return;
        }
        aVar.f21269c = metadataRepo;
        MetadataRepo metadataRepo2 = aVar.f21269c;
        EmojiCompat emojiCompat = aVar.f21270a;
        aVar.f21268b = new d(metadataRepo2, emojiCompat.f21251g, emojiCompat.f21257n, emojiCompat.f21253i, emojiCompat.f21254j, Build.VERSION.SDK_INT >= 34 ? f.a() : g.a());
        aVar.f21270a.c();
    }
}
