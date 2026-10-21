package com.adobe.marketing.mobile;

import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
class RangedResolver<T> {
    private T INVALID;
    private T NEXT;
    private T PENDING;
    private T PREV;
    private TreeMap<Integer, T> states_;

    public RangedResolver(T t10, T t11, T t12, T t13) {
        this.PENDING = t10;
        this.INVALID = t11;
        this.NEXT = t12;
        this.PREV = t13;
        if ((t11 == t13) | (t10 == t11) | (t10 == t12) | (t10 == t13) | (t11 == t12) | (t13 == t12)) {
            Log.warning("RangedResolver", "Found equality between marker states! Pending(%x) Invalid(%x) Next(%x) Previous(%x)", Integer.valueOf(System.identityHashCode(t10)), Integer.valueOf(System.identityHashCode(this.INVALID)), Integer.valueOf(System.identityHashCode(this.NEXT)), Integer.valueOf(System.identityHashCode(this.PREV)));
        }
        TreeMap<Integer, T> treeMap = new TreeMap<>();
        this.states_ = treeMap;
        treeMap.put(-1, this.NEXT);
    }

    private synchronized T walkStates(Map.Entry<Integer, T> entry) {
        while (entry.getValue() == this.PREV) {
            try {
                entry = this.states_.lowerEntry(entry.getKey());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        while (entry != null && (entry.getValue() == this.NEXT || entry.getValue() == this.PREV)) {
            entry = this.states_.higherEntry(entry.getKey());
        }
        if (entry == null) {
            return this.PENDING;
        }
        return entry.getValue();
    }

    public boolean add(int i10, T t10) {
        if (this.NEXT == t10 || this.PREV == t10) {
            return false;
        }
        synchronized (this) {
            try {
                if (i10 <= this.states_.lastKey().intValue()) {
                    return false;
                }
                this.states_.put(Integer.valueOf(i10), t10);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized boolean containsValidState() {
        Map.Entry<Integer, T> entryLastEntry = this.states_.lastEntry();
        while (entryLastEntry.getKey().intValue() >= 0) {
            if (entryLastEntry.getValue() != this.INVALID && entryLastEntry.getValue() != this.NEXT && entryLastEntry.getValue() != this.PREV) {
                return true;
            }
            entryLastEntry = this.states_.lowerEntry(entryLastEntry.getKey());
        }
        return false;
    }

    public synchronized T resolve(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        Map.Entry<Integer, T> entryFloorEntry = this.states_.floorEntry(Integer.valueOf(i10));
        if (entryFloorEntry == null) {
            return this.PENDING;
        }
        return walkStates(entryFloorEntry);
    }

    public boolean update(int i10, T t10) {
        if (t10 == this.PENDING) {
            return false;
        }
        synchronized (this) {
            try {
                if (!this.states_.containsKey(Integer.valueOf(i10)) || this.states_.get(Integer.valueOf(i10)) != this.PENDING) {
                    return false;
                }
                this.states_.put(Integer.valueOf(i10), t10);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
