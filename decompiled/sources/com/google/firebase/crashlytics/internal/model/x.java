package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutsState.java */
/* JADX INFO: loaded from: classes10.dex */
public final class x extends CrashlyticsReport.Session.Event.RolloutsState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<CrashlyticsReport.Session.Event.RolloutAssignment> f48261a;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutsState.java */
    public static final class a extends CrashlyticsReport.Session.Event.RolloutsState.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<CrashlyticsReport.Session.Event.RolloutAssignment> f48262a;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.Builder
        public final CrashlyticsReport.Session.Event.RolloutsState build() {
            String str = this.f48262a == null ? " rolloutAssignments" : "";
            if (str.isEmpty()) {
                return new x(this.f48262a);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.Builder
        public final CrashlyticsReport.Session.Event.RolloutsState.Builder setRolloutAssignments(@Nullable List<CrashlyticsReport.Session.Event.RolloutAssignment> list) {
            if (list == null) {
                throw new NullPointerException("Null rolloutAssignments");
            }
            this.f48262a = list;
            return this;
        }
    }

    public x() {
        throw null;
    }

    public x(List list) {
        this.f48261a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.RolloutsState) {
            return this.f48261a.equals(((CrashlyticsReport.Session.Event.RolloutsState) obj).getRolloutAssignments());
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState
    @NonNull
    @Encodable.Field(name = "assignments")
    public final List<CrashlyticsReport.Session.Event.RolloutAssignment> getRolloutAssignments() {
        return this.f48261a;
    }

    public final int hashCode() {
        return this.f48261a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return androidx.camera.core.imagecapture.a.c(new StringBuilder("RolloutsState{rolloutAssignments="), this.f48261a, "}");
    }
}
