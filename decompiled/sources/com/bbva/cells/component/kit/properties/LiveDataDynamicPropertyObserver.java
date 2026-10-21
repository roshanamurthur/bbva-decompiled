package com.bbva.cells.component.kit.properties;

import androidx.lifecycle.MutableLiveData;

/* JADX INFO: loaded from: classes2.dex */
public interface LiveDataDynamicPropertyObserver {
    <T> MutableLiveData<T> newProperty(String str);
}
