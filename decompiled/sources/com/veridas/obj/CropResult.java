package com.veridas.obj;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.veridas.graphics.Frame;
import com.veridas.math.geometry.Rectangle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CropResult.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB#\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/veridas/obj/CropResult;", "", "request", "Lcom/veridas/obj/CropRequest;", "crop", "Lcom/veridas/graphics/Frame;", "cropArea", "Lcom/veridas/math/geometry/Rectangle;", "(Lcom/veridas/obj/CropRequest;Lcom/veridas/graphics/Frame;Lcom/veridas/math/geometry/Rectangle;)V", "getCrop", "()Lcom/veridas/graphics/Frame;", "getCropArea", "()Lcom/veridas/math/geometry/Rectangle;", "getRequest", "()Lcom/veridas/obj/CropRequest;", "Builder", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CropResult {

    @Nullable
    private final Frame crop;

    @NotNull
    private final Rectangle cropArea;

    @NotNull
    private final CropRequest request;

    /* JADX INFO: compiled from: CropResult.kt */
    @Keep
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0015\u001a\u00020\u0016J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0007J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lcom/veridas/obj/CropResult$Builder;", "", "request", "Lcom/veridas/obj/CropRequest;", "crop", "Lcom/veridas/graphics/Frame;", "cropArea", "Lcom/veridas/math/geometry/Rectangle;", "(Lcom/veridas/obj/CropRequest;Lcom/veridas/graphics/Frame;Lcom/veridas/math/geometry/Rectangle;)V", "getCrop", "()Lcom/veridas/graphics/Frame;", "setCrop", "(Lcom/veridas/graphics/Frame;)V", "getCropArea", "()Lcom/veridas/math/geometry/Rectangle;", "setCropArea", "(Lcom/veridas/math/geometry/Rectangle;)V", "getRequest", "()Lcom/veridas/obj/CropRequest;", "setRequest", "(Lcom/veridas/obj/CropRequest;)V", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/veridas/obj/CropResult;", "component1", "component2", "component3", "copy", "value", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Builder {

        @Nullable
        private Frame crop;

        @Nullable
        private Rectangle cropArea;

        @Nullable
        private CropRequest request;

        public Builder() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ Builder copy$default(Builder builder, CropRequest cropRequest, Frame frame, Rectangle rectangle, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cropRequest = builder.request;
            }
            if ((i10 & 2) != 0) {
                frame = builder.crop;
            }
            if ((i10 & 4) != 0) {
                rectangle = builder.cropArea;
            }
            return builder.copy(cropRequest, frame, rectangle);
        }

        @NotNull
        public final CropResult build() {
            Rectangle rectangle = this.cropArea;
            if (rectangle == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            CropRequest cropRequest = this.request;
            if (cropRequest != null) {
                return new CropResult(cropRequest, this.crop, rectangle, null);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CropRequest getRequest() {
            return this.request;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Frame getCrop() {
            return this.crop;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Rectangle getCropArea() {
            return this.cropArea;
        }

        @NotNull
        public final Builder copy(@Nullable CropRequest request, @Nullable Frame crop, @Nullable Rectangle cropArea) {
            return new Builder(request, crop, cropArea);
        }

        @NotNull
        public final Builder crop(@NotNull Frame value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.crop = value;
            return this;
        }

        @NotNull
        public final Builder cropArea(@NotNull Rectangle value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.cropArea = value;
            return this;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return Intrinsics.areEqual(this.request, builder.request) && Intrinsics.areEqual(this.crop, builder.crop) && Intrinsics.areEqual(this.cropArea, builder.cropArea);
        }

        @Nullable
        public final Frame getCrop() {
            return this.crop;
        }

        @Nullable
        public final Rectangle getCropArea() {
            return this.cropArea;
        }

        @Nullable
        public final CropRequest getRequest() {
            return this.request;
        }

        public int hashCode() {
            CropRequest cropRequest = this.request;
            int iHashCode = (cropRequest == null ? 0 : cropRequest.hashCode()) * 31;
            Frame frame = this.crop;
            int iHashCode2 = (iHashCode + (frame == null ? 0 : frame.hashCode())) * 31;
            Rectangle rectangle = this.cropArea;
            return iHashCode2 + (rectangle != null ? rectangle.hashCode() : 0);
        }

        @NotNull
        public final Builder request(@NotNull CropRequest value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.request = value;
            return this;
        }

        public final void setCrop(@Nullable Frame frame) {
            this.crop = frame;
        }

        public final void setCropArea(@Nullable Rectangle rectangle) {
            this.cropArea = rectangle;
        }

        public final void setRequest(@Nullable CropRequest cropRequest) {
            this.request = cropRequest;
        }

        @NotNull
        public String toString() {
            return "Builder(request=" + this.request + ", crop=" + this.crop + ", cropArea=" + this.cropArea + ")";
        }

        public Builder(@Nullable CropRequest cropRequest, @Nullable Frame frame, @Nullable Rectangle rectangle) {
            this.request = cropRequest;
            this.crop = frame;
            this.cropArea = rectangle;
        }

        public /* synthetic */ Builder(CropRequest cropRequest, Frame frame, Rectangle rectangle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : cropRequest, (i10 & 2) != 0 ? null : frame, (i10 & 4) != 0 ? null : rectangle);
        }
    }

    public /* synthetic */ CropResult(CropRequest cropRequest, Frame frame, Rectangle rectangle, DefaultConstructorMarker defaultConstructorMarker) {
        this(cropRequest, frame, rectangle);
    }

    @Nullable
    public final Frame getCrop() {
        return this.crop;
    }

    @NotNull
    public final Rectangle getCropArea() {
        return this.cropArea;
    }

    @NotNull
    public final CropRequest getRequest() {
        return this.request;
    }

    private CropResult(CropRequest cropRequest, Frame frame, Rectangle rectangle) {
        this.request = cropRequest;
        this.crop = frame;
        this.cropArea = rectangle;
    }

    public /* synthetic */ CropResult(CropRequest cropRequest, Frame frame, Rectangle rectangle, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cropRequest, (i10 & 2) != 0 ? null : frame, rectangle);
    }
}
