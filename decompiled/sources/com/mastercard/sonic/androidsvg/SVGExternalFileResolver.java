package com.mastercard.sonic.androidsvg;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SVGExternalFileResolver.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J$\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0012"}, d2 = {"Lcom/mastercard/sonic/androidsvg/SVGExternalFileResolver;", "", "()V", "isFormatSupported", "", "mimeType", "", "resolveCSSStyleSheet", "url", "resolveFont", "Landroid/graphics/Typeface;", "fontFamily", "fontWeight", "", "fontStyle", "resolveImage", "Landroid/graphics/Bitmap;", "filename", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class SVGExternalFileResolver {
    public boolean isFormatSupported(@Nullable String mimeType) {
        return false;
    }

    @Nullable
    public String resolveCSSStyleSheet(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return null;
    }

    @Nullable
    public Typeface resolveFont(@Nullable String fontFamily, int fontWeight, @NotNull String fontStyle) {
        Intrinsics.checkNotNullParameter(fontStyle, "fontStyle");
        return null;
    }

    @Nullable
    public Bitmap resolveImage(@Nullable String filename) {
        return null;
    }
}
