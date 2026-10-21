package androidx.camera.core;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.location.Location;
import android.media.AudioRecord;
import android.media.CamcorderProfile;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.VideoCaptureConfig;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.ThreadConfig;
import androidx.camera.core.internal.UseCaseEventConfig;
import androidx.camera.core.internal.utils.VideoUtil;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@Deprecated
public final class VideoCapture extends UseCase {
    private static final String AUDIO_MIME_TYPE = "audio/mp4a-latm";
    private static final int DEQUE_TIMEOUT_USEC = 10000;
    public static final int ERROR_ENCODER = 1;
    public static final int ERROR_FILE_IO = 4;
    public static final int ERROR_INVALID_CAMERA = 5;
    public static final int ERROR_MUXER = 2;
    public static final int ERROR_RECORDING_IN_PROGRESS = 3;
    public static final int ERROR_RECORDING_TOO_SHORT = 6;
    public static final int ERROR_UNKNOWN = 0;
    private static final String TAG = "VideoCapture";
    private static final String VIDEO_MIME_TYPE = "video/avc";
    private int mAudioBitRate;
    private final MediaCodec.BufferInfo mAudioBufferInfo;
    private volatile int mAudioBufferSize;
    private int mAudioChannelCount;

    @NonNull
    private MediaCodec mAudioEncoder;
    private Handler mAudioHandler;
    private HandlerThread mAudioHandlerThread;

    @Nullable
    private volatile AudioRecord mAudioRecorder;
    private int mAudioSampleRate;

    @GuardedBy("mMuxerLock")
    private int mAudioTrackIndex;
    Surface mCameraSurface;
    private DeferrableSurface mDeferrableSurface;
    private final AtomicBoolean mEndOfAudioStreamSignal;
    private final AtomicBoolean mEndOfAudioVideoSignal;
    private final AtomicBoolean mEndOfVideoStreamSignal;
    private final AtomicBoolean mIsAudioEnabled;

    @VisibleForTesting(otherwise = 2)
    public final AtomicBoolean mIsFirstAudioSampleWrite;

    @VisibleForTesting(otherwise = 2)
    public final AtomicBoolean mIsFirstVideoKeyFrameWrite;
    private volatile boolean mIsRecording;

    @GuardedBy("mMuxerLock")
    private MediaMuxer mMuxer;
    private final Object mMuxerLock;
    private final AtomicBoolean mMuxerStarted;
    private volatile ParcelFileDescriptor mParcelFileDescriptor;

    @Nullable
    private ListenableFuture<Void> mRecordingFuture;
    volatile Uri mSavedVideoUri;

    @NonNull
    private SessionConfig.Builder mSessionConfigBuilder;
    private final MediaCodec.BufferInfo mVideoBufferInfo;

    @NonNull
    MediaCodec mVideoEncoder;

    @Nullable
    private Throwable mVideoEncoderErrorMessage;
    private VideoEncoderInitStatus mVideoEncoderInitStatus;
    private Handler mVideoHandler;
    private HandlerThread mVideoHandlerThread;

    @GuardedBy("mMuxerLock")
    private int mVideoTrackIndex;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Defaults DEFAULT_CONFIG = new Defaults();
    private static final int[] CamcorderQuality = {8, 6, 5, 4};

