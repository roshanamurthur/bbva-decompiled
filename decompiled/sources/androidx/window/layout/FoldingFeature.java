package androidx.window.layout;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FoldingFeature.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/window/layout/FoldingFeature;", "Landroidx/window/layout/DisplayFeature;", "isSeparating", "", "()Z", "occlusionType", "Landroidx/window/layout/FoldingFeature$OcclusionType;", "getOcclusionType", "()Landroidx/window/layout/FoldingFeature$OcclusionType;", "orientation", "Landroidx/window/layout/FoldingFeature$Orientation;", "getOrientation", "()Landroidx/window/layout/FoldingFeature$Orientation;", "state", "Landroidx/window/layout/FoldingFeature$State;", "getState", "()Landroidx/window/layout/FoldingFeature$State;", "OcclusionType", ExifInterface.TAG_ORIENTATION, "State", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface FoldingFeature extends DisplayFeature {

    /* JADX INFO: compiled from: FoldingFeature.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"Landroidx/window/layout/FoldingFeature$OcclusionType;", "", "", "toString", "Companion", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class OcclusionType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f24170a;

        @JvmField
        @NotNull
        public static final OcclusionType NONE = new OcclusionType(ExpectedUserActionOnPoiTypes.NONE);

        @JvmField
        @NotNull
        public static final OcclusionType FULL = new OcclusionType("FULL");

        public OcclusionType(String str) {
            this.f24170a = str;
        }

        @NotNull
        /* JADX INFO: renamed from: toString, reason: from getter */
        public String getF24170a() {
            return this.f24170a;
        }
    }

    /* JADX INFO: compiled from: FoldingFeature.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"Landroidx/window/layout/FoldingFeature$Orientation;", "", "", "toString", "Companion", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class Orientation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f24171a;

        @JvmField
        @NotNull
        public static final Orientation VERTICAL = new Orientation("VERTICAL");

        @JvmField
        @NotNull
        public static final Orientation HORIZONTAL = new Orientation("HORIZONTAL");

        public Orientation(String str) {
            this.f24171a = str;
        }

        @NotNull
        /* JADX INFO: renamed from: toString, reason: from getter */
        public String getF24171a() {
            return this.f24171a;
        }
    }

    /* JADX INFO: compiled from: FoldingFeature.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"Landroidx/window/layout/FoldingFeature$State;", "", "", "toString", "Companion", "window_release"}, k = 1, mv = {1, 6, 0})
    public static final class State {

        @JvmField
        @NotNull
        public static final State FLAT = new State("FLAT");

        @JvmField
        @NotNull
        public static final State HALF_OPENED = new State("HALF_OPENED");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f24172a;

        public State(String str) {
            this.f24172a = str;
        }

        @NotNull
        /* JADX INFO: renamed from: toString, reason: from getter */
        public String getF24172a() {
            return this.f24172a;
        }
    }

    @NotNull
    OcclusionType getOcclusionType();

    @NotNull
    Orientation getOrientation();

    @NotNull
    State getState();

    boolean isSeparating();
}
