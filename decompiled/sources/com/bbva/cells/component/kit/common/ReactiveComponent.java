package com.bbva.cells.component.kit.common;

import androidx.annotation.NonNull;
import com.bbva.androidtoolkit.utils.Tracer;
import com.bbva.cells.component.kit.datamanager.store.VoidValue;
import com.bbva.cells.component.kit.featureflag.FlagState;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cells.component.kit.properties.RxDynamicPropertyObserver;
import com.bbva.cellscore.app.Reactor;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ReactiveComponent implements Component, RxDynamicPropertyObserver {
    private static final VoidValue EMPTY = new VoidValue();
    private static final String TAG = "ReactiveComponent";
    private List<ActionSpecListener> mEventListeners = new ArrayList();
    private Map<String, PublishSubject> mProperties = new HashMap();
    private Map<String, PublishSubject<FlagState>> mFeatureFlags = new HashMap();
    private CompositeDisposable mCompositeDisposable = new CompositeDisposable();

    public interface ActionSpecListener {
        <T> void onEvent(@NonNull String str, @NonNull ActionSpec<T> actionSpec, T t10);
    }

    private <T> void propagateFire(ActionSpec<T> actionSpec, T t10) {
        Reactor.in(getK0()).doAction(actionSpec).with(t10).fire();
        Iterator<ActionSpecListener> it = this.mEventListeners.iterator();
        while (it.hasNext()) {
            it.next().onEvent(getK0(), actionSpec, t10);
        }
    }

    public void addOnEventListener(ActionSpecListener actionSpecListener) {
        this.mEventListeners.add(actionSpecListener);
    }

    public void applyChanges() {
        onPropertiesBound();
    }

    @Override // com.bbva.cells.component.kit.common.Disposable
    public void dispose() {
        this.mCompositeDisposable.clear();
    }

    @Override // com.bbva.cells.component.kit.common.Component, com.bbva.cells.component.kit.properties.RxDynamicPropertyObserver
    public void featureFlag(String str, Consumer<FlagState> consumer) {
        PublishSubject<FlagState> publishSubjectCreate = PublishSubject.create();
        this.mFeatureFlags.put(str, publishSubjectCreate);
        this.mCompositeDisposable.add(publishSubjectCreate.subscribe(consumer));
    }

    public <T> void fire(ActionSpec<T> actionSpec) {
        propagateFire(actionSpec, null);
    }

    @Override // com.bbva.cells.component.kit.properties.RxDynamicPropertyObserver
    public <T> void newProperty(String str, Consumer<T> consumer) {
        PublishSubject publishSubjectCreate = PublishSubject.create();
        this.mProperties.put(str, publishSubjectCreate);
        this.mCompositeDisposable.add(publishSubjectCreate.subscribe(consumer));
    }

    public void removeListener(ActionSpecListener actionSpecListener) {
        this.mEventListeners.remove(actionSpecListener);
    }

    @Override // com.bbva.cells.component.kit.common.Component
    public void setFeatureFlag(String str, FlagState flagState) {
        PublishSubject<FlagState> publishSubject = this.mFeatureFlags.get(str);
        if (publishSubject != null) {
            publishSubject.onNext(flagState);
            return;
        }
        Tracer.w(TAG, "setFeatureFlag() called with: key = [" + str + "] but not found");
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
                t10 = (T) EMPTY;
            }
            publishSubject.onNext(t10);
        } else {
            Tracer.w(TAG, "setProperty() called with: key = [" + str + "] but not found");
        }
    }

    public <T> void fire(ActionSpec<T> actionSpec, T t10) {
        propagateFire(actionSpec, t10);
    }

    public void onPropertiesBound() {
    }
}
