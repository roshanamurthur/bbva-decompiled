package com.bbva.videocapture.command.params.response;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VideoCaptureResponse.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/bbva/videocapture/command/params/response/CachedCapturedVideo;", "", "id", "", "content", "", "<init>", "(Ljava/lang/String;[B)V", "getId", "()Ljava/lang/String;", "getContent", "()[B", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "video-capture-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CachedCapturedVideo {

    @NotNull
    private final byte[] content;

    @NotNull
    private final String id;

    public CachedCapturedVideo(@NotNull String id, @NotNull byte[] content) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(content, "content");
        this.id = id;
        this.content = content;
    }

    public static /* synthetic */ CachedCapturedVideo copy$default(CachedCapturedVideo cachedCapturedVideo, String str, byte[] bArr, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cachedCapturedVideo.id;
        }
        if ((i10 & 2) != 0) {
            bArr = cachedCapturedVideo.content;
        }
        return cachedCapturedVideo.copy(str, bArr);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte[] getContent() {
        return this.content;
    }

    @NotNull
    public final CachedCapturedVideo copy(@NotNull String id, @NotNull byte[] content) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(content, "content");
        return new CachedCapturedVideo(id, content);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CachedCapturedVideo)) {
            return false;
        }
        CachedCapturedVideo cachedCapturedVideo = (CachedCapturedVideo) other;
        return Intrinsics.areEqual(this.id, cachedCapturedVideo.id) && Intrinsics.areEqual(this.content, cachedCapturedVideo.content);
    }

    @NotNull
    public final byte[] getContent() {
        return this.content;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return Arrays.hashCode(this.content) + (this.id.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return u.g("CachedCapturedVideo(id=", this.id, ", content=", Arrays.toString(this.content), ")");
    }
}
