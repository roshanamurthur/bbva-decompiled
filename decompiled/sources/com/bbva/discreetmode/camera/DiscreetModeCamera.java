package com.bbva.discreetmode.camera;

import android.content.Context;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.p1;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import com.bbva.discreetmode.camera.di.CameraDependencyInjector;
import com.bbva.discreetmode.camera.models.CameraConfiguration;
import com.bbva.discreetmode.extensions.ContextExtensions;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DiscreetModeCamera.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/bbva/discreetmode/camera/DiscreetModeCamera;", "", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "", "startAnalyzing", "stopAnalyzing", "Lkotlinx/coroutines/channels/Channel;", "", "c", "Lkotlinx/coroutines/channels/Channel;", "getFaceCountChannel", "()Lkotlinx/coroutines/channels/Channel;", "faceCountChannel", "Landroid/content/Context;", "context", "Lcom/bbva/discreetmode/camera/models/CameraConfiguration;", "configuration", "<init>", "(Landroid/content/Context;Lcom/bbva/discreetmode/camera/models/CameraConfiguration;)V", "discreetmode_release"}, k = 1, mv = {1, 5, 1})
public final class DiscreetModeCamera {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f29044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CameraConfiguration f29045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Channel<Integer> faceCountChannel;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ListenableFuture<ProcessCameraProvider> f29047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Lazy f29048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final CameraSelector f29049f;

    /* JADX INFO: compiled from: DiscreetModeCamera.kt */
    public static final class a extends Lambda implements Function1<Integer, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            DiscreetModeCamera.this.getFaceCountChannel().offer(Integer.valueOf(num.intValue()));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DiscreetModeCamera.kt */
    public static final class b extends Lambda implements Function0<ProcessCameraProvider> {
        public b() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final ProcessCameraProvider invoke() {
            ListenableFuture listenableFuture = DiscreetModeCamera.this.f29047d;
            if (listenableFuture != null) {
                return (ProcessCameraProvider) listenableFuture.get();
            }
            Intrinsics.throwUninitializedPropertyAccessException("cameraProcessProviderFuture");
            throw null;
        }
    }

    public DiscreetModeCamera(@NotNull Context context, @NotNull CameraConfiguration configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f29044a = context;
        this.f29045b = configuration;
        this.faceCountChannel = ChannelKt.Channel$default(0, null, null, 7, null);
        this.f29048e = LazyKt__LazyJVMKt.lazy(new b());
        CameraSelector cameraSelectorBuild = new CameraSelector.Builder().requireLensFacing(0).build();
        Intrinsics.checkNotNullExpressionValue(cameraSelectorBuild, "Builder()\n        .requireLensFacing(CameraSelector.LENS_FACING_FRONT)\n        .build()");
        this.f29049f = cameraSelectorBuild;
    }

    public final void a(LifecycleOwner lifecycleOwner) {
        if (ContextExtensions.isCameraPermissionGranted(this.f29044a)) {
            Lazy lazy = this.f29048e;
            Object value = lazy.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-cameraProcess>(...)");
            ((ProcessCameraProvider) value).unbindAll();
            DiscreetModeCameraUseCase discreetModeCameraUseCaseInjectUseCase = CameraDependencyInjector.INSTANCE.injectUseCase(this.f29045b);
            discreetModeCameraUseCaseInjectUseCase.setListener(new a());
            Object value2 = lazy.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "<get-cameraProcess>(...)");
            ((ProcessCameraProvider) value2).bindToLifecycle(lifecycleOwner, this.f29049f, discreetModeCameraUseCaseInjectUseCase.getInstance());
        }
    }

    @NotNull
    public final Channel<Integer> getFaceCountChannel() {
        return this.faceCountChannel;
    }

    public final void startAnalyzing(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        if (this.f29047d != null) {
            a(lifecycleOwner);
            return;
        }
        Context context = this.f29044a;
        ListenableFuture<ProcessCameraProvider> processCameraProvider = ProcessCameraProvider.getInstance(context);
        Intrinsics.checkNotNullExpressionValue(processCameraProvider, "getInstance(context)");
        this.f29047d = processCameraProvider;
        if (processCameraProvider != null) {
            processCameraProvider.addListener(new p1(this, lifecycleOwner, 2), ContextCompat.getMainExecutor(context));
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("cameraProcessProviderFuture");
            throw null;
        }
    }

    public final void stopAnalyzing() {
        if (this.f29047d != null) {
            Object value = this.f29048e.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-cameraProcess>(...)");
            ((ProcessCameraProvider) value).unbindAll();
        }
    }
}
