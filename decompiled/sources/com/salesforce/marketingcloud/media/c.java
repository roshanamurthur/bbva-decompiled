package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.collection.LruCache;
import androidx.core.graphics.BitmapCompat;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LruCache<String, b> f64457a;

    public class a extends LruCache<String, b> {
        public a(int i10) {
            super(i10);
        }

        @Override // androidx.collection.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, b bVar) {
            return bVar.f64460b;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Bitmap f64459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f64460b;

        public b(Bitmap bitmap, int i10) {
            this.f64459a = bitmap;
            this.f64460b = i10;
        }
    }

    public c(Context context) {
        this.f64457a = new a(a(context));
    }

    private static int a(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID);
        return (int) ((((long) ((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass())) * 1048576) / 10);
    }

    public Bitmap a(String str) {
        b bVar = this.f64457a.get(str);
        if (bVar != null) {
            return bVar.f64459a;
        }
        return null;
    }

    public void a() {
        this.f64457a.evictAll();
    }

    public void a(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            return;
        }
        int allocationByteCount = BitmapCompat.getAllocationByteCount(bitmap);
        if (allocationByteCount > this.f64457a.maxSize()) {
            this.f64457a.remove(str);
        } else {
            this.f64457a.put(str, new b(bitmap, allocationByteCount));
        }
    }
}
