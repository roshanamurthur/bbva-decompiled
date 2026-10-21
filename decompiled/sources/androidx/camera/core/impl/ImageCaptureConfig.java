package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.UseCase;
import androidx.camera.core.internal.IoConfig;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class ImageCaptureConfig implements UseCaseConfig<ImageCapture>, ImageOutputConfig, IoConfig {
    public static final Config.Option<Integer> OPTION_BUFFER_FORMAT;
    public static final Config.Option<CaptureBundle> OPTION_CAPTURE_BUNDLE;
    public static final Config.Option<CaptureProcessor> OPTION_CAPTURE_PROCESSOR;
    public static final Config.Option<Integer> OPTION_FLASH_MODE;
    public static final Config.Option<Integer> OPTION_FLASH_TYPE;
    public static final Config.Option<Integer> OPTION_IMAGE_CAPTURE_MODE;
    public static final Config.Option<ImageReaderProxyProvider> OPTION_IMAGE_READER_PROXY_PROVIDER;
    public static final Config.Option<Integer> OPTION_JPEG_COMPRESSION_QUALITY;
    public static final Config.Option<Integer> OPTION_MAX_CAPTURE_STAGES;
    public static final Config.Option<Boolean> OPTION_USE_SOFTWARE_JPEG_ENCODER;
    private final OptionsBundle mConfig;

    static {
        Class cls = Integer.TYPE;
        OPTION_IMAGE_CAPTURE_MODE = Config.Option.create("camerax.core.imageCapture.captureMode", cls);
        OPTION_FLASH_MODE = Config.Option.create("camerax.core.imageCapture.flashMode", cls);
        OPTION_CAPTURE_BUNDLE = Config.Option.create("camerax.core.imageCapture.captureBundle", CaptureBundle.class);
        OPTION_CAPTURE_PROCESSOR = Config.Option.create("camerax.core.imageCapture.captureProcessor", CaptureProcessor.class);
        OPTION_BUFFER_FORMAT = Config.Option.create("camerax.core.imageCapture.bufferFormat", Integer.class);
        OPTION_MAX_CAPTURE_STAGES = Config.Option.create("camerax.core.imageCapture.maxCaptureStages", Integer.class);
        OPTION_IMAGE_READER_PROXY_PROVIDER = Config.Option.create("camerax.core.imageCapture.imageReaderProxyProvider", ImageReaderProxyProvider.class);
        OPTION_USE_SOFTWARE_JPEG_ENCODER = Config.Option.create("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE);
        OPTION_FLASH_TYPE = Config.Option.create("camerax.core.imageCapture.flashType", cls);
        OPTION_JPEG_COMPRESSION_QUALITY = Config.Option.create("camerax.core.imageCapture.jpegCompressionQuality", cls);
    }

    public ImageCaptureConfig(@NonNull OptionsBundle optionsBundle) {
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

    @Nullable
    public Integer getBufferFormat(@Nullable Integer num) {
        return (Integer) e0.g(this, OPTION_BUFFER_FORMAT, num);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ CameraSelector getCameraSelector() {
        return i0.a(this);
    }

    @Nullable
    public CaptureBundle getCaptureBundle(@Nullable CaptureBundle captureBundle) {
        return (CaptureBundle) e0.g(this, OPTION_CAPTURE_BUNDLE, captureBundle);
    }

    public int getCaptureMode() {
        return ((Integer) e0.f(this, OPTION_IMAGE_CAPTURE_MODE)).intValue();
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ CaptureConfig.OptionUnpacker getCaptureOptionUnpacker() {
        return i0.c(this);
    }

    @Nullable
    public CaptureProcessor getCaptureProcessor(@Nullable CaptureProcessor captureProcessor) {
        return (CaptureProcessor) e0.g(this, OPTION_CAPTURE_PROCESSOR, captureProcessor);
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

    public int getFlashMode(int i10) {
        return ((Integer) e0.g(this, OPTION_FLASH_MODE, Integer.valueOf(i10))).intValue();
    }

    public int getFlashType(int i10) {
        return ((Integer) e0.g(this, OPTION_FLASH_TYPE, Integer.valueOf(i10))).intValue();
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ImageReaderProxyProvider getImageReaderProxyProvider() {
        return (ImageReaderProxyProvider) e0.g(this, OPTION_IMAGE_READER_PROXY_PROVIDER, null);
    }

    @Override // androidx.camera.core.impl.ImageInputConfig
    public int getInputFormat() {
        return ((Integer) e0.f(this, ImageInputConfig.OPTION_INPUT_FORMAT)).intValue();
    }

    @Override // androidx.camera.core.internal.IoConfig
    @Nullable
    public Executor getIoExecutor(@Nullable Executor executor) {
        return (Executor) e0.g(this, IoConfig.OPTION_IO_EXECUTOR, executor);
    }

    @IntRange(from = 1, to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis)
    public int getJpegQuality(@IntRange(from = 1, to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis) int i10) {
        return ((Integer) e0.g(this, OPTION_JPEG_COMPRESSION_QUALITY, Integer.valueOf(i10))).intValue();
    }

    public int getMaxCaptureStages(int i10) {
        return ((Integer) e0.g(this, OPTION_MAX_CAPTURE_STAGES, Integer.valueOf(i10))).intValue();
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ Size getMaxResolution() {
        return x.d(this);
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ Config.OptionPriority getOptionPriority(Config.Option option) {
        return e0.c(this, option);
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

    public boolean hasCaptureMode() {
        return e0.a(this, OPTION_IMAGE_CAPTURE_MODE);
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ boolean hasTargetAspectRatio() {
        return x.m(this);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isSoftwareJpegEncoderRequested() {
        return ((Boolean) e0.g(this, OPTION_USE_SOFTWARE_JPEG_ENCODER, Boolean.FALSE)).booleanValue();
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

    @NonNull
    public Integer getBufferFormat() {
        return (Integer) e0.f(this, OPTION_BUFFER_FORMAT);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ CameraSelector getCameraSelector(CameraSelector cameraSelector) {
        return i0.b(this, cameraSelector);
    }

    @NonNull
    public CaptureBundle getCaptureBundle() {
        return (CaptureBundle) e0.f(this, OPTION_CAPTURE_BUNDLE);
    }

    @Override // androidx.camera.core.impl.UseCaseConfig
    public final /* synthetic */ CaptureConfig.OptionUnpacker getCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
        return i0.d(this, optionUnpacker);
    }

    @NonNull
    public CaptureProcessor getCaptureProcessor() {
        return (CaptureProcessor) e0.f(this, OPTION_CAPTURE_PROCESSOR);
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

    public int getFlashMode() {
        return ((Integer) e0.f(this, OPTION_FLASH_MODE)).intValue();
    }

    public int getFlashType() {
        return ((Integer) e0.f(this, OPTION_FLASH_TYPE)).intValue();
    }

    @Override // androidx.camera.core.internal.IoConfig
    @NonNull
    public Executor getIoExecutor() {
        return (Executor) e0.f(this, IoConfig.OPTION_IO_EXECUTOR);
    }

    @IntRange(from = 1, to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis)
    public int getJpegQuality() {
        return ((Integer) e0.f(this, OPTION_JPEG_COMPRESSION_QUALITY)).intValue();
    }

    public int getMaxCaptureStages() {
        return ((Integer) e0.f(this, OPTION_MAX_CAPTURE_STAGES)).intValue();
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
