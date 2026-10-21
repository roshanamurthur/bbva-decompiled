package com.bbva.cells.component.kit.common;

import androidx.annotation.NonNull;
import com.bbva.androidtoolkit.utils.Tracer;
import com.bbva.cells.component.kit.datamanager.store.VoidValue;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cells.component.kit.properties.RxDynamicPropertyObserver;
import com.bbva.cellscore.app.Reactor;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class RxComponent implements Component, RxDynamicPropertyObserver {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final VoidValue f26673s0 = new VoidValue();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ArrayList f26676r0 = new ArrayList();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final HashMap f26675q0 = new HashMap();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompositeDisposable f26674p0 = new CompositeDisposable();

    public interface ActionSpecListener {
        <T> void onEvent(@NonNull String str, @NonNull ActionSpec<T> actionSpec, T t10);
    }

    public final <T> void a(ActionSpec<T> actionSpec, T t10) {
        Reactor.in(getK0()).doAction(actionSpec).with(t10).fire();
        Iterator it = this.f26676r0.iterator();
        while (it.hasNext()) {
            ((ActionSpecListener) it.next()).onEvent(getK0(), actionSpec, t10);
        }
    }

    public void addOnEventListener(ActionSpecListener actionSpecListener) {
        this.f26676r0.add(actionSpecListener);
    }

    @Override // com.bbva.cells.component.kit.common.Disposable
    public void dispose() {
        this.f26674p0.clear();
    }

    public <T> void fire(ActionSpec<T> actionSpec) {
        a(actionSpec, null);
    }

    @Override // com.bbva.cells.component.kit.properties.RxDynamicPropertyObserver
    public <T> void newProperty(String str, Consumer<T> consumer) {
        PublishSubject publishSubjectCreate = PublishSubject.create();
        this.f26675q0.put(str, publishSubjectCreate);
        this.f26674p0.add(publishSubjectCreate.subscribe(consumer));
    }

    public void removeListener(ActionSpecListener actionSpecListener) {
        this.f26676r0.remove(actionSpecListener);
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
        PublishSubject publishSubject = (PublishSubject) this.f26675q0.get(str);
        if (publishSubject != null) {
            if (t10 == null) {
                t10 = (T) f26673s0;
            }
            publishSubject.onNext(t10);
        } else {
            Tracer.w("RxComponent", "setProperty() called with: key = [" + str + "] but not found");
        }
    }

    public <T> void fire(ActionSpec<T> actionSpec, T t10) {
        a(actionSpec, t10);
    }

    public void onPropertiesBound() {
    }
}
