package com.bbva.selfiecapture.plugin.command.params.response;

import ad.d;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.compat.u;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SelfieCaptureResponse.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/selfiecapture/plugin/command/params/response/SelfieCaptureResult;", "", "<init>", "()V", "CachedCapturedImage", "CachedCapturedVideo", "Lcom/bbva/selfiecapture/plugin/command/params/response/SelfieCaptureResult$CachedCapturedImage;", "Lcom/bbva/selfiecapture/plugin/command/params/response/SelfieCaptureResult$CachedCapturedVideo;", "selfie-capture-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SelfieCaptureResult {

    /* JADX INFO: compiled from: SelfieCaptureResponse.kt */
    @Keep
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/bbva/selfiecapture/plugin/command/params/response/SelfieCaptureResult$CachedCapturedImage;", "Lcom/bbva/selfiecapture/plugin/command/params/response/SelfieCaptureResult;", "id", "", "content", "", "<init>", "(Ljava/lang/String;[B)V", "getId", "()Ljava/lang/String;", "getContent", "()[B", "component1", "component2", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "selfie-capture-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CachedCapturedImage extends SelfieCaptureResult {

        @NotNull
        private final byte[] content;

        @NotNull
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CachedCapturedImage(@NotNull String id, @NotNull byte[] content) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(content, "content");
            this.id = id;
            this.content = content;
        }

        public static /* synthetic */ CachedCapturedImage copy$default(CachedCapturedImage cachedCapturedImage, String str, byte[] bArr, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = cachedCapturedImage.id;
            }
            if ((i10 & 2) != 0) {
                bArr = cachedCapturedImage.content;
            }
            return cachedCapturedImage.copy(str, bArr);
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
        public final CachedCapturedImage copy(@NotNull String id, @NotNull byte[] content) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(content, "content");
            return new CachedCapturedImage(id, content);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CachedCapturedImage)) {
                return false;
            }
            CachedCapturedImage cachedCapturedImage = (CachedCapturedImage) other;
            return Intrinsics.areEqual(this.id, cachedCapturedImage.id) && Intrinsics.areEqual(this.content, cachedCapturedImage.content);
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
            return u.g("CachedCapturedImage(id=", this.id, ", content=", Arrays.toString(this.content), ")");
        }
    }

    /* JADX INFO: compiled from: SelfieCaptureResponse.kt */
    @Keep
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/bbva/selfiecapture/plugin/command/params/response/SelfieCaptureResult$CachedCapturedVideo;", "Lcom/bbva/selfiecapture/plugin/command/params/response/SelfieCaptureResult;", "id", "", "content", "", ClientData.KEY_CHALLENGE, "<init>", "(Ljava/lang/String;[BLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getContent", "()[B", "getChallenge", "component1", "component2", "component3", "copy", "equals", "", "other", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "selfie-capture-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CachedCapturedVideo extends SelfieCaptureResult {

        @NotNull
        private final String challenge;

        @NotNull
        private final byte[] content;

        @NotNull
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CachedCapturedVideo(@NotNull String id, @NotNull byte[] content, @NotNull String challenge) {
            super(null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            this.id = id;
            this.content = content;
            this.challenge = challenge;
        }

        public static /* synthetic */ CachedCapturedVideo copy$default(CachedCapturedVideo cachedCapturedVideo, String str, byte[] bArr, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = cachedCapturedVideo.id;
            }
            if ((i10 & 2) != 0) {
                bArr = cachedCapturedVideo.content;
            }
            if ((i10 & 4) != 0) {
                str2 = cachedCapturedVideo.challenge;
            }
            return cachedCapturedVideo.copy(str, bArr, str2);
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
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getChallenge() {
            return this.challenge;
        }

        @NotNull
        public final CachedCapturedVideo copy(@NotNull String id, @NotNull byte[] content, @NotNull String challenge) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            return new CachedCapturedVideo(id, content, challenge);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CachedCapturedVideo)) {
                return false;
            }
            CachedCapturedVideo cachedCapturedVideo = (CachedCapturedVideo) other;
            return Intrinsics.areEqual(this.id, cachedCapturedVideo.id) && Intrinsics.areEqual(this.content, cachedCapturedVideo.content) && Intrinsics.areEqual(this.challenge, cachedCapturedVideo.challenge);
        }

        @NotNull
        public final String getChallenge() {
            return this.challenge;
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
            return this.challenge.hashCode() + ((Arrays.hashCode(this.content) + (this.id.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String string = Arrays.toString(this.content);
            return d.f(a.c("CachedCapturedVideo(id=", str, ", content=", string, ", challenge="), this.challenge, ")");
        }
    }

    private SelfieCaptureResult() {
    }

    public /* synthetic */ SelfieCaptureResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
