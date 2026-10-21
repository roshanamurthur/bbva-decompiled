package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.o1;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public class SortedList<T> {
    public static final int INVALID_POSITION = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T[] f22870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T[] f22871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Callback f22875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public BatchedCallback f22876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22877h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Class<T> f22878i;

    public static class BatchedCallback<T2> extends Callback<T2> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Callback<T2> f22879p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BatchingListUpdateCallback f22880q0;

        @SuppressLint({"UnknownNullness"})
        public BatchedCallback(Callback<T2> callback) {
            this.f22879p0 = callback;
            this.f22880q0 = new BatchingListUpdateCallback(callback);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public boolean areContentsTheSame(T2 t10, T2 t11) {
            return this.f22879p0.areContentsTheSame(t10, t11);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public boolean areItemsTheSame(T2 t10, T2 t11) {
            return this.f22879p0.areItemsTheSame(t10, t11);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback, java.util.Comparator
        public int compare(T2 t10, T2 t11) {
            return this.f22879p0.compare(t10, t11);
        }

        public void dispatchLastEvent() {
            this.f22880q0.dispatchLastEvent();
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        @Nullable
        public Object getChangePayload(T2 t10, T2 t11) {
            return this.f22879p0.getChangePayload(t10, t11);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public void onChanged(int i10, int i11) {
            this.f22880q0.onChanged(i10, i11, null);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onInserted(int i10, int i11) {
            this.f22880q0.onInserted(i10, i11);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onMoved(int i10, int i11) {
            this.f22880q0.onMoved(i10, i11);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onRemoved(int i10, int i11) {
            this.f22880q0.onRemoved(i10, i11);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback, androidx.recyclerview.widget.ListUpdateCallback
        @SuppressLint({"UnknownNullness"})
        public void onChanged(int i10, int i11, Object obj) {
            this.f22880q0.onChanged(i10, i11, obj);
        }
    }

    public static abstract class Callback<T2> implements Comparator<T2>, ListUpdateCallback {
        public abstract boolean areContentsTheSame(T2 t10, T2 t11);

        public abstract boolean areItemsTheSame(T2 t10, T2 t11);

        @Override // java.util.Comparator
        public abstract int compare(T2 t10, T2 t11);

        @Nullable
        public Object getChangePayload(T2 t10, T2 t11) {
            return null;
        }

        public abstract void onChanged(int i10, int i11);

        @SuppressLint({"UnknownNullness"})
        public void onChanged(int i10, int i11, Object obj) {
            onChanged(i10, i11);
        }
    }

    public SortedList(@NonNull Class<T> cls, @NonNull Callback<T> callback) {
        this(cls, callback, 10);
    }

    public final int a(T t10, boolean z10) {
        int iC = c(this.f22870a, 0, this.f22877h, 1, t10);
        if (iC == -1) {
            iC = 0;
        } else if (iC < this.f22877h) {
            T t11 = this.f22870a[iC];
            if (this.f22875f.areItemsTheSame(t11, t10)) {
                if (this.f22875f.areContentsTheSame(t11, t10)) {
                    this.f22870a[iC] = t10;
                    return iC;
                }
                this.f22870a[iC] = t10;
                Callback callback = this.f22875f;
                callback.onChanged(iC, 1, callback.getChangePayload(t11, t10));
                return iC;
            }
        }
        int i10 = this.f22877h;
        if (iC > i10) {
            StringBuilder sbC = o1.c("cannot add item to ", iC, " because size is ");
            sbC.append(this.f22877h);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        T[] tArr = this.f22870a;
        if (i10 == tArr.length) {
            T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f22878i, tArr.length + 10));
            System.arraycopy(this.f22870a, 0, tArr2, 0, iC);
            tArr2[iC] = t10;
            System.arraycopy(this.f22870a, iC, tArr2, iC + 1, this.f22877h - iC);
            this.f22870a = tArr2;
        } else {
            System.arraycopy(tArr, iC, tArr, iC + 1, i10 - iC);
            this.f22870a[iC] = t10;
        }
        this.f22877h++;
        if (z10) {
            this.f22875f.onInserted(iC, 1);
        }
        return iC;
    }

    public int add(T t10) {
        g();
        return a(t10, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addAll(@NonNull T[] tArr, boolean z10) {
        g();
        if (tArr.length == 0) {
            return;
        }
        if (z10) {
            b(tArr);
            return;
        }
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.f22878i, tArr.length);
        System.arraycopy(tArr, 0, objArr, 0, tArr.length);
        b(objArr);
    }

    public final void b(T[] tArr) {
        if (tArr.length < 1) {
            return;
        }
        int iF = f(tArr);
        int i10 = 0;
        if (this.f22877h == 0) {
            this.f22870a = tArr;
            this.f22877h = iF;
            this.f22875f.onInserted(0, iF);
            return;
        }
        boolean z10 = !(this.f22875f instanceof BatchedCallback);
        if (z10) {
            beginBatchedUpdates();
        }
        this.f22871b = this.f22870a;
        this.f22872c = 0;
        int i11 = this.f22877h;
        this.f22873d = i11;
        this.f22870a = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f22878i, i11 + iF + 10));
        this.f22874e = 0;
        while (true) {
            int i12 = this.f22872c;
            int i13 = this.f22873d;
            if (i12 >= i13 && i10 >= iF) {
                break;
            }
            if (i12 == i13) {
                int i14 = iF - i10;
                System.arraycopy(tArr, i10, this.f22870a, this.f22874e, i14);
                int i15 = this.f22874e + i14;
                this.f22874e = i15;
                this.f22877h += i14;
                this.f22875f.onInserted(i15 - i14, i14);
                break;
            }
            if (i10 == iF) {
                int i16 = i13 - i12;
                System.arraycopy(this.f22871b, i12, this.f22870a, this.f22874e, i16);
                this.f22874e += i16;
                break;
            }
            T t10 = this.f22871b[i12];
            T t11 = tArr[i10];
            int iCompare = this.f22875f.compare(t10, t11);
            if (iCompare > 0) {
                T[] tArr2 = this.f22870a;
                int i17 = this.f22874e;
                this.f22874e = i17 + 1;
                tArr2[i17] = t11;
                this.f22877h++;
                i10++;
                this.f22875f.onInserted(i17, 1);
            } else if (iCompare == 0 && this.f22875f.areItemsTheSame(t10, t11)) {
                T[] tArr3 = this.f22870a;
                int i18 = this.f22874e;
                this.f22874e = i18 + 1;
                tArr3[i18] = t11;
                i10++;
                this.f22872c++;
                if (!this.f22875f.areContentsTheSame(t10, t11)) {
                    Callback callback = this.f22875f;
                    callback.onChanged(this.f22874e - 1, 1, callback.getChangePayload(t10, t11));
                }
            } else {
                T[] tArr4 = this.f22870a;
                int i19 = this.f22874e;
                this.f22874e = i19 + 1;
                tArr4[i19] = t10;
                this.f22872c++;
            }
        }
        this.f22871b = null;
        if (z10) {
            endBatchedUpdates();
        }
    }

    public void beginBatchedUpdates() {
        g();
        Callback callback = this.f22875f;
        if (callback instanceof BatchedCallback) {
            return;
        }
        if (this.f22876g == null) {
            this.f22876g = new BatchedCallback(callback);
        }
        this.f22875f = this.f22876g;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    public final int c(Object[] objArr, int i10, int i11, int i12, Object obj) {
        while (i10 < i11) {
            int i13 = (i10 + i11) / 2;
            Object obj2 = objArr[i13];
            int iCompare = this.f22875f.compare(obj2, obj);
            if (iCompare < 0) {
                i10 = i13 + 1;
            } else {
                if (iCompare == 0) {
                    if (this.f22875f.areItemsTheSame(obj2, obj)) {
                        return i13;
                    }
                    int i14 = i13 - 1;
                    while (true) {
                        if (i14 >= i10) {
                            T t10 = this.f22870a[i14];
                            if (this.f22875f.compare(t10, obj) == 0) {
                                if (!this.f22875f.areItemsTheSame(t10, obj)) {
                                    i14--;
                                }
                            }
                            if (i12 == 1) {
                                return i14;
                            }
                            if (i14 == -1) {
                                return i13;
                            }
                            return i14;
                        }
                        i14 = i13 + 1;
                        while (true) {
                            if (i14 < i11) {
                                T t11 = this.f22870a[i14];
                                if (this.f22875f.compare(t11, obj) == 0) {
                                    if (this.f22875f.areItemsTheSame(t11, obj)) {
                                        break;
                                    }
                                    i14++;
                                }
                            }
                            i14 = -1;
                            break;
                        }
                        if (i12 == 1) {
                            return i14;
                        }
                        if (i14 == -1) {
                            return i13;
                        }
                        return i14;
                    }
                }
                i11 = i13;
            }
        }
        if (i12 == 1) {
            return i10;
        }
        return -1;
    }

    public void clear() {
        g();
        int i10 = this.f22877h;
        if (i10 == 0) {
            return;
        }
        Arrays.fill(this.f22870a, 0, i10, (Object) null);
        this.f22877h = 0;
        this.f22875f.onRemoved(0, i10);
    }

    public final void d(int i10, boolean z10) {
        T[] tArr = this.f22870a;
        System.arraycopy(tArr, i10 + 1, tArr, i10, (this.f22877h - i10) - 1);
        int i11 = this.f22877h - 1;
        this.f22877h = i11;
        this.f22870a[i11] = null;
        if (z10) {
            this.f22875f.onRemoved(i10, 1);
        }
    }

    public final void e(@NonNull T[] tArr) {
        boolean z10 = !(this.f22875f instanceof BatchedCallback);
        if (z10) {
            beginBatchedUpdates();
        }
        this.f22872c = 0;
        this.f22873d = this.f22877h;
        this.f22871b = this.f22870a;
        this.f22874e = 0;
        int iF = f(tArr);
        this.f22870a = (T[]) ((Object[]) Array.newInstance((Class<?>) this.f22878i, iF));
        while (true) {
            int i10 = this.f22874e;
            if (i10 >= iF && this.f22872c >= this.f22873d) {
                break;
            }
            int i11 = this.f22872c;
            int i12 = this.f22873d;
            if (i11 >= i12) {
                int i13 = iF - i10;
                System.arraycopy(tArr, i10, this.f22870a, i10, i13);
                this.f22874e += i13;
                this.f22877h += i13;
                this.f22875f.onInserted(i10, i13);
                break;
            }
            if (i10 >= iF) {
                int i14 = i12 - i11;
                this.f22877h -= i14;
                this.f22875f.onRemoved(i10, i14);
                break;
            }
            T t10 = this.f22871b[i11];
            T t11 = tArr[i10];
            int iCompare = this.f22875f.compare(t10, t11);
            if (iCompare < 0) {
                this.f22877h--;
                this.f22872c++;
                this.f22875f.onRemoved(this.f22874e, 1);
            } else if (iCompare > 0) {
                T[] tArr2 = this.f22870a;
                int i15 = this.f22874e;
                tArr2[i15] = t11;
                this.f22874e = i15 + 1;
                this.f22877h++;
                this.f22875f.onInserted(i15, 1);
            } else if (this.f22875f.areItemsTheSame(t10, t11)) {
                T[] tArr3 = this.f22870a;
                int i16 = this.f22874e;
                tArr3[i16] = t11;
                this.f22872c++;
                this.f22874e = i16 + 1;
                if (!this.f22875f.areContentsTheSame(t10, t11)) {
                    Callback callback = this.f22875f;
                    callback.onChanged(this.f22874e - 1, 1, callback.getChangePayload(t10, t11));
                }
            } else {
                this.f22877h--;
                this.f22872c++;
                this.f22875f.onRemoved(this.f22874e, 1);
                T[] tArr4 = this.f22870a;
                int i17 = this.f22874e;
                tArr4[i17] = t11;
                this.f22874e = i17 + 1;
                this.f22877h++;
                this.f22875f.onInserted(i17, 1);
            }
        }
        this.f22871b = null;
        if (z10) {
            endBatchedUpdates();
        }
    }

    public void endBatchedUpdates() {
        g();
        Callback callback = this.f22875f;
        if (callback instanceof BatchedCallback) {
            ((BatchedCallback) callback).dispatchLastEvent();
        }
        Callback callback2 = this.f22875f;
        BatchedCallback batchedCallback = this.f22876g;
        if (callback2 == batchedCallback) {
            this.f22875f = batchedCallback.f22879p0;
        }
    }

    public final int f(@NonNull T[] tArr) {
        if (tArr.length == 0) {
            return 0;
        }
        Arrays.sort(tArr, this.f22875f);
        int i10 = 0;
        int i11 = 1;
        for (int i12 = 1; i12 < tArr.length; i12++) {
            T t10 = tArr[i12];
            if (this.f22875f.compare(tArr[i10], t10) == 0) {
                int i13 = i10;
                while (true) {
                    if (i13 >= i11) {
                        i13 = -1;
                        break;
                    }
                    if (this.f22875f.areItemsTheSame(tArr[i13], t10)) {
                        break;
                    }
                    i13++;
                }
                if (i13 != -1) {
                    tArr[i13] = t10;
                } else {
                    if (i11 != i12) {
                        tArr[i11] = t10;
                    }
                    i11++;
                }
            } else {
                if (i11 != i12) {
                    tArr[i11] = t10;
                }
                i10 = i11;
                i11++;
            }
        }
        return i11;
    }

    public final void g() {
        if (this.f22871b != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    public T get(int i10) throws IndexOutOfBoundsException {
        int i11;
        if (i10 < this.f22877h && i10 >= 0) {
            T[] tArr = this.f22871b;
            return (tArr == null || i10 < (i11 = this.f22874e)) ? this.f22870a[i10] : tArr[(i10 - i11) + this.f22872c];
        }
        StringBuilder sbC = o1.c("Asked to get item at ", i10, " but size is ");
        sbC.append(this.f22877h);
        throw new IndexOutOfBoundsException(sbC.toString());
    }

    public int indexOf(T t10) {
        if (this.f22871b == null) {
            return c(this.f22870a, 0, this.f22877h, 4, t10);
        }
        int iC = c(this.f22870a, 0, this.f22874e, 4, t10);
        if (iC != -1) {
            return iC;
        }
        int iC2 = c(this.f22871b, this.f22872c, this.f22873d, 4, t10);
        if (iC2 != -1) {
            return (iC2 - this.f22872c) + this.f22874e;
        }
        return -1;
    }

    public void recalculatePositionOfItemAt(int i10) {
        g();
        T t10 = get(i10);
        d(i10, false);
        int iA = a(t10, false);
        if (i10 != iA) {
            this.f22875f.onMoved(i10, iA);
        }
    }

    public boolean remove(T t10) {
        g();
        int iC = c(this.f22870a, 0, this.f22877h, 2, t10);
        if (iC == -1) {
            return false;
        }
        d(iC, true);
        return true;
    }

    public T removeItemAt(int i10) {
        g();
        T t10 = get(i10);
        d(i10, true);
        return t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void replaceAll(@NonNull T[] tArr, boolean z10) {
        g();
        if (z10) {
            e(tArr);
            return;
        }
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.f22878i, tArr.length);
        System.arraycopy(tArr, 0, objArr, 0, tArr.length);
        e(objArr);
    }

    public int size() {
        return this.f22877h;
    }

    public void updateItemAt(int i10, T t10) {
        g();
        T t11 = get(i10);
        boolean z10 = t11 == t10 || !this.f22875f.areContentsTheSame(t11, t10);
        if (t11 != t10 && this.f22875f.compare(t11, t10) == 0) {
            this.f22870a[i10] = t10;
            if (z10) {
                Callback callback = this.f22875f;
                callback.onChanged(i10, 1, callback.getChangePayload(t11, t10));
                return;
            }
            return;
        }
        if (z10) {
            Callback callback2 = this.f22875f;
            callback2.onChanged(i10, 1, callback2.getChangePayload(t11, t10));
        }
        d(i10, false);
        int iA = a(t10, false);
        if (i10 != iA) {
            this.f22875f.onMoved(i10, iA);
        }
    }

    public SortedList(@NonNull Class<T> cls, @NonNull Callback<T> callback, int i10) {
        this.f22878i = cls;
        this.f22870a = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i10));
        this.f22875f = callback;
        this.f22877h = 0;
    }

    public void replaceAll(@NonNull T... tArr) {
        replaceAll(tArr, false);
    }

    public void addAll(@NonNull T... tArr) {
        addAll(tArr, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void replaceAll(@NonNull Collection<T> collection) {
        replaceAll(collection.toArray((Object[]) Array.newInstance((Class<?>) this.f22878i, collection.size())), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addAll(@NonNull Collection<T> collection) {
        addAll(collection.toArray((Object[]) Array.newInstance((Class<?>) this.f22878i, collection.size())), true);
    }
}
