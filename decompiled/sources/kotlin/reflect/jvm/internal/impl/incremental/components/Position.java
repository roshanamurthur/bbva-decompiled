package kotlin.reflect.jvm.internal.impl.incremental.components;

import androidx.activity.a;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LookupLocation.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class Position implements Serializable {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public static final Position f80471r0 = new Position(-1, -1);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f80472p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f80473q0;

    /* JADX INFO: compiled from: LookupLocation.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Position getNO_POSITION() {
            return Position.f80471r0;
        }
    }

    public Position(int i10, int i11) {
        this.f80472p0 = i10;
        this.f80473q0 = i11;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Position)) {
            return false;
        }
        Position position = (Position) obj;
        return this.f80472p0 == position.f80472p0 && this.f80473q0 == position.f80473q0;
    }

    public int hashCode() {
        return (this.f80472p0 * 31) + this.f80473q0;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Position(line=");
        sb2.append(this.f80472p0);
        sb2.append(", column=");
        return a.d(sb2, this.f80473q0, RootService.CLOSE_BRACKET);
    }
}
