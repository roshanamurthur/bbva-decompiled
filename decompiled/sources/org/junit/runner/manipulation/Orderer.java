package org.junit.runner.manipulation;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.junit.runner.Description;

/* JADX INFO: loaded from: classes13.dex */
public final class Orderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ordering f91995a;

    public Orderer(Ordering ordering) {
        this.f91995a = ordering;
    }

    public void apply(Object obj) throws InvalidOrderingException {
        if (obj instanceof Orderable) {
            ((Orderable) obj).order(this);
        }
    }

    public List<Description> order(Collection<Description> collection) throws InvalidOrderingException {
        Collection<Description> collectionUnmodifiableCollection = Collections.unmodifiableCollection(collection);
        Ordering ordering = this.f91995a;
        List<Description> listOrderItems = ordering.orderItems(collectionUnmodifiableCollection);
        if (!ordering.a()) {
            return listOrderItems;
        }
        HashSet hashSet = new HashSet(collection);
        if (!hashSet.containsAll(listOrderItems)) {
            throw new InvalidOrderingException("Ordering added items");
        }
        HashSet hashSet2 = new HashSet(listOrderItems);
        if (hashSet2.size() != listOrderItems.size()) {
            throw new InvalidOrderingException("Ordering duplicated items");
        }
        if (hashSet2.containsAll(hashSet)) {
            return listOrderItems;
        }
        throw new InvalidOrderingException("Ordering removed items");
    }
}
