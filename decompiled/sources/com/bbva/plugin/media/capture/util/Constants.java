package com.bbva.plugin.media.capture.util;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Constants.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/bbva/plugin/media/capture/util/Constants;", "", "", "MOUNTED", "Ljava/lang/String;", "TEMP_FOLDER", "AUDIO_EXTENSION", "VIDEO_EXTENSION", "PHOTO_EXTENSION", "AUDIO_FILE_NAME", "VIDEO_FILE_NAME", "PHOTO_FILE_NAME", "CAMERA_SRC", "GALLERY_SRC", "KNOWN_SIDE_SCALE", "MAX_IMAGE_WEIGHT_SCALE", "NO_SCALE", "INTENT_TYPE", "", "a", "Ljava/util/List;", "getSupportedScaleTypes", "()Ljava/util/List;", "supportedScaleTypes", "b", "getSupportedSources", "supportedSources", "<init>", "()V", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class Constants {

    @NotNull
    public static final String AUDIO_EXTENSION = ".mp3";

    @NotNull
    public static final String AUDIO_FILE_NAME = "audio_temp_file_%s.mp3";

    @NotNull
    public static final String INTENT_TYPE = "image/*";

    @NotNull
    public static final String MOUNTED = "mounted";

    @NotNull
    public static final String NO_SCALE = "none";

    @NotNull
    public static final String PHOTO_EXTENSION = ".jpg";

    @NotNull
    public static final String PHOTO_FILE_NAME = "photo_temp_file_%s.jpg";

    @NotNull
    public static final String TEMP_FOLDER = "temp";

    @NotNull
    public static final String VIDEO_EXTENSION = ".mp4";

    @NotNull
    public static final String VIDEO_FILE_NAME = "video_temp_file_%s.mp4";

    @NotNull
    public static final Constants INSTANCE = new Constants();

    @NotNull
    public static final String KNOWN_SIDE_SCALE = "knownSide";

    @NotNull
    public static final String MAX_IMAGE_WEIGHT_SCALE = "maxWeight";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final List<String> supportedScaleTypes = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{KNOWN_SIDE_SCALE, MAX_IMAGE_WEIGHT_SCALE, "none"});

    @NotNull
    public static final String CAMERA_SRC = "camera";

    @NotNull
    public static final String GALLERY_SRC = "gallery";

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final List<String> supportedSources = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{CAMERA_SRC, GALLERY_SRC});

    @NotNull
    public final List<String> getSupportedScaleTypes() {
        return supportedScaleTypes;
    }

    @NotNull
    public final List<String> getSupportedSources() {
        return supportedSources;
    }
}
