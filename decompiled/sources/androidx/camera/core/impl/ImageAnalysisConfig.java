package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.UseCase;
import androidx.camera.core.internal.ThreadConfig;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class ImageAnalysisConfig implements UseCaseConfig<ImageAnalysis>, ImageOutputConfig, ThreadConfig {
    private final OptionsBundle mConfig;
    public static final Config.Option<Integer> OPTION_BACKPRESSURE_STRATEGY = Config.Option.create("camerax.core.imageAnalysis.backpressureStrategy", ImageAnalysis.BackpressureStrategy.class);
    public static final Config.Option<Integer> OPTION_IMAGE_QUEUE_DEPTH = Config.Option.create("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE);
    public static final Config.Option<ImageReaderProxyProvider> OPTION_IMAGE_READER_PROXY_PROVIDER = Config.Option.create("camerax.core.imageAnalysis.imageReaderProxyProvider", ImageReaderProxyProvider.class);
    public static final Config.Option<Integer> OPTION_OUTPUT_IMAGE_FORMAT = Config.Option.create("camerax.core.imageAnalysis.outputImageFormat", ImageAnalysis.OutputImageFormat.class);
    public static final Config.Option<Boolean> OPTION_ONE_PIXEL_SHIFT_ENABLED = Config.Option.create("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class);
    public static final Config.Option<Boolean> OPTION_OUTPUT_IMAGE_ROTATION_ENABLED = Config.Option.create("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class);

    public ImageAnalysisConfig(@NonNull OptionsBundle optionsBundle) {
        this.mConfig = optionsBundle;
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ boolean containsOption(Config.Option option) {
        return e0.a(this, option);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ void findOptions(String str, Config.OptionMatcher optionMatcher) {
        e0.b(this, str, optionMatcher);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ int getAppTargetRotation(int i10) {
        return x.a(this, i10);
    }

    @Override // androidx.camera.core.internal.ThreadConfig
    public final /* synthetic */ Executor getBackgroundExecutor() {
        return androidx.camera.core.internal.e.a(this);
    }

    public int getBackpressureStrategy(int i10) {
        return ((Integer) e0.g(this, OPTION_BACKPRESSURE_STRATEGY, Integer.valueOf(i10))).intValue();
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ CameraSelector getCameraSelector() {
        return i0.a(this);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ CaptureConfig.OptionUnpacker getCaptureOptionUnpacker() {
        return i0.c(this);
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    @NonNull
    public Config getConfig() {
        return this.mConfig;
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ CaptureConfig getDefaultCaptureConfig() {
        return i0.e(this);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ Size getDefaultResolution() {
        return x.b(this);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ SessionConfig getDefaultSessionConfig() {
        return i0.g(this);
    }

    public int getImageQueueDepth(int i10) {
        return ((Integer) e0.g(this, OPTION_IMAGE_QUEUE_DEPTH, Integer.valueOf(i10))).intValue();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ImageReaderProxyProvider getImageReaderProxyProvider() {
        return (ImageReaderProxyProvider) e0.g(this, OPTION_IMAGE_READER_PROXY_PROVIDER, null);
    }

    @Override // androidx.camera.core.impl.ImageInputConfig
    public int getInputFormat() {
        return 35;
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ Size getMaxResolution() {
        return x.d(this);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Boolean getOnePixelShiftEnabled(@Nullable Boolean bool) {
        return (Boolean) e0.g(this, OPTION_ONE_PIXEL_SHIFT_ENABLED, bool);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ Config.OptionPriority getOptionPriority(Config.Option option) {
        return e0.c(this, option);
    }

    public int getOutputImageFormat(int i10) {
        return ((Integer) e0.g(this, OPTION_OUTPUT_IMAGE_FORMAT, Integer.valueOf(i10))).intValue();
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ Set getPriorities(Config.Option option) {
        return e0.d(this, option);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ SessionConfig.OptionUnpacker getSessionOptionUnpacker() {
        return i0.i(this);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ List getSupportedResolutions() {
        return x.f(this);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ int getSurfaceOccupancyPriority() {
        return i0.k(this);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ int getTargetAspectRatio() {
        return x.h(this);
    }

    @Override // androidx.camera.core.internal.TargetConfig
    public final /* synthetic */ Class getTargetClass() {
        return androidx.camera.core.internal.d.a(this);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ Range getTargetFramerate() {
        return i0.m(this);
    }

    @Override // androidx.camera.core.internal.TargetConfig
    public final /* synthetic */ String getTargetName() {
        return androidx.camera.core.internal.d.c(this);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ Size getTargetResolution() {
        return x.i(this);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ int getTargetRotation() {
        return x.k(this);
    }

    @Override // androidx.camera.core.internal.UseCaseEventConfig
    public final /* synthetic */ UseCase.EventCallback getUseCaseEventCallback() {
        return androidx.camera.core.internal.f.a(this);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ boolean hasTargetAspectRatio() {
        return x.m(this);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Boolean isOutputImageRotationEnabled(@Nullable Boolean bool) {
        return (Boolean) e0.g(this, OPTION_OUTPUT_IMAGE_ROTATION_ENABLED, bool);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ boolean isZslDisabled(boolean z10) {
        return i0.o(this, z10);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ Set listOptions() {
        return e0.e(this);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ Object retrieveOption(Config.Option option) {
        return e0.f(this, option);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ Object retrieveOptionWithPriority(Config.Option option, Config.OptionPriority optionPriority) {
        return e0.h(this, option, optionPriority);
    }

    @Override // androidx.camera.core.internal.ThreadConfig
    public final /* synthetic */ Executor getBackgroundExecutor(Executor executor) {
        return androidx.camera.core.internal.e.b(this, executor);
    }

    public int getBackpressureStrategy() {
        return ((Integer) e0.f(this, OPTION_BACKPRESSURE_STRATEGY)).intValue();
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ CameraSelector getCameraSelector(CameraSelector cameraSelector) {
        return i0.b(this, cameraSelector);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ CaptureConfig.OptionUnpacker getCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
        return i0.d(this, optionUnpacker);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ CaptureConfig getDefaultCaptureConfig(CaptureConfig captureConfig) {
        return i0.f(this, captureConfig);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ Size getDefaultResolution(Size size) {
        return x.c(this, size);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ SessionConfig getDefaultSessionConfig(SessionConfig sessionConfig) {
        return i0.h(this, sessionConfig);
    }

    public int getImageQueueDepth() {
        return ((Integer) e0.f(this, OPTION_IMAGE_QUEUE_DEPTH)).intValue();
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ Size getMaxResolution(Size size) {
        return x.e(this, size);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ SessionConfig.OptionUnpacker getSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker) {
        return i0.j(this, optionUnpacker);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ List getSupportedResolutions(List list) {
        return x.g(this, list);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ int getSurfaceOccupancyPriority(int i10) {
        return i0.l(this, i10);
    }

    @Override // androidx.camera.core.internal.TargetConfig
    public final /* synthetic */ Class getTargetClass(Class cls) {
        return androidx.camera.core.internal.d.b(this, cls);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ Range getTargetFramerate(Range range) {
        return i0.n(this, range);
    }

    @Override // androidx.camera.core.internal.TargetConfig
    public final /* synthetic */ String getTargetName(String str) {
        return androidx.camera.core.internal.d.d(this, str);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ Size getTargetResolution(Size size) {
        return x.j(this, size);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ int getTargetRotation(int i10) {
        return x.l(this, i10);
    }

    @Override // androidx.camera.core.internal.UseCaseEventConfig
    public final /* synthetic */ UseCase.EventCallback getUseCaseEventCallback(UseCase.EventCallback eventCallback) {
        return androidx.camera.core.internal.f.b(this, eventCallback);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ Object retrieveOption(Config.Option option, Object obj) {
        return e0.g(this, option, obj);
    }
}
