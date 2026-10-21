package io.reactivex.internal.util;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class LinkedArrayList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f73788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f73789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f73790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f73791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f73792e;

    public LinkedArrayList(int i10) {
        this.f73788a = i10;
    }

    public void add(Object obj) {
        if (this.f73791d == 0) {
            Object[] objArr = new Object[this.f73788a + 1];
            this.f73789b = objArr;
            this.f73790c = objArr;
            objArr[0] = obj;
            this.f73792e = 1;
            this.f73791d = 1;
            return;
        }
        int i10 = this.f73792e;
        int i11 = this.f73788a;
        if (i10 != i11) {
            this.f73790c[i10] = obj;
            this.f73792e = i10 + 1;
            this.f73791d++;
        } else {
            Object[] objArr2 = new Object[i11 + 1];
            objArr2[0] = obj;
            this.f73790c[i11] = objArr2;
            this.f73790c = objArr2;
            this.f73792e = 1;
            this.f73791d++;
        }
    }

    public Object[] head() {
        return this.f73789b;
    }

    public int size() {
        return this.f73791d;
    }

    public String toString() {
        int i10 = this.f73788a;
        int i11 = this.f73791d;
        ArrayList arrayList = new ArrayList(i11 + 1);
        Object[] objArrHead = head();
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            arrayList.add(objArrHead[i13]);
            i12++;
            i13++;
            if (i13 == i10) {
                objArrHead = (Object[]) objArrHead[i10];
                i13 = 0;
            }
        }
        return arrayList.toString();
    }
}
