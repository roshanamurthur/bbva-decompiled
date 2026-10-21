package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.camera.core.impl.t;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.b0;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class FontRequestEmojiCompatConfig extends EmojiCompat.Config {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final FontProviderHelper f21280k = new FontProviderHelper();

    public static class ExponentialBackoffRetryPolicy extends RetryPolicy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f21281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f21282b;

        public ExponentialBackoffRetryPolicy(long j10) {
            this.f21281a = j10;
        }

        @Override // androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy
        public long getRetryDelay() {
            if (this.f21282b == 0) {
                this.f21282b = SystemClock.uptimeMillis();
                return 0L;
            }
            long jUptimeMillis = SystemClock.uptimeMillis() - this.f21282b;
            long j10 = this.f21281a;
            if (jUptimeMillis > j10) {
                return -1L;
            }
            return Math.min(Math.max(jUptimeMillis, 1000L), j10 - jUptimeMillis);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class FontProviderHelper {
        @Nullable
        public Typeface buildTypeface(@NonNull Context context, @NonNull FontsContractCompat.FontInfo fontInfo) throws PackageManager.NameNotFoundException {
            return FontsContractCompat.buildTypeface(context, null, new FontsContractCompat.FontInfo[]{fontInfo});
        }

        @NonNull
        public FontsContractCompat.FontFamilyResult fetchFonts(@NonNull Context context, @NonNull FontRequest fontRequest) throws PackageManager.NameNotFoundException {
            return FontsContractCompat.fetchFonts(context, null, fontRequest);
        }

        public void registerObserver(@NonNull Context context, @NonNull Uri uri, @NonNull ContentObserver contentObserver) {
            context.getContentResolver().registerContentObserver(uri, false, contentObserver);
        }

        public void unregisterObserver(@NonNull Context context, @NonNull ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    public static abstract class RetryPolicy {
        public abstract long getRetryDelay();
    }

    public static class a implements EmojiCompat.MetadataRepoLoader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final Context f21283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final FontRequest f21284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final FontProviderHelper f21285c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        public final Object f21286d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        @GuardedBy("mLock")
        public Handler f21287e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        @GuardedBy("mLock")
        public Executor f21288f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        @GuardedBy("mLock")
        public ThreadPoolExecutor f21289g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        @GuardedBy("mLock")
        public RetryPolicy f21290h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        @GuardedBy("mLock")
        public EmojiCompat.MetadataRepoLoaderCallback f21291i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        @GuardedBy("mLock")
        public C0081a f21292j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        @GuardedBy("mLock")
        public b0 f21293k;

        /* JADX INFO: renamed from: androidx.emoji2.text.FontRequestEmojiCompatConfig$a$a, reason: collision with other inner class name */
        public class C0081a extends ContentObserver {
            public C0081a(Handler handler) {
                super(handler);
            }

            @Override // android.database.ContentObserver
            public final void onChange(boolean z10, Uri uri) {
                a.this.b();
            }
        }

        public a(@NonNull Context context, @NonNull FontRequest fontRequest, @NonNull FontProviderHelper fontProviderHelper) {
            Preconditions.checkNotNull(context, "Context cannot be null");
            Preconditions.checkNotNull(fontRequest, "FontRequest cannot be null");
            this.f21283a = context.getApplicationContext();
            this.f21284b = fontRequest;
            this.f21285c = fontProviderHelper;
        }

        public final void a() {
            synchronized (this.f21286d) {
                try {
                    this.f21291i = null;
                    C0081a c0081a = this.f21292j;
                    if (c0081a != null) {
                        this.f21285c.unregisterObserver(this.f21283a, c0081a);
                        this.f21292j = null;
                    }
                    Handler handler = this.f21287e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f21293k);
                    }
                    this.f21287e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f21289g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f21288f = null;
                    this.f21289g = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @RequiresApi(19)
        public final void b() {
            synchronized (this.f21286d) {
                try {
                    if (this.f21291i == null) {
                        return;
                    }
                    int i10 = 1;
                    if (this.f21288f == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new v2.b("emojiCompat"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.f21289g = threadPoolExecutor;
                        this.f21288f = threadPoolExecutor;
                    }
                    this.f21288f.execute(new t(this, i10));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @WorkerThread
        public final FontsContractCompat.FontInfo c() {
            try {
                FontsContractCompat.FontFamilyResult fontFamilyResultFetchFonts = this.f21285c.fetchFonts(this.f21283a, this.f21284b);
                if (fontFamilyResultFetchFonts.getStatusCode() != 0) {
                    throw new RuntimeException("fetchFonts failed (" + fontFamilyResultFetchFonts.getStatusCode() + ")");
                }
                FontsContractCompat.FontInfo[] fonts = fontFamilyResultFetchFonts.getFonts();
                if (fonts == null || fonts.length == 0) {
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                return fonts[0];
            } catch (PackageManager.NameNotFoundException e5) {
                throw new RuntimeException("provider not found", e5);
            }
        }

        @RequiresApi(19)
        @WorkerThread
        public final void d(Uri uri, long j10) {
            synchronized (this.f21286d) {
                try {
                    Handler handlerA = this.f21287e;
                    if (handlerA == null) {
                        handlerA = Build.VERSION.SDK_INT >= 28 ? v2.c.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper());
                        this.f21287e = handlerA;
                    }
                    if (this.f21292j == null) {
                        C0081a c0081a = new C0081a(handlerA);
                        this.f21292j = c0081a;
                        this.f21285c.registerObserver(this.f21283a, uri, c0081a);
                    }
                    if (this.f21293k == null) {
                        this.f21293k = new b0(this, 1);
                    }
                    handlerA.postDelayed(this.f21293k, j10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        @RequiresApi(19)
        public final void load(@NonNull EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback) {
            Preconditions.checkNotNull(metadataRepoLoaderCallback, "LoaderCallback cannot be null");
            synchronized (this.f21286d) {
                this.f21291i = metadataRepoLoaderCallback;
            }
            b();
        }
    }

    public FontRequestEmojiCompatConfig(@NonNull Context context, @NonNull FontRequest fontRequest) {
        super(new a(context, fontRequest, f21280k));
    }

    @NonNull
    @Deprecated
    public FontRequestEmojiCompatConfig setHandler(@Nullable final Handler handler) {
        if (handler == null) {
            return this;
        }
        setLoadingExecutor(new Executor() { // from class: v2.a
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        });
        return this;
    }

    @NonNull
    public FontRequestEmojiCompatConfig setLoadingExecutor(@NonNull Executor executor) {
        a aVar = (a) getMetadataRepoLoader();
        synchronized (aVar.f21286d) {
            aVar.f21288f = executor;
        }
        return this;
    }

    @NonNull
    public FontRequestEmojiCompatConfig setRetryPolicy(@Nullable RetryPolicy retryPolicy) {
        a aVar = (a) getMetadataRepoLoader();
        synchronized (aVar.f21286d) {
            aVar.f21290h = retryPolicy;
        }
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public FontRequestEmojiCompatConfig(@NonNull Context context, @NonNull FontRequest fontRequest, @NonNull FontProviderHelper fontProviderHelper) {
        super(new a(context, fontRequest, fontProviderHelper));
    }
}
