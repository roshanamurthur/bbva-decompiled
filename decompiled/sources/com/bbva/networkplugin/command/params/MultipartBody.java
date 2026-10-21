package com.bbva.networkplugin.command.params;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MultipartBody.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/bbva/networkplugin/command/params/MultipartBody;", "", "", "a", "Ljava/lang/String;", "getMediaType", "()Ljava/lang/String;", "mediaType", "b", "getContent", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "network-plugin_release"}, k = 1, mv = {1, 8, 0})
public final class MultipartBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mediaType")
    @NotNull
    private final String mediaType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("content")
    @NotNull
    private final String content;

    public MultipartBody(@NotNull String mediaType, @NotNull String content) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(content, "content");
        this.mediaType = mediaType;
        this.content = content;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final String getMediaType() {
        return this.mediaType;
    }
}
