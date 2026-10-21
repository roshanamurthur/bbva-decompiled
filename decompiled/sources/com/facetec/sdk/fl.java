package com.facetec.sdk;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public final class fl extends eo<Date> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final el f41612d = new el() { // from class: com.facetec.sdk.fl.3
        @Override // com.facetec.sdk.el
        public final <T> eo<T> c(dv dvVar, fy<T> fyVar) {
            if (fyVar.d() == Date.class) {
                return new fl();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<DateFormat> f41613a;

    public fl() {
        ArrayList arrayList = new ArrayList();
        this.f41613a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (ew.e()) {
            arrayList.add(fa.d(2, 2));
        }
    }

    private synchronized Date a(String str) {
        Iterator<DateFormat> it = this.f41613a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return fx.d(str, new ParsePosition(0));
        } catch (ParseException e5) {
            throw new en(str, e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facetec.sdk.eo
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public synchronized void b(ga gaVar, Date date) throws IOException {
        try {
            if (date == null) {
                gaVar.g();
            } else {
                gaVar.e(this.f41613a.get(0).format(date));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.facetec.sdk.eo
    public final /* synthetic */ Date a(fz fzVar) throws IOException {
        if (fzVar.j() == gb.NULL) {
            fzVar.m();
            return null;
        }
        return a(fzVar.f());
    }
}
