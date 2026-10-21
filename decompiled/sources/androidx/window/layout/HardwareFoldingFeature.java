package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.core.Bounds;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.UUIDPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HardwareFoldingFeature.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 (2\u00020\u0001:\u0002()B\u001f\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006*"}, d2 = {"Landroidx/window/layout/HardwareFoldingFeature;", "Landroidx/window/layout/FoldingFeature;", "", "toString", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "Landroidx/window/layout/HardwareFoldingFeature$Type;", "b", "Landroidx/window/layout/HardwareFoldingFeature$Type;", "getType$window_release", "()Landroidx/window/layout/HardwareFoldingFeature$Type;", "type", "Landroidx/window/layout/FoldingFeature$State;", "c", "Landroidx/window/layout/FoldingFeature$State;", "getState", "()Landroidx/window/layout/FoldingFeature$State;", "state", "Landroid/graphics/Rect;", "getBounds", "()Landroid/graphics/Rect;", "bounds", "isSeparating", "()Z", "Landroidx/window/layout/FoldingFeature$OcclusionType;", "getOcclusionType", "()Landroidx/window/layout/FoldingFeature$OcclusionType;", "occlusionType", "Landroidx/window/layout/FoldingFeature$Orientation;", "getOrientation", "()Landroidx/window/layout/FoldingFeature$Orientation;", "orientation", "Landroidx/window/core/Bounds;", "featureBounds", "<init>", "(Landroidx/window/core/Bounds;Landroidx/window/layout/HardwareFoldingFeature$Type;Landroidx/window/layout/FoldingFeature$State;)V", "Companion", UUIDPreferences.TYPE_KEY, "window_release"}, k = 1, mv = {1, 6, 0})
public final class HardwareFoldingFeature implements FoldingFeature {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Bounds f24173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Type type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FoldingFeature.State state;

    /* JADX INFO: compiled from: HardwareFoldingFeature.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/window/layout/HardwareFoldingFeature$Companion;", "", "()V", "validateFeatureBounds", "", "bounds", "Landroidx/window/core/Bounds;", "validateFeatureBounds$window_release", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void validateFeatureBounds$window_release(@NotNull Bounds bounds) {
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            if (bounds.getWidth() == 0 && bounds.getHeight() == 0) {
                throw new IllegalArgumentException("Bounds must be non zero".toString());
            }
            if (bounds.getLeft() != 0 && bounds.getTop() != 0) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
            }
        }
    }

    /* JADX INFO: compiled from: HardwareFoldingFeature.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"Landroidx/window/layout/HardwareFoldingFeature$Type;", "", "", "toString", "Companion", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class Type {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final Type f24176b = new Type("FOLD");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final Type f24177c = new Type("HINGE");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f24178a;

        /* JADX INFO: compiled from: HardwareFoldingFeature.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/window/layout/HardwareFoldingFeature$Type$Companion;", "", "()V", "FOLD", "Landroidx/window/layout/HardwareFoldingFeature$Type;", "getFOLD", "()Landroidx/window/layout/HardwareFoldingFeature$Type;", "HINGE", "getHINGE", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Type getFOLD() {
                return Type.f24176b;
            }

            @NotNull
            public final Type getHINGE() {
                return Type.f24177c;
            }
        }

        public Type(String str) {
            this.f24178a = str;
        }

        @NotNull
        /* JADX INFO: renamed from: toString, reason: from getter */
        public String getF24178a() {
            return this.f24178a;
        }
    }

    public HardwareFoldingFeature(@NotNull Bounds featureBounds, @NotNull Type type, @NotNull FoldingFeature.State state) {
        Intrinsics.checkNotNullParameter(featureBounds, "featureBounds");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f24173a = featureBounds;
        this.type = type;
        this.state = state;
        INSTANCE.validateFeatureBounds$window_release(featureBounds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(HardwareFoldingFeature.class, other == null ? null : other.getClass())) {
            return false;
        }
        if (other == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        }
        HardwareFoldingFeature hardwareFoldingFeature = (HardwareFoldingFeature) other;
        return Intrinsics.areEqual(this.f24173a, hardwareFoldingFeature.f24173a) && Intrinsics.areEqual(this.type, hardwareFoldingFeature.type) && Intrinsics.areEqual(getState(), hardwareFoldingFeature.getState());
    }

    @Override // androidx.window.layout.DisplayFeature
    @NotNull
    public Rect getBounds() {
        return this.f24173a.toRect();
    }

    @Override // androidx.window.layout.FoldingFeature
    @NotNull
    public FoldingFeature.OcclusionType getOcclusionType() {
        Bounds bounds = this.f24173a;
        return (bounds.getWidth() == 0 || bounds.getHeight() == 0) ? FoldingFeature.OcclusionType.NONE : FoldingFeature.OcclusionType.FULL;
    }

    @Override // androidx.window.layout.FoldingFeature
    @NotNull
    public FoldingFeature.Orientation getOrientation() {
        Bounds bounds = this.f24173a;
        return bounds.getWidth() > bounds.getHeight() ? FoldingFeature.Orientation.HORIZONTAL : FoldingFeature.Orientation.VERTICAL;
    }

    @Override // androidx.window.layout.FoldingFeature
    @NotNull
    public FoldingFeature.State getState() {
        return this.state;
    }

    @NotNull
    /* JADX INFO: renamed from: getType$window_release, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        return getState().hashCode() + ((this.type.hashCode() + (this.f24173a.hashCode() * 31)) * 31);
    }

    @Override // androidx.window.layout.FoldingFeature
    public boolean isSeparating() {
        Type.Companion companion = Type.INSTANCE;
        Type hinge = companion.getHINGE();
        Type type = this.type;
        if (Intrinsics.areEqual(type, hinge)) {
            return true;
        }
        return Intrinsics.areEqual(type, companion.getFOLD()) && Intrinsics.areEqual(getState(), FoldingFeature.State.HALF_OPENED);
    }

    @NotNull
    public String toString() {
        return "HardwareFoldingFeature { " + this.f24173a + ", type=" + this.type + ", state=" + getState() + " }";
    }
}
