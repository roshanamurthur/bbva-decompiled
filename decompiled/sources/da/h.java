package da;

import android.content.Context;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.glomohybrid.qrscanner.view.GalleryView;
import com.bbva.glomohybrid.qrscanner.viewmodel.GalleryViewModel;
import com.bbva.glomohybrid.qrscanner.viewmodel.QrContract;
import com.bbva.qr.activity.ScannerActivity;
import com.bbva.qr.decoder.BarcodeImageDecoder;
import com.bbva.qr.model.input.DecoderSettings;
import com.bbva.qr.model.response.BarcodeResult;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GalleryView.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.qrscanner.view.GalleryView$decodeImage$1", f = "GalleryView.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
public final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f68153p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ GalleryView f68154q0;

    /* JADX INFO: compiled from: GalleryView.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.qrscanner.view.GalleryView$decodeImage$1$result$1", f = "GalleryView.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<BarcodeResult>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f68155p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ GalleryView f68156q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(GalleryView galleryView, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f68156q0 = galleryView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f68156q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<BarcodeResult>> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f68155p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                BarcodeImageDecoder barcodeImageDecoder = BarcodeImageDecoder.INSTANCE;
                GalleryView galleryView = this.f68156q0;
                Context context = galleryView.getContext();
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.bbva.qr.activity.ScannerActivity");
                ScannerActivity scannerActivity = (ScannerActivity) context;
                DecoderSettings decoderSettings = galleryView.f34449q0;
                if (decoderSettings == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("decoderSettings");
                    decoderSettings = null;
                }
                this.f68155p0 = 1;
                obj = barcodeImageDecoder.detectInDecodedImage(scannerActivity, decoderSettings, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(GalleryView galleryView, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f68154q0 = galleryView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new h(this.f68154q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f68153p0;
        GalleryView galleryView = this.f68154q0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(galleryView, null);
            this.f68153p0 = 1;
            obj = BuildersKt.withContext(io2, aVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Result result = (Result) obj;
        GalleryViewModel viewModel = galleryView.getViewModel();
        if (viewModel != null) {
            viewModel.setIntent(new QrContract.Intent.GalleryBarcodeResult(result));
        }
        return Unit.INSTANCE;
    }
}
