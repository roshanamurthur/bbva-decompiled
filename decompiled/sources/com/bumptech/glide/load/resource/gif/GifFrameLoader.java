package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.signature.ObjectKey;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class GifFrameLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GifDecoder f38657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f38658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f38659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RequestManager f38660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitmapPool f38661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f38662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f38663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f38664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RequestBuilder<Bitmap> f38665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f38666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f38667k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f38668l;
    public Bitmap m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Transformation<Bitmap> f38669n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f38670o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f38671p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f38672q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f38673r;

    public interface FrameCallback {
        void onFrameReady();
    }

    @VisibleForTesting
    public static class a extends CustomTarget<Bitmap> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Handler f38674p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f38675q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f38676r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Bitmap f38677s0;

        public a(Handler handler, int i10, long j10) {
            this.f38674p0 = handler;
            this.f38675q0 = i10;
            this.f38676r0 = j10;
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void onLoadCleared(@Nullable Drawable drawable) {
            this.f38677s0 = null;
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void onResourceReady(@NonNull Object obj, @Nullable Transition transition) {
            this.f38677s0 = (Bitmap) obj;
            Handler handler = this.f38674p0;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f38676r0);
        }
    }

    public class b implements Handler.Callback {
        public b() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.what;
            GifFrameLoader gifFrameLoader = GifFrameLoader.this;
            if (i10 == 1) {
                gifFrameLoader.b((a) message.obj);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            gifFrameLoader.f38660d.clear((a) message.obj);
            return false;
        }
    }

    public GifFrameLoader(Glide glide, GifDecoder gifDecoder, int i10, int i11, Transformation<Bitmap> transformation, Bitmap bitmap) {
        BitmapPool bitmapPool = glide.getBitmapPool();
        RequestManager requestManagerWith = Glide.with(glide.getContext());
        RequestBuilder<Bitmap> requestBuilderApply = Glide.with(glide.getContext()).asBitmap().apply((BaseRequestOptions<?>) RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE).useAnimationPool(true).skipMemoryCache(true).override(i10, i11));
        this.f38659c = new ArrayList();
        this.f38660d = requestManagerWith;
        Handler handler = new Handler(Looper.getMainLooper(), new b());
        this.f38661e = bitmapPool;
        this.f38658b = handler;
        this.f38665i = requestBuilderApply;
        this.f38657a = gifDecoder;
        c(transformation, bitmap);
    }

    public final void a() {
        if (!this.f38662f || this.f38663g) {
            return;
        }
        boolean z10 = this.f38664h;
        GifDecoder gifDecoder = this.f38657a;
        if (z10) {
            Preconditions.checkArgument(this.f38670o == null, "Pending target must be null when starting from the first frame");
            gifDecoder.resetFrameIndex();
            this.f38664h = false;
        }
        a aVar = this.f38670o;
        if (aVar != null) {
            this.f38670o = null;
            b(aVar);
            return;
        }
        this.f38663g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) gifDecoder.getNextDelay());
        gifDecoder.advance();
        this.f38668l = new a(this.f38658b, gifDecoder.getCurrentFrameIndex(), jUptimeMillis);
        this.f38665i.apply((BaseRequestOptions<?>) RequestOptions.signatureOf(new ObjectKey(Double.valueOf(Math.random())))).mo4906load((Object) gifDecoder).into(this.f38668l);
    }

    @VisibleForTesting
    public final void b(a aVar) {
        this.f38663g = false;
        boolean z10 = this.f38667k;
        Handler handler = this.f38658b;
        if (z10) {
            handler.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f38662f) {
            if (this.f38664h) {
                handler.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f38670o = aVar;
                return;
            }
        }
        if (aVar.f38677s0 != null) {
            Bitmap bitmap = this.m;
            if (bitmap != null) {
                this.f38661e.put(bitmap);
                this.m = null;
            }
            a aVar2 = this.f38666j;
            this.f38666j = aVar;
            ArrayList arrayList = this.f38659c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((FrameCallback) arrayList.get(size)).onFrameReady();
            }
            if (aVar2 != null) {
                handler.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(Transformation<Bitmap> transformation, Bitmap bitmap) {
        this.f38669n = (Transformation) Preconditions.checkNotNull(transformation);
        this.m = (Bitmap) Preconditions.checkNotNull(bitmap);
        this.f38665i = this.f38665i.apply((BaseRequestOptions<?>) new RequestOptions().transform(transformation));
        this.f38671p = Util.getBitmapByteSize(bitmap);
        this.f38672q = bitmap.getWidth();
        this.f38673r = bitmap.getHeight();
    }
}
