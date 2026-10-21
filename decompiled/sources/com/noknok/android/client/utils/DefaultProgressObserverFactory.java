package com.noknok.android.client.utils;

import android.app.Activity;

/* JADX INFO: loaded from: classes11.dex */
public class DefaultProgressObserverFactory extends ProgressObserverFactory {
    @Override // com.noknok.android.client.utils.ProgressObserverFactory
    public IProgressObserver createProgressObserver(Activity activity) {
        return new ProgressObserver(activity);
    }
}
