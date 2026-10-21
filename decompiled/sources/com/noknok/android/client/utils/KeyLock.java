package com.noknok.android.client.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes11.dex */
public class KeyLock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final KeyLock f63455a = new KeyLock();
    protected final ThreadLocal<List<Semaphore>> mSemList = new ThreadLocal<>();
    protected final Map<String, Semaphore> mKeyMap = new HashMap();
    protected final Semaphore mLoc = new Semaphore(1, true);

    public static KeyLock getInstance() {
        return f63455a;
    }

    public void activate() {
        this.mSemList.set(new ArrayList());
    }

    public void lock(List<String> list) throws InterruptedException {
        List<Semaphore> list2 = this.mSemList.get();
        if (list2 == null) {
            return;
        }
        if (!list2.isEmpty()) {
            throw new IllegalStateException("The list is not empty: " + list2.size());
        }
        for (String str : new TreeSet(list)) {
            this.mLoc.acquire();
            try {
                Semaphore semaphore = this.mKeyMap.get(str);
                if (semaphore == null) {
                    semaphore = new Semaphore(1, true);
                    this.mKeyMap.put(str, semaphore);
                }
                this.mLoc.release();
                list2.add(semaphore);
            } catch (Throwable th2) {
                this.mLoc.release();
                throw th2;
            }
        }
        Iterator<Semaphore> it = list2.iterator();
        while (it.hasNext()) {
            it.next().acquire();
        }
    }

    public void unlock() {
        List<Semaphore> list = this.mSemList.get();
        if (list == null) {
            return;
        }
        Iterator<Semaphore> it = list.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        this.mSemList.set(null);
    }
}
