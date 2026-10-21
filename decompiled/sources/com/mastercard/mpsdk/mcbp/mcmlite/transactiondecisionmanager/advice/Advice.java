package com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class Advice {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Assessment f51015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Reason> f51016b;

    public Advice(Assessment assessment, List<Reason> list) {
        this.f51015a = assessment;
        this.f51016b = list;
    }

    public Assessment getAssessment() {
        return this.f51015a;
    }

    public List<Reason> getReasons() {
        return this.f51016b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Assessment: ");
        sb2.append(this.f51015a);
        sb2.append("\nReasons: ");
        Iterator<Reason> it = this.f51016b.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
        }
        sb2.append(RootService.LINE_BREAK);
        return sb2.toString();
    }
}
