package com.bbva.cells.component.kit.ui.viewmodel;

import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bbva.androidtoolkit.utils.Tracer;
import com.bbva.cells.component.kit.common.ReactiveComponent;
import com.bbva.cells.component.kit.properties.LiveDataDynamicPropertyObserver;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ViewModel extends ReactiveComponent implements LiveDataDynamicPropertyObserver {
    protected Application mApplication;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f26707p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final MutableLiveData<Void> f26708q0 = new MutableLiveData<>();
    protected Map<String, MutableLiveData> mProperties = new HashMap();

    public ViewModel(Application application) {
        this.mApplication = application;
    }

    @Override // com.bbva.cells.component.kit.common.Component
    /* JADX INFO: renamed from: getId */
    public String getK0() {
        return this.f26707p0;
    }

    @Override // com.bbva.cells.component.kit.properties.LiveDataDynamicPropertyObserver
    public <T> MutableLiveData<T> newProperty(String str) {
        MutableLiveData<T> mutableLiveData = new MutableLiveData<>();
        this.mProperties.put(str, mutableLiveData);
        return mutableLiveData;
    }

    @Override // com.bbva.cells.component.kit.common.ReactiveComponent
    public void onPropertiesBound() {
        this.f26708q0.setValue(null);
    }

    public LiveData<Void> propertiesBound() {
        return this.f26708q0;
    }

    public void reloadProperties() {
        for (Map.Entry<String, MutableLiveData> entry : this.mProperties.entrySet()) {
            setProperty(entry.getKey(), entry.getValue());
        }
    }

    public void setId(int i10) {
        this.f26707p0 = String.valueOf(i10);
    }

    @Override // com.bbva.cells.component.kit.common.ReactiveComponent, com.bbva.cells.component.kit.common.Component
    public <T> void setProperty(String str, T t10) {
        MutableLiveData mutableLiveData = this.mProperties.get(str);
        if (mutableLiveData != null) {
            mutableLiveData.setValue(t10);
            return;
        }
        Tracer.w("ViewModel", "setProperty() called with: key = [" + str + "] but not found");
    }

    @Override // com.bbva.cells.component.kit.common.ReactiveComponent, com.bbva.cells.component.kit.common.Disposable
    public void dispose() {
    }
}
