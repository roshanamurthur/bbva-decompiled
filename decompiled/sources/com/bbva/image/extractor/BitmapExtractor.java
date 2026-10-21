package com.bbva.image.extractor;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.InputStream;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BitmapExtractor.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\f"}, d2 = {"Lcom/bbva/image/extractor/BitmapExtractor;", "", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "uri", "Landroid/graphics/Bitmap;", "extract", "Lcom/bbva/image/extractor/ImageScaler;", "imageScaler", "<init>", "(Lcom/bbva/image/extractor/ImageScaler;)V", "image-transform_release"}, k = 1, mv = {1, 4, 2})
public final class BitmapExtractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageScaler f34881a;

    /* JADX WARN: Multi-variable type inference failed */
    public BitmapExtractor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static InputStream a(Context context, Uri uri) {
        Object objM5535constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(context.getContentResolver().openInputStream(uri));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null) {
            Objects.toString(uri);
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = null;
        }
        return (InputStream) objM5535constructorimpl;
    }

    @Nullable
    public final Bitmap extract(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        InputStream inputStreamA = a(context, uri);
        if (inputStreamA == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStreamA, null, options);
        ImageScaler imageScaler = this.f34881a;
        imageScaler.preResize(options);
        InputStream inputStreamA2 = a(context, uri);
        options.inJustDecodeBounds = false;
        Unit unit = Unit.INSTANCE;
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamA2, null, options);
        if (bitmapDecodeStream == null) {
            return null;
        }
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        bitmapDecodeStream.setDensity(resources.getDisplayMetrics().densityDpi);
        return imageScaler.postResize(bitmapDecodeStream);
    }

    public BitmapExtractor(@NotNull ImageScaler imageScaler) {
        Intrinsics.checkNotNullParameter(imageScaler, "imageScaler");
        this.f34881a = imageScaler;
    }

    public /* synthetic */ BitmapExtractor(ImageScaler imageScaler, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? NoScale.INSTANCE : imageScaler);
    }
}
