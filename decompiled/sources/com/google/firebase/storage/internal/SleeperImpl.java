package com.google.firebase.storage.internal;

/* JADX INFO: loaded from: classes10.dex */
public class SleeperImpl implements Sleeper {
    @Override // com.google.firebase.storage.internal.Sleeper
    public void sleep(int i10) throws InterruptedException {
        Thread.sleep(i10);
    }
}
