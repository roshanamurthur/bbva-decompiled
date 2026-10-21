package com.bbva.image.transform;

import android.graphics.Bitmap;
import androidx.core.view.ViewCompat;
import bk.o;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MonochromeImageTransformer.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u001d\b\u0016\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u0015\u0010\u001aJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/bbva/image/transform/MonochromeImageTransformer;", "Lcom/bbva/image/transform/ImageTransformer;", "Landroid/graphics/Bitmap;", "bitmap", "transform", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "", "b", "Z", "getPerformResize", "()Z", "performResize", "", MonochromeImageTransformer.THRESHOLD, "Lcom/bbva/image/transform/GrayscaleImageTransformer;", "grayscaleImageFilter", "<init>", "(ILcom/bbva/image/transform/GrayscaleImageTransformer;)V", "", "", "params", "(Ljava/util/Map;)V", "Companion", "image-transform_release"}, k = 1, mv = {1, 4, 2})
public final class MonochromeImageTransformer implements ImageTransformer {
    public static final int DEFAULT_THRESHOLD = 50;

    @NotNull
    public static final String ID = "Monochrome";

    @NotNull
    public static final String THRESHOLD = "threshold";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean performResize;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GrayscaleImageTransformer f34900d;

    /* JADX INFO: compiled from: MonochromeImageTransformer.kt */
    public static final class a extends Lambda implements Function1<String, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f34901p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            return 50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MonochromeImageTransformer() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    @Override // com.bbva.image.transform.ImageTransformer
    @NotNull
    public String getId() {
        return this.id;
    }

    @Override // com.bbva.image.transform.ImageTransformer
    public boolean getPerformResize() {
        return this.performResize;
    }

    @Override // com.bbva.image.transform.ImageTransformer
    @NotNull
    public Bitmap transform(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Bitmap bitmapTransform = this.f34900d.transform(bitmap);
        Bitmap monochromeBitmap = Bitmap.createBitmap(bitmapTransform.getWidth(), bitmapTransform.getHeight(), bitmapTransform.getConfig());
        int i10 = (this.f34899c * 255) / 100;
        Intrinsics.checkNotNullExpressionValue(monochromeBitmap, "monochromeBitmap");
        int width = monochromeBitmap.getWidth();
        int height = monochromeBitmap.getHeight();
        for (int i11 = 0; i11 < width; i11++) {
            for (int i12 = 0; i12 < height; i12++) {
                monochromeBitmap.setPixel(i11, i12, (bitmapTransform.getPixel(i11, i12) & 255) < i10 ? ViewCompat.MEASURED_STATE_MASK : -1);
            }
        }
        return monochromeBitmap;
    }

    public MonochromeImageTransformer(int i10, @NotNull GrayscaleImageTransformer grayscaleImageFilter) {
        Intrinsics.checkNotNullParameter(grayscaleImageFilter, "grayscaleImageFilter");
        this.f34899c = i10;
        this.f34900d = grayscaleImageFilter;
        this.id = ID;
        this.performResize = true;
    }

    public /* synthetic */ MonochromeImageTransformer(int i10, GrayscaleImageTransformer grayscaleImageTransformer, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 50 : i10, (i11 & 2) != 0 ? new GrayscaleImageTransformer() : grayscaleImageTransformer);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MonochromeImageTransformer(@NotNull Map<String, ? extends Object> params) {
        this(UtilsKt.toSafeInt(String.valueOf(o.withDefault(params, a.f34901p0).get(THRESHOLD))), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(params, "params");
    }
}
