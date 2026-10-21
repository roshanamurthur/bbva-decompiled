package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.util.Util;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;
import uc.d;
import uc.e;

/* JADX INFO: loaded from: classes9.dex */
@RequiresApi(19)
public class SizeConfigStrategy implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Bitmap.Config[] f38253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f38254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f38255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f38256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f38257h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f38258a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uc.c<b, Bitmap> f38259b = new uc.c<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f38260c = new HashMap();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38261a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f38261a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38261a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38261a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38261a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @VisibleForTesting
    public static final class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f38262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f38263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Bitmap.Config f38264c;

        public b(c cVar) {
            this.f38262a = cVar;
        }

        @Override // uc.e
        public final void a() {
            this.f38262a.a(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f38263b == bVar.f38263b && Util.bothNullOrEqual(this.f38264c, bVar.f38264c);
        }

        public final int hashCode() {
            int i10 = this.f38263b * 31;
            Bitmap.Config config = this.f38264c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return SizeConfigStrategy.b(this.f38263b, this.f38264c);
        }
    }

    @VisibleForTesting
    public static class c extends uc.b<b> {
        public final e b() {
            return new b(this);
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f38253d = configArr;
        f38254e = configArr;
        f38255f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f38256g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f38257h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String b(int i10, Bitmap.Config config) {
        return Constant.BRACKET_OPEN + i10 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapC = c(bitmap.getConfig());
        Integer num2 = navigableMapC.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapC.remove(num);
                return;
            } else {
                navigableMapC.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + logBitmap(bitmap) + ", this: " + this);
    }

    public final NavigableMap<Integer, Integer> c(Bitmap.Config config) {
        HashMap map = this.f38260c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    @Override // uc.d
    @Nullable
    public Bitmap get(int i10, int i11, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int bitmapByteSize = Util.getBitmapByteSize(i10, i11, config);
        c cVar = this.f38258a;
        e eVarB = (e) cVar.f93771a.poll();
        if (eVarB == null) {
            eVarB = cVar.b();
        }
        b bVar = (b) eVarB;
        bVar.f38263b = bitmapByteSize;
        bVar.f38264c = config;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i12 = a.f38261a[config.ordinal()];
            if (i12 == 1) {
                configArr = f38253d;
            } else if (i12 == 2) {
                configArr = f38255f;
            } else if (i12 != 3) {
                configArr = i12 != 4 ? new Bitmap.Config[]{config} : f38257h;
            } else {
                configArr = f38256g;
            }
        } else {
            configArr = f38254e;
        }
        for (Bitmap.Config config2 : configArr) {
            Integer numCeilingKey = c(config2).ceilingKey(Integer.valueOf(bitmapByteSize));
            if (numCeilingKey != null && numCeilingKey.intValue() <= bitmapByteSize * 8) {
                if (numCeilingKey.intValue() == bitmapByteSize && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                cVar.a(bVar);
                int iIntValue = numCeilingKey.intValue();
                e eVarB2 = (e) cVar.f93771a.poll();
                if (eVarB2 == null) {
                    eVarB2 = cVar.b();
                }
                bVar = (b) eVarB2;
                bVar.f38263b = iIntValue;
                bVar.f38264c = config2;
                break;
            }
        }
        Bitmap bitmapA = this.f38259b.a(bVar);
        if (bitmapA != null) {
            a(Integer.valueOf(bVar.f38263b), bitmapA);
            bitmapA.reconfigure(i10, i11, config);
        }
        return bitmapA;
    }

    @Override // uc.d
    public int getSize(Bitmap bitmap) {
        return Util.getBitmapByteSize(bitmap);
    }

    @Override // uc.d
    public String logBitmap(Bitmap bitmap) {
        return b(Util.getBitmapByteSize(bitmap), bitmap.getConfig());
    }

    @Override // uc.d
    public void put(Bitmap bitmap) {
        int bitmapByteSize = Util.getBitmapByteSize(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        c cVar = this.f38258a;
        e eVarB = (e) cVar.f93771a.poll();
        if (eVarB == null) {
            eVarB = cVar.b();
        }
        b bVar = (b) eVarB;
        bVar.f38263b = bitmapByteSize;
        bVar.f38264c = config;
        this.f38259b.b(bVar, bitmap);
        NavigableMap<Integer, Integer> navigableMapC = c(bitmap.getConfig());
        Integer num = navigableMapC.get(Integer.valueOf(bVar.f38263b));
        navigableMapC.put(Integer.valueOf(bVar.f38263b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // uc.d
    @Nullable
    public Bitmap removeLast() {
        Bitmap bitmapC = this.f38259b.c();
        if (bitmapC != null) {
            a(Integer.valueOf(Util.getBitmapByteSize(bitmapC)), bitmapC);
        }
        return bitmapC;
    }

    public String toString() {
        StringBuilder sbD = androidx.camera.core.impl.utils.c.d("SizeConfigStrategy{groupedMap=");
        sbD.append(this.f38259b);
        sbD.append(", sortedSizes=(");
        HashMap map = this.f38260c;
        for (Map.Entry entry : map.entrySet()) {
            sbD.append(entry.getKey());
            sbD.append(AbstractJsonLexerKt.BEGIN_LIST);
            sbD.append(entry.getValue());
            sbD.append("], ");
        }
        if (!map.isEmpty()) {
            sbD.replace(sbD.length() - 2, sbD.length(), "");
        }
        sbD.append(")}");
        return sbD.toString();
    }

    @Override // uc.d
    public String logBitmap(int i10, int i11, Bitmap.Config config) {
        return b(Util.getBitmapByteSize(i10, i11, config), config);
    }
}
