package com.google.firebase.remoteconfig.interop.rollouts;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
@AutoValue
public abstract class RolloutsState {
    @NonNull
    public static RolloutsState create(@NonNull Set<RolloutAssignment> set) {
        return new lg.a(set);
    }

    @NonNull
    public abstract Set<RolloutAssignment> getRolloutAssignments();
}
