package com.veridas.obj;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.veridas.graphics.Frame;
import com.veridas.math.geometry.Rectangle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CropRequest.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB/\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/veridas/obj/CropRequest;", "", TypedValues.AttributesType.S_FRAME, "Lcom/veridas/graphics/Frame;", "detectedObject", "Lcom/veridas/math/geometry/Rectangle;", "referenceObject", "viewport", "(Lcom/veridas/graphics/Frame;Lcom/veridas/math/geometry/Rectangle;Lcom/veridas/math/geometry/Rectangle;Lcom/veridas/math/geometry/Rectangle;)V", "getDetectedObject", "()Lcom/veridas/math/geometry/Rectangle;", "getFrame", "()Lcom/veridas/graphics/Frame;", "getReferenceObject", "getViewport", "Builder", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CropRequest {

    @NotNull
    private final Rectangle detectedObject;

    @NotNull
    private final Frame frame;

    @Nullable
    private final Rectangle referenceObject;

    @Nullable
    private final Rectangle viewport;

    /* JADX INFO: compiled from: CropRequest.kt */
    @Keep
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u0006\u0010\u0015\u001a\u00020\u0016J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0003J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0005J\t\u0010 \u001a\u00020!HÖ\u0001J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0003R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006$"}, d2 = {"Lcom/veridas/obj/CropRequest$Builder;", "", "detectedObject", "Lcom/veridas/math/geometry/Rectangle;", TypedValues.AttributesType.S_FRAME, "Lcom/veridas/graphics/Frame;", "referenceObject", "viewport", "(Lcom/veridas/math/geometry/Rectangle;Lcom/veridas/graphics/Frame;Lcom/veridas/math/geometry/Rectangle;Lcom/veridas/math/geometry/Rectangle;)V", "getDetectedObject", "()Lcom/veridas/math/geometry/Rectangle;", "setDetectedObject", "(Lcom/veridas/math/geometry/Rectangle;)V", "getFrame", "()Lcom/veridas/graphics/Frame;", "setFrame", "(Lcom/veridas/graphics/Frame;)V", "getReferenceObject", "setReferenceObject", "getViewport", "setViewport", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/veridas/obj/CropRequest;", "component1", "component2", "component3", "component4", "copy", "value", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Builder {

        @Nullable
        private Rectangle detectedObject;

        @Nullable
        private Frame frame;

        @Nullable
        private Rectangle referenceObject;

        @Nullable
        private Rectangle viewport;

        public Builder() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ Builder copy$default(Builder builder, Rectangle rectangle, Frame frame, Rectangle rectangle2, Rectangle rectangle3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                rectangle = builder.detectedObject;
            }
            if ((i10 & 2) != 0) {
                frame = builder.frame;
            }
            if ((i10 & 4) != 0) {
                rectangle2 = builder.referenceObject;
            }
            if ((i10 & 8) != 0) {
                rectangle3 = builder.viewport;
            }
            return builder.copy(rectangle, frame, rectangle2, rectangle3);
        }

        @NotNull
        public final CropRequest build() {
            Rectangle rectangle = this.detectedObject;
            if (rectangle == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Frame frame = this.frame;
            if (frame != null) {
                return new CropRequest(frame, rectangle, this.referenceObject, this.viewport, null);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Rectangle getDetectedObject() {
            return this.detectedObject;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Frame getFrame() {
            return this.frame;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Rectangle getReferenceObject() {
            return this.referenceObject;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Rectangle getViewport() {
            return this.viewport;
        }

        @NotNull
        public final Builder copy(@Nullable Rectangle detectedObject, @Nullable Frame frame, @Nullable Rectangle referenceObject, @Nullable Rectangle viewport) {
            return new Builder(detectedObject, frame, referenceObject, viewport);
        }

        @NotNull
        public final Builder detectedObject(@NotNull Rectangle value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.detectedObject = value;
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
            return Intrinsics.areEqual(this.detectedObject, builder.detectedObject) && Intrinsics.areEqual(this.frame, builder.frame) && Intrinsics.areEqual(this.referenceObject, builder.referenceObject) && Intrinsics.areEqual(this.viewport, builder.viewport);
        }

        @NotNull
        public final Builder frame(@NotNull Frame value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.frame = value;
            return this;
        }

        @Nullable
        public final Rectangle getDetectedObject() {
            return this.detectedObject;
        }

        @Nullable
        public final Frame getFrame() {
            return this.frame;
        }

        @Nullable
        public final Rectangle getReferenceObject() {
            return this.referenceObject;
        }

        @Nullable
        public final Rectangle getViewport() {
            return this.viewport;
        }

        public int hashCode() {
            Rectangle rectangle = this.detectedObject;
            int iHashCode = (rectangle == null ? 0 : rectangle.hashCode()) * 31;
            Frame frame = this.frame;
            int iHashCode2 = (iHashCode + (frame == null ? 0 : frame.hashCode())) * 31;
            Rectangle rectangle2 = this.referenceObject;
            int iHashCode3 = (iHashCode2 + (rectangle2 == null ? 0 : rectangle2.hashCode())) * 31;
            Rectangle rectangle3 = this.viewport;
            return iHashCode3 + (rectangle3 != null ? rectangle3.hashCode() : 0);
        }

        @NotNull
        public final Builder referenceObject(@NotNull Rectangle value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.referenceObject = value;
            return this;
        }

        public final void setDetectedObject(@Nullable Rectangle rectangle) {
            this.detectedObject = rectangle;
        }

        public final void setFrame(@Nullable Frame frame) {
            this.frame = frame;
        }

        public final void setReferenceObject(@Nullable Rectangle rectangle) {
            this.referenceObject = rectangle;
        }

        public final void setViewport(@Nullable Rectangle rectangle) {
            this.viewport = rectangle;
        }

        @NotNull
        public String toString() {
            return "Builder(detectedObject=" + this.detectedObject + ", frame=" + this.frame + ", referenceObject=" + this.referenceObject + ", viewport=" + this.viewport + ")";
        }

        @NotNull
        public final Builder viewport(@NotNull Rectangle value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.viewport = value;
            return this;
        }

        public Builder(@Nullable Rectangle rectangle, @Nullable Frame frame, @Nullable Rectangle rectangle2, @Nullable Rectangle rectangle3) {
            this.detectedObject = rectangle;
            this.frame = frame;
            this.referenceObject = rectangle2;
            this.viewport = rectangle3;
        }

        public /* synthetic */ Builder(Rectangle rectangle, Frame frame, Rectangle rectangle2, Rectangle rectangle3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : rectangle, (i10 & 2) != 0 ? null : frame, (i10 & 4) != 0 ? null : rectangle2, (i10 & 8) != 0 ? null : rectangle3);
        }
    }

    public /* synthetic */ CropRequest(Frame frame, Rectangle rectangle, Rectangle rectangle2, Rectangle rectangle3, DefaultConstructorMarker defaultConstructorMarker) {
        this(frame, rectangle, rectangle2, rectangle3);
    }

    @NotNull
    public final Rectangle getDetectedObject() {
        return this.detectedObject;
    }

    @NotNull
    public final Frame getFrame() {
        return this.frame;
    }

    @Nullable
    public final Rectangle getReferenceObject() {
        return this.referenceObject;
    }

    @Nullable
    public final Rectangle getViewport() {
        return this.viewport;
    }

    private CropRequest(Frame frame, Rectangle rectangle, Rectangle rectangle2, Rectangle rectangle3) {
        this.frame = frame;
        this.detectedObject = rectangle;
        this.referenceObject = rectangle2;
        this.viewport = rectangle3;
    }

    public /* synthetic */ CropRequest(Frame frame, Rectangle rectangle, Rectangle rectangle2, Rectangle rectangle3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(frame, rectangle, (i10 & 4) != 0 ? null : rectangle2, (i10 & 8) != 0 ? null : rectangle3);
    }
}
