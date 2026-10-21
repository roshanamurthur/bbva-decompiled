package androidx.emoji2.text;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.os.TraceCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.AppInitializer;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v2.e;

/* JADX INFO: loaded from: classes2.dex */
public class EmojiCompatInitializer implements Initializer<Boolean> {

    @RequiresApi(19)
    public static class a extends EmojiCompat.Config {
    }

    @RequiresApi(19)
    public static class b implements EmojiCompat.MetadataRepoLoader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f21274a;

        public b(Context context) {
            this.f21274a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        public final void load(@NonNull EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new v2.b("EmojiCompatInitializer"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new e(this, metadataRepoLoaderCallback, 0, threadPoolExecutor));
        }
    }

    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                TraceCompat.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (EmojiCompat.isConfigured()) {
                    EmojiCompat.get().load();
                }
            } finally {
                TraceCompat.endSection();
            }
        }
    }

    @Override // androidx.startup.Initializer
    @NonNull
    public List<Class<? extends Initializer<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    @NonNull
    public Boolean create(@NonNull Context context) {
        a aVar = new a(new b(context));
        aVar.setMetadataLoadStrategy(1);
        EmojiCompat.init(aVar);
        Lifecycle lifecycle = ((LifecycleOwner) AppInitializer.getInstance(context).initializeComponent(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.addObserver(new v2.d(this, lifecycle));
        return Boolean.TRUE;
    }
}
