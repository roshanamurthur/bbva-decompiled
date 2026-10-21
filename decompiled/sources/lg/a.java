package lg;

import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import java.util.Set;

/* JADX INFO: compiled from: AutoValue_RolloutsState.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends RolloutsState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<RolloutAssignment> f83211a;

    public a(Set<RolloutAssignment> set) {
        if (set == null) {
            throw new NullPointerException("Null rolloutAssignments");
        }
        this.f83211a = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RolloutsState) {
            return this.f83211a.equals(((RolloutsState) obj).getRolloutAssignments());
        }
        return false;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutsState
    @NonNull
    public final Set<RolloutAssignment> getRolloutAssignments() {
        return this.f83211a;
    }

    public final int hashCode() {
        return this.f83211a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f83211a + "}";
    }
}
