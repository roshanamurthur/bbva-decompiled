package com.veridas.logger;

import android.content.Context;
import android.os.Bundle;
import com.bbva.glomohybrid.logs.LogKeysKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J9\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e\"\u00020\u0001H&¢\u0006\u0002\u0010\u000fJ1\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e\"\u00020\u0001H&¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH&J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J9\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e\"\u00020\u0001H&¢\u0006\u0002\u0010\u0011J1\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e\"\u00020\u0001H&¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&¨\u0006\u0017"}, d2 = {"Lcom/veridas/logger/Logger;", "", "endSession", "", "isSuccessful", "", LogKeysKt.LOG, LogKeysKt.TAG, "Lcom/veridas/logger/Logger$Tag;", "message", "", "params", "Landroid/os/Bundle;", "args", "", "(Lcom/veridas/logger/Logger$Tag;Ljava/lang/String;Landroid/os/Bundle;[Ljava/lang/Object;)V", "(Lcom/veridas/logger/Logger$Tag;Ljava/lang/String;[Ljava/lang/Object;)V", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;[Ljava/lang/Object;)V", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "startSession", "context", "Landroid/content/Context;", "Tag", "common-logger_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Logger {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Logger.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b5\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5¨\u00066"}, d2 = {"Lcom/veridas/logger/Logger$Tag;", "", "APP_VERSION", "CAMERA_ERROR", "CAMERA_FATAL_ERROR", "CAMERA_PERMISSION", "CAMERA_TAKE_PICTURE", "CAMERA_AUTOFOCUS", "CAPTURE_AVAILABLE_SIZES", "CAPTURE_RESIZED", "CLOSE", "CONFIGURATION", "CONTINUE", "DEVICE", "DOC_RECT", "DOCUMENT_CAPTURED", "DOCUMENT_CAPTURED_WITH_BUTTON", "DOCUMENT_DETECTED", "DOCUMENT_SMART_DETECTION", "ERROR", "ERROR_DOC", "ERROR_FACE", "ERROR_TIMEOUT", "FACE_CAPTURED", "FACE_DETECTED", "FACE_RECT", "FRAME_WITH_FLASH_SAVED", "FINISH_SDK", "FOCUS_ATTEMPT", "FPS", "ON_PAUSE", "ON_PREVIEW_FRAME", "ON_RESUME", "ORIENTATION", "OPEN_CAMERA", "PACKAGE_NAME", "PERMISSION", "PICTURE_BLURRINESS", "PICTURE_EXPOSURE", "PICTURE_HAS_FLASH", "PICTURE_HAS_CENTERED_FLASH", "PICTURE_WITH_FLASH_IS_A_FRAME", "PREVIEW_AVAILABLE_SIZES", "REPEAT", "RESTART_PROCESS_NOT_CORRECT_FLASH", "SDK_VERSION", "SMART_VIDEO", "SMILE", "START_SDK", "STOP_SDK", "TEMPLATE_DISTANCE", "TIME_WITHOUT_PHOTO_TAKEN", "USER_ID", "VERIFICATION_ID", "common-logger_release"}, k = 1, mv = {1, 9, 0})
    public static final class Tag {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Tag[] $VALUES;
        public static final Tag APP_VERSION;
        public static final Tag CAMERA_AUTOFOCUS;
        public static final Tag CAMERA_ERROR;
        public static final Tag CAMERA_FATAL_ERROR;
        public static final Tag CAMERA_PERMISSION;
        public static final Tag CAMERA_TAKE_PICTURE;
        public static final Tag CAPTURE_AVAILABLE_SIZES;
        public static final Tag CAPTURE_RESIZED;
        public static final Tag CLOSE;
        public static final Tag CONFIGURATION;
        public static final Tag CONTINUE;
        public static final Tag DEVICE;
        public static final Tag DOCUMENT_CAPTURED;
        public static final Tag DOCUMENT_CAPTURED_WITH_BUTTON;
        public static final Tag DOCUMENT_DETECTED;
        public static final Tag DOCUMENT_SMART_DETECTION;
        public static final Tag DOC_RECT;
        public static final Tag ERROR;
        public static final Tag ERROR_DOC;
        public static final Tag ERROR_FACE;
        public static final Tag ERROR_TIMEOUT;
        public static final Tag FACE_CAPTURED;
        public static final Tag FACE_DETECTED;
        public static final Tag FACE_RECT;
        public static final Tag FINISH_SDK;
        public static final Tag FOCUS_ATTEMPT;
        public static final Tag FPS;
        public static final Tag FRAME_WITH_FLASH_SAVED;
        public static final Tag ON_PAUSE;
        public static final Tag ON_PREVIEW_FRAME;
        public static final Tag ON_RESUME;
        public static final Tag OPEN_CAMERA;
        public static final Tag ORIENTATION;
        public static final Tag PACKAGE_NAME;
        public static final Tag PERMISSION;
        public static final Tag PICTURE_BLURRINESS;
        public static final Tag PICTURE_EXPOSURE;
        public static final Tag PICTURE_HAS_CENTERED_FLASH;
        public static final Tag PICTURE_HAS_FLASH;
        public static final Tag PICTURE_WITH_FLASH_IS_A_FRAME;
        public static final Tag PREVIEW_AVAILABLE_SIZES;
        public static final Tag REPEAT;
        public static final Tag RESTART_PROCESS_NOT_CORRECT_FLASH;
        public static final Tag SDK_VERSION;
        public static final Tag SMART_VIDEO;
        public static final Tag SMILE;
        public static final Tag START_SDK;
        public static final Tag STOP_SDK;
        public static final Tag TEMPLATE_DISTANCE;
        public static final Tag TIME_WITHOUT_PHOTO_TAKEN;
        public static final Tag USER_ID;
        public static final Tag VERIFICATION_ID;

        static {
            Tag tag = new Tag("APP_VERSION", 0);
            APP_VERSION = tag;
            Tag tag2 = new Tag("CAMERA_ERROR", 1);
            CAMERA_ERROR = tag2;
            Tag tag3 = new Tag("CAMERA_FATAL_ERROR", 2);
            CAMERA_FATAL_ERROR = tag3;
            Tag tag4 = new Tag("CAMERA_PERMISSION", 3);
            CAMERA_PERMISSION = tag4;
            Tag tag5 = new Tag("CAMERA_TAKE_PICTURE", 4);
            CAMERA_TAKE_PICTURE = tag5;
            Tag tag6 = new Tag("CAMERA_AUTOFOCUS", 5);
            CAMERA_AUTOFOCUS = tag6;
            Tag tag7 = new Tag("CAPTURE_AVAILABLE_SIZES", 6);
            CAPTURE_AVAILABLE_SIZES = tag7;
            Tag tag8 = new Tag("CAPTURE_RESIZED", 7);
            CAPTURE_RESIZED = tag8;
            Tag tag9 = new Tag("CLOSE", 8);
            CLOSE = tag9;
            Tag tag10 = new Tag("CONFIGURATION", 9);
            CONFIGURATION = tag10;
            Tag tag11 = new Tag("CONTINUE", 10);
            CONTINUE = tag11;
            Tag tag12 = new Tag("DEVICE", 11);
            DEVICE = tag12;
            Tag tag13 = new Tag("DOC_RECT", 12);
            DOC_RECT = tag13;
            Tag tag14 = new Tag("DOCUMENT_CAPTURED", 13);
            DOCUMENT_CAPTURED = tag14;
            Tag tag15 = new Tag("DOCUMENT_CAPTURED_WITH_BUTTON", 14);
            DOCUMENT_CAPTURED_WITH_BUTTON = tag15;
            Tag tag16 = new Tag("DOCUMENT_DETECTED", 15);
            DOCUMENT_DETECTED = tag16;
            Tag tag17 = new Tag("DOCUMENT_SMART_DETECTION", 16);
            DOCUMENT_SMART_DETECTION = tag17;
            Tag tag18 = new Tag("ERROR", 17);
            ERROR = tag18;
            Tag tag19 = new Tag("ERROR_DOC", 18);
            ERROR_DOC = tag19;
            Tag tag20 = new Tag("ERROR_FACE", 19);
            ERROR_FACE = tag20;
            Tag tag21 = new Tag("ERROR_TIMEOUT", 20);
            ERROR_TIMEOUT = tag21;
            Tag tag22 = new Tag("FACE_CAPTURED", 21);
            FACE_CAPTURED = tag22;
            Tag tag23 = new Tag("FACE_DETECTED", 22);
            FACE_DETECTED = tag23;
            Tag tag24 = new Tag("FACE_RECT", 23);
            FACE_RECT = tag24;
            Tag tag25 = new Tag("FRAME_WITH_FLASH_SAVED", 24);
            FRAME_WITH_FLASH_SAVED = tag25;
            Tag tag26 = new Tag("FINISH_SDK", 25);
            FINISH_SDK = tag26;
            Tag tag27 = new Tag("FOCUS_ATTEMPT", 26);
            FOCUS_ATTEMPT = tag27;
            Tag tag28 = new Tag("FPS", 27);
            FPS = tag28;
            Tag tag29 = new Tag("ON_PAUSE", 28);
            ON_PAUSE = tag29;
            Tag tag30 = new Tag("ON_PREVIEW_FRAME", 29);
            ON_PREVIEW_FRAME = tag30;
            Tag tag31 = new Tag("ON_RESUME", 30);
            ON_RESUME = tag31;
            Tag tag32 = new Tag("ORIENTATION", 31);
            ORIENTATION = tag32;
            Tag tag33 = new Tag("OPEN_CAMERA", 32);
            OPEN_CAMERA = tag33;
            Tag tag34 = new Tag("PACKAGE_NAME", 33);
            PACKAGE_NAME = tag34;
            Tag tag35 = new Tag("PERMISSION", 34);
            PERMISSION = tag35;
            Tag tag36 = new Tag("PICTURE_BLURRINESS", 35);
            PICTURE_BLURRINESS = tag36;
            Tag tag37 = new Tag("PICTURE_EXPOSURE", 36);
            PICTURE_EXPOSURE = tag37;
            Tag tag38 = new Tag("PICTURE_HAS_FLASH", 37);
            PICTURE_HAS_FLASH = tag38;
            Tag tag39 = new Tag("PICTURE_HAS_CENTERED_FLASH", 38);
            PICTURE_HAS_CENTERED_FLASH = tag39;
            Tag tag40 = new Tag("PICTURE_WITH_FLASH_IS_A_FRAME", 39);
            PICTURE_WITH_FLASH_IS_A_FRAME = tag40;
            Tag tag41 = new Tag("PREVIEW_AVAILABLE_SIZES", 40);
            PREVIEW_AVAILABLE_SIZES = tag41;
            Tag tag42 = new Tag("REPEAT", 41);
            REPEAT = tag42;
            Tag tag43 = new Tag("RESTART_PROCESS_NOT_CORRECT_FLASH", 42);
            RESTART_PROCESS_NOT_CORRECT_FLASH = tag43;
            Tag tag44 = new Tag("SDK_VERSION", 43);
            SDK_VERSION = tag44;
            Tag tag45 = new Tag("SMART_VIDEO", 44);
            SMART_VIDEO = tag45;
            Tag tag46 = new Tag("SMILE", 45);
            SMILE = tag46;
            Tag tag47 = new Tag("START_SDK", 46);
            START_SDK = tag47;
            Tag tag48 = new Tag("STOP_SDK", 47);
            STOP_SDK = tag48;
            Tag tag49 = new Tag("TEMPLATE_DISTANCE", 48);
            TEMPLATE_DISTANCE = tag49;
            Tag tag50 = new Tag("TIME_WITHOUT_PHOTO_TAKEN", 49);
            TIME_WITHOUT_PHOTO_TAKEN = tag50;
            Tag tag51 = new Tag("USER_ID", 50);
            USER_ID = tag51;
            Tag tag52 = new Tag("VERIFICATION_ID", 51);
            VERIFICATION_ID = tag52;
            Tag[] tagArr = {tag, tag2, tag3, tag4, tag5, tag6, tag7, tag8, tag9, tag10, tag11, tag12, tag13, tag14, tag15, tag16, tag17, tag18, tag19, tag20, tag21, tag22, tag23, tag24, tag25, tag26, tag27, tag28, tag29, tag30, tag31, tag32, tag33, tag34, tag35, tag36, tag37, tag38, tag39, tag40, tag41, tag42, tag43, tag44, tag45, tag46, tag47, tag48, tag49, tag50, tag51, tag52};
            $VALUES = tagArr;
            $ENTRIES = EnumEntriesKt.enumEntries(tagArr);
        }

        public Tag() {
            throw null;
        }

        @NotNull
        public static EnumEntries<Tag> getEntries() {
            return $ENTRIES;
        }

        public static Tag valueOf(String str) {
            return (Tag) Enum.valueOf(Tag.class, str);
        }

        public static Tag[] values() {
            return (Tag[]) $VALUES.clone();
        }
    }

    void endSession(boolean isSuccessful);

    void log(@NotNull Tag tag, @NotNull String message);

    void log(@NotNull Tag tag, @NotNull String message, @NotNull Bundle params);

    void log(@NotNull Tag tag, @NotNull String message, @NotNull Bundle params, @NotNull Object... args);

    void log(@NotNull Tag tag, @NotNull String message, @NotNull Object... args);

    void log(@NotNull String tag, @NotNull String message);

    void log(@NotNull String tag, @NotNull String message, @NotNull Bundle params);

    void log(@NotNull String tag, @NotNull String message, @NotNull Bundle params, @NotNull Object... args);

    void log(@NotNull String tag, @NotNull String message, @NotNull Object... args);

    void startSession(@NotNull Context context);
}
