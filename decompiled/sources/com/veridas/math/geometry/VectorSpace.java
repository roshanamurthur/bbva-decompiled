package com.veridas.math.geometry;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.UUIDPreferences;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VectorSpace.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0003&'(B1\b\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b$\u0010%J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0019\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\u0002J\u001e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010J&\u0010\u0012\u001a\u00060\u0013j\u0002`\u00142\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000f2\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014R\u0017\u0010\u0016\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006)"}, d2 = {"Lcom/veridas/math/geometry/VectorSpace;", "", "", FirebaseAnalytics.Param.INDEX, "Lcom/veridas/math/geometry/Matrix;", "get", "from", TypedValues.TransitionType.S_TO, "frameSpace", "viewfinderSpace", "viewportSpace", "referenceObjectSpace", "firstIndex", "lastIndex", "size", "Lcom/veridas/math/geometry/VectorSpace$Type;", "Lcom/veridas/math/geometry/Rectangle;", "rectangle", "translate", "Lcom/veridas/math/geometry/Vector2;", "Lcom/veridas/math/geometry/Point;", "point", TypedValues.AttributesType.S_FRAME, "Lcom/veridas/math/geometry/Rectangle;", "getFrame", "()Lcom/veridas/math/geometry/Rectangle;", "viewfinder", "getViewfinder", "viewport", "getViewport", "referenceObject", "getReferenceObject", "", "Lcom/veridas/math/geometry/VectorSpace$a;", "spaces", "Ljava/util/List;", "<init>", "(Lcom/veridas/math/geometry/Rectangle;Lcom/veridas/math/geometry/Rectangle;Lcom/veridas/math/geometry/Rectangle;Lcom/veridas/math/geometry/Rectangle;)V", "Builder", "a", UUIDPreferences.TYPE_KEY, "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class VectorSpace {

    @NotNull
    private final Rectangle frame;

    @Nullable
    private final Rectangle referenceObject;

    @NotNull
    private final List<a> spaces;

    @NotNull
    private final Rectangle viewfinder;

    @Nullable
    private final Rectangle viewport;

    /* JADX INFO: compiled from: VectorSpace.kt */
    @Keep
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0006\u0010\b\u001a\u00020\tJ\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÂ\u0003J9\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0003J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0003R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/veridas/math/geometry/VectorSpace$Builder;", "", TypedValues.AttributesType.S_FRAME, "Lcom/veridas/math/geometry/Rectangle;", "viewfinder", "viewport", "referenceObject", "(Lcom/veridas/math/geometry/Rectangle;Lcom/veridas/math/geometry/Rectangle;Lcom/veridas/math/geometry/Rectangle;Lcom/veridas/math/geometry/Rectangle;)V", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/veridas/math/geometry/VectorSpace;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "value", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Builder {

        @Nullable
        private Rectangle frame;

        @Nullable
        private Rectangle referenceObject;

        @Nullable
        private Rectangle viewfinder;

        @Nullable
        private Rectangle viewport;

        public Builder() {
            this(null, null, null, null, 15, null);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        private final Rectangle getFrame() {
            return this.frame;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        private final Rectangle getViewfinder() {
            return this.viewfinder;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        private final Rectangle getViewport() {
            return this.viewport;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        private final Rectangle getReferenceObject() {
            return this.referenceObject;
        }

        public static /* synthetic */ Builder copy$default(Builder builder, Rectangle rectangle, Rectangle rectangle2, Rectangle rectangle3, Rectangle rectangle4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                rectangle = builder.frame;
            }
            if ((i10 & 2) != 0) {
                rectangle2 = builder.viewfinder;
            }
            if ((i10 & 4) != 0) {
                rectangle3 = builder.viewport;
            }
            if ((i10 & 8) != 0) {
                rectangle4 = builder.referenceObject;
            }
            return builder.copy(rectangle, rectangle2, rectangle3, rectangle4);
        }

        @NotNull
        public final VectorSpace build() {
            Rectangle rectangle = this.frame;
            if (rectangle == null) {
                throw new IllegalArgumentException("Frame is required".toString());
            }
            Rectangle rectangle2 = this.viewfinder;
            if (rectangle2 == null) {
                throw new IllegalArgumentException("viewfinder is required".toString());
            }
            return new VectorSpace(rectangle, rectangle2, this.viewport, this.referenceObject, null);
        }

        @NotNull
        public final Builder copy(@Nullable Rectangle frame, @Nullable Rectangle viewfinder, @Nullable Rectangle viewport, @Nullable Rectangle referenceObject) {
            return new Builder(frame, viewfinder, viewport, referenceObject);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) other;
            return Intrinsics.areEqual(this.frame, builder.frame) && Intrinsics.areEqual(this.viewfinder, builder.viewfinder) && Intrinsics.areEqual(this.viewport, builder.viewport) && Intrinsics.areEqual(this.referenceObject, builder.referenceObject);
        }

        @NotNull
        public final Builder frame(@NotNull Rectangle value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.frame = value;
            return this;
        }

        public int hashCode() {
            Rectangle rectangle = this.frame;
            int iHashCode = (rectangle == null ? 0 : rectangle.hashCode()) * 31;
            Rectangle rectangle2 = this.viewfinder;
            int iHashCode2 = (iHashCode + (rectangle2 == null ? 0 : rectangle2.hashCode())) * 31;
            Rectangle rectangle3 = this.viewport;
            int iHashCode3 = (iHashCode2 + (rectangle3 == null ? 0 : rectangle3.hashCode())) * 31;
            Rectangle rectangle4 = this.referenceObject;
            return iHashCode3 + (rectangle4 != null ? rectangle4.hashCode() : 0);
        }

        @NotNull
        public final Builder referenceObject(@NotNull Rectangle value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.referenceObject = value;
            return this;
        }

        @NotNull
        public String toString() {
            return "Builder(frame=" + this.frame + ", viewfinder=" + this.viewfinder + ", viewport=" + this.viewport + ", referenceObject=" + this.referenceObject + ")";
        }

        @NotNull
        public final Builder viewfinder(@NotNull Rectangle value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.viewfinder = value;
            return this;
        }

        @NotNull
        public final Builder viewport(@NotNull Rectangle value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.viewport = value;
            return this;
        }

        public Builder(@Nullable Rectangle rectangle, @Nullable Rectangle rectangle2, @Nullable Rectangle rectangle3, @Nullable Rectangle rectangle4) {
            this.frame = rectangle;
            this.viewfinder = rectangle2;
            this.viewport = rectangle3;
            this.referenceObject = rectangle4;
        }

        public /* synthetic */ Builder(Rectangle rectangle, Rectangle rectangle2, Rectangle rectangle3, Rectangle rectangle4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : rectangle, (i10 & 2) != 0 ? null : rectangle2, (i10 & 4) != 0 ? null : rectangle3, (i10 & 8) != 0 ? null : rectangle4);
        }
    }

    /* JADX INFO: compiled from: VectorSpace.kt */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/veridas/math/geometry/VectorSpace$Type;", "", "(Ljava/lang/String;I)V", "FRAME", "VIEWFINDER", "VIEWPORT", "REFERENCE_OBJECT", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum Type {
        FRAME,
        VIEWFINDER,
        VIEWPORT,
        REFERENCE_OBJECT;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: VectorSpace.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Rectangle f67229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Matrix f67230b;

        public a(@NotNull Rectangle rectangle, double d2) {
            Intrinsics.checkNotNullParameter(rectangle, "rectangle");
            this.f67229a = rectangle;
            Matrix identity = MatrixKt.getIDENTITY();
            Matrix.Companion companion = Matrix.INSTANCE;
            Matrix matrixTimes = identity.times(companion.translate(rectangle.getPosition())).times(companion.scale(d2));
            this.f67230b = matrixTimes;
            matrixTimes.inverse();
        }
    }

    public /* synthetic */ VectorSpace(Rectangle rectangle, Rectangle rectangle2, Rectangle rectangle3, Rectangle rectangle4, DefaultConstructorMarker defaultConstructorMarker) {
        this(rectangle, rectangle2, rectangle3, rectangle4);
    }

    public final int firstIndex() {
        return 0;
    }

    @NotNull
    public final Matrix frameSpace() {
        return get(0);
    }

    @NotNull
    public final Matrix get(int index) {
        int iFirstIndex = firstIndex();
        int iLastIndex = lastIndex();
        if (iFirstIndex > index || index > iLastIndex) {
            throw new IllegalArgumentException(n1.e("Index must be larger than or equal to ", iFirstIndex, " and less than or equal to ", iLastIndex).toString());
        }
        return get(index, firstIndex());
    }

    @NotNull
    public final Rectangle getFrame() {
        return this.frame;
    }

    @Nullable
    public final Rectangle getReferenceObject() {
        return this.referenceObject;
    }

    @NotNull
    public final Rectangle getViewfinder() {
        return this.viewfinder;
    }

    @Nullable
    public final Rectangle getViewport() {
        return this.viewport;
    }

    public final int lastIndex() {
        return size() - 1;
    }

    @NotNull
    public final Matrix referenceObjectSpace() {
        return get(3, 0);
    }

    public final int size() {
        return this.spaces.size();
    }

    @NotNull
    public final Rectangle translate(@NotNull Type from, @NotNull Type to, @NotNull Rectangle rectangle) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        Intrinsics.checkNotNullParameter(rectangle, "rectangle");
        return rectangle.times(get(to.ordinal(), from.ordinal()));
    }

    @NotNull
    public final Matrix viewfinderSpace() {
        return get(1, 0);
    }

    @NotNull
    public final Matrix viewportSpace() {
        return get(2, 0);
    }

    private VectorSpace(Rectangle rectangle, Rectangle rectangle2, Rectangle rectangle3, Rectangle rectangle4) {
        this.frame = rectangle;
        this.viewfinder = rectangle2;
        this.viewport = rectangle3;
        this.referenceObject = rectangle4;
        double dFit = Rectangle.INSTANCE.fit(rectangle2, rectangle);
        Vector2 vector2Div = rectangle.getDimensions().minus(rectangle2.getDimensions().times(dFit)).div(2);
        ArrayList arrayList = new ArrayList();
        Vector2.Companion companion = Vector2.INSTANCE;
        arrayList.add(new a(new Rectangle(companion.getZERO(), rectangle.getDimensions()), 1.0d));
        arrayList.add(new a(new Rectangle(vector2Div, rectangle2.getDimensions()), dFit));
        if (rectangle3 != null) {
            arrayList.add(new a(rectangle3, 1.0d));
        } else {
            arrayList.add(new a(new Rectangle(companion.getZERO(), ((a) CollectionsKt___CollectionsKt.last((List) arrayList)).f67229a.getDimensions()), 1.0d));
        }
        if (rectangle4 != null) {
            arrayList.add(new a(rectangle4, 1.0d));
        } else {
            arrayList.add(new a(new Rectangle(companion.getZERO(), ((a) CollectionsKt___CollectionsKt.last((List) arrayList)).f67229a.getDimensions()), 1.0d));
        }
        this.spaces = CollectionsKt___CollectionsKt.toList(arrayList);
    }

    @NotNull
    public final Vector2 translate(@NotNull Type from, @NotNull Type to, @NotNull Vector2 point) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        Intrinsics.checkNotNullParameter(point, "point");
        return point.times(get(from.ordinal(), to.ordinal()));
    }

    @NotNull
    public final Matrix get(int from, int to) {
        int iFirstIndex = firstIndex();
        Matrix identity = MatrixKt.getIDENTITY();
        int iLastIndex = lastIndex();
        if (iFirstIndex > from || from > iLastIndex) {
            throw new IllegalArgumentException(n1.e("The from argument must be larger than or equal to ", iFirstIndex, " and less than or equal to ", iLastIndex).toString());
        }
        if (iFirstIndex > to || to > iLastIndex) {
            throw new IllegalArgumentException(n1.e("The to argument  must be larger than or equal to ", iFirstIndex, " and less than or equal to ", iLastIndex).toString());
        }
        if (from == to) {
            return identity.times(this.spaces.get(from).f67230b);
        }
        if (to > from) {
            return identity;
        }
        while (true) {
            identity = identity.times(this.spaces.get(to).f67230b);
            if (to == from) {
                return identity;
            }
            to++;
        }
    }

    public /* synthetic */ VectorSpace(Rectangle rectangle, Rectangle rectangle2, Rectangle rectangle3, Rectangle rectangle4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(rectangle, rectangle2, (i10 & 4) != 0 ? null : rectangle3, (i10 & 8) != 0 ? null : rectangle4);
    }
}
