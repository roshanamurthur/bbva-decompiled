package com.facetec.sdk;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
final class du extends eo<Date> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<? extends Date> f41368b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<DateFormat> f41369e;

    public du(Class<? extends Date> cls, String str) {
        ArrayList arrayList = new ArrayList();
        this.f41369e = arrayList;
        this.f41368b = e(cls);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    private Date c(String str) {
        synchronized (this.f41369e) {
            Iterator<DateFormat> it = this.f41369e.iterator();
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
    }

    private static Class<? extends Date> e(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        StringBuilder sb2 = new StringBuilder("Date type must be one of ");
        sb2.append(Date.class);
        sb2.append(", ");
        sb2.append(Timestamp.class);
        sb2.append(", or ");
        sb2.append(java.sql.Date.class);
        sb2.append(" but was ");
        sb2.append(cls);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // com.facetec.sdk.eo
    public final /* synthetic */ Date a(fz fzVar) throws IOException {
        if (fzVar.j() == gb.NULL) {
            fzVar.m();
            return null;
        }
        Date dateC = c(fzVar.f());
        Class<? extends Date> cls = this.f41368b;
        if (cls == Date.class) {
            return dateC;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(dateC.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(dateC.getTime());
        }
        throw new AssertionError();
    }

    @Override // com.facetec.sdk.eo
    public final /* synthetic */ void b(ga gaVar, Date date) throws IOException {
        Date date2 = date;
        if (date2 == null) {
            gaVar.g();
            return;
        }
        synchronized (this.f41369e) {
            gaVar.e(this.f41369e.get(0).format(date2));
        }
    }

    public final String toString() {
        DateFormat dateFormat = this.f41369e.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            StringBuilder sb2 = new StringBuilder("DefaultDateTypeAdapter(");
            sb2.append(((SimpleDateFormat) dateFormat).toPattern());
            sb2.append(RootService.CLOSE_BRACKET);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("DefaultDateTypeAdapter(");
        sb3.append(dateFormat.getClass().getSimpleName());
        sb3.append(RootService.CLOSE_BRACKET);
        return sb3.toString();
    }

    public du(Class<? extends Date> cls, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f41369e = arrayList;
        this.f41368b = e(cls);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (ew.e()) {
            arrayList.add(fa.d(i10, i11));
        }
    }
}
