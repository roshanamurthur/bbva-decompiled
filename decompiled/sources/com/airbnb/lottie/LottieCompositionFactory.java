package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.WorkerThread;
import androidx.appcompat.widget.w1;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.LottieCompositionCache;
import com.airbnb.lottie.network.NetworkCache;
import com.airbnb.lottie.network.NetworkFetcher;
import com.airbnb.lottie.parser.LottieCompositionMoshiParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import mx.openpay.library.domain.util.Constant;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LottieCompositionFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f25604a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f25605b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f25606c = {Constants.CVR_B1b85_0101_MOBILE_APP, 75, 3, 4};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f25607d = {31, -117, 8};

    public static LottieTask<LottieComposition> a(@Nullable final String str, Callable<LottieResult<LottieComposition>> callable, @Nullable Runnable runnable) {
        LottieComposition lottieComposition = str == null ? null : LottieCompositionCache.getInstance().get(str);
        LottieTask<LottieComposition> lottieTask = lottieComposition != null ? new LottieTask<>(lottieComposition) : null;
        HashMap map = f25604a;
        if (str != null && map.containsKey(str)) {
            lottieTask = (LottieTask) map.get(str);
        }
        if (lottieTask != null) {
            if (runnable != null) {
                runnable.run();
            }
            return lottieTask;
        }
        LottieTask<LottieComposition> lottieTask2 = new LottieTask<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            lottieTask2.addListener(new LottieListener() { // from class: com.airbnb.lottie.g
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(Object obj) {
                    HashMap map2 = LottieCompositionFactory.f25604a;
                    map2.remove(str);
                    atomicBoolean.set(true);
                    if (map2.size() == 0) {
                        LottieCompositionFactory.e(true);
                    }
                }
            });
            lottieTask2.addFailureListener(new LottieListener() { // from class: com.airbnb.lottie.h
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(Object obj) {
                    HashMap map2 = LottieCompositionFactory.f25604a;
                    map2.remove(str);
                    atomicBoolean.set(true);
                    if (map2.size() == 0) {
                        LottieCompositionFactory.e(true);
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, lottieTask2);
                if (map.size() == 1) {
                    e(false);
                }
            }
        }
        return lottieTask2;
    }

    public static LottieResult<LottieComposition> b(JsonReader jsonReader, @Nullable String str, boolean z10) {
        try {
            LottieComposition lottieComposition = str == null ? null : LottieCompositionCache.getInstance().get(str);
            if (lottieComposition != null) {
                return new LottieResult<>(lottieComposition);
            }
            LottieComposition lottieComposition2 = LottieCompositionMoshiParser.parse(jsonReader);
            if (str != null) {
                LottieCompositionCache.getInstance().put(str, lottieComposition2);
            }
            return new LottieResult<>(lottieComposition2);
        } catch (Exception e5) {
            return new LottieResult<>((Throwable) e5);
        } finally {
            if (z10) {
                Utils.closeQuietly(jsonReader);
            }
        }
    }

    @WorkerThread
    public static LottieResult<LottieComposition> c(@Nullable Context context, ZipInputStream zipInputStream, @Nullable String str) {
        LottieComposition lottieComposition;
        LottieImageAsset next;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            lottieComposition = null;
        } else {
            try {
                lottieComposition = LottieCompositionCache.getInstance().get(str);
            } catch (IOException e5) {
                return new LottieResult<>((Throwable) e5);
            }
        }
        if (lottieComposition != null) {
            return new LottieResult<>(lottieComposition);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        LottieComposition value = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase(com.google.mlkit.common.sdkinternal.Constants.AUTOML_IMAGE_LABELING_MANIFEST_JSON_FILE_NAME)) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                value = b(JsonReader.of(Okio.buffer(Okio.source(zipInputStream))), null, false).getValue();
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(com.bbva.plugin.media.capture.util.Constants.PHOTO_EXTENSION) || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new LottieResult<>((Throwable) new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i10 = zipInputStream.read(bArr);
                                if (i10 == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i10);
                            }
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            fileOutputStream.close();
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                            if (!file.delete()) {
                                Logger.warning("Failed to delete temp font file " + file.getAbsolutePath() + Constant.DOT_STRING);
                            }
                            map2.put(str3, typefaceCreateFromFile);
                        } catch (Throwable th2) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    Logger.warning("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th6);
                }
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (value == null) {
            return new LottieResult<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator<LottieImageAsset> it = value.getImages().values().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!next.getFileName().equals(str4));
            if (next != null) {
                next.setBitmap(Utils.resizeBitmapIfNeeded((Bitmap) entry.getValue(), next.getWidth(), next.getHeight()));
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z10 = false;
            for (Font font : value.getFonts().values()) {
                if (font.getFamily().equals(entry2.getKey())) {
                    font.setTypeface((Typeface) entry2.getValue());
                    z10 = true;
                }
            }
            if (!z10) {
                Logger.warning("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator<Map.Entry<String, LottieImageAsset>> it2 = value.getImages().entrySet().iterator();
            while (it2.hasNext()) {
                LottieImageAsset value2 = it2.next().getValue();
                if (value2 == null) {
                    return null;
                }
                String fileName = value2.getFileName();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (fileName.startsWith("data:") && fileName.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(fileName.substring(fileName.indexOf(44) + 1), 0);
                        value2.setBitmap(Utils.resizeBitmapIfNeeded(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options), value2.getWidth(), value2.getHeight()));
                    } catch (IllegalArgumentException e7) {
                        Logger.warning("data URL did not have correct base64 format.", e7);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            LottieCompositionCache.getInstance().put(str, value);
        }
        return new LottieResult<>(value);
    }

    public static void clearCache(Context context) {
        f25604a.clear();
        LottieCompositionCache.getInstance().clear();
        NetworkCache networkCache = L.networkCache(context);
        if (networkCache != null) {
            networkCache.clear();
        }
    }

    public static Boolean d(BufferedSource bufferedSource, byte[] bArr) {
        try {
            BufferedSource bufferedSourcePeek = bufferedSource.peek();
            for (byte b10 : bArr) {
                if (bufferedSourcePeek.readByte() != b10) {
                    return Boolean.FALSE;
                }
            }
            bufferedSourcePeek.close();
            return Boolean.TRUE;
        } catch (Exception e5) {
            Logger.error("Failed to check zip file header", e5);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    public static void e(boolean z10) {
        ArrayList arrayList = new ArrayList(f25605b);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((LottieTaskIdleListener) arrayList.get(i10)).onIdleChanged(z10);
        }
    }

    public static String f(Context context, @RawRes int i10) {
        StringBuilder sb2 = new StringBuilder("rawRes");
        sb2.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        sb2.append(i10);
        return sb2.toString();
    }

    public static LottieTask<LottieComposition> fromAsset(Context context, String str) {
        return fromAsset(context, str, "asset_" + str);
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromAssetSync(Context context, String str) {
        return fromAssetSync(context, str, "asset_" + str);
    }

    @Deprecated
    public static LottieTask<LottieComposition> fromJson(final JSONObject jSONObject, @Nullable final String str) {
        return a(str, new Callable() { // from class: com.airbnb.lottie.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieCompositionFactory.fromJsonSync(jSONObject, str);
            }
        }, null);
    }

    public static LottieTask<LottieComposition> fromJsonInputStream(final InputStream inputStream, @Nullable final String str) {
        return a(str, new Callable() { // from class: com.airbnb.lottie.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieCompositionFactory.fromJsonInputStreamSync(inputStream, str);
            }
        }, new androidx.room.f(inputStream, 1));
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromJsonInputStreamSync(InputStream inputStream, @Nullable String str) {
        return fromJsonInputStreamSync(inputStream, str, true);
    }

    public static LottieTask<LottieComposition> fromJsonReader(JsonReader jsonReader, @Nullable String str) {
        return a(str, new m(jsonReader, str, 0), new androidx.core.view.b0(jsonReader, 2));
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromJsonReaderSync(JsonReader jsonReader, @Nullable String str) {
        return fromJsonReaderSync(jsonReader, str, true);
    }

    public static LottieTask<LottieComposition> fromJsonSource(final Source source, @Nullable final String str) {
        return a(str, new Callable() { // from class: com.airbnb.lottie.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieCompositionFactory.fromJsonSourceSync(source, str);
            }
        }, new w1(source, 2));
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromJsonSourceSync(Source source, @Nullable String str) {
        return fromJsonSourceSync(source, str, true);
    }

    public static LottieTask<LottieComposition> fromJsonString(final String str, @Nullable final String str2) {
        return a(str2, new Callable() { // from class: com.airbnb.lottie.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieCompositionFactory.fromJsonStringSync(str, str2);
            }
        }, null);
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromJsonStringSync(String str, @Nullable String str2) {
        return fromJsonSourceSync(Okio.source(new ByteArrayInputStream(str.getBytes())), str2);
    }

    @WorkerThread
    @Deprecated
    public static LottieResult<LottieComposition> fromJsonSync(JSONObject jSONObject, @Nullable String str) {
        return fromJsonStringSync(jSONObject.toString(), str);
    }

    public static LottieTask<LottieComposition> fromRawRes(Context context, @RawRes int i10) {
        return fromRawRes(context, i10, f(context, i10));
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromRawResSync(Context context, @RawRes int i10) {
        return fromRawResSync(context, i10, f(context, i10));
    }

    public static LottieTask<LottieComposition> fromUrl(Context context, String str) {
        return fromUrl(context, str, "url_" + str);
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromUrlSync(Context context, String str) {
        return fromUrlSync(context, str, str);
    }

    public static LottieTask<LottieComposition> fromZipStream(ZipInputStream zipInputStream, @Nullable String str) {
        return fromZipStream((Context) null, zipInputStream, str);
    }

    public static LottieResult<LottieComposition> fromZipStreamSync(ZipInputStream zipInputStream, @Nullable String str) {
        return fromZipStreamSync(zipInputStream, str, true);
    }

    public static void registerLottieTaskIdleListener(LottieTaskIdleListener lottieTaskIdleListener) {
        f25605b.add(lottieTaskIdleListener);
        lottieTaskIdleListener.onIdleChanged(f25604a.size() == 0);
    }

    public static void setMaxCacheSize(int i10) {
        LottieCompositionCache.getInstance().resize(i10);
    }

    public static void unregisterLottieTaskIdleListener(LottieTaskIdleListener lottieTaskIdleListener) {
        f25605b.remove(lottieTaskIdleListener);
    }

    public static LottieTask<LottieComposition> fromJsonInputStream(final InputStream inputStream, @Nullable final String str, final boolean z10) {
        return a(str, new Callable() { // from class: com.airbnb.lottie.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieCompositionFactory.fromJsonInputStreamSync(inputStream, str, z10);
            }
        }, new Runnable() { // from class: com.airbnb.lottie.i
            @Override // java.lang.Runnable
            public final void run() {
                HashMap map = LottieCompositionFactory.f25604a;
                if (z10) {
                    Utils.closeQuietly(inputStream);
                }
            }
        });
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromJsonInputStreamSync(InputStream inputStream, @Nullable String str, boolean z10) {
        return fromJsonSourceSync(Okio.source(inputStream), str, z10);
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromJsonReaderSync(JsonReader jsonReader, @Nullable String str, boolean z10) {
        return b(jsonReader, str, z10);
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromJsonSourceSync(Source source, @Nullable String str, boolean z10) {
        return b(JsonReader.of(Okio.buffer(source)), str, z10);
    }

    public static LottieTask<LottieComposition> fromRawRes(Context context, @RawRes final int i10, @Nullable final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return a(str, new Callable() { // from class: com.airbnb.lottie.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap map = LottieCompositionFactory.f25604a;
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return LottieCompositionFactory.fromRawResSync(context2, i10, str);
            }
        }, null);
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromRawResSync(Context context, @RawRes int i10, @Nullable String str) {
        LottieComposition lottieComposition = str == null ? null : LottieCompositionCache.getInstance().get(str);
        if (lottieComposition != null) {
            return new LottieResult<>(lottieComposition);
        }
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(Okio.source(context.getResources().openRawResource(i10)));
            if (d(bufferedSourceBuffer, f25606c).booleanValue()) {
                return fromZipStreamSync(context, new ZipInputStream(bufferedSourceBuffer.inputStream()), str);
            }
            if (!d(bufferedSourceBuffer, f25607d).booleanValue()) {
                return fromJsonReaderSync(JsonReader.of(bufferedSourceBuffer), str);
            }
            try {
                return fromJsonInputStreamSync(new GZIPInputStream(bufferedSourceBuffer.inputStream()), str);
            } catch (IOException e5) {
                return new LottieResult<>((Throwable) e5);
            }
        } catch (Resources.NotFoundException e7) {
            return new LottieResult<>((Throwable) e7);
        }
    }

    public static LottieTask<LottieComposition> fromUrl(final Context context, final String str, @Nullable final String str2) {
        return a(str2, new Callable() { // from class: com.airbnb.lottie.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap map = LottieCompositionFactory.f25604a;
                Context context2 = context;
                NetworkFetcher networkFetcher = L.networkFetcher(context2);
                String str3 = str;
                String str4 = str2;
                LottieResult<LottieComposition> lottieResultFetchSync = networkFetcher.fetchSync(context2, str3, str4);
                if (str4 != null && lottieResultFetchSync.getValue() != null) {
                    LottieCompositionCache.getInstance().put(str4, lottieResultFetchSync.getValue());
                }
                return lottieResultFetchSync;
            }
        }, null);
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromUrlSync(Context context, String str, @Nullable String str2) {
        LottieComposition lottieComposition = str2 == null ? null : LottieCompositionCache.getInstance().get(str2);
        if (lottieComposition != null) {
            return new LottieResult<>(lottieComposition);
        }
        LottieResult<LottieComposition> lottieResultFetchSync = L.networkFetcher(context).fetchSync(context, str, str2);
        if (str2 != null && lottieResultFetchSync.getValue() != null) {
            LottieCompositionCache.getInstance().put(str2, lottieResultFetchSync.getValue());
        }
        return lottieResultFetchSync;
    }

    public static LottieTask<LottieComposition> fromZipStream(ZipInputStream zipInputStream, @Nullable String str, boolean z10) {
        return fromZipStream(null, zipInputStream, str, z10);
    }

    public static LottieResult<LottieComposition> fromZipStreamSync(ZipInputStream zipInputStream, @Nullable String str, boolean z10) {
        return fromZipStreamSync(null, zipInputStream, str, z10);
    }

    public static LottieTask<LottieComposition> fromAsset(Context context, final String str, @Nullable final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return a(str2, new Callable() { // from class: com.airbnb.lottie.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieCompositionFactory.fromAssetSync(applicationContext, str, str2);
            }
        }, null);
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromAssetSync(Context context, String str, @Nullable String str2) {
        LottieComposition lottieComposition = str2 == null ? null : LottieCompositionCache.getInstance().get(str2);
        if (lottieComposition != null) {
            return new LottieResult<>(lottieComposition);
        }
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(Okio.source(context.getAssets().open(str)));
            if (d(bufferedSourceBuffer, f25606c).booleanValue()) {
                return fromZipStreamSync(context, new ZipInputStream(bufferedSourceBuffer.inputStream()), str2);
            }
            if (d(bufferedSourceBuffer, f25607d).booleanValue()) {
                return fromJsonInputStreamSync(new GZIPInputStream(bufferedSourceBuffer.inputStream()), str2);
            }
            return fromJsonReaderSync(JsonReader.of(bufferedSourceBuffer), str2);
        } catch (IOException e5) {
            return new LottieResult<>((Throwable) e5);
        }
    }

    public static LottieTask<LottieComposition> fromZipStream(final Context context, final ZipInputStream zipInputStream, @Nullable final String str) {
        return a(str, new Callable() { // from class: com.airbnb.lottie.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieCompositionFactory.fromZipStreamSync(context, zipInputStream, str);
            }
        }, new androidx.activity.f(zipInputStream, 5));
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromZipStreamSync(@Nullable Context context, ZipInputStream zipInputStream, @Nullable String str) {
        return fromZipStreamSync(context, zipInputStream, str, true);
    }

    public static LottieTask<LottieComposition> fromZipStream(final Context context, final ZipInputStream zipInputStream, @Nullable final String str, boolean z10) {
        return a(str, new Callable() { // from class: com.airbnb.lottie.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieCompositionFactory.fromZipStreamSync(context, zipInputStream, str);
            }
        }, z10 ? new androidx.activity.h(zipInputStream, 2) : null);
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromZipStreamSync(@Nullable Context context, ZipInputStream zipInputStream, @Nullable String str, boolean z10) {
        try {
            return c(context, zipInputStream, str);
        } finally {
            if (z10) {
                Utils.closeQuietly(zipInputStream);
            }
        }
    }
}
