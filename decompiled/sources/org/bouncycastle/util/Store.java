package org.bouncycastle.util;

import java.util.Collection;

/* JADX INFO: loaded from: classes13.dex */
public interface Store<T> {
    Collection<T> getMatches(Selector<T> selector) throws StoreException;
}
