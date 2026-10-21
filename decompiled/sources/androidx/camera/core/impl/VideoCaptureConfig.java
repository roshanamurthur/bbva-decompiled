package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.UseCase;
import androidx.camera.core.VideoCapture;
import androidx.camera.core.internal.ThreadConfig;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class VideoCaptureConfig implements UseCaseConfig<VideoCapture>, ImageOutputConfig, ThreadConfig {
    public static final Config.Option<Integer> OPTION_AUDIO_BIT_RATE;
    public static final Config.Option<Integer> OPTION_AUDIO_CHANNEL_COUNT;
    public static final Config.Option<Integer> OPTION_AUDIO_MIN_BUFFER_SIZE;
    public static final Config.Option<Integer> OPTION_AUDIO_SAMPLE_RATE;
    public static final Config.Option<Integer> OPTION_BIT_RATE;
    public static final Config.Option<Integer> OPTION_INTRA_FRAME_INTERVAL;
    public static final Config.Option<Integer> OPTION_VIDEO_FRAME_RATE;
    private final OptionsBundle mConfig;

    static {
        Class cls = Integer.TYPE;
        OPTION_VIDEO_FRAME_RATE = Config.Option.create("camerax.core.videoCapture.recordingFrameRate", cls);
        OPTION_BIT_RATE = Config.Option.create("camerax.core.videoCapture.bitRate", cls);
        OPTION_INTRA_FRAME_INTERVAL = Config.Option.create("camerax.core.videoCapture.intraFrameInterval", cls);
        OPTION_AUDIO_BIT_RATE = Config.Option.create("camerax.core.videoCapture.audioBitRate", cls);
        OPTION_AUDIO_SAMPLE_RATE = Config.Option.create("camerax.core.videoCapture.audioSampleRate", cls);
        OPTION_AUDIO_CHANNEL_COUNT = Config.Option.create("camerax.core.videoCapture.audioChannelCount", cls);
        OPTION_AUDIO_MIN_BUFFER_SIZE = Config.Option.create("camerax.core.videoCapture.audioMinBufferSize", cls);
    }

    public VideoCaptureConfig(@NonNull OptionsBundle optionsBundle) {
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

    public int getAudioBitRate(int i10) {
        return ((Integer) e0.g(this, OPTION_AUDIO_BIT_RATE, Integer.valueOf(i10))).intValue();
    }

    public int getAudioChannelCount(int i10) {
        return ((Integer) e0.g(this, OPTION_AUDIO_CHANNEL_COUNT, Integer.valueOf(i10))).intValue();
    }

    public int getAudioMinBufferSize(int i10) {
        return ((Integer) e0.g(this, OPTION_AUDIO_MIN_BUFFER_SIZE, Integer.valueOf(i10))).intValue();
    }

    public int getAudioSampleRate(int i10) {
        return ((Integer) e0.g(this, OPTION_AUDIO_SAMPLE_RATE, Integer.valueOf(i10))).intValue();
    }

    @Override // androidx.camera.core.internal.ThreadConfig
    public final /* synthetic */ Executor getBackgroundExecutor() {
        return androidx.camera.core.internal.e.a(this);
    }

    public int getBitRate(int i10) {
        return ((Integer) e0.g(this, OPTION_BIT_RATE, Integer.valueOf(i10))).intValue();
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

    public int getIFrameInterval(int i10) {
        return ((Integer) e0.g(this, OPTION_INTRA_FRAME_INTERVAL, Integer.valueOf(i10))).intValue();
    }

    @Override // androidx.camera.core.impl.ImageInputConfig
    public int getInputFormat() {
        return 34;
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

    public int getVideoFrameRate(int i10) {
        return ((Integer) e0.g(this, OPTION_VIDEO_FRAME_RATE, Integer.valueOf(i10))).intValue();
    }

    @Override // androidx.camera.core.impl.ImageOutputConfig
    public final /* synthetic */ boolean hasTargetAspectRatio() {
        return x.m(this);
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

    public int getAudioBitRate() {
        return ((Integer) e0.f(this, OPTION_AUDIO_BIT_RATE)).intValue();
    }

    public int getAudioChannelCount() {
        return ((Integer) e0.f(this, OPTION_AUDIO_CHANNEL_COUNT)).intValue();
    }

    public int getAudioMinBufferSize() {
        return ((Integer) e0.f(this, OPTION_AUDIO_MIN_BUFFER_SIZE)).intValue();
    }

    public int getAudioSampleRate() {
        return ((Integer) e0.f(this, OPTION_AUDIO_SAMPLE_RATE)).intValue();
    }

    @Override // androidx.camera.core.internal.ThreadConfig
    public final /* synthetic */ Executor getBackgroundExecutor(Executor executor) {
        return androidx.camera.core.internal.e.b(this, executor);
    }

    public int getBitRate() {
        return ((Integer) e0.f(this, OPTION_BIT_RATE)).intValue();
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

    public int getIFrameInterval() {
        return ((Integer) e0.f(this, OPTION_INTRA_FRAME_INTERVAL)).intValue();
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

    public int getVideoFrameRate() {
        return ((Integer) e0.f(this, OPTION_VIDEO_FRAME_RATE)).intValue();
    }

    @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
    public final /* synthetic */ Object retrieveOption(Config.Option option, Object obj) {
        return e0.g(this, option, obj);
    }
}
