package com.facetec.sdk;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes9.dex */
public final class fr extends eo<Time> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final el f41655d = new el() { // from class: com.facetec.sdk.fr.2
        @Override // com.facetec.sdk.el
        public final <T> eo<T> c(dv dvVar, fy<T> fyVar) {
            if (fyVar.d() == Time.class) {
                return new fr();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DateFormat f41656b = new SimpleDateFormat("hh:mm:ss a");

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facetec.sdk.eo
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized Time a(fz fzVar) throws IOException {
        if (fzVar.j() == gb.NULL) {
            fzVar.m();
            return null;
        }
        try {
            return new Time(this.f41656b.parse(fzVar.f()).getTime());
        } catch (ParseException e5) {
            throw new en(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facetec.sdk.eo
    public synchronized void b(ga gaVar, Time time) throws IOException {
        gaVar.e(time == null ? null : this.f41656b.format((Date) time));
    }
}
