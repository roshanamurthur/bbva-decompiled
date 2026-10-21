package com.bumptech.glide.load.engine.bitmap_recycle;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import uc.d;

/* JADX INFO: loaded from: classes9.dex */
public class LruBitmapPool implements BitmapPool {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Bitmap.Config f38243j = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f38244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<Bitmap.Config> f38245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f38246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f38247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f38248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f38249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f38251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f38252i;

    public static final class a {
    }

    public LruBitmapPool(long j10, SizeConfigStrategy sizeConfigStrategy, Set set) {
        this.f38246c = j10;
        this.f38248e = j10;
        this.f38244a = sizeConfigStrategy;
        this.f38245b = set;
        this.f38247d = new a();
    }

    @Nullable
    public final synchronized Bitmap a(int i10, int i11, @Nullable Bitmap.Config config) {
        Bitmap bitmap;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmap = this.f38244a.get(i10, i11, config != null ? config : f38243j);
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.f38244a.logBitmap(i10, i11, config);
                }
                this.f38251h++;
            } else {
                this.f38250g++;
                this.f38249f -= (long) this.f38244a.getSize(bitmap);
                this.f38247d.getClass();
                bitmap.setHasAlpha(true);
                bitmap.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f38244a.logBitmap(i10, i11, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.f38244a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return bitmap;
    }

    public final synchronized void b(long j10) {
        while (this.f38249f > j10) {
            try {
                Bitmap bitmapRemoveLast = this.f38244a.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        Objects.toString(this.f38244a);
                    }
                    this.f38249f = 0L;
                    return;
                }
                this.f38247d.getClass();
                this.f38249f -= (long) this.f38244a.getSize(bitmapRemoveLast);
                this.f38252i++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.f38244a.logBitmap(bitmapRemoveLast);
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Objects.toString(this.f38244a);
                }
                bitmapRemoveLast.recycle();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public void clearMemory() {
        b(0L);
    }

    public long evictionCount() {
        return this.f38252i;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    @NonNull
    public Bitmap get(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapA = a(i10, i11, config);
        if (bitmapA != null) {
            bitmapA.eraseColor(0);
            return bitmapA;
        }
        if (config == null) {
            config = f38243j;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    public long getCurrentSize() {
        return this.f38249f;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    @NonNull
    public Bitmap getDirty(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapA = a(i10, i11, config);
        if (bitmapA != null) {
            return bitmapA;
        }
        if (config == null) {
            config = f38243j;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public long getMaxSize() {
        return this.f38248e;
    }

    public long hitCount() {
        return this.f38250g;
    }

    public long missCount() {
        return this.f38251h;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public synchronized void put(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f38244a.getSize(bitmap) <= this.f38248e && this.f38245b.contains(bitmap.getConfig())) {
                int size = this.f38244a.getSize(bitmap);
                this.f38244a.put(bitmap);
                this.f38247d.getClass();
                this.f38249f += (long) size;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    this.f38244a.logBitmap(bitmap);
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Objects.toString(this.f38244a);
                }
                b(this.f38248e);
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f38244a.logBitmap(bitmap);
                bitmap.isMutable();
                this.f38245b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    public synchronized void setSizeMultiplier(float f6) {
        long jRound = Math.round(this.f38246c * f6);
        this.f38248e = jRound;
        b(jRound);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
    @SuppressLint({"InlinedApi"})
    public void trimMemory(int i10) {
        if (i10 >= 40 || i10 >= 20) {
            clearMemory();
        } else if (i10 >= 20 || i10 == 15) {
            b(getMaxSize() / 2);
        }
    }

    public LruBitmapPool(long j10) {
        SizeConfigStrategy sizeConfigStrategy = new SizeConfigStrategy();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i10 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        this(j10, sizeConfigStrategy, Collections.unmodifiableSet(hashSet));
    }

    public LruBitmapPool(long j10, Set<Bitmap.Config> set) {
        this(j10, new SizeConfigStrategy(), set);
    }
}
