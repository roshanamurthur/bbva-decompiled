package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CrashlyticsRemoteConfigListener.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/google/firebase/crashlytics/internal/CrashlyticsRemoteConfigListener;", "Lcom/google/firebase/remoteconfig/interop/rollouts/RolloutsStateSubscriber;", "Lcom/google/firebase/remoteconfig/interop/rollouts/RolloutsState;", "rolloutsState", "", "onRolloutsStateChanged", "Lcom/google/firebase/crashlytics/internal/metadata/UserMetadata;", "userMetadata", "<init>", "(Lcom/google/firebase/crashlytics/internal/metadata/UserMetadata;)V", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 7, 1})
public final class CrashlyticsRemoteConfigListener implements RolloutsStateSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final UserMetadata f47698a;

    public CrashlyticsRemoteConfigListener(@NotNull UserMetadata userMetadata) {
        Intrinsics.checkNotNullParameter(userMetadata, "userMetadata");
        this.f47698a = userMetadata;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber
    public void onRolloutsStateChanged(@NotNull RolloutsState rolloutsState) {
        Intrinsics.checkNotNullParameter(rolloutsState, "rolloutsState");
        Set<RolloutAssignment> rolloutAssignments = rolloutsState.getRolloutAssignments();
        Intrinsics.checkNotNullExpressionValue(rolloutAssignments, "rolloutsState.rolloutAssignments");
        Set<RolloutAssignment> set = rolloutAssignments;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
        for (RolloutAssignment rolloutAssignment : set) {
            arrayList.add(com.google.firebase.crashlytics.internal.metadata.RolloutAssignment.create(rolloutAssignment.getRolloutId(), rolloutAssignment.getParameterKey(), rolloutAssignment.getParameterValue(), rolloutAssignment.getVariantId(), rolloutAssignment.getTemplateVersion()));
        }
        this.f47698a.updateRolloutsState(arrayList);
        Logger.getLogger().d("Updated Crashlytics Rollout State");
    }
}
