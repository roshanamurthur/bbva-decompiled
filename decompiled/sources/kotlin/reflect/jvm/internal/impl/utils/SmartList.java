package kotlin.reflect.jvm.internal.impl.utils;

import androidx.appcompat.widget.o1;
import androidx.datastore.preferences.protobuf.e;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public class SmartList<E> extends AbstractList<E> implements RandomAccess {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f82108p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Object f82109q0;

    public static class a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f82110p0 = new a();

        public static <T> a<T> getInstance() {
            return f82110p0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }
    }

    public class b extends c<E> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f82111q0;

        public b() {
            this.f82111q0 = ((AbstractList) SmartList.this).modCount;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.SmartList.c
        public final void a() {
            SmartList smartList = SmartList.this;
            int i10 = ((AbstractList) smartList).modCount;
            int i11 = this.f82111q0;
            if (i10 == i11) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) smartList).modCount + "; expected: " + i11);
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            SmartList.this.clear();
        }
    }

    public static abstract class c<T> implements Iterator<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public boolean f82113p0;

        public abstract void a();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f82113p0;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f82113p0) {
                throw new NoSuchElementException();
            }
            this.f82113p0 = true;
            a();
            return (T) SmartList.this.f82109q0;
        }
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i10 == 2 || i10 == 3) {
            objArr[1] = "iterator";
        } else if (i10 == 5 || i10 == 6 || i10 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e5) {
        int i10 = this.f82108p0;
        if (i10 == 0) {
            this.f82109q0 = e5;
        } else if (i10 == 1) {
            this.f82109q0 = new Object[]{this.f82109q0, e5};
        } else {
            Object[] objArr = (Object[]) this.f82109q0;
            int length = objArr.length;
            if (i10 >= length) {
                int iB = e.b(length, 3, 2, 1);
                int i11 = i10 + 1;
                if (iB < i11) {
                    iB = i11;
                }
                Object[] objArr2 = new Object[iB];
                this.f82109q0 = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f82108p0] = e5;
        }
        this.f82108p0++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f82109q0 = null;
        this.f82108p0 = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f82108p0)) {
            return i11 == 1 ? (E) this.f82109q0 : (E) ((Object[]) this.f82109q0)[i10];
        }
        StringBuilder sbC = o1.c("Index: ", i10, ", Size: ");
        sbC.append(this.f82108p0);
        throw new IndexOutOfBoundsException(sbC.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        int i10 = this.f82108p0;
        if (i10 == 0) {
            a aVar = a.getInstance();
            if (aVar != null) {
                return aVar;
            }
            a(2);
            throw null;
        }
        if (i10 == 1) {
            return new b();
        }
        Iterator<E> it = super.iterator();
        if (it != null) {
            return it;
        }
        a(3);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i10) {
        int i11;
        E e5;
        if (i10 < 0 || i10 >= (i11 = this.f82108p0)) {
            StringBuilder sbC = o1.c("Index: ", i10, ", Size: ");
            sbC.append(this.f82108p0);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        if (i11 == 1) {
            e5 = (E) this.f82109q0;
            this.f82109q0 = null;
        } else {
            Object[] objArr = (Object[]) this.f82109q0;
            Object obj = objArr[i10];
            if (i11 == 2) {
                this.f82109q0 = objArr[1 - i10];
            } else {
                int i12 = (i11 - i10) - 1;
                if (i12 > 0) {
                    System.arraycopy(objArr, i10 + 1, objArr, i10, i12);
                }
                objArr[this.f82108p0 - 1] = null;
            }
            e5 = (E) obj;
        }
        this.f82108p0--;
        ((AbstractList) this).modCount++;
        return e5;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e5) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f82108p0)) {
            StringBuilder sbC = o1.c("Index: ", i10, ", Size: ");
            sbC.append(this.f82108p0);
            throw new IndexOutOfBoundsException(sbC.toString());
        }
        if (i11 == 1) {
            E e7 = (E) this.f82109q0;
            this.f82109q0 = e5;
            return e7;
        }
        Object[] objArr = (Object[]) this.f82109q0;
        E e10 = (E) objArr[i10];
        objArr[i10] = e5;
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f82108p0;
    }

    @Override // java.util.List
    public void sort(Comparator<? super E> comparator) {
        int i10 = this.f82108p0;
        if (i10 >= 2) {
            Arrays.sort((Object[]) this.f82109q0, 0, i10, comparator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] tArr) {
        if (tArr == 0) {
            a(4);
            throw null;
        }
        int length = tArr.length;
        int i10 = this.f82108p0;
        if (i10 == 1) {
            if (length == 0) {
                T[] tArr2 = (T[]) ((Object[]) androidx.collection.a.b(tArr, 1));
                tArr2[0] = this.f82109q0;
                return tArr2;
            }
            tArr[0] = this.f82109q0;
        } else {
            if (length < i10) {
                T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.f82109q0, i10, tArr.getClass());
                if (tArr3 != null) {
                    return tArr3;
                }
                a(6);
                throw null;
            }
            if (i10 != 0) {
                System.arraycopy(this.f82109q0, 0, tArr, 0, i10);
            }
        }
        int i11 = this.f82108p0;
        if (length > i11) {
            tArr[i11] = 0;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e5) {
        int i11;
        if (i10 >= 0 && i10 <= (i11 = this.f82108p0)) {
            if (i11 == 0) {
                this.f82109q0 = e5;
            } else if (i11 == 1 && i10 == 0) {
                this.f82109q0 = new Object[]{e5, this.f82109q0};
            } else {
                Object[] objArr = new Object[i11 + 1];
                if (i11 == 1) {
                    objArr[0] = this.f82109q0;
                } else {
                    Object[] objArr2 = (Object[]) this.f82109q0;
                    System.arraycopy(objArr2, 0, objArr, 0, i10);
                    System.arraycopy(objArr2, i10, objArr, i10 + 1, this.f82108p0 - i10);
                }
                objArr[i10] = e5;
                this.f82109q0 = objArr;
            }
            this.f82108p0++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbC = o1.c("Index: ", i10, ", Size: ");
        sbC.append(this.f82108p0);
        throw new IndexOutOfBoundsException(sbC.toString());
    }
}
