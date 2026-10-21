package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Predicate;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public class AppendOnlyLinkedArrayList<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f78076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f78077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f78078d;

    public interface NonThrowingPredicate<T> extends Predicate<T> {
        @Override // io.reactivex.rxjava3.functions.Predicate
        boolean test(T t10);
    }

    public AppendOnlyLinkedArrayList(int i10) {
        this.f78075a = i10;
        Object[] objArr = new Object[i10 + 1];
        this.f78076b = objArr;
        this.f78077c = objArr;
    }

    public <U> boolean accept(Subscriber<? super U> subscriber) {
        int i10;
        Object[] objArr;
        Object[] objArr2 = this.f78076b;
        while (true) {
            int i11 = 0;
            if (objArr2 == null) {
                return false;
            }
            while (true) {
                i10 = this.f78075a;
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
        int i10 = this.f78078d;
        int i11 = this.f78075a;
        if (i10 == i11) {
            Object[] objArr = new Object[i11 + 1];
            this.f78077c[i11] = objArr;
            this.f78077c = objArr;
            i10 = 0;
        }
        this.f78077c[i10] = t10;
        this.f78078d = i10 + 1;
    }

    public void forEachWhile(NonThrowingPredicate<? super T> nonThrowingPredicate) {
        int i10;
        Object obj;
        Object[] objArr = this.f78076b;
        while (objArr != null) {
            int i11 = 0;
            while (true) {
                i10 = this.f78075a;
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
        this.f78076b[0] = t10;
    }

    public <U> boolean accept(Observer<? super U> observer) {
        int i10;
        Object[] objArr;
        Object[] objArr2 = this.f78076b;
        while (true) {
            int i11 = 0;
            if (objArr2 == null) {
                return false;
            }
            while (true) {
                i10 = this.f78075a;
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

    public <S> void forEachWhile(S s4, BiPredicate<? super S, ? super T> biPredicate) throws Throwable {
        int i10;
        Object[] objArr = this.f78076b;
        while (true) {
            int i11 = 0;
            while (true) {
                i10 = this.f78075a;
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
