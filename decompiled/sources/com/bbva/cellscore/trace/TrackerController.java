package com.bbva.cellscore.trace;

import com.bbva.cells.component.kit.tracking.Tracker;
import com.bbva.cells.component.kit.tracking.TrackingEvent;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TrackerController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Tracker> f27053a;

    public TrackerController(boolean z10, List<Tracker> list) {
        this.f27053a = list;
    }

    public void addTracker(Tracker tracker) {
        this.f27053a.add(tracker);
    }

    public void trace(TrackingEvent trackingEvent) {
        Iterator<Tracker> it = this.f27053a.iterator();
        while (it.hasNext()) {
            it.next().onEvent(trackingEvent);
        }
    }
}
