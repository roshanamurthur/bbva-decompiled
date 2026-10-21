package com.mastercard.sonic.androidsvg;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import androidx.constraintlayout.core.parser.a;
import com.veridas.Veridas;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SimpleAssetResolver.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¨\u0006\u0016"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SimpleAssetResolver;", "Lcom/mastercard/sonic/androidsvg/SVGExternalFileResolver;", "", "fontFamily", "", "fontWeight", "fontStyle", "Landroid/graphics/Typeface;", "resolveFont", "filename", "Landroid/graphics/Bitmap;", "resolveImage", "mimeType", "", "isFormatSupported", "url", "resolveCSSStyleSheet", "Landroid/content/res/AssetManager;", "assetManager", "<init>", "(Landroid/content/res/AssetManager;)V", "Companion", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final class SimpleAssetResolver extends SVGExternalFileResolver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final HashSet f51415b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AssetManager f51416a;

    static {
        HashSet hashSet = new HashSet(8);
        f51415b = hashSet;
        a.d(hashSet, "image/svg+xml", Veridas.JPEG_MIME_TYPE, "image/png", "image/pjpeg");
        a.d(hashSet, "image/gif", "image/bmp", "image/x-windows-bmp", "image/webp");
    }

    public SimpleAssetResolver(@NotNull AssetManager assetManager) {
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        this.f51416a = assetManager;
    }

    @Override // com.mastercard.sonic.androidsvg.SVGExternalFileResolver
    public boolean isFormatSupported(@Nullable String mimeType) {
        return f51415b.contains(mimeType);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0037 A[EXC_TOP_SPLITTER, PHI: r0 r8
      0x0037: PHI (r0v5 java.lang.String) = (r0v1 java.lang.String), (r0v9 java.lang.String) binds: [B:19:0x0048, B:10:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x0037: PHI (r8v6 java.io.InputStream) = (r8v5 java.io.InputStream), (r8v7 java.io.InputStream) binds: [B:19:0x0048, B:10:0x0035] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // com.mastercard.sonic.androidsvg.SVGExternalFileResolver
    @Nullable
    public String resolveCSSStyleSheet(@NotNull String url) throws Throwable {
        Throwable th2;
        InputStream inputStreamOpen;
        Intrinsics.checkNotNullParameter(url, "url");
        String string = null;
        try {
            inputStreamOpen = this.f51416a.open(url);
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStreamOpen, Charset.forName("UTF-8"));
                char[] cArr = new char[4096];
                StringBuilder sb2 = new StringBuilder();
                for (int i10 = inputStreamReader.read(cArr); i10 > 0; i10 = inputStreamReader.read(cArr)) {
                    sb2.append(cArr, 0, i10);
                }
                string = sb2.toString();
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (IOException unused2) {
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
            } catch (Throwable th3) {
                th2 = th3;
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th2;
            }
        } catch (IOException unused4) {
            inputStreamOpen = null;
        } catch (Throwable th4) {
            th2 = th4;
            inputStreamOpen = null;
        }
        return string;
    }

    @Override // com.mastercard.sonic.androidsvg.SVGExternalFileResolver
    @Nullable
    public Typeface resolveFont(@Nullable String fontFamily, int fontWeight, @NotNull String fontStyle) {
        AssetManager assetManager = this.f51416a;
        Intrinsics.checkNotNullParameter(fontStyle, "fontStyle");
        try {
            try {
                return Typeface.createFromAsset(assetManager, fontFamily + ".ttf");
            } catch (RuntimeException unused) {
                return null;
            }
        } catch (RuntimeException unused2) {
            return Typeface.createFromAsset(assetManager, fontFamily + ".otf");
        }
    }

    @Override // com.mastercard.sonic.androidsvg.SVGExternalFileResolver
    @Nullable
    public Bitmap resolveImage(@Nullable String filename) {
        try {
            AssetManager assetManager = this.f51416a;
            Intrinsics.checkNotNull(filename);
            InputStream inputStreamOpen = assetManager.open(filename);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "assetManager.open(filename!!)");
            return BitmapFactory.decodeStream(inputStreamOpen);
        } catch (IOException unused) {
            return null;
        }
    }
}
