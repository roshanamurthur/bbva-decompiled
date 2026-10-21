package com.veridas.util;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class Collections {
    public static List<String> difference(Collection<String> collection, Collection<String> collection2) {
        LinkedList linkedList = new LinkedList(collection);
        linkedList.removeAll(collection2);
        return linkedList;
    }
}