    @RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
        }

        @DoNotInline
        public static int getCodecExceptionErrorCode(MediaCodec.CodecException codecException) {
            return codecException.getErrorCode();
        }
    }

    @RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
        }

        @NonNull
        @DoNotInline
        public static MediaMuxer createMediaMuxer(@NonNull FileDescriptor fileDescriptor, int i10) throws IOException {
            return new MediaMuxer(fileDescriptor, i10);
        }
    }

    public static final class Builder implements UseCaseConfig.Builder<VideoCapture, VideoCaptureConfig, Builder>, ImageOutputConfig.Builder<Builder>, ThreadConfig.Builder<Builder> {
        private final MutableOptionsBundle mMutableConfig;

        public Builder() {
            this(MutableOptionsBundle.create());
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static Builder fromConfig(@NonNull Config config) {
            return new Builder(MutableOptionsBundle.from(config));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public MutableConfig getMutableConfig() {
            return this.mMutableConfig;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setAudioBitRate(int i10) {
            getMutableConfig().insertOption(VideoCaptureConfig.OPTION_AUDIO_BIT_RATE, Integer.valueOf(i10));
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setAudioChannelCount(int i10) {
            getMutableConfig().insertOption(VideoCaptureConfig.OPTION_AUDIO_CHANNEL_COUNT, Integer.valueOf(i10));
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setAudioMinBufferSize(int i10) {
            getMutableConfig().insertOption(VideoCaptureConfig.OPTION_AUDIO_MIN_BUFFER_SIZE, Integer.valueOf(i10));
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setAudioSampleRate(int i10) {
            getMutableConfig().insertOption(VideoCaptureConfig.OPTION_AUDIO_SAMPLE_RATE, Integer.valueOf(i10));
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setBitRate(int i10) {
            getMutableConfig().insertOption(VideoCaptureConfig.OPTION_BIT_RATE, Integer.valueOf(i10));
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setIFrameInterval(int i10) {
            getMutableConfig().insertOption(VideoCaptureConfig.OPTION_INTRA_FRAME_INTERVAL, Integer.valueOf(i10));
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ Builder setSupportedResolutions(@NonNull List list) {
            return setSupportedResolutions((List<Pair<Integer, Size[]>>) list);
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public /* bridge */ /* synthetic */ Object setTargetClass(@NonNull Class cls) {
            return setTargetClass((Class<VideoCapture>) cls);
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setVideoFrameRate(int i10) {
            getMutableConfig().insertOption(VideoCaptureConfig.OPTION_VIDEO_FRAME_RATE, Integer.valueOf(i10));
            return this;
        }

        private Builder(@NonNull MutableOptionsBundle mutableOptionsBundle) {
            this.mMutableConfig = mutableOptionsBundle;
            Class cls = (Class) mutableOptionsBundle.retrieveOption(TargetConfig.OPTION_TARGET_CLASS, null);
            if (cls == null || cls.equals(VideoCapture.class)) {
                setTargetClass(VideoCapture.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        @NonNull
        public static Builder fromConfig(@NonNull VideoCaptureConfig videoCaptureConfig) {
            return new Builder(MutableOptionsBundle.from((Config) videoCaptureConfig));
        }

        @Override // androidx.camera.core.ExtendableBuilder
        @NonNull
        public VideoCapture build() {
            if (getMutableConfig().retrieveOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, null) == null || getMutableConfig().retrieveOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, null) == null) {
                return new VideoCapture(getUseCaseConfig());
            }
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public VideoCaptureConfig getUseCaseConfig() {
            return new VideoCaptureConfig(OptionsBundle.from(this.mMutableConfig));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.internal.ThreadConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setBackgroundExecutor(@NonNull Executor executor) {
            getMutableConfig().insertOption(ThreadConfig.OPTION_BACKGROUND_EXECUTOR, executor);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public Builder setCameraSelector(@NonNull CameraSelector cameraSelector) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAMERA_SELECTOR, cameraSelector);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setCaptureOptionUnpacker(@NonNull CaptureConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setDefaultCaptureConfig(@NonNull CaptureConfig captureConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setDefaultResolution(@NonNull Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_DEFAULT_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setDefaultSessionConfig(@NonNull SessionConfig sessionConfig) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setMaxResolution(@NonNull Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setSessionOptionUnpacker(@NonNull SessionConfig.OptionUnpacker optionUnpacker) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setSupportedResolutions(@NonNull List<Pair<Integer, Size[]>> list) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, list);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setSurfaceOccupancyPriority(int i10) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i10));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setTargetAspectRatio(int i10) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO, Integer.valueOf(i10));
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setTargetClass(@NonNull Class<VideoCapture> cls) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_CLASS, cls);
            if (getMutableConfig().retrieveOption(TargetConfig.OPTION_TARGET_NAME, null) == null) {
                setTargetName(cls.getCanonicalName() + Constant.DASH_STRING + UUID.randomUUID());
            }
            return this;
        }

        @Override // androidx.camera.core.internal.TargetConfig.Builder
        @NonNull
        public Builder setTargetName(@NonNull String str) {
            getMutableConfig().insertOption(TargetConfig.OPTION_TARGET_NAME, str);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setTargetResolution(@NonNull Size size) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, size);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setTargetRotation(int i10) {
            getMutableConfig().insertOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i10));
            return this;
        }

        @Override // androidx.camera.core.internal.UseCaseEventConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setUseCaseEventCallback(@NonNull UseCase.EventCallback eventCallback) {
            getMutableConfig().insertOption(UseCaseEventConfig.OPTION_USE_CASE_EVENT_CALLBACK, eventCallback);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder setZslDisabled(boolean z10) {
            getMutableConfig().insertOption(UseCaseConfig.OPTION_ZSL_DISABLED, Boolean.valueOf(z10));
            return this;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Defaults implements ConfigProvider<VideoCaptureConfig> {
        private static final int DEFAULT_ASPECT_RATIO = 1;
        private static final int DEFAULT_AUDIO_BIT_RATE = 64000;
        private static final int DEFAULT_AUDIO_CHANNEL_COUNT = 1;
        private static final int DEFAULT_AUDIO_MIN_BUFFER_SIZE = 1024;
        private static final int DEFAULT_AUDIO_SAMPLE_RATE = 8000;
        private static final int DEFAULT_BIT_RATE = 8388608;
        private static final VideoCaptureConfig DEFAULT_CONFIG;
        private static final int DEFAULT_INTRA_FRAME_INTERVAL = 1;
        private static final Size DEFAULT_MAX_RESOLUTION;
        private static final int DEFAULT_SURFACE_OCCUPANCY_PRIORITY = 3;
        private static final int DEFAULT_VIDEO_FRAME_RATE = 30;

        static {
            Size size = new Size(1920, 1080);
            DEFAULT_MAX_RESOLUTION = size;
            DEFAULT_CONFIG = new Builder().setVideoFrameRate(30).setBitRate(8388608).setIFrameInterval(1).setAudioBitRate(DEFAULT_AUDIO_BIT_RATE).setAudioSampleRate(DEFAULT_AUDIO_SAMPLE_RATE).setAudioChannelCount(1).setAudioMinBufferSize(1024).setMaxResolution(size).setSurfaceOccupancyPriority(3).setTargetAspectRatio(1).getUseCaseConfig();
        }

        @Override // androidx.camera.core.impl.ConfigProvider
        @NonNull
        public VideoCaptureConfig getConfig() {
            return DEFAULT_CONFIG;
        }
    }

    public static final class Metadata {

        @Nullable
        public Location location;
    }

    public interface OnVideoSavedCallback {
        void onError(int i10, @NonNull String str, @Nullable Throwable th2);

        void onVideoSaved(@NonNull OutputFileResults outputFileResults);
    }

    public static final class OutputFileOptions {
        private static final Metadata EMPTY_METADATA = new Metadata();

        @Nullable
        private final ContentResolver mContentResolver;

        @Nullable
        private final ContentValues mContentValues;

        @Nullable
        private final File mFile;

        @Nullable
        private final FileDescriptor mFileDescriptor;

        @Nullable
        private final Metadata mMetadata;

        @Nullable
        private final Uri mSaveCollection;

        public OutputFileOptions(@Nullable File file, @Nullable FileDescriptor fileDescriptor, @Nullable ContentResolver contentResolver, @Nullable Uri uri, @Nullable ContentValues contentValues, @Nullable Metadata metadata) {
            this.mFile = file;
            this.mFileDescriptor = fileDescriptor;
            this.mContentResolver = contentResolver;
            this.mSaveCollection = uri;
            this.mContentValues = contentValues;
            this.mMetadata = metadata == null ? EMPTY_METADATA : metadata;
        }

        @Nullable
        public ContentResolver getContentResolver() {
            return this.mContentResolver;
        }

        @Nullable
        public ContentValues getContentValues() {
            return this.mContentValues;
        }

        @Nullable
        public File getFile() {
            return this.mFile;
        }

        @Nullable
        public FileDescriptor getFileDescriptor() {
            return this.mFileDescriptor;
        }

        @Nullable
        public Metadata getMetadata() {
            return this.mMetadata;
        }

        @Nullable
        public Uri getSaveCollection() {
            return this.mSaveCollection;
        }

        public boolean isSavingToFile() {
            return getFile() != null;
        }

        public boolean isSavingToFileDescriptor() {
            return getFileDescriptor() != null;
        }

        public boolean isSavingToMediaStore() {
            return (getSaveCollection() == null || getContentResolver() == null || getContentValues() == null) ? false : true;
        }

        public static final class Builder {

            @Nullable
            private ContentResolver mContentResolver;

            @Nullable
            private ContentValues mContentValues;

            @Nullable
            private File mFile;

            @Nullable
            private FileDescriptor mFileDescriptor;

            @Nullable
            private Metadata mMetadata;

            @Nullable
            private Uri mSaveCollection;

            public Builder(@NonNull File file) {
                this.mFile = file;
            }

            @NonNull
            public OutputFileOptions build() {
                return new OutputFileOptions(this.mFile, this.mFileDescriptor, this.mContentResolver, this.mSaveCollection, this.mContentValues, this.mMetadata);
            }

            @NonNull
            public Builder setMetadata(@NonNull Metadata metadata) {
                this.mMetadata = metadata;
                return this;
            }

            public Builder(@NonNull FileDescriptor fileDescriptor) {
                Preconditions.checkArgument(Build.VERSION.SDK_INT >= 26, "Using a FileDescriptor to record a video is only supported for Android 8.0 or above.");
                this.mFileDescriptor = fileDescriptor;
            }

            public Builder(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @NonNull ContentValues contentValues) {
                this.mContentResolver = contentResolver;
                this.mSaveCollection = uri;
                this.mContentValues = contentValues;
            }
        }
    }

    public static class OutputFileResults {

        @Nullable
        private Uri mSavedUri;

        public OutputFileResults(@Nullable Uri uri) {
            this.mSavedUri = uri;
        }

        @Nullable
        public Uri getSavedUri() {
            return this.mSavedUri;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface VideoCaptureError {
    }

    public enum VideoEncoderInitStatus {
        VIDEO_ENCODER_INIT_STATUS_UNINITIALIZED,
        VIDEO_ENCODER_INIT_STATUS_INITIALIZED_FAILED,
        VIDEO_ENCODER_INIT_STATUS_INSUFFICIENT_RESOURCE,
        VIDEO_ENCODER_INIT_STATUS_RESOURCE_RECLAIMED
    }

    public static final class VideoSavedListenerWrapper implements OnVideoSavedCallback {

        @NonNull
        Executor mExecutor;

        @NonNull
        OnVideoSavedCallback mOnVideoSavedCallback;

        public VideoSavedListenerWrapper(@NonNull Executor executor, @NonNull OnVideoSavedCallback onVideoSavedCallback) {
            this.mExecutor = executor;
            this.mOnVideoSavedCallback = onVideoSavedCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onError$1(int i10, String str, Throwable th2) {
            this.mOnVideoSavedCallback.onError(i10, str, th2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVideoSaved$0(OutputFileResults outputFileResults) {
            this.mOnVideoSavedCallback.onVideoSaved(outputFileResults);
        }

        @Override // androidx.camera.core.VideoCapture.OnVideoSavedCallback
        public void onError(final int i10, @NonNull final String str, @Nullable final Throwable th2) {
            try {
                this.mExecutor.execute(new Runnable() { // from class: androidx.camera.core.w1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f2281p0.lambda$onError$1(i10, str, th2);
                    }
                });
            } catch (RejectedExecutionException unused) {
                Logger.e("VideoCapture", "Unable to post to the supplied executor.");
            }
        }

        @Override // androidx.camera.core.VideoCapture.OnVideoSavedCallback
        public void onVideoSaved(@NonNull final OutputFileResults outputFileResults) {
            try {
                this.mExecutor.execute(new Runnable() { // from class: androidx.camera.core.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f2275p0.lambda$onVideoSaved$0(outputFileResults);
                    }
                });
            } catch (RejectedExecutionException unused) {
                Logger.e("VideoCapture", "Unable to post to the supplied executor.");
            }
        }
    }

    public VideoCapture(@NonNull VideoCaptureConfig videoCaptureConfig) {
        super(videoCaptureConfig);
        this.mVideoBufferInfo = new MediaCodec.BufferInfo();
        this.mMuxerLock = new Object();
        this.mEndOfVideoStreamSignal = new AtomicBoolean(true);
        this.mEndOfAudioStreamSignal = new AtomicBoolean(true);
        this.mEndOfAudioVideoSignal = new AtomicBoolean(true);
        this.mAudioBufferInfo = new MediaCodec.BufferInfo();
        this.mIsFirstVideoKeyFrameWrite = new AtomicBoolean(false);
        this.mIsFirstAudioSampleWrite = new AtomicBoolean(false);
        this.mRecordingFuture = null;
        this.mSessionConfigBuilder = new SessionConfig.Builder();
        this.mMuxerStarted = new AtomicBoolean(false);
        this.mIsRecording = false;
        this.mIsAudioEnabled = new AtomicBoolean(true);
        this.mVideoEncoderInitStatus = VideoEncoderInitStatus.VIDEO_ENCODER_INIT_STATUS_UNINITIALIZED;
    }

    @RequiresPermission("android.permission.RECORD_AUDIO")
    private AudioRecord autoConfigAudioRecordSource(VideoCaptureConfig videoCaptureConfig) {
        int i10 = this.mAudioChannelCount == 1 ? 16 : 12;
        try {
            int minBufferSize = AudioRecord.getMinBufferSize(this.mAudioSampleRate, i10, 2);
            if (minBufferSize <= 0) {
                minBufferSize = videoCaptureConfig.getAudioMinBufferSize();
            }
            int i11 = minBufferSize;
            AudioRecord audioRecord = new AudioRecord(5, this.mAudioSampleRate, i10, 2, i11 * 2);
            if (audioRecord.getState() != 1) {
                return null;
            }
            this.mAudioBufferSize = i11;
            Logger.i("VideoCapture", "source: 5 audioSampleRate: " + this.mAudioSampleRate + " channelConfig: " + i10 + " audioFormat: 2 bufferSize: " + i11);
            return audioRecord;
        } catch (Exception e5) {
            Logger.e("VideoCapture", "Exception, keep trying.", e5);
            return null;
        }
    }

    private MediaFormat createAudioMediaFormat() {
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(AUDIO_MIME_TYPE, this.mAudioSampleRate, this.mAudioChannelCount);
        mediaFormatCreateAudioFormat.setInteger("aac-profile", 2);
        mediaFormatCreateAudioFormat.setInteger("bitrate", this.mAudioBitRate);
        return mediaFormatCreateAudioFormat;
    }

    private static MediaFormat createVideoMediaFormat(VideoCaptureConfig videoCaptureConfig, Size size) {
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(VIDEO_MIME_TYPE, size.getWidth(), size.getHeight());
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", videoCaptureConfig.getBitRate());
        mediaFormatCreateVideoFormat.setInteger("frame-rate", videoCaptureConfig.getVideoFrameRate());
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", videoCaptureConfig.getIFrameInterval());
        return mediaFormatCreateVideoFormat;
    }

    private ByteBuffer getInputBuffer(MediaCodec mediaCodec, int i10) {
        return mediaCodec.getInputBuffer(i10);
    }

    private ByteBuffer getOutputBuffer(MediaCodec mediaCodec, int i10) {
        return mediaCodec.getOutputBuffer(i10);
    }

    @NonNull
    private MediaMuxer initMediaMuxer(@NonNull OutputFileOptions outputFileOptions) throws IOException {
        MediaMuxer mediaMuxerCreateMediaMuxer;
        if (outputFileOptions.isSavingToFile()) {
            File file = outputFileOptions.getFile();
            this.mSavedVideoUri = Uri.fromFile(outputFileOptions.getFile());
            return new MediaMuxer(file.getAbsolutePath(), 0);
        }
        if (outputFileOptions.isSavingToFileDescriptor()) {
            if (Build.VERSION.SDK_INT >= 26) {
                return Api26Impl.createMediaMuxer(outputFileOptions.getFileDescriptor(), 0);
            }
            throw new IllegalArgumentException("Using a FileDescriptor to record a video is only supported for Android 8.0 or above.");
        }
        if (!outputFileOptions.isSavingToMediaStore()) {
            throw new IllegalArgumentException("The OutputFileOptions should assign before recording");
        }
        this.mSavedVideoUri = outputFileOptions.getContentResolver().insert(outputFileOptions.getSaveCollection(), outputFileOptions.getContentValues() != null ? new ContentValues(outputFileOptions.getContentValues()) : new ContentValues());
        if (this.mSavedVideoUri == null) {
            throw new IOException("Invalid Uri!");
        }
        try {
            if (Build.VERSION.SDK_INT < 26) {
                String absolutePathFromUri = VideoUtil.getAbsolutePathFromUri(outputFileOptions.getContentResolver(), this.mSavedVideoUri);
                Logger.i("VideoCapture", "Saved Location Path: " + absolutePathFromUri);
                mediaMuxerCreateMediaMuxer = new MediaMuxer(absolutePathFromUri, 0);
            } else {
                this.mParcelFileDescriptor = outputFileOptions.getContentResolver().openFileDescriptor(this.mSavedVideoUri, RootService.RW);
                mediaMuxerCreateMediaMuxer = Api26Impl.createMediaMuxer(this.mParcelFileDescriptor.getFileDescriptor(), 0);
            }
            return mediaMuxerCreateMediaMuxer;
        } catch (IOException e5) {
            this.mSavedVideoUri = null;
            throw e5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$releaseCameraSurface$7(boolean z10, MediaCodec mediaCodec) {
        if (!z10 || mediaCodec == null) {
            return;
        }
        mediaCodec.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$startRecording$1(AtomicReference atomicReference, CallbackToFutureAdapter.Completer completer) throws Exception {
        atomicReference.set(completer);
        return "startRecording";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startRecording$2() {
        this.mRecordingFuture = null;
        if (getCamera() != null) {
            setupEncoder(getCameraId(), getAttachedSurfaceResolution());
            notifyReset();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startRecording$4(OnVideoSavedCallback onVideoSavedCallback, String str, Size size, OutputFileOptions outputFileOptions, CallbackToFutureAdapter.Completer completer) {
        if (!videoEncode(onVideoSavedCallback, str, size, outputFileOptions)) {
            onVideoSavedCallback.onVideoSaved(new OutputFileResults(this.mSavedVideoUri));
            this.mSavedVideoUri = null;
        }
        completer.set(null);
    }

    private void releaseAudioInputResource() {
        this.mAudioHandlerThread.quitSafely();
        MediaCodec mediaCodec = this.mAudioEncoder;
        if (mediaCodec != null) {
            mediaCodec.release();
            this.mAudioEncoder = null;
        }
        if (this.mAudioRecorder != null) {
            this.mAudioRecorder.release();
            this.mAudioRecorder = null;
        }
    }

    @UiThread
    private void releaseCameraSurface(final boolean z10) {
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface == null) {
            return;
        }
        final MediaCodec mediaCodec = this.mVideoEncoder;
        deferrableSurface.close();
        this.mDeferrableSurface.getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.core.t1
            @Override // java.lang.Runnable
            public final void run() {
                VideoCapture.lambda$releaseCameraSurface$7(z10, mediaCodec);
            }
        }, CameraXExecutors.mainThreadExecutor());
        if (z10) {
            this.mVideoEncoder = null;
        }
        this.mCameraSurface = null;
        this.mDeferrableSurface = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: releaseResources, reason: merged with bridge method [inline-methods] */
    public void lambda$onDetached$6() {
        this.mVideoHandlerThread.quitSafely();
        releaseAudioInputResource();
        if (this.mCameraSurface != null) {
            releaseCameraSurface(true);
        }
    }

    private boolean removeRecordingResultIfNoVideoKeyFrameArrived(@NonNull OutputFileOptions outputFileOptions) {
        boolean z10;
        Logger.i("VideoCapture", "check Recording Result First Video Key Frame Write: " + this.mIsFirstVideoKeyFrameWrite.get());
        if (this.mIsFirstVideoKeyFrameWrite.get()) {
            z10 = true;
        } else {
            Logger.i("VideoCapture", "The recording result has no key frame.");
            z10 = false;
        }
        if (outputFileOptions.isSavingToFile()) {
            File file = outputFileOptions.getFile();
            if (!z10) {
                Logger.i("VideoCapture", "Delete file.");
                file.delete();
            }
        } else if (outputFileOptions.isSavingToMediaStore() && !z10) {
            Logger.i("VideoCapture", "Delete file.");
            if (this.mSavedVideoUri != null) {
                outputFileOptions.getContentResolver().delete(this.mSavedVideoUri, null, null);
            }
        }
        return z10;
    }

    private void setAudioParametersByCamcorderProfile(Size size, String str) {
        try {
            for (int i10 : CamcorderQuality) {
                if (CamcorderProfile.hasProfile(Integer.parseInt(str), i10)) {
                    CamcorderProfile camcorderProfile = CamcorderProfile.get(Integer.parseInt(str), i10);
                    if (size.getWidth() == camcorderProfile.videoFrameWidth && size.getHeight() == camcorderProfile.videoFrameHeight) {
                        this.mAudioChannelCount = camcorderProfile.audioChannels;
                        this.mAudioSampleRate = camcorderProfile.audioSampleRate;
                        this.mAudioBitRate = camcorderProfile.audioBitRate;
                        return;
                    }
                }
            }
        } catch (NumberFormatException unused) {
            Logger.i("VideoCapture", "The camera Id is not an integer because the camera may be a removable device. Use the default values for the audio related settings.");
        }
        VideoCaptureConfig videoCaptureConfig = (VideoCaptureConfig) getCurrentConfig();
        this.mAudioChannelCount = videoCaptureConfig.getAudioChannelCount();
        this.mAudioSampleRate = videoCaptureConfig.getAudioSampleRate();
        this.mAudioBitRate = videoCaptureConfig.getAudioBitRate();
    }

    private boolean writeAudioEncodedBuffer(int i10) {
        ByteBuffer outputBuffer = getOutputBuffer(this.mAudioEncoder, i10);
        outputBuffer.position(this.mAudioBufferInfo.offset);
        if (this.mMuxerStarted.get()) {
            try {
                MediaCodec.BufferInfo bufferInfo = this.mAudioBufferInfo;
                if (bufferInfo.size <= 0 || bufferInfo.presentationTimeUs <= 0) {
                    Logger.i("VideoCapture", "mAudioBufferInfo size: " + this.mAudioBufferInfo.size + " presentationTimeUs: " + this.mAudioBufferInfo.presentationTimeUs);
                } else {
                    synchronized (this.mMuxerLock) {
                        try {
                            if (!this.mIsFirstAudioSampleWrite.get()) {
                                Logger.i("VideoCapture", "First audio sample written.");
                                this.mIsFirstAudioSampleWrite.set(true);
                            }
                            this.mMuxer.writeSampleData(this.mAudioTrackIndex, outputBuffer, this.mAudioBufferInfo);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Exception e5) {
                Logger.e("VideoCapture", "audio error:size=" + this.mAudioBufferInfo.size + "/offset=" + this.mAudioBufferInfo.offset + "/timeUs=" + this.mAudioBufferInfo.presentationTimeUs);
                e5.printStackTrace();
            }
        }
        this.mAudioEncoder.releaseOutputBuffer(i10, false);
        return (this.mAudioBufferInfo.flags & 4) != 0;
    }

    private boolean writeVideoEncodedBuffer(int i10) {
        if (i10 < 0) {
            Logger.e("VideoCapture", "Output buffer should not have negative index: " + i10);
            return false;
        }
        ByteBuffer outputBuffer = this.mVideoEncoder.getOutputBuffer(i10);
        if (outputBuffer == null) {
            Logger.d("VideoCapture", "OutputBuffer was null.");
            return false;
        }
        if (this.mMuxerStarted.get()) {
            MediaCodec.BufferInfo bufferInfo = this.mVideoBufferInfo;
            if (bufferInfo.size > 0) {
                outputBuffer.position(bufferInfo.offset);
                MediaCodec.BufferInfo bufferInfo2 = this.mVideoBufferInfo;
                outputBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                this.mVideoBufferInfo.presentationTimeUs = System.nanoTime() / 1000;
                synchronized (this.mMuxerLock) {
                    try {
                        if (!this.mIsFirstVideoKeyFrameWrite.get()) {
                            if ((this.mVideoBufferInfo.flags & 1) != 0) {
                                Logger.i("VideoCapture", "First video key frame written.");
                                this.mIsFirstVideoKeyFrameWrite.set(true);
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putInt("request-sync", 0);
                                this.mVideoEncoder.setParameters(bundle);
                            }
                        }
                        this.mMuxer.writeSampleData(this.mVideoTrackIndex, outputBuffer, this.mVideoBufferInfo);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else {
                Logger.i("VideoCapture", "mVideoBufferInfo.size <= 0, index " + i10);
            }
        }
        this.mVideoEncoder.releaseOutputBuffer(i10, false);
        return (this.mVideoBufferInfo.flags & 4) != 0;
    }

    /* JADX INFO: renamed from: audioEncode, reason: merged with bridge method [inline-methods] */
    public boolean lambda$startRecording$3(OnVideoSavedCallback onVideoSavedCallback) {
        boolean zWriteAudioEncodedBuffer = false;
        long j10 = 0;
        while (!zWriteAudioEncodedBuffer && this.mIsRecording) {
            if (this.mEndOfAudioStreamSignal.get()) {
                this.mEndOfAudioStreamSignal.set(false);
                this.mIsRecording = false;
            }
            if (this.mAudioEncoder != null && this.mAudioRecorder != null) {
                try {
                    int iDequeueInputBuffer = this.mAudioEncoder.dequeueInputBuffer(-1L);
                    if (iDequeueInputBuffer >= 0) {
                        ByteBuffer inputBuffer = getInputBuffer(this.mAudioEncoder, iDequeueInputBuffer);
                        inputBuffer.clear();
                        int i10 = this.mAudioRecorder.read(inputBuffer, this.mAudioBufferSize);
                        if (i10 > 0) {
                            this.mAudioEncoder.queueInputBuffer(iDequeueInputBuffer, 0, i10, System.nanoTime() / 1000, this.mIsRecording ? 0 : 4);
                        }
                    }
                } catch (MediaCodec.CodecException e5) {
                    Logger.i("VideoCapture", "audio dequeueInputBuffer CodecException " + e5.getMessage());
                } catch (IllegalStateException e7) {
                    Logger.i("VideoCapture", "audio dequeueInputBuffer IllegalStateException " + e7.getMessage());
                }
                do {
                    int iDequeueOutputBuffer = this.mAudioEncoder.dequeueOutputBuffer(this.mAudioBufferInfo, 0L);
                    if (iDequeueOutputBuffer == -2) {
                        synchronized (this.mMuxerLock) {
                            try {
                                int iAddTrack = this.mMuxer.addTrack(this.mAudioEncoder.getOutputFormat());
                                this.mAudioTrackIndex = iAddTrack;
                                if (iAddTrack >= 0 && this.mVideoTrackIndex >= 0) {
                                    Logger.i("VideoCapture", "MediaMuxer start on audio encoder thread.");
                                    this.mMuxer.start();
                                    this.mMuxerStarted.set(true);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else if (iDequeueOutputBuffer != -1) {
                        if (this.mAudioBufferInfo.presentationTimeUs > j10) {
                            zWriteAudioEncodedBuffer = writeAudioEncodedBuffer(iDequeueOutputBuffer);
                            j10 = this.mAudioBufferInfo.presentationTimeUs;
                        } else {
                            Logger.w("VideoCapture", "Drops frame, current frame's timestamp " + this.mAudioBufferInfo.presentationTimeUs + " is earlier that last frame " + j10);
                            this.mAudioEncoder.releaseOutputBuffer(iDequeueOutputBuffer, false);
                        }
                    }
                    if (iDequeueOutputBuffer < 0) {
                        break;
                    }
                } while (!zWriteAudioEncodedBuffer);
            }
        }
        try {
            Logger.i("VideoCapture", "audioRecorder stop");
            this.mAudioRecorder.stop();
        } catch (IllegalStateException e10) {
            onVideoSavedCallback.onError(1, "Audio recorder stop failed!", e10);
        }
        try {
            this.mAudioEncoder.stop();
        } catch (IllegalStateException e11) {
            onVideoSavedCallback.onError(1, "Audio encoder stop failed!", e11);
        }
        Logger.i("VideoCapture", "Audio encode thread end");
        this.mEndOfVideoStreamSignal.set(true);
        return false;
    }

    @Override // androidx.camera.core.UseCase
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfig<?> getDefaultConfig(boolean z10, @NonNull UseCaseConfigFactory useCaseConfigFactory) {
        Config config = useCaseConfigFactory.getConfig(UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE, 1);
        if (z10) {
            config = androidx.camera.core.impl.n.b(config, DEFAULT_CONFIG.getConfig());
        }
        if (config == null) {
            return null;
        }
        return getUseCaseConfigBuilder(config).getUseCaseConfig();
    }

    @Override // androidx.camera.core.UseCase
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public UseCaseConfig.Builder<?, ?, ?> getUseCaseConfigBuilder(@NonNull Config config) {
        return Builder.fromConfig(config);
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onAttached() {
        this.mVideoHandlerThread = new HandlerThread("CameraX-video encoding thread");
        this.mAudioHandlerThread = new HandlerThread("CameraX-audio encoding thread");
        this.mVideoHandlerThread.start();
        this.mVideoHandler = new Handler(this.mVideoHandlerThread.getLooper());
        this.mAudioHandlerThread.start();
        this.mAudioHandler = new Handler(this.mAudioHandlerThread.getLooper());
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onDetached() {
        lambda$stopRecording$5();
        ListenableFuture<Void> listenableFuture = this.mRecordingFuture;
        if (listenableFuture != null) {
            listenableFuture.addListener(new androidx.activity.f(this, 1), CameraXExecutors.mainThreadExecutor());
        } else {
            lambda$onDetached$6();
        }
    }

    @Override // androidx.camera.core.UseCase
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @UiThread
    public void onStateDetached() {
        lambda$stopRecording$5();
    }

    @Override // androidx.camera.core.UseCase
    @NonNull
    @RequiresPermission("android.permission.RECORD_AUDIO")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Size onSuggestedResolutionUpdated(@NonNull Size size) {
        if (this.mCameraSurface != null) {
            this.mVideoEncoder.stop();
            this.mVideoEncoder.release();
            this.mAudioEncoder.stop();
            this.mAudioEncoder.release();
            releaseCameraSurface(false);
        }
        try {
            this.mVideoEncoder = MediaCodec.createEncoderByType(VIDEO_MIME_TYPE);
            this.mAudioEncoder = MediaCodec.createEncoderByType(AUDIO_MIME_TYPE);
            setupEncoder(getCameraId(), size);
            notifyActive();
            return size;
        } catch (IOException e5) {
            throw new IllegalStateException("Unable to create MediaCodec due to: " + e5.getCause());
        }
    }

    public void setTargetRotation(int i10) {
        setTargetRotationInternal(i10);
    }

    @RequiresPermission("android.permission.RECORD_AUDIO")
    @UiThread
    public void setupEncoder(@NonNull final String str, @NonNull final Size size) {
        VideoCaptureConfig videoCaptureConfig = (VideoCaptureConfig) getCurrentConfig();
        this.mVideoEncoder.reset();
        this.mVideoEncoderInitStatus = VideoEncoderInitStatus.VIDEO_ENCODER_INIT_STATUS_UNINITIALIZED;
        try {
            this.mVideoEncoder.configure(createVideoMediaFormat(videoCaptureConfig, size), (Surface) null, (MediaCrypto) null, 1);
            int i10 = 0;
            if (this.mCameraSurface != null) {
                releaseCameraSurface(false);
            }
            Surface surfaceCreateInputSurface = this.mVideoEncoder.createInputSurface();
            this.mCameraSurface = surfaceCreateInputSurface;
            this.mSessionConfigBuilder = SessionConfig.Builder.createFrom(videoCaptureConfig);
            DeferrableSurface deferrableSurface = this.mDeferrableSurface;
            if (deferrableSurface != null) {
                deferrableSurface.close();
            }
            ImmediateSurface immediateSurface = new ImmediateSurface(this.mCameraSurface, size, getImageFormat());
            this.mDeferrableSurface = immediateSurface;
            ListenableFuture<Void> terminationFuture = immediateSurface.getTerminationFuture();
            Objects.requireNonNull(surfaceCreateInputSurface);
            terminationFuture.addListener(new u1(surfaceCreateInputSurface, i10), CameraXExecutors.mainThreadExecutor());
            this.mSessionConfigBuilder.addNonRepeatingSurface(this.mDeferrableSurface);
            this.mSessionConfigBuilder.addErrorListener(new SessionConfig.ErrorListener() { // from class: androidx.camera.core.VideoCapture.1
                @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
                @RequiresPermission("android.permission.RECORD_AUDIO")
                public void onError(@NonNull SessionConfig sessionConfig, @NonNull SessionConfig.SessionError sessionError) {
                    if (VideoCapture.this.isCurrentCamera(str)) {
                        VideoCapture.this.setupEncoder(str, size);
                        VideoCapture.this.notifyReset();
                    }
                }
            });
            updateSessionConfig(this.mSessionConfigBuilder.build());
            this.mIsAudioEnabled.set(true);
            setAudioParametersByCamcorderProfile(size, str);
            this.mAudioEncoder.reset();
            this.mAudioEncoder.configure(createAudioMediaFormat(), (Surface) null, (MediaCrypto) null, 1);
            if (this.mAudioRecorder != null) {
                this.mAudioRecorder.release();
            }
            this.mAudioRecorder = autoConfigAudioRecordSource(videoCaptureConfig);
            if (this.mAudioRecorder == null) {
                Logger.e("VideoCapture", "AudioRecord object cannot initialized correctly!");
                this.mIsAudioEnabled.set(false);
            }
            synchronized (this.mMuxerLock) {
                this.mVideoTrackIndex = -1;
                this.mAudioTrackIndex = -1;
            }
            this.mIsRecording = false;
        } catch (MediaCodec.CodecException e5) {
            int codecExceptionErrorCode = Api23Impl.getCodecExceptionErrorCode(e5);
            String diagnosticInfo = e5.getDiagnosticInfo();
            if (codecExceptionErrorCode == 1100) {
                Logger.i("VideoCapture", "CodecException: code: " + codecExceptionErrorCode + " diagnostic: " + diagnosticInfo);
                this.mVideoEncoderInitStatus = VideoEncoderInitStatus.VIDEO_ENCODER_INIT_STATUS_INSUFFICIENT_RESOURCE;
            } else if (codecExceptionErrorCode == 1101) {
                Logger.i("VideoCapture", "CodecException: code: " + codecExceptionErrorCode + " diagnostic: " + diagnosticInfo);
                this.mVideoEncoderInitStatus = VideoEncoderInitStatus.VIDEO_ENCODER_INIT_STATUS_RESOURCE_RECLAIMED;
            }
            this.mVideoEncoderErrorMessage = e5;
        } catch (IllegalArgumentException e7) {
            e = e7;
            this.mVideoEncoderInitStatus = VideoEncoderInitStatus.VIDEO_ENCODER_INIT_STATUS_INITIALIZED_FAILED;
            this.mVideoEncoderErrorMessage = e;
        } catch (IllegalStateException e10) {
            e = e10;
            this.mVideoEncoderInitStatus = VideoEncoderInitStatus.VIDEO_ENCODER_INIT_STATUS_INITIALIZED_FAILED;
            this.mVideoEncoderErrorMessage = e;
        }
    }

    @RequiresPermission("android.permission.RECORD_AUDIO")
    /* JADX INFO: renamed from: startRecording, reason: merged with bridge method [inline-methods] */
    public void lambda$startRecording$0(@NonNull final OutputFileOptions outputFileOptions, @NonNull final Executor executor, @NonNull final OnVideoSavedCallback onVideoSavedCallback) {
        Location location;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.q1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2233p0.lambda$startRecording$0(outputFileOptions, executor, onVideoSavedCallback);
                }
            });
            return;
        }
        Logger.i("VideoCapture", "startRecording");
        int i10 = 0;
        this.mIsFirstVideoKeyFrameWrite.set(false);
        this.mIsFirstAudioSampleWrite.set(false);
        VideoSavedListenerWrapper videoSavedListenerWrapper = new VideoSavedListenerWrapper(executor, onVideoSavedCallback);
        CameraInternal camera = getCamera();
        if (camera == null) {
            videoSavedListenerWrapper.onError(5, "Not bound to a Camera [" + this + Constant.BRACKET_CLOSE, null);
            return;
        }
        VideoEncoderInitStatus videoEncoderInitStatus = this.mVideoEncoderInitStatus;
        int i11 = 1;
        if (videoEncoderInitStatus == VideoEncoderInitStatus.VIDEO_ENCODER_INIT_STATUS_INSUFFICIENT_RESOURCE || videoEncoderInitStatus == VideoEncoderInitStatus.VIDEO_ENCODER_INIT_STATUS_INITIALIZED_FAILED || videoEncoderInitStatus == VideoEncoderInitStatus.VIDEO_ENCODER_INIT_STATUS_RESOURCE_RECLAIMED) {
            videoSavedListenerWrapper.onError(1, "Video encoder initialization failed before start recording ", this.mVideoEncoderErrorMessage);
            return;
        }
        if (!this.mEndOfAudioVideoSignal.get()) {
            videoSavedListenerWrapper.onError(3, "It is still in video recording!", null);
            return;
        }
        if (this.mIsAudioEnabled.get()) {
            try {
                if (this.mAudioRecorder.getState() == 1) {
                    this.mAudioRecorder.startRecording();
                }
            } catch (IllegalStateException e5) {
                Logger.i("VideoCapture", "AudioRecorder cannot start recording, disable audio." + e5.getMessage());
                this.mIsAudioEnabled.set(false);
                releaseAudioInputResource();
            }
            if (this.mAudioRecorder.getRecordingState() != 3) {
                Logger.i("VideoCapture", "AudioRecorder startRecording failed - incorrect state: " + this.mAudioRecorder.getRecordingState());
                this.mIsAudioEnabled.set(false);
                releaseAudioInputResource();
            }
        }
        AtomicReference atomicReference = new AtomicReference();
        this.mRecordingFuture = CallbackToFutureAdapter.getFuture(new m(atomicReference, i11));
        CallbackToFutureAdapter.Completer completer = (CallbackToFutureAdapter.Completer) Preconditions.checkNotNull((CallbackToFutureAdapter.Completer) atomicReference.get());
        this.mRecordingFuture.addListener(new r1(this, i10), CameraXExecutors.mainThreadExecutor());
        try {
            Logger.i("VideoCapture", "videoEncoder start");
            this.mVideoEncoder.start();
            if (this.mIsAudioEnabled.get()) {
                Logger.i("VideoCapture", "audioEncoder start");
                this.mAudioEncoder.start();
            }
            try {
                synchronized (this.mMuxerLock) {
                    try {
                        MediaMuxer mediaMuxerInitMediaMuxer = initMediaMuxer(outputFileOptions);
                        this.mMuxer = mediaMuxerInitMediaMuxer;
                        Preconditions.checkNotNull(mediaMuxerInitMediaMuxer);
                        this.mMuxer.setOrientationHint(getRelativeRotation(camera));
                        Metadata metadata = outputFileOptions.getMetadata();
                        if (metadata != null && (location = metadata.location) != null) {
                            this.mMuxer.setLocation((float) location.getLatitude(), (float) metadata.location.getLongitude());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.mEndOfVideoStreamSignal.set(false);
                this.mEndOfAudioStreamSignal.set(false);
                this.mEndOfAudioVideoSignal.set(false);
                this.mIsRecording = true;
                this.mSessionConfigBuilder.clearSurfaces();
                this.mSessionConfigBuilder.addSurface(this.mDeferrableSurface);
                updateSessionConfig(this.mSessionConfigBuilder.build());
                notifyUpdated();
                if (this.mIsAudioEnabled.get()) {
                    this.mAudioHandler.post(new t0(this, videoSavedListenerWrapper, i11));
                }
                this.mVideoHandler.post(new s1(this, videoSavedListenerWrapper, getCameraId(), getAttachedSurfaceResolution(), outputFileOptions, completer, 0));
            } catch (IOException e7) {
                completer.set(null);
                videoSavedListenerWrapper.onError(2, "MediaMuxer creation failed!", e7);
            }
        } catch (IllegalStateException e10) {
            completer.set(null);
            videoSavedListenerWrapper.onError(1, "Audio/Video encoder start fail", e10);
        }
    }

    /* JADX INFO: renamed from: stopRecording, reason: merged with bridge method [inline-methods] */
    public void lambda$stopRecording$5() {
        int i10 = 1;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            CameraXExecutors.mainThreadExecutor().execute(new androidx.appcompat.widget.s1(this, i10));
            return;
        }
        Logger.i("VideoCapture", "stopRecording");
        this.mSessionConfigBuilder.clearSurfaces();
        this.mSessionConfigBuilder.addNonRepeatingSurface(this.mDeferrableSurface);
        updateSessionConfig(this.mSessionConfigBuilder.build());
        notifyUpdated();
        if (this.mIsRecording) {
            if (this.mIsAudioEnabled.get()) {
                this.mEndOfAudioStreamSignal.set(true);
            } else {
                this.mEndOfVideoStreamSignal.set(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006e A[Catch: all -> 0x0060, TryCatch #1 {all -> 0x0060, blocks: (B:19:0x0041, B:21:0x0057, B:23:0x005b, B:32:0x006e, B:33:0x0090, B:28:0x0062, B:30:0x006a), top: B:75:0x0041 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x006e, please report this as an issue */
    public boolean videoEncode(@NonNull OnVideoSavedCallback onVideoSavedCallback, @NonNull String str, @NonNull Size size, @NonNull OutputFileOptions outputFileOptions) {
        boolean zWriteVideoEncodedBuffer = false;
        boolean z10 = false;
        while (!zWriteVideoEncodedBuffer && !z10) {
            if (this.mEndOfVideoStreamSignal.get()) {
                this.mVideoEncoder.signalEndOfInputStream();
                this.mEndOfVideoStreamSignal.set(false);
            }
            int iDequeueOutputBuffer = this.mVideoEncoder.dequeueOutputBuffer(this.mVideoBufferInfo, 10000L);
            if (iDequeueOutputBuffer == -2) {
                if (this.mMuxerStarted.get()) {
                    onVideoSavedCallback.onError(1, "Unexpected change in video encoding format.", null);
                    z10 = true;
                }
                synchronized (this.mMuxerLock) {
                    try {
                        this.mVideoTrackIndex = this.mMuxer.addTrack(this.mVideoEncoder.getOutputFormat());
                        if (this.mIsAudioEnabled.get() && this.mAudioTrackIndex >= 0 && this.mVideoTrackIndex >= 0) {
                            Logger.i("VideoCapture", "MediaMuxer started on video encode thread and audio enabled: " + this.mIsAudioEnabled);
                            this.mMuxer.start();
                            this.mMuxerStarted.set(true);
                        } else if (!this.mIsAudioEnabled.get() && this.mVideoTrackIndex >= 0) {
                            Logger.i("VideoCapture", "MediaMuxer started on video encode thread and audio enabled: " + this.mIsAudioEnabled);
                            this.mMuxer.start();
                            this.mMuxerStarted.set(true);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else if (iDequeueOutputBuffer != -1) {
                zWriteVideoEncodedBuffer = writeVideoEncodedBuffer(iDequeueOutputBuffer);
            }
        }
        try {
            Logger.i("VideoCapture", "videoEncoder stop");
            this.mVideoEncoder.stop();
        } catch (IllegalStateException e5) {
            onVideoSavedCallback.onError(1, "Video encoder stop failed!", e5);
            z10 = true;
        }
        try {
            synchronized (this.mMuxerLock) {
                try {
                    if (this.mMuxer != null) {
                        if (this.mMuxerStarted.get()) {
                            Logger.i("VideoCapture", "Muxer already started");
                            this.mMuxer.stop();
                        }
                        this.mMuxer.release();
                        this.mMuxer = null;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (!removeRecordingResultIfNoVideoKeyFrameArrived(outputFileOptions)) {
                onVideoSavedCallback.onError(6, "The file has no video key frame.", null);
                z10 = true;
            }
        } catch (IllegalStateException e7) {
            Logger.i("VideoCapture", "muxer stop IllegalStateException: " + System.currentTimeMillis());
            Logger.i("VideoCapture", "muxer stop exception, mIsFirstVideoKeyFrameWrite: " + this.mIsFirstVideoKeyFrameWrite.get());
            if (this.mIsFirstVideoKeyFrameWrite.get()) {
                onVideoSavedCallback.onError(2, "Muxer stop failed!", e7);
            } else {
                onVideoSavedCallback.onError(6, "The file has no video key frame.", null);
            }
        }
        if (this.mParcelFileDescriptor != null) {
            try {
                this.mParcelFileDescriptor.close();
                this.mParcelFileDescriptor = null;
            } catch (IOException e10) {
                onVideoSavedCallback.onError(2, "File descriptor close failed!", e10);
                z10 = true;
            }
        }
        this.mMuxerStarted.set(false);
        this.mEndOfAudioVideoSignal.set(true);
        this.mIsFirstVideoKeyFrameWrite.set(false);
        Logger.i("VideoCapture", "Video encode thread end.");
        return z10;
    }
}
