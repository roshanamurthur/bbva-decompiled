package com.sun.mail.imap;

import com.bbva.cellscore.web.model.page.components.ComponentDTO;

/* JADX INFO: loaded from: classes9.dex */
public final class SortTerm {
    public static final SortTerm ARRIVAL = new SortTerm("ARRIVAL");
    public static final SortTerm CC = new SortTerm(ComponentDTO.CROSS_COMPONENT);
    public static final SortTerm DATE = new SortTerm("DATE");
    public static final SortTerm FROM = new SortTerm("FROM");
    public static final SortTerm REVERSE = new SortTerm("REVERSE");
    public static final SortTerm SIZE = new SortTerm("SIZE");
    public static final SortTerm SUBJECT = new SortTerm("SUBJECT");
    public static final SortTerm TO = new SortTerm("TO");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65398a;

    public SortTerm(String str) {
        this.f65398a = str;
    }

    public String toString() {
        return this.f65398a;
    }
}
