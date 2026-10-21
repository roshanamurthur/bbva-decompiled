package com.bbva.plugin.media.capture.media.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.bbva.plugin.media.capture.media.image.compress.ImageCompressor;
import com.bbva.plugin.media.capture.media.image.transformer.ImageTransformer;
import com.bbva.plugin.media.capture.model.TempFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
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

/* JADX INFO: compiled from: ImagePipeline.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/bbva/plugin/media/capture/media/image/ImagePipeline;", "", "Landroid/content/Context;", "context", "Lcom/bbva/plugin/media/capture/model/TempFile;", "file", "", "execute", "(Landroid/content/Context;Lcom/bbva/plugin/media/capture/model/TempFile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/plugin/media/capture/media/image/BitmapExtractor;", "extractor", "", "Lcom/bbva/plugin/media/capture/media/image/transformer/ImageTransformer;", "transformations", "Lcom/bbva/plugin/media/capture/media/image/compress/ImageCompressor;", "compressor", "<init>", "(Lcom/bbva/plugin/media/capture/media/image/BitmapExtractor;Ljava/util/List;Lcom/bbva/plugin/media/capture/media/image/compress/ImageCompressor;)V", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class ImagePipeline {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitmapExtractor f35838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<ImageTransformer> f35839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageCompressor f35840c;

    /* JADX INFO: compiled from: ImagePipeline.kt */
    @DebugMetadata(c = "com.bbva.plugin.media.capture.media.image.ImagePipeline$execute$2", f = "ImagePipeline.kt", i = {}, l = {17}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f35841p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Context f35843r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ TempFile f35844s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, TempFile tempFile, Continuation continuation) {
            super(2, continuation);
            this.f35843r0 = context;
            this.f35844s0 = tempFile;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            return ImagePipeline.this.new a(this.f35843r0, this.f35844s0, completion);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f35841p0;
            ImagePipeline imagePipeline = ImagePipeline.this;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                BitmapExtractor bitmapExtractor = imagePipeline.f35838a;
                Uri uri = this.f35844s0.getUri();
                this.f35841p0 = 1;
                obj = bitmapExtractor.extract(this.f35843r0, uri, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Bitmap bitmapTransform = (Bitmap) obj;
            Iterator it = imagePipeline.f35839b.iterator();
            while (it.hasNext()) {
                bitmapTransform = bitmapTransform != null ? ((ImageTransformer) it.next()).transform(bitmapTransform) : null;
            }
            if (bitmapTransform != null) {
                return imagePipeline.f35840c.compress(bitmapTransform);
            }
            return null;
        }
    }

    public ImagePipeline(@NotNull BitmapExtractor extractor, @NotNull List<ImageTransformer> transformations, @NotNull ImageCompressor compressor) {
        Intrinsics.checkNotNullParameter(extractor, "extractor");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        Intrinsics.checkNotNullParameter(compressor, "compressor");
        this.f35838a = extractor;
        this.f35839b = transformations;
        this.f35840c = compressor;
    }

    @Nullable
    public final Object execute(@NotNull Context context, @NotNull TempFile tempFile, @NotNull Continuation<? super String> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new a(context, tempFile, null), continuation);
    }

    public /* synthetic */ ImagePipeline(BitmapExtractor bitmapExtractor, List list, ImageCompressor imageCompressor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bitmapExtractor, (i10 & 2) != 0 ? new ArrayList() : list, imageCompressor);
    }
}
