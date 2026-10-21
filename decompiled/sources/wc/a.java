package wc;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.prefill.PreFillType;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.util.Util;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: BitmapPreFillRunner.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final C0503a f94201x0 = new C0503a();

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final long f94202y0 = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BitmapPool f94203p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final MemoryCache f94204q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final wc.b f94205r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final C0503a f94206s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final HashSet f94207t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Handler f94208u0;
    public long v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f94209w0;

    /* JADX INFO: renamed from: wc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BitmapPreFillRunner.java */
    @VisibleForTesting
    public static class C0503a {
    }

    /* JADX INFO: compiled from: BitmapPreFillRunner.java */
    public static final class b implements Key {
        @Override // com.bumptech.glide.load.Key
        public final void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
            throw new UnsupportedOperationException();
        }
    }

    public a(BitmapPool bitmapPool, MemoryCache memoryCache, wc.b bVar) {
        C0503a c0503a = f94201x0;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f94207t0 = new HashSet();
        this.v0 = 40L;
        this.f94203p0 = bitmapPool;
        this.f94204q0 = memoryCache;
        this.f94205r0 = bVar;
        this.f94206s0 = c0503a;
        this.f94208u0 = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wc.b bVar;
        Bitmap bitmapCreateBitmap;
        this.f94206s0.getClass();
        long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        while (true) {
            bVar = this.f94205r0;
            if (bVar.f94212c == 0 || SystemClock.currentThreadTimeMillis() - jCurrentThreadTimeMillis >= 32) {
                break;
            }
            ArrayList arrayList = bVar.f94211b;
            PreFillType preFillType = (PreFillType) arrayList.get(bVar.f94213d);
            Map<PreFillType, Integer> map = bVar.f94210a;
            Integer num = map.get(preFillType);
            if (num.intValue() == 1) {
                map.remove(preFillType);
                arrayList.remove(bVar.f94213d);
            } else {
                map.put(preFillType, Integer.valueOf(num.intValue() - 1));
            }
            bVar.f94212c--;
            bVar.f94213d = arrayList.isEmpty() ? 0 : (bVar.f94213d + 1) % arrayList.size();
            HashSet hashSet = this.f94207t0;
            boolean zContains = hashSet.contains(preFillType);
            BitmapPool bitmapPool = this.f94203p0;
            if (zContains) {
                bitmapCreateBitmap = Bitmap.createBitmap(preFillType.f38396a, preFillType.f38397b, preFillType.f38398c);
            } else {
                hashSet.add(preFillType);
                bitmapCreateBitmap = bitmapPool.getDirty(preFillType.f38396a, preFillType.f38397b, preFillType.f38398c);
            }
            int bitmapByteSize = Util.getBitmapByteSize(bitmapCreateBitmap);
            MemoryCache memoryCache = this.f94204q0;
            if (memoryCache.getMaxSize() - memoryCache.getCurrentSize() >= bitmapByteSize) {
                memoryCache.put(new b(), BitmapResource.obtain(bitmapCreateBitmap, bitmapPool));
            } else {
                bitmapPool.put(bitmapCreateBitmap);
            }
            if (Log.isLoggable("PreFillRunner", 3)) {
                int i10 = preFillType.f38396a;
                Objects.toString(preFillType.f38398c);
            }
        }
        if (this.f94209w0 || bVar.f94212c == 0) {
            return;
        }
        long j10 = this.v0;
        this.v0 = Math.min(4 * j10, f94202y0);
        this.f94208u0.postDelayed(this, j10);
    }
}
