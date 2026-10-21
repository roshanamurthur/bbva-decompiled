package com.caverock.androidsvg;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import com.veridas.Veridas;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashSet;

/* JADX INFO: loaded from: classes9.dex */
public class SimpleAssetResolver extends SVGExternalFileResolver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f39099b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetManager f39100a;

    static {
        HashSet hashSet = new HashSet(8);
        f39099b = hashSet;
        androidx.constraintlayout.core.parser.a.d(hashSet, "image/svg+xml", Veridas.JPEG_MIME_TYPE, "image/png", "image/pjpeg");
        androidx.constraintlayout.core.parser.a.d(hashSet, "image/gif", "image/bmp", "image/x-windows-bmp", "image/webp");
    }

    public SimpleAssetResolver(AssetManager assetManager) {
        this.f39100a = assetManager;
    }

    @Override // com.caverock.androidsvg.SVGExternalFileResolver
    public boolean isFormatSupported(String str) {
        return f39099b.contains(str);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0032 A[EXC_TOP_SPLITTER, PHI: r0 r8
      0x0032: PHI (r0v4 java.lang.String) = (r0v0 java.lang.String), (r0v8 java.lang.String) binds: [B:19:0x0043, B:10:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x0032: PHI (r8v6 java.io.InputStream) = (r8v5 java.io.InputStream), (r8v7 java.io.InputStream) binds: [B:19:0x0043, B:10:0x0030] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // com.caverock.androidsvg.SVGExternalFileResolver
    public String resolveCSSStyleSheet(String str) throws Throwable {
        Throwable th2;
        InputStream inputStreamOpen;
        String string = null;
        try {
            inputStreamOpen = this.f39100a.open(str);
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

    @Override // com.caverock.androidsvg.SVGExternalFileResolver
    public Typeface resolveFont(String str, int i10, String str2) {
        AssetManager assetManager = this.f39100a;
        try {
            try {
                return Typeface.createFromAsset(assetManager, str + ".ttf");
            } catch (RuntimeException unused) {
                return Typeface.createFromAsset(assetManager, str + ".otf");
            }
        } catch (RuntimeException unused2) {
            return null;
        }
    }

    @Override // com.caverock.androidsvg.SVGExternalFileResolver
    public Bitmap resolveImage(String str) {
        try {
            return BitmapFactory.decodeStream(this.f39100a.open(str));
        } catch (IOException unused) {
            return null;
        }
    }
}
