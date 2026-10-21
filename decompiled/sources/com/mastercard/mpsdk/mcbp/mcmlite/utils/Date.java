package com.mastercard.mpsdk.mcbp.mcmlite.utils;

import androidx.activity.a;
import java.util.Calendar;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class Date {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f51024c;

    public Date(int i10, int i11, int i12) {
        this.f51022a = i10;
        this.f51024c = i11;
        this.f51023b = i12;
    }

    public int getDay() {
        return this.f51023b;
    }

    public int getMonth() {
        return this.f51024c;
    }

    public int getYear() {
        return this.f51022a;
    }

    public boolean isValid() {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        int i10 = this.f51022a;
        int i11 = this.f51023b;
        int i12 = this.f51024c;
        if (i10 == 0 && i12 == 0 && i11 == 0) {
            return true;
        }
        if (getYear() <= 2000) {
            return false;
        }
        calendar.set(1, getYear());
        if (i12 < 1 || i12 > 12) {
            return false;
        }
        calendar.set(2, i12 - 1);
        return calendar.getActualMinimum(5) <= i11 && i11 <= calendar.getActualMaximum(5);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Date{Year=");
        sb2.append(this.f51022a);
        sb2.append(", Day=");
        sb2.append(this.f51023b);
        sb2.append(", Month=");
        return a.d(sb2, this.f51024c, AbstractJsonLexerKt.END_OBJ);
    }

    public Date() {
        Calendar calendar = Calendar.getInstance();
        this.f51022a = calendar.get(1);
        this.f51024c = calendar.get(2) + 1;
        this.f51023b = calendar.get(5);
    }
}
