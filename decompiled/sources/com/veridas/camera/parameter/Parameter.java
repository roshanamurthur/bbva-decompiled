package com.veridas.camera.parameter;

import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;

/* JADX INFO: loaded from: classes9.dex */
public interface Parameter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AntiBandingMode {
        private static final /* synthetic */ AntiBandingMode[] $VALUES;
        public static final AntiBandingMode AUTO;
        public static final AntiBandingMode FIFTY_HZ;
        public static final AntiBandingMode NONE;
        public static final AntiBandingMode SIXTY_HZ;

        static {
            AntiBandingMode antiBandingMode = new AntiBandingMode(ExpectedUserActionOnPoiTypes.NONE, 0);
            NONE = antiBandingMode;
            AntiBandingMode antiBandingMode2 = new AntiBandingMode("FIFTY_HZ", 1);
            FIFTY_HZ = antiBandingMode2;
            AntiBandingMode antiBandingMode3 = new AntiBandingMode("SIXTY_HZ", 2);
            SIXTY_HZ = antiBandingMode3;
            AntiBandingMode antiBandingMode4 = new AntiBandingMode("AUTO", 3);
            AUTO = antiBandingMode4;
            $VALUES = new AntiBandingMode[]{antiBandingMode, antiBandingMode2, antiBandingMode3, antiBandingMode4};
        }

        public AntiBandingMode() {
            throw null;
        }

        public static AntiBandingMode valueOf(String str) {
            return (AntiBandingMode) Enum.valueOf(AntiBandingMode.class, str);
        }

