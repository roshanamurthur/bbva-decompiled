package com.bbva.plugin.media.capture.media.image;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.bbva.androidtoolkit.utils.Tracer;
import com.bbva.plugin.media.capture.command.param.GetPictureParams;
import com.bbva.plugin.media.capture.media.image.resizer.NonResize;
import com.bbva.plugin.media.capture.media.image.resizer.Resizer;
import com.bbva.plugin.media.capture.media.image.resizer.ScaleSidesResizer;
import com.bbva.plugin.media.capture.media.image.resizer.WeightScaleResizer;
import com.bbva.plugin.media.capture.util.Constants;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BitmapExtractor.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/bbva/plugin/media/capture/media/image/BitmapExtractor;", "", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "uri", "Landroid/graphics/Bitmap;", "extract", "(Landroid/content/Context;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/plugin/media/capture/media/image/resizer/Resizer;", "resizer", "<init>", "(Lcom/bbva/plugin/media/capture/media/image/resizer/Resizer;)V", "Companion", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class BitmapExtractor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resizer f35834a;

    /* JADX INFO: compiled from: BitmapExtractor.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/plugin/media/capture/media/image/BitmapExtractor$Companion;", "", "()V", "create", "Lcom/bbva/plugin/media/capture/media/image/BitmapExtractor;", "pictureParams", "Lcom/bbva/plugin/media/capture/command/param/GetPictureParams;", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:16:0x004d  */
        @NotNull
        public final BitmapExtractor create(@NotNull GetPictureParams pictureParams) {
            Resizer weightScaleResizer;
            Intrinsics.checkNotNullParameter(pictureParams, "pictureParams");
            String scaleType = pictureParams.getScaleType();
            if (scaleType != null) {
                int iHashCode = scaleType.hashCode();
                if (iHashCode != -476628740) {
                    if (iHashCode == 1551203130 && scaleType.equals(Constants.KNOWN_SIDE_SCALE)) {
                        Float scaleRate = pictureParams.getScaleRate();
                        Intrinsics.checkNotNull(scaleRate);
                        weightScaleResizer = new ScaleSidesResizer(scaleRate.floatValue());
                    } else {
                        weightScaleResizer = NonResize.INSTANCE;
                    }
                } else if (scaleType.equals(Constants.MAX_IMAGE_WEIGHT_SCALE)) {
                    Float scaleRate2 = pictureParams.getScaleRate();
                    Intrinsics.checkNotNull(scaleRate2);
                    weightScaleResizer = new WeightScaleResizer(scaleRate2.floatValue());
                } else {
                    weightScaleResizer = NonResize.INSTANCE;
                }
            } else {
                weightScaleResizer = NonResize.INSTANCE;
            }
            return new BitmapExtractor(weightScaleResizer);
        }
    }

    /* JADX INFO: compiled from: BitmapExtractor.kt */
    @DebugMetadata(c = "com.bbva.plugin.media.capture.media.image.BitmapExtractor$extract$2", f = "BitmapExtractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Uri f35836q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Context f35837r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Uri uri, Context context, Continuation continuation) {
            super(2, continuation);
            this.f35836q0 = uri;
            this.f35837r0 = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            return BitmapExtractor.this.new a(this.f35836q0, this.f35837r0, completion);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            BitmapExtractor bitmapExtractor = BitmapExtractor.this;
            Uri uri = this.f35836q0;
            Context context = this.f35837r0;
            InputStream inputStreamAccess$asStream = BitmapExtractor.access$asStream(bitmapExtractor, uri, context);
            if (inputStreamAccess$asStream == null) {
                return null;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(inputStreamAccess$asStream, null, options);
            bitmapExtractor.f35834a.preResize(options);
            InputStream inputStreamAccess$asStream2 = BitmapExtractor.access$asStream(bitmapExtractor, uri, context);
            options.inJustDecodeBounds = false;
            Unit unit = Unit.INSTANCE;
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamAccess$asStream2, null, options);
            if (bitmapDecodeStream == null) {
                return null;
            }
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
            bitmapDecodeStream.setDensity(resources.getDisplayMetrics().densityDpi);
            return bitmapExtractor.f35834a.postResize(bitmapDecodeStream);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BitmapExtractor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final InputStream access$asStream(BitmapExtractor bitmapExtractor, Uri uri, Context context) {
        Object objM5535constructorimpl;
        bitmapExtractor.getClass();
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(context.getContentResolver().openInputStream(uri));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            Tracer.e(thM5538exceptionOrNullimpl, "Error getting image from camera");
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = null;
        }
        return (InputStream) objM5535constructorimpl;
    }

    @Nullable
    public final Object extract(@NotNull Context context, @NotNull Uri uri, @NotNull Continuation<? super Bitmap> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new a(uri, context, null), continuation);
    }

    public BitmapExtractor(@NotNull Resizer resizer) {
        Intrinsics.checkNotNullParameter(resizer, "resizer");
        this.f35834a = resizer;
    }

    public /* synthetic */ BitmapExtractor(Resizer resizer, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? NonResize.INSTANCE : resizer);
    }
}
