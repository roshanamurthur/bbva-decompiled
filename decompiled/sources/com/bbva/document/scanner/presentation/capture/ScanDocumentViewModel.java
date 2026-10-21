package com.bbva.document.scanner.presentation.capture;

import androidx.camera.core.ImageCaptureException;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bbva.document.scanner.camera.Dimensions;
import com.bbva.document.scanner.camera.FramePosition;
import com.bbva.document.scanner.domain.ProcessImageUseCase;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ScanDocumentViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\bR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/bbva/document/scanner/presentation/capture/ScanDocumentViewModel;", "Landroidx/lifecycle/ViewModel;", "", "outputPath", "Lcom/bbva/document/scanner/camera/Dimensions;", "dimensions", "Lcom/bbva/document/scanner/camera/FramePosition;", "framePosition", "", "onImageCaptured", "Landroidx/camera/core/ImageCaptureException;", "exception", "onImageCaptureError", "onCapturePhotoClicked", "Landroidx/lifecycle/LiveData;", "Lcom/bbva/document/scanner/presentation/capture/ScanDocumentState;", "r0", "Landroidx/lifecycle/LiveData;", "getState", "()Landroidx/lifecycle/LiveData;", "state", "Lcom/bbva/document/scanner/domain/ProcessImageUseCase;", "useCase", "<init>", "(Lcom/bbva/document/scanner/domain/ProcessImageUseCase;)V", "document-scanner_release"}, k = 1, mv = {1, 8, 0})
public final class ScanDocumentViewModel extends ViewModel {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ProcessImageUseCase f29178p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<ScanDocumentState> f29179q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData f29180r0;

    /* JADX INFO: compiled from: ScanDocumentViewModel.kt */
    @DebugMetadata(c = "com.bbva.document.scanner.presentation.capture.ScanDocumentViewModel$onImageCaptured$1", f = "ScanDocumentViewModel.kt", i = {}, l = {20}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f29181p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f29183r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Dimensions f29184s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ FramePosition f29185t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Dimensions dimensions, FramePosition framePosition, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f29183r0 = str;
            this.f29184s0 = dimensions;
            this.f29185t0 = framePosition;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScanDocumentViewModel.this.new a(this.f29183r0, this.f29184s0, this.f29185t0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f29181p0;
            ScanDocumentViewModel scanDocumentViewModel = ScanDocumentViewModel.this;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ProcessImageUseCase processImageUseCase = scanDocumentViewModel.f29178p0;
                File file = new File(this.f29183r0);
                this.f29181p0 = 1;
                obj = processImageUseCase.invoke(file, this.f29184s0, this.f29185t0, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            scanDocumentViewModel.f29179q0.setValue(new ScanDocumentState.Completed((ScanResult) obj));
            return Unit.INSTANCE;
        }
    }

    public ScanDocumentViewModel(@NotNull ProcessImageUseCase useCase) {
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        this.f29178p0 = useCase;
        MutableLiveData<ScanDocumentState> mutableLiveData = new MutableLiveData<>(ScanDocumentState.Standby.INSTANCE);
        this.f29179q0 = mutableLiveData;
        this.f29180r0 = mutableLiveData;
    }

    @NotNull
    public final LiveData<ScanDocumentState> getState() {
        return this.f29180r0;
    }

    public final void onCapturePhotoClicked() {
        this.f29179q0.setValue(ScanDocumentState.Loading.INSTANCE);
    }

    public final void onImageCaptureError(@NotNull ImageCaptureException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        MutableLiveData<ScanDocumentState> mutableLiveData = this.f29179q0;
        String message = exception.getMessage();
        if (message == null) {
            message = "";
        }
        mutableLiveData.setValue(new ScanDocumentState.Error(new ScanResult.ScanError(message)));
    }

    public final void onImageCaptured(@NotNull String outputPath, @NotNull Dimensions dimensions, @NotNull FramePosition framePosition) {
        Intrinsics.checkNotNullParameter(outputPath, "outputPath");
        Intrinsics.checkNotNullParameter(dimensions, "dimensions");
        Intrinsics.checkNotNullParameter(framePosition, "framePosition");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new a(outputPath, dimensions, framePosition, null), 3, null);
    }
}
