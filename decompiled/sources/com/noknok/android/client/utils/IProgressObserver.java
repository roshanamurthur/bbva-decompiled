package com.noknok.android.client.utils;

import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

/* JADX INFO: loaded from: classes11.dex */
public interface IProgressObserver extends Observer<Boolean> {
    void disable();

    void enable(LifecycleOwner lifecycleOwner);

    /* JADX INFO: renamed from: onChanged, reason: avoid collision after fix types in other method */
    void onChanged2(@Nullable Boolean bool);

    @Override // androidx.lifecycle.Observer
    /* bridge */ /* synthetic */ void onChanged(@Nullable Boolean bool);
}
