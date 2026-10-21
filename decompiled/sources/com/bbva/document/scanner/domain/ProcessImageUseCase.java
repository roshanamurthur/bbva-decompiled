package com.bbva.document.scanner.domain;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bbva.document.scanner.Compression;
import com.bbva.document.scanner.ImageTransformation;
import com.bbva.document.scanner.camera.CameraMaskTransformer;
import com.bbva.document.scanner.camera.Dimensions;
import com.bbva.document.scanner.camera.FramePosition;
import com.bbva.document.scanner.presentation.capture.ScanResult;
import com.bbva.image.ImagePipeline;
import com.bbva.image.compressor.CompressorFactory;
import com.bbva.image.transform.ImageTransformer;
import com.bbva.image.transform.ImageTransformerFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ProcessImageUseCase.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086Bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/bbva/document/scanner/domain/ProcessImageUseCase;", "", "Ljava/io/File;", "outputFile", "Lcom/bbva/document/scanner/camera/Dimensions;", "cameraPreviewDimensions", "Lcom/bbva/document/scanner/camera/FramePosition;", "referenceDimensions", "Lcom/bbva/document/scanner/presentation/capture/ScanResult;", "invoke", "(Ljava/io/File;Lcom/bbva/document/scanner/camera/Dimensions;Lcom/bbva/document/scanner/camera/FramePosition;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/document/scanner/Compression;", "compression", "", "Lcom/bbva/document/scanner/ImageTransformation;", "imageTransformers", "<init>", "(Lcom/bbva/document/scanner/Compression;Ljava/util/List;)V", "document-scanner_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nProcessImageUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessImageUseCase.kt\ncom/bbva/document/scanner/domain/ProcessImageUseCase\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n37#2,2:48\n1#3:50\n1#3:61\n1603#4,9:51\n1855#4:60\n1856#4:62\n1612#4:63\n*S KotlinDebug\n*F\n+ 1 ProcessImageUseCase.kt\ncom/bbva/document/scanner/domain/ProcessImageUseCase\n*L\n32#1:48,2\n42#1:61\n42#1:51,9\n42#1:60\n42#1:62\n42#1:63\n*E\n"})
public final class ProcessImageUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Compression f29136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<ImageTransformation> f29137b;

    /* JADX INFO: compiled from: ProcessImageUseCase.kt */
    @DebugMetadata(c = "com.bbva.document.scanner.domain.ProcessImageUseCase", f = "ProcessImageUseCase.kt", i = {0}, l = {34}, m = "invoke", n = {"outputFile"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public File f29138p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f29139q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f29141s0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29139q0 = obj;
            this.f29141s0 |= Integer.MIN_VALUE;
            return ProcessImageUseCase.this.invoke(null, null, null, this);
        }
    }

    public ProcessImageUseCase(@NotNull Compression compression, @NotNull List<ImageTransformation> imageTransformers) {
        Intrinsics.checkNotNullParameter(compression, "compression");
        Intrinsics.checkNotNullParameter(imageTransformers, "imageTransformers");
        this.f29136a = compression;
        this.f29137b = imageTransformers;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object invoke(@NotNull File file, @NotNull Dimensions dimensions, @NotNull FramePosition framePosition, @NotNull Continuation<? super ScanResult> continuation) {
        a aVar;
        Object objM5535constructorimpl;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f29141s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f29141s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objSave = aVar.f29139q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f29141s0;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(objSave);
                CameraMaskTransformer cameraMaskTransformer = new CameraMaskTransformer(dimensions, framePosition);
                Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                ImagePipeline imagePipelineAdd = new ImagePipeline(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0).add(cameraMaskTransformer);
                List<ImageTransformation> list = this.f29137b;
                ArrayList arrayList = new ArrayList();
                for (ImageTransformation imageTransformation : list) {
                    ImageTransformer imageTransformerCreate = ImageTransformerFactory.INSTANCE.create(imageTransformation.getTransformationId(), imageTransformation.getParameters());
                    if (imageTransformerCreate != null) {
                        arrayList.add(imageTransformerCreate);
                    }
                }
                ImageTransformer[] imageTransformerArr = (ImageTransformer[]) arrayList.toArray(new ImageTransformer[0]);
                ImagePipeline imagePipelineAdd2 = imagePipelineAdd.add((ImageTransformer[]) Arrays.copyOf(imageTransformerArr, imageTransformerArr.length));
                CompressorFactory compressorFactory = CompressorFactory.INSTANCE;
                Compression compression = this.f29136a;
                ImagePipeline imagePipelineCompression = imagePipelineAdd2.compression(compressorFactory.create(compression.getId(), compression.getFactor()));
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
                aVar.f29138p0 = file;
                aVar.f29141s0 = 1;
                objSave = imagePipelineCompression.save(bitmap, file, aVar);
                if (objSave == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                file = aVar.f29138p0;
                ResultKt.throwOnFailure(objSave);
            }
            objM5535constructorimpl = Result.m5535constructorimpl((Bitmap) objSave);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "outputFile.absolutePath");
            objM5535constructorimpl = new ScanResult.ScanSuccess(absolutePath);
        }
        Object objM5535constructorimpl2 = Result.m5535constructorimpl(objM5535constructorimpl);
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl2);
        if (thM5538exceptionOrNullimpl != null) {
            String message = thM5538exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            objM5535constructorimpl2 = new ScanResult.ScanError(message);
        }
        return objM5535constructorimpl2;
    }
}
