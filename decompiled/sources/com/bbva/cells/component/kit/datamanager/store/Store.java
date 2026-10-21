package com.bbva.cells.component.kit.datamanager.store;

import com.bbva.androidtoolkit.utils.Tracer;
import com.bbva.cells.component.kit.common.Component;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cells.component.kit.properties.RxDynamicPropertyObserver;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.cellscore.app.Reactor;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class Store implements Component, RxDynamicPropertyObserver {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final VoidValue f26685q0 = new VoidValue();
    protected Map<String, PublishSubject> mProperties;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompositeDisposable f26686p0;

    public Store() {
        ComponentManager.add(getF28076q0(), this);
        this.mProperties = new HashMap();
        this.f26686p0 = new CompositeDisposable();
    }

    @Override // com.bbva.cells.component.kit.common.Disposable
    public void dispose() {
        ComponentManager.remove(getF28076q0());
        this.f26686p0.clear();
    }

    public <T> void fire(ActionSpec<T> actionSpec) {
        Reactor.in(getF28076q0()).doAction(actionSpec).fire();
    }

    @Override // com.bbva.cells.component.kit.properties.RxDynamicPropertyObserver
    public <T> void newProperty(String str, Consumer<T> consumer) {
        PublishSubject publishSubjectCreate = PublishSubject.create();
        this.mProperties.put(str, publishSubjectCreate);
        this.f26686p0.add(publishSubjectCreate.subscribe(consumer));
    }

    @Override // com.bbva.cells.component.kit.common.Component
    public void setProperties(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            setProperty(entry.getKey(), entry.getValue());
        }
        onPropertiesBound();
    }

    @Override // com.bbva.cells.component.kit.common.Component
    public <T> void setProperty(String str, T t10) {
        PublishSubject publishSubject = this.mProperties.get(str);
        if (publishSubject != null) {
            if (t10 == null) {
                t10 = (T) f26685q0;
            }
            publishSubject.onNext(t10);
        } else {
            Tracer.w("Store", "setProperty() called with: key = [" + str + "] but not found");
        }
    }

    public <T> void fire(ActionSpec<T> actionSpec, T t10) {
        Reactor.in(getF28076q0()).doAction(actionSpec).with(t10).fire();
    }

    public void onPropertiesBound() {
    }
}
