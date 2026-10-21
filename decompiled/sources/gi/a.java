package gi;

import com.nimbusds.jose.Algorithm;
import java.util.Collection;
import java.util.LinkedHashSet;
import net.jcip.annotations.Immutable;

/* JADX INFO: compiled from: AlgorithmFamily.java */
/* JADX INFO: loaded from: classes10.dex */
@Immutable
public class a<T extends Algorithm> extends LinkedHashSet<T> {
    public a(T... tArr) {
        for (T t10 : tArr) {
            super.add(t10);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t10) {
        throw new UnsupportedOperationException();
    }
}
