package com.bbva.image;

import android.graphics.Bitmap;
import bk.g;
import com.bbva.image.compressor.ImageCompressor;
import com.bbva.image.transform.ImageTransformer;
import dk.e;
import java.io.File;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
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
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J!\u0010\u0004\u001a\u00020\u00002\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005\"\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0007J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u001b\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/bbva/image/ImagePipeline;", "", "Lcom/bbva/image/transform/ImageTransformer;", "imageTransformer", "add", "", "transformer", "([Lcom/bbva/image/transform/ImageTransformer;)Lcom/bbva/image/ImagePipeline;", "Lcom/bbva/image/compressor/ImageCompressor;", "compressor", "compression", "Landroid/graphics/Bitmap;", "bitmap", "transform", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/io/File;", "file", "save", "(Landroid/graphics/Bitmap;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "initialTransformers", "<init>", "(Ljava/util/List;Lcom/bbva/image/compressor/ImageCompressor;)V", "image-transform_release"}, k = 1, mv = {1, 4, 2})
public final class ImagePipeline {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ImageTransformer> f34871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageCompressor f34872b;

    /* JADX INFO: compiled from: ImagePipeline.kt */
    @DebugMetadata(c = "com.bbva.image.ImagePipeline$save$2", f = "ImagePipeline.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Bitmap f34874q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ File f34875r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Bitmap bitmap, File file, Continuation continuation) {
            super(2, continuation);
            this.f34874q0 = bitmap;
            this.f34875r0 = file;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            return ImagePipeline.this.new a(this.f34874q0, this.f34875r0, completion);
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
            Bitmap bitmap = this.f34874q0;
            ImagePipeline imagePipeline = ImagePipeline.this;
            Bitmap bitmapAccess$applyTransformers = ImagePipeline.access$applyTransformers(imagePipeline, bitmap);
            ImageCompressor imageCompressor = imagePipeline.f34872b;
            if (imageCompressor != null) {
                imageCompressor.compress(bitmapAccess$applyTransformers, this.f34875r0);
            }
            return bitmapAccess$applyTransformers;
        }
    }

    /* JADX INFO: compiled from: ImagePipeline.kt */
    @DebugMetadata(c = "com.bbva.image.ImagePipeline$transform$2", f = "ImagePipeline.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Bitmap f34877q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Bitmap bitmap, Continuation continuation) {
            super(2, continuation);
            this.f34877q0 = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            return ImagePipeline.this.new b(this.f34877q0, completion);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return ImagePipeline.access$applyTransformers(ImagePipeline.this, this.f34877q0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImagePipeline() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static final Bitmap access$applyTransformers(ImagePipeline imagePipeline, Bitmap bitmap) {
        Iterator it = CollectionsKt___CollectionsKt.sortedWith(imagePipeline.f34871a, new Comparator<T>() { // from class: com.bbva.image.ImagePipeline$applyTransformers$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return e.compareValues(Boolean.valueOf(((ImageTransformer) t11).getPerformResize()), Boolean.valueOf(((ImageTransformer) t10).getPerformResize()));
            }
        }).iterator();
        while (it.hasNext()) {
            bitmap = ((ImageTransformer) it.next()).transform(bitmap);
        }
        return bitmap;
    }

    @NotNull
    public final ImagePipeline add(@NotNull ImageTransformer imageTransformer) {
        Intrinsics.checkNotNullParameter(imageTransformer, "imageTransformer");
        this.f34871a.add(imageTransformer);
        return this;
    }

    @NotNull
    public final ImagePipeline compression(@NotNull ImageCompressor compressor) {
        Intrinsics.checkNotNullParameter(compressor, "compressor");
        this.f34872b = compressor;
        return this;
    }

    @Nullable
    public final Object save(@NotNull Bitmap bitmap, @NotNull File file, @NotNull Continuation<? super Bitmap> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new a(bitmap, file, null), continuation);
    }

    @Nullable
    public final Object transform(@NotNull Bitmap bitmap, @NotNull Continuation<? super Bitmap> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new b(bitmap, null), continuation);
    }

    public ImagePipeline(@NotNull List<? extends ImageTransformer> initialTransformers, @Nullable ImageCompressor imageCompressor) {
        Intrinsics.checkNotNullParameter(initialTransformers, "initialTransformers");
        this.f34872b = imageCompressor;
        this.f34871a = CollectionsKt___CollectionsKt.toMutableList((Collection) initialTransformers);
    }

    @NotNull
    public final ImagePipeline add(@NotNull ImageTransformer... transformer) {
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        g.addAll(this.f34871a, transformer);
        return this;
    }

    public /* synthetic */ ImagePipeline(List list, ImageCompressor imageCompressor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i10 & 2) != 0 ? null : imageCompressor);
    }
}
