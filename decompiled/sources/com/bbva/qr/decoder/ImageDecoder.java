package com.bbva.qr.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.qr.extension.BarcodeKt;
import com.bbva.qr.extension.ContextKt;
import com.bbva.qr.model.input.DecoderSettings;
import com.bbva.qr.model.input.ImageSourceType;
import com.bbva.qr.model.response.BarcodeResult;
import com.bbva.qr.model.response.ImageDecodingError;
import com.bbva.qr.model.response.NonDetectableCode;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import ek.a;
import java.io.FileNotFoundException;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ImageDecoder.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J-\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\nJ'\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/bbva/qr/decoder/ImageDecoder;", "", "decode", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "content", "", "contentType", "Lcom/bbva/qr/model/input/ImageSourceType;", "(Landroid/content/Context;Ljava/lang/String;Lcom/bbva/qr/model/input/ImageSourceType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectInDecodedImage", "Lcom/bbva/ethermobile/help/kit/result/Result;", "Lcom/bbva/qr/model/response/BarcodeResult;", "settings", "Lcom/bbva/qr/model/input/DecoderSettings;", "(Landroid/content/Context;Lcom/bbva/qr/model/input/DecoderSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "qr_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ImageDecoder {

    /* JADX INFO: compiled from: ImageDecoder.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {

        /* JADX INFO: compiled from: ImageDecoder.kt */
        @DebugMetadata(c = "com.bbva.qr.decoder.ImageDecoder$DefaultImpls", f = "ImageDecoder.kt", i = {0, 0}, l = {68}, m = "detectInDecodedImage", n = {"context", "$this$detectInDecodedImage_u24lambda_u240"}, s = {"L$0", "L$1"})
        public static final class a extends ContinuationImpl {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public Context f36280p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public DecoderSettings f36281q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public /* synthetic */ Object f36282r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public int f36283s0;

            public a() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f36282r0 = obj;
                this.f36283s0 |= Integer.MIN_VALUE;
                return DefaultImpls.detectInDecodedImage(null, null, null, this);
            }
        }

        @Nullable
        public static Object decode(@NotNull ImageDecoder imageDecoder, @NotNull Context context, @NotNull String str, @Nullable ImageSourceType imageSourceType, @NotNull Continuation<? super Bitmap> continuation) {
            return BuildersKt.withContext(Dispatchers.getDefault(), new AnonymousClass2(context, str, imageSourceType, null), continuation);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Nullable
        public static Object detectInDecodedImage(@NotNull ImageDecoder imageDecoder, @NotNull Context context, @NotNull DecoderSettings decoderSettings, @NotNull Continuation<? super Result<BarcodeResult>> continuation) {
            a aVar;
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i10 = aVar.f36283s0;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f36283s0 = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(continuation);
                }
            } else {
                aVar = new a(continuation);
            }
            Object objDecode = aVar.f36282r0;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i11 = aVar.f36283s0;
            if (i11 == 0) {
                ResultKt.throwOnFailure(objDecode);
                if (decoderSettings.getSource() == null) {
                    return new Result.Error(ImageDecodingError.INSTANCE);
                }
                String content = decoderSettings.getSource().getContent();
                if (content == null) {
                    content = "";
                }
                ImageSourceType type = decoderSettings.getSource().getType();
                aVar.f36280p0 = context;
                aVar.f36281q0 = decoderSettings;
                aVar.f36283s0 = 1;
                objDecode = imageDecoder.decode(context, content, type, aVar);
                if (objDecode == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                decoderSettings = aVar.f36281q0;
                context = aVar.f36280p0;
                ResultKt.throwOnFailure(objDecode);
            }
            Bitmap bitmap = (Bitmap) objDecode;
            if (bitmap == null) {
                return new Result.Error(ImageDecodingError.INSTANCE);
            }
            InputImage inputImageFromBitmap = InputImage.fromBitmap(bitmap, 0);
            Intrinsics.checkNotNullExpressionValue(inputImageFromBitmap, "fromBitmap(barcodeFrame, 0)");
            try {
                Object objAwait = Tasks.await(ContextKt.generateBarcodeDetector(context, decoderSettings.getCodeType()).process(inputImageFromBitmap));
                Intrinsics.checkNotNullExpressionValue(objAwait, "await(barcodeDetector.process(image))");
                List list = (List) objAwait;
                return list.size() == 1 ? BarcodeKt.toBarcodeResult$default((Barcode) list.get(0), null, 1, null) : new Result.Error(NonDetectableCode.INSTANCE);
            } catch (Exception unused) {
                return new Result.Error(NonDetectableCode.INSTANCE);
            }
        }
    }

    /* JADX INFO: renamed from: com.bbva.qr.decoder.ImageDecoder$decode$2, reason: invalid class name */
    /* JADX INFO: compiled from: ImageDecoder.kt */
    @DebugMetadata(c = "com.bbva.qr.decoder.ImageDecoder$decode$2", f = "ImageDecoder.kt", i = {}, l = {44, 48}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f36284p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ImageSourceType f36285q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Context f36286r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f36287s0;

        /* JADX INFO: renamed from: com.bbva.qr.decoder.ImageDecoder$decode$2$WhenMappings */
        /* JADX INFO: compiled from: ImageDecoder.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ImageSourceType.values().length];
                try {
                    iArr[ImageSourceType.BASE64.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ImageSourceType.URI.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, String str, ImageSourceType imageSourceType, Continuation continuation) {
            super(2, continuation);
            this.f36285q0 = imageSourceType;
            this.f36286r0 = context;
            this.f36287s0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.f36286r0, this.f36287s0, this.f36285q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws FileNotFoundException {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i10 = this.f36284p0;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return (Bitmap) obj;
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return (Bitmap) obj;
            }
            ResultKt.throwOnFailure(obj);
            ImageSourceType imageSourceType = this.f36285q0;
            int i11 = imageSourceType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[imageSourceType.ordinal()];
            String str = this.f36287s0;
            Context context = this.f36286r0;
            if (i11 == 1) {
                Base64Decoder base64Decoder = Base64Decoder.INSTANCE;
                this.f36284p0 = 1;
                obj = base64Decoder.decode(context, str, imageSourceType, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return (Bitmap) obj;
            }
            if (i11 != 2) {
                return null;
            }
            UriDecoder uriDecoder = UriDecoder.INSTANCE;
            this.f36284p0 = 2;
            obj = uriDecoder.decode(context, str, imageSourceType, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (Bitmap) obj;
        }
    }

    @Nullable
    Object decode(@NotNull Context context, @NotNull String str, @Nullable ImageSourceType imageSourceType, @NotNull Continuation<? super Bitmap> continuation);

    @Nullable
    Object detectInDecodedImage(@NotNull Context context, @NotNull DecoderSettings decoderSettings, @NotNull Continuation<? super Result<BarcodeResult>> continuation);
}
