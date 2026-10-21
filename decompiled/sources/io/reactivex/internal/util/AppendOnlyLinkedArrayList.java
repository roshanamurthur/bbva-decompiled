package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Predicate;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public class AppendOnlyLinkedArrayList<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f73784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f73785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f73786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f73787d;

    public interface NonThrowingPredicate<T> extends Predicate<T> {
        @Override // io.reactivex.functions.Predicate
        boolean test(T t10);
    }

    public AppendOnlyLinkedArrayList(int i10) {
        this.f73784a = i10;
        Object[] objArr = new Object[i10 + 1];
        this.f73785b = objArr;
        this.f73786c = objArr;
    }

    public <U> boolean accept(Subscriber<? super U> subscriber) {
        int i10;
        Object[] objArr;
        Object[] objArr2 = this.f73785b;
        while (true) {
            int i11 = 0;
            if (objArr2 == null) {
                return false;
            }
            while (true) {
                i10 = this.f73784a;
                if (i11 >= i10 || (objArr = objArr2[i11]) == null) {
                    break;
                }
                if (NotificationLite.acceptFull(objArr, subscriber)) {
                    return true;
                }
                i11++;
            }
            objArr2 = objArr2[i10];
        }
    }

    public void add(T t10) {
        int i10 = this.f73787d;
        int i11 = this.f73784a;
        if (i10 == i11) {
            Object[] objArr = new Object[i11 + 1];
            this.f73786c[i11] = objArr;
            this.f73786c = objArr;
            i10 = 0;
        }
        this.f73786c[i10] = t10;
        this.f73787d = i10 + 1;
    }

    public void forEachWhile(NonThrowingPredicate<? super T> nonThrowingPredicate) {
        int i10;
        Object obj;
        Object[] objArr = this.f73785b;
        while (objArr != null) {
            int i11 = 0;
            while (true) {
                i10 = this.f73784a;
                if (i11 >= i10 || (obj = objArr[i11]) == null) {
                    break;
                } else if (nonThrowingPredicate.test(obj)) {
                    return;
                } else {
                    i11++;
                }
            }
            objArr = (Object[]) objArr[i10];
        }
    }

    public void setFirst(T t10) {
        this.f73785b[0] = t10;
    }

    public <U> boolean accept(Observer<? super U> observer) {
        int i10;
        Object[] objArr;
        Object[] objArr2 = this.f73785b;
        while (true) {
            int i11 = 0;
            if (objArr2 == null) {
                return false;
            }
            while (true) {
                i10 = this.f73784a;
                if (i11 >= i10 || (objArr = objArr2[i11]) == null) {
                    break;
                }
                if (NotificationLite.acceptFull(objArr, observer)) {
                    return true;
                }
                i11++;
            }
            objArr2 = objArr2[i10];
        }
    }

    public <S> void forEachWhile(S s4, BiPredicate<? super S, ? super T> biPredicate) throws Exception {
        int i10;
        Object[] objArr = this.f73785b;
        while (true) {
            int i11 = 0;
            while (true) {
                i10 = this.f73784a;
                if (i11 < i10) {
                    Object obj = objArr[i11];
                    if (obj == null || biPredicate.test(s4, obj)) {
                        return;
                    } else {
                        i11++;
                    }
                }
            }
            objArr = (Object[]) objArr[i10];
        }
    }
}
