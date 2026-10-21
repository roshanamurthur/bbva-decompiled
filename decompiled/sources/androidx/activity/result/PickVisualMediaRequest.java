package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContracts;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PickVisualMediaRequest.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0000¢\u0006\u0004\b\u000b\u0010\fR*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Landroidx/activity/result/PickVisualMediaRequest;", "", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "<set-?>", "a", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "getMediaType", "()Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "setMediaType$activity_release", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;)V", "mediaType", "<init>", "()V", "Builder", "activity_release"}, k = 1, mv = {1, 8, 0})
public final class PickVisualMediaRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;

    /* JADX INFO: compiled from: PickVisualMediaRequest.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\t"}, d2 = {"Landroidx/activity/result/PickVisualMediaRequest$Builder;", "", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "mediaType", "setMediaType", "Landroidx/activity/result/PickVisualMediaRequest;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public ActivityResultContracts.PickVisualMedia.VisualMediaType f498a = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;

        @NotNull
        public final PickVisualMediaRequest build() {
            PickVisualMediaRequest pickVisualMediaRequest = new PickVisualMediaRequest();
            pickVisualMediaRequest.setMediaType$activity_release(this.f498a);
            return pickVisualMediaRequest;
        }

        @NotNull
        public final Builder setMediaType(@NotNull ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType) {
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            this.f498a = mediaType;
            return this;
        }
    }

    @NotNull
    public final ActivityResultContracts.PickVisualMedia.VisualMediaType getMediaType() {
        return this.mediaType;
    }

    public final void setMediaType$activity_release(@NotNull ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType) {
        Intrinsics.checkNotNullParameter(visualMediaType, "<set-?>");
        this.mediaType = visualMediaType;
    }
}
