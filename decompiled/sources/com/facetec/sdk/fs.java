package com.facetec.sdk;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes9.dex */
public final class fs extends eo<Date> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final el f41657d = new el() { // from class: com.facetec.sdk.fs.4
        @Override // com.facetec.sdk.el
        public final <T> eo<T> c(dv dvVar, fy<T> fyVar) {
            if (fyVar.d() == Date.class) {
                return new fs();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final DateFormat f41658e = new SimpleDateFormat("MMM d, yyyy");

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facetec.sdk.eo
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public synchronized Date a(fz fzVar) throws IOException {
        if (fzVar.j() == gb.NULL) {
            fzVar.m();
            return null;
        }
        try {
            return new Date(this.f41658e.parse(fzVar.f()).getTime());
        } catch (ParseException e5) {
            throw new en(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facetec.sdk.eo
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized void b(ga gaVar, Date date) throws IOException {
        gaVar.e(date == null ? null : this.f41658e.format((java.util.Date) date));
    }
}
