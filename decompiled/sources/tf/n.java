package tf;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.DependencyException;
import com.google.firebase.components.Qualified;
import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: RestrictedComponentContainer.java */
/* JADX INFO: loaded from: classes10.dex */
public final class n implements ComponentContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<Qualified<?>> f93587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<Qualified<?>> f93588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<Qualified<?>> f93589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<Qualified<?>> f93590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<Qualified<?>> f93591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set<Class<?>> f93592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ComponentContainer f93593g;

    /* JADX INFO: compiled from: RestrictedComponentContainer.java */
    public static class a implements Publisher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<Class<?>> f93594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Publisher f93595b;

        public a(Set<Class<?>> set, Publisher publisher) {
            this.f93594a = set;
            this.f93595b = publisher;
        }

        @Override // com.google.firebase.events.Publisher
        public final void publish(Event<?> event) {
            if (!this.f93594a.contains(event.getType())) {
                throw new DependencyException(String.format("Attempting to publish an undeclared event %s.", event));
            }
            this.f93595b.publish(event);
        }
    }

    public n(Component component, ComponentRuntime componentRuntime) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (Dependency dependency : component.getDependencies()) {
            if (dependency.isDirectInjection()) {
                if (dependency.isSet()) {
                    hashSet4.add(dependency.getInterface());
                } else {
                    hashSet.add(dependency.getInterface());
                }
            } else if (dependency.isDeferred()) {
                hashSet3.add(dependency.getInterface());
            } else if (dependency.isSet()) {
                hashSet5.add(dependency.getInterface());
            } else {
                hashSet2.add(dependency.getInterface());
            }
        }
        if (!component.getPublishedEvents().isEmpty()) {
            hashSet.add(Qualified.unqualified(Publisher.class));
        }
        this.f93587a = Collections.unmodifiableSet(hashSet);
        this.f93588b = Collections.unmodifiableSet(hashSet2);
        this.f93589c = Collections.unmodifiableSet(hashSet3);
        this.f93590d = Collections.unmodifiableSet(hashSet4);
        this.f93591e = Collections.unmodifiableSet(hashSet5);
        this.f93592f = component.getPublishedEvents();
        this.f93593g = componentRuntime;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final <T> T get(Class<T> cls) {
        if (!this.f93587a.contains(Qualified.unqualified(cls))) {
            throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t10 = (T) this.f93593g.get(cls);
        return !cls.equals(Publisher.class) ? t10 : (T) new a(this.f93592f, (Publisher) t10);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final <T> Deferred<T> getDeferred(Class<T> cls) {
        return getDeferred(Qualified.unqualified(cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final <T> Provider<T> getProvider(Class<T> cls) {
        return getProvider(Qualified.unqualified(cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final /* synthetic */ Set setOf(Class cls) {
        return b.f(this, cls);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final <T> Provider<Set<T>> setOfProvider(Class<T> cls) {
        return setOfProvider(Qualified.unqualified(cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final <T> Deferred<T> getDeferred(Qualified<T> qualified) {
        if (this.f93589c.contains(qualified)) {
            return this.f93593g.getDeferred(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final <T> Provider<T> getProvider(Qualified<T> qualified) {
        if (this.f93588b.contains(qualified)) {
            return this.f93593g.getProvider(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final <T> Set<T> setOf(Qualified<T> qualified) {
        if (this.f93590d.contains(qualified)) {
            return this.f93593g.setOf(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final <T> Provider<Set<T>> setOfProvider(Qualified<T> qualified) {
        if (this.f93591e.contains(qualified)) {
            return this.f93593g.setOfProvider(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final <T> T get(Qualified<T> qualified) {
        if (this.f93587a.contains(qualified)) {
            return (T) this.f93593g.get(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", qualified));
    }
}
