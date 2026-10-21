package com.bbva.plugin.media.capture.model;

import com.bbva.plugin.media.capture.util.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MediaSource.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/bbva/plugin/media/capture/model/MediaSource;", "", "", "fileName", "Ljava/lang/String;", "getFileName", "()Ljava/lang/String;", "directory", "getDirectory", "Image", "Audio", "Video", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
public enum MediaSource {
    Image(Constants.PHOTO_FILE_NAME, "temp/Pictures"),
    Audio(Constants.AUDIO_FILE_NAME, "temp/Audio"),
    Video(Constants.VIDEO_FILE_NAME, "temp/Video");


    @NotNull
    private final String directory;

    @NotNull
    private final String fileName;

    MediaSource(String str, String str2) {
        this.fileName = str;
        this.directory = str2;
    }

    @NotNull
    public final String getDirectory() {
        return this.directory;
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }
}
