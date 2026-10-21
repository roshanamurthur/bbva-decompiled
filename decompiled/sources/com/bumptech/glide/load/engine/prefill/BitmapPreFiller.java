package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.util.Util;
import java.util.HashMap;
import wc.a;
import wc.b;

/* JADX INFO: loaded from: classes9.dex */
public final class BitmapPreFiller {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MemoryCache f38392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BitmapPool f38393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DecodeFormat f38394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f38395d;

    public BitmapPreFiller(MemoryCache memoryCache, BitmapPool bitmapPool, DecodeFormat decodeFormat) {
        this.f38392a = memoryCache;
        this.f38393b = bitmapPool;
        this.f38394c = decodeFormat;
    }

    public void preFill(PreFillType.Builder... builderArr) {
        a aVar = this.f38395d;
        if (aVar != null) {
            aVar.f94209w0 = true;
        }
        int length = builderArr.length;
        PreFillType[] preFillTypeArr = new PreFillType[length];
        for (int i10 = 0; i10 < builderArr.length; i10++) {
            PreFillType.Builder builder = builderArr[i10];
            if (builder.f38402c == null) {
                builder.setConfig(this.f38394c == DecodeFormat.PREFER_ARGB_8888 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            }
            preFillTypeArr[i10] = new PreFillType(builder.f38400a, builder.f38401b, builder.f38402c, builder.f38403d);
        }
        MemoryCache memoryCache = this.f38392a;
        long maxSize = memoryCache.getMaxSize() - memoryCache.getCurrentSize();
        BitmapPool bitmapPool = this.f38393b;
        long maxSize2 = bitmapPool.getMaxSize() + maxSize;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i11 += preFillTypeArr[i12].f38399d;
        }
        float f6 = maxSize2 / i11;
        HashMap map = new HashMap();
        for (int i13 = 0; i13 < length; i13++) {
            PreFillType preFillType = preFillTypeArr[i13];
            map.put(preFillType, Integer.valueOf(Math.round(preFillType.f38399d * f6) / Util.getBitmapByteSize(preFillType.f38396a, preFillType.f38397b, preFillType.f38398c)));
        }
        a aVar2 = new a(bitmapPool, memoryCache, new b(map));
        this.f38395d = aVar2;
        Util.postOnUiThread(aVar2);
    }
}
