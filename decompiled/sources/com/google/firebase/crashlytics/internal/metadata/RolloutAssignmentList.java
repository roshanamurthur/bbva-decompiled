package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class RolloutAssignmentList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f47847a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47848b;

    public RolloutAssignmentList(int i10) {
        this.f47848b = i10;
    }

    public List<CrashlyticsReport.Session.Event.RolloutAssignment> getReportRolloutsState() {
        List<RolloutAssignment> rolloutAssignmentList = getRolloutAssignmentList();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < rolloutAssignmentList.size(); i10++) {
            arrayList.add(rolloutAssignmentList.get(i10).toReportProto());
        }
        return arrayList;
    }

    public synchronized List<RolloutAssignment> getRolloutAssignmentList() {
        return Collections.unmodifiableList(new ArrayList(this.f47847a));
    }

    public synchronized boolean updateRolloutAssignmentList(List<RolloutAssignment> list) {
        this.f47847a.clear();
        if (list.size() <= this.f47848b) {
            return this.f47847a.addAll(list);
        }
        Logger.getLogger().w("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f47848b);
        return this.f47847a.addAll(list.subList(0, this.f47848b));
    }
}