        public static AntiBandingMode[] values() {
            return (AntiBandingMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CaptureMode {
        private static final /* synthetic */ CaptureMode[] $VALUES;
        public static final CaptureMode PICTURE;
        public static final CaptureMode PICTURE_AND_VIDEO;
        public static final CaptureMode VIDEO;

        static {
            CaptureMode captureMode = new CaptureMode("PICTURE", 0);
            PICTURE = captureMode;
            CaptureMode captureMode2 = new CaptureMode("VIDEO", 1);
            VIDEO = captureMode2;
            CaptureMode captureMode3 = new CaptureMode("PICTURE_AND_VIDEO", 2);
            PICTURE_AND_VIDEO = captureMode3;
            $VALUES = new CaptureMode[]{captureMode, captureMode2, captureMode3};
        }

        public CaptureMode() {
            throw null;
        }

        public static CaptureMode valueOf(String str) {
            return (CaptureMode) Enum.valueOf(CaptureMode.class, str);
        }

        public static CaptureMode[] values() {
            return (CaptureMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ColorEffectMode {
        private static final /* synthetic */ ColorEffectMode[] $VALUES;
        public static final ColorEffectMode MONO;
        public static final ColorEffectMode NONE;

        static {
            ColorEffectMode colorEffectMode = new ColorEffectMode(ExpectedUserActionOnPoiTypes.NONE, 0);
            NONE = colorEffectMode;
            ColorEffectMode colorEffectMode2 = new ColorEffectMode("MONO", 1);
            MONO = colorEffectMode2;
            $VALUES = new ColorEffectMode[]{colorEffectMode, colorEffectMode2};
        }

        public ColorEffectMode() {
            throw null;
        }

        public static ColorEffectMode valueOf(String str) {
            return (ColorEffectMode) Enum.valueOf(ColorEffectMode.class, str);
        }

        public static ColorEffectMode[] values() {
            return (ColorEffectMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FlashMode {
        private static final /* synthetic */ FlashMode[] $VALUES;
        public static final FlashMode AUTO;
        public static final FlashMode OFF;
        public static final FlashMode ON;
        public static final FlashMode RED_EYE;
        public static final FlashMode TORCH;

        static {
            FlashMode flashMode = new FlashMode("AUTO", 0);
            AUTO = flashMode;
            FlashMode flashMode2 = new FlashMode("OFF", 1);
            OFF = flashMode2;
            FlashMode flashMode3 = new FlashMode("ON", 2);
            ON = flashMode3;
            FlashMode flashMode4 = new FlashMode("RED_EYE", 3);
            RED_EYE = flashMode4;
            FlashMode flashMode5 = new FlashMode("TORCH", 4);
            TORCH = flashMode5;
            $VALUES = new FlashMode[]{flashMode, flashMode2, flashMode3, flashMode4, flashMode5};
        }

        public FlashMode() {
            throw null;
        }

        public static FlashMode valueOf(String str) {
            return (FlashMode) Enum.valueOf(FlashMode.class, str);
        }

        public static FlashMode[] values() {
            return (FlashMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FocusMode {
        private static final /* synthetic */ FocusMode[] $VALUES;
        public static final FocusMode AUTO;
        public static final FocusMode CONTINUOUS_PICTURE;
        public static final FocusMode CONTINUOUS_VIDEO;
        public static final FocusMode EDOF;
        public static final FocusMode FIXED;
        public static final FocusMode INFINITY;
        public static final FocusMode SINGLE;

        static {
            FocusMode focusMode = new FocusMode("FIXED", 0);
            FIXED = focusMode;
            FocusMode focusMode2 = new FocusMode("INFINITY", 1);
            INFINITY = focusMode2;
            FocusMode focusMode3 = new FocusMode("AUTO", 2);
            AUTO = focusMode3;
            FocusMode focusMode4 = new FocusMode("SINGLE", 3);
            SINGLE = focusMode4;
            FocusMode focusMode5 = new FocusMode("CONTINUOUS_PICTURE", 4);
            CONTINUOUS_PICTURE = focusMode5;
            FocusMode focusMode6 = new FocusMode("CONTINUOUS_VIDEO", 5);
            CONTINUOUS_VIDEO = focusMode6;
            FocusMode focusMode7 = new FocusMode("EDOF", 6);
            EDOF = focusMode7;
            $VALUES = new FocusMode[]{focusMode, focusMode2, focusMode3, focusMode4, focusMode5, focusMode6, focusMode7};
        }

        public FocusMode() {
            throw null;
        }

        public static FocusMode valueOf(String str) {
            return (FocusMode) Enum.valueOf(FocusMode.class, str);
        }

        public static FocusMode[] values() {
            return (FocusMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SceneMode {
        private static final /* synthetic */ SceneMode[] $VALUES;
        public static final SceneMode AUTO;
        public static final SceneMode NONE;

        static {
            SceneMode sceneMode = new SceneMode(ExpectedUserActionOnPoiTypes.NONE, 0);
            NONE = sceneMode;
            SceneMode sceneMode2 = new SceneMode("AUTO", 1);
            AUTO = sceneMode2;
            $VALUES = new SceneMode[]{sceneMode, sceneMode2};
        }

        public SceneMode() {
            throw null;
        }

        public static SceneMode valueOf(String str) {
            return (SceneMode) Enum.valueOf(SceneMode.class, str);
        }

        public static SceneMode[] values() {
            return (SceneMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class WhiteBalanceMode {
        private static final /* synthetic */ WhiteBalanceMode[] $VALUES;
        public static final WhiteBalanceMode AUTO;
        public static final WhiteBalanceMode NONE;

        static {
            WhiteBalanceMode whiteBalanceMode = new WhiteBalanceMode(ExpectedUserActionOnPoiTypes.NONE, 0);
            NONE = whiteBalanceMode;
            WhiteBalanceMode whiteBalanceMode2 = new WhiteBalanceMode("AUTO", 1);
            AUTO = whiteBalanceMode2;
            $VALUES = new WhiteBalanceMode[]{whiteBalanceMode, whiteBalanceMode2};
        }

        public WhiteBalanceMode() {
            throw null;
        }

        public static WhiteBalanceMode valueOf(String str) {
            return (WhiteBalanceMode) Enum.valueOf(WhiteBalanceMode.class, str);
        }

        public static WhiteBalanceMode[] values() {
            return (WhiteBalanceMode[]) $VALUES.clone();
        }
    }
}
