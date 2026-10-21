package com.airbnb.lottie.network;

import android.content.Context;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieResult;
import com.airbnb.lottie.utils.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class NetworkFetcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final NetworkCache f26135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LottieNetworkFetcher f26136b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26137a;

        static {
            int[] iArr = new int[FileExtension.values().length];
            f26137a = iArr;
            try {
                iArr[FileExtension.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26137a[FileExtension.GZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public NetworkFetcher(@Nullable NetworkCache networkCache, @NonNull LottieNetworkFetcher lottieNetworkFetcher) {
        this.f26135a = networkCache;
        this.f26136b = lottieNetworkFetcher;
    }

    @NonNull
    public final LottieResult<LottieComposition> a(Context context, @NonNull String str, @NonNull InputStream inputStream, @Nullable String str2, @Nullable String str3) throws IOException {
        LottieResult<LottieComposition> lottieResultFromZipStreamSync;
        FileExtension fileExtension;
        if (str2 == null) {
            str2 = "application/json";
        }
        boolean zContains = str2.contains("application/zip");
        NetworkCache networkCache = this.f26135a;
        if (zContains || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            Logger.debug("Handling zip response.");
            FileExtension fileExtension2 = FileExtension.ZIP;
            lottieResultFromZipStreamSync = (str3 == null || networkCache == null) ? LottieCompositionFactory.fromZipStreamSync(context, new ZipInputStream(inputStream), (String) null) : LottieCompositionFactory.fromZipStreamSync(context, new ZipInputStream(new FileInputStream(networkCache.d(str, inputStream, fileExtension2))), str);
            fileExtension = fileExtension2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            Logger.debug("Handling gzip response.");
            fileExtension = FileExtension.GZIP;
            lottieResultFromZipStreamSync = (str3 == null || networkCache == null) ? LottieCompositionFactory.fromJsonInputStreamSync(new GZIPInputStream(inputStream), null) : LottieCompositionFactory.fromJsonInputStreamSync(new GZIPInputStream(new FileInputStream(networkCache.d(str, inputStream, fileExtension))), str);
        } else {
            Logger.debug("Received json response.");
            fileExtension = FileExtension.JSON;
            lottieResultFromZipStreamSync = (str3 == null || networkCache == null) ? LottieCompositionFactory.fromJsonInputStreamSync(inputStream, null) : LottieCompositionFactory.fromJsonInputStreamSync(new FileInputStream(networkCache.d(str, inputStream, fileExtension).getAbsolutePath()), str);
        }
        if (str3 != null && lottieResultFromZipStreamSync.getValue() != null && networkCache != null) {
            networkCache.getClass();
            File file = new File(networkCache.c(), NetworkCache.a(str, fileExtension, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            Logger.debug("Copying temp file to real file (" + file2 + ")");
            if (!zRenameTo) {
                Logger.warning("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + Constant.DOT_STRING);
            }
        }
        return lottieResultFromZipStreamSync;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [com.airbnb.lottie.LottieResult<com.airbnb.lottie.LottieComposition>] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0101 -> B:77:0x012b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x012a -> B:77:0x012b). Please report as a decompilation issue!!! */
    @NonNull
    @WorkerThread
    public LottieResult<LottieComposition> fetchSync(Context context, @NonNull String str, @Nullable String str2) {
        LottieComposition value;
        NetworkCache networkCache;
        Pair pair;
        LottieResult<LottieComposition> lottieResultFromZipStreamSync;
        FileExtension fileExtension;
        boolean z10 = true;
        LottieFetchResult lottieFetchResultFetchSync = null;
        if (str2 == null || (networkCache = this.f26135a) == null) {
            value = null;
        } else {
            try {
                File fileB = networkCache.b(str);
                if (fileB == null) {
                    pair = null;
                } else {
                    FileInputStream fileInputStream = new FileInputStream(fileB);
                    if (fileB.getAbsolutePath().endsWith(".zip")) {
                        fileExtension = FileExtension.ZIP;
                    } else {
                        fileExtension = fileB.getAbsolutePath().endsWith(".gz") ? FileExtension.GZIP : FileExtension.JSON;
                    }
                    StringBuilder sbD = ci.a.d("Cache hit for ", str, " at ");
                    sbD.append(fileB.getAbsolutePath());
                    Logger.debug(sbD.toString());
                    pair = new Pair(fileExtension, fileInputStream);
                }
            } catch (FileNotFoundException unused) {
            }
            if (pair == null) {
                value = null;
            } else {
                FileExtension fileExtension2 = (FileExtension) pair.first;
                InputStream inputStream = (InputStream) pair.second;
                int i10 = a.f26137a[fileExtension2.ordinal()];
                if (i10 == 1) {
                    lottieResultFromZipStreamSync = LottieCompositionFactory.fromZipStreamSync(context, new ZipInputStream(inputStream), str2);
                } else if (i10 != 2) {
                    lottieResultFromZipStreamSync = LottieCompositionFactory.fromJsonInputStreamSync(inputStream, str2);
                } else {
                    try {
                        lottieResultFromZipStreamSync = LottieCompositionFactory.fromJsonInputStreamSync(new GZIPInputStream(inputStream), str2);
                    } catch (IOException e5) {
                        lottieResultFromZipStreamSync = new LottieResult<>(e5);
                    }
                }
                if (lottieResultFromZipStreamSync.getValue() != null) {
                    value = lottieResultFromZipStreamSync.getValue();
                } else {
                    value = null;
                }
            }
        }
        if (value != null) {
            return new LottieResult<>(value);
        }
        Logger.debug("Animation for " + str + " not found in cache. Fetching from network.");
        StringBuilder sb2 = new StringBuilder("Fetching ");
        sb2.append(str);
        Logger.debug(sb2.toString());
        try {
            try {
                lottieFetchResultFetchSync = this.f26136b.fetchSync(str);
                try {
                    if (lottieFetchResultFetchSync.isSuccessful()) {
                        LottieResult<LottieComposition> lottieResultA = a(context, str, lottieFetchResultFetchSync.bodyByteStream(), lottieFetchResultFetchSync.contentType(), str2);
                        StringBuilder sb3 = new StringBuilder("Completed fetch from network. Success: ");
                        if (lottieResultA.getValue() == null) {
                            z10 = false;
                        }
                        sb3.append(z10);
                        Logger.debug(sb3.toString());
                        lottieFetchResultFetchSync.close();
                        context = lottieResultA;
                    } else {
                        LottieResult lottieResult = new LottieResult((Throwable) new IllegalArgumentException(lottieFetchResultFetchSync.error()));
                        lottieFetchResultFetchSync.close();
                        context = lottieResult;
                    }
                } catch (IOException e7) {
                    Logger.warning("LottieFetchResult close failed ", e7);
                    context = context;
                }
            } catch (Throwable th2) {
                if (lottieFetchResultFetchSync != null) {
                    try {
                        lottieFetchResultFetchSync.close();
                    } catch (IOException e10) {
                        Logger.warning("LottieFetchResult close failed ", e10);
                    }
                }
                throw th2;
            }
        } catch (Exception e11) {
            LottieResult lottieResult2 = new LottieResult((Throwable) e11);
            if (lottieFetchResultFetchSync != null) {
                try {
                    lottieFetchResultFetchSync.close();
                } catch (IOException e12) {
                    Logger.warning("LottieFetchResult close failed ", e12);
                }
            }
            context = lottieResult2;
        }
        return context;
    }
}
