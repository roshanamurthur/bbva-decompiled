package io.reactivex.rxjava3.internal.util;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class LinkedArrayList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f78080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f78081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f78082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f78083e;

    public LinkedArrayList(int i10) {
        this.f78079a = i10;
    }

    public void add(Object obj) {
        if (this.f78082d == 0) {
            Object[] objArr = new Object[this.f78079a + 1];
            this.f78080b = objArr;
            this.f78081c = objArr;
            objArr[0] = obj;
            this.f78083e = 1;
            this.f78082d = 1;
            return;
        }
        int i10 = this.f78083e;
        int i11 = this.f78079a;
        if (i10 != i11) {
            this.f78081c[i10] = obj;
            this.f78083e = i10 + 1;
            this.f78082d++;
        } else {
            Object[] objArr2 = new Object[i11 + 1];
            objArr2[0] = obj;
            this.f78081c[i11] = objArr2;
            this.f78081c = objArr2;
            this.f78083e = 1;
            this.f78082d++;
        }
    }

    public Object[] head() {
        return this.f78080b;
    }

    public int size() {
        return this.f78082d;
    }

    public String toString() {
        int i10 = this.f78079a;
        int i11 = this.f78082d;
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
