package androidx.core.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.util.Consumer;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: compiled from: FontRequestWorker.java */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LruCache<String, Typeface> f20063a = new LruCache<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f20064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f20065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @GuardedBy("LOCK")
    public static final SimpleArrayMap<String, ArrayList<Consumer<a>>> f20066d;

    static {
        k2.c cVar = new k2.c();
        cVar.f79173p0 = "fonts-androidx";
        cVar.f79174q0 = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), cVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f20064b = threadPoolExecutor;
        f20065c = new Object();
        f20066d = new SimpleArrayMap<>();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0023 A[EDGE_INSN: B:12:0x0023->B:28:0x0047 BREAK  A[LOOP:0: B:20:0x0034->B:26:0x0043]] */
    @NonNull
    public static a a(@NonNull String str, @NonNull Context context, @NonNull FontRequest fontRequest, int i10) {
        LruCache<String, Typeface> lruCache = f20063a;
        Typeface typeface = lruCache.get(str);
        if (typeface != null) {
            return new a(typeface);
        }
        try {
            FontsContractCompat.FontFamilyResult fontFamilyResultA = d.a(context, null, fontRequest);
            int i11 = 1;
            if (fontFamilyResultA.getStatusCode() == 0) {
                FontsContractCompat.FontInfo[] fonts = fontFamilyResultA.getFonts();
                if (fonts != null && fonts.length != 0) {
                    int length = fonts.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length) {
                            i11 = 0;
                            break;
                        }
                        int resultCode = fonts[i12].getResultCode();
                        if (resultCode != 0) {
                            if (resultCode >= 0) {
                                i11 = resultCode;
                                break;
                            }
                            i11 = -3;
                            break;
                        }
                        i12++;
                    }
                }
            } else {
                if (fontFamilyResultA.getStatusCode() != 1) {
                    i11 = -3;
                    break;
                }
                i11 = -2;
            }
            if (i11 != 0) {
                return new a(i11);
            }
            Typeface typefaceCreateFromFontInfo = TypefaceCompat.createFromFontInfo(context, null, fontFamilyResultA.getFonts(), i10);
            if (typefaceCreateFromFontInfo == null) {
                return new a(-3);
            }
            lruCache.put(str, typefaceCreateFromFontInfo);
            return new a(typefaceCreateFromFontInfo);
        } catch (PackageManager.NameNotFoundException unused) {
            return new a(-1);
        }
    }

    public static Typeface b(@NonNull Context context, @NonNull FontRequest fontRequest, int i10, @Nullable k2.d dVar, @NonNull c cVar) {
        String str = fontRequest.f20019f + Constant.DASH_STRING + i10;
        Typeface typeface = f20063a.get(str);
        if (typeface != null) {
            cVar.f20051b.post(new androidx.core.provider.a(cVar.f20050a, typeface));
            return typeface;
        }
        f fVar = new f(cVar);
        synchronized (f20065c) {
            try {
                SimpleArrayMap<String, ArrayList<Consumer<a>>> simpleArrayMap = f20066d;
                ArrayList<Consumer<a>> arrayList = simpleArrayMap.get(str);
                if (arrayList != null) {
                    arrayList.add(fVar);
                    return null;
                }
                ArrayList<Consumer<a>> arrayList2 = new ArrayList<>();
                arrayList2.add(fVar);
                simpleArrayMap.put(str, arrayList2);
                g gVar = new g(str, context, fontRequest, i10);
                Executor executor = dVar;
                if (dVar == null) {
                    executor = f20064b;
                }
                h hVar = new h(str);
                Handler handlerA = k2.a.a();
                k2.e eVar = new k2.e();
                eVar.f79177p0 = gVar;
                eVar.f79178q0 = hVar;
                eVar.f79179r0 = handlerA;
                executor.execute(eVar);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: FontRequestWorker.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Typeface f20067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20068b;

        public a(int i10) {
            this.f20067a = null;
            this.f20068b = i10;
        }

        @SuppressLint({"WrongConstant"})
        public a(@NonNull Typeface typeface) {
            this.f20067a = typeface;
            this.f20068b = 0;
        }
    }
}
