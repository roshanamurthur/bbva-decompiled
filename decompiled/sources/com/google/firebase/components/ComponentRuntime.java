package com.google.firebase.components;

import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.dynamicloading.ComponentLoader;
import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import m4.b;
import tf.d;
import tf.e;
import tf.f;
import tf.g;
import tf.h;
import tf.i;
import tf.j;
import tf.m;

/* JADX INFO: loaded from: classes10.dex */
public class ComponentRuntime implements ComponentContainer, ComponentLoader {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f f47660i = new f(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f47661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f47662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f47663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f47664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f47665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f47666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference<Boolean> f47667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ComponentRegistrarProcessor f47668h;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f47669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f47670b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f47671c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ComponentRegistrarProcessor f47672d = ComponentRegistrarProcessor.NOOP;

        public Builder(Executor executor) {
            this.f47669a = executor;
        }

        @CanIgnoreReturnValue
        public Builder addComponent(Component<?> component) {
            this.f47671c.add(component);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addComponentRegistrar(ComponentRegistrar componentRegistrar) {
            this.f47670b.add(new e(componentRegistrar));
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addLazyComponentRegistrars(Collection<Provider<ComponentRegistrar>> collection) {
            this.f47670b.addAll(collection);
            return this;
        }

        public ComponentRuntime build() {
            return new ComponentRuntime(this.f47669a, this.f47670b, this.f47671c, this.f47672d);
        }

        @CanIgnoreReturnValue
        public Builder setProcessor(ComponentRegistrarProcessor componentRegistrarProcessor) {
            this.f47672d = componentRegistrarProcessor;
            return this;
        }
    }

    public ComponentRuntime(Executor executor, ArrayList arrayList, List list, ComponentRegistrarProcessor componentRegistrarProcessor) {
        this.f47661a = new HashMap();
        this.f47662b = new HashMap();
        this.f47663c = new HashMap();
        this.f47665e = new HashSet();
        this.f47667g = new AtomicReference<>();
        i iVar = new i(executor);
        this.f47666f = iVar;
        this.f47668h = componentRegistrarProcessor;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Component.of(iVar, (Class<i>) i.class, (Class<? super i>[]) new Class[]{Subscriber.class, Publisher.class}));
        arrayList2.add(Component.of(this, (Class<ComponentRuntime>) ComponentLoader.class, (Class<? super ComponentRuntime>[]) new Class[0]));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Component component = (Component) it.next();
            if (component != null) {
                arrayList2.add(component);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(it2.next());
        }
        this.f47664d = arrayList3;
        a(arrayList2);
    }

    public static Builder builder(Executor executor) {
        return new Builder(executor);
    }

    public final void a(ArrayList arrayList) {
        int i10;
        ArrayList arrayList2 = new ArrayList();
        synchronized (this) {
            Iterator it = this.f47664d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((Provider) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList.addAll(this.f47668h.processRegistrar(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException e5) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e5);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                i10 = 0;
                if (!it2.hasNext()) {
                    break;
                }
                Object[] array = ((Component) it2.next()).getProvidedInterfaces().toArray();
                int length = array.length;
                while (i10 < length) {
                    Object obj = array[i10];
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.f47665e.contains(obj.toString())) {
                            it2.remove();
                            break;
                        }
                        this.f47665e.add(obj.toString());
                    }
                    i10++;
                }
            }
            if (this.f47661a.isEmpty()) {
                h.a(arrayList);
            } else {
                ArrayList arrayList3 = new ArrayList(this.f47661a.keySet());
                arrayList3.addAll(arrayList);
                h.a(arrayList3);
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Component component = (Component) it3.next();
                this.f47661a.put(component, new Lazy(new d(this, component, i10)));
            }
            arrayList2.addAll(d(arrayList));
            arrayList2.addAll(e());
            c();
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        Boolean bool = this.f47667g.get();
        if (bool != null) {
            b(this.f47661a, bool.booleanValue());
        }
    }

    public final void b(Map<Component<?>, Provider<?>> map, boolean z10) {
        ArrayDeque arrayDeque;
        for (Map.Entry<Component<?>, Provider<?>> entry : map.entrySet()) {
            Component<?> key = entry.getKey();
            Provider<?> value = entry.getValue();
            if (key.isAlwaysEager() || (key.isEagerInDefaultApp() && z10)) {
                value.get();
            }
        }
        i iVar = this.f47666f;
        synchronized (iVar) {
            arrayDeque = iVar.f93577b;
            if (arrayDeque != null) {
                iVar.f93577b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                iVar.publish((Event) it.next());
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void c() {
        for (Component component : this.f47661a.keySet()) {
            for (Dependency dependency : component.getDependencies()) {
                if (dependency.isSet()) {
                    Qualified<?> qualified = dependency.getInterface();
                    HashMap map = this.f47663c;
                    if (!map.containsKey(qualified)) {
                        Qualified<?> qualified2 = dependency.getInterface();
                        Set setEmptySet = Collections.emptySet();
                        j jVar = new j();
                        jVar.f93580b = null;
                        jVar.f93579a = Collections.newSetFromMap(new ConcurrentHashMap());
                        jVar.f93579a.addAll(setEmptySet);
                        map.put(qualified2, jVar);
                    }
                }
                Qualified<?> qualified3 = dependency.getInterface();
                HashMap map2 = this.f47662b;
                if (map2.containsKey(qualified3)) {
                    continue;
                } else {
                    if (dependency.isRequired()) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", component, dependency.getInterface()));
                    }
                    if (!dependency.isSet()) {
                        map2.put(dependency.getInterface(), new m(m.f93583c, m.f93584d));
                    }
                }
            }
        }
    }

    public final ArrayList d(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Component component = (Component) it.next();
            if (component.isValue()) {
                Provider provider = (Provider) this.f47661a.get(component);
                for (Qualified qualified : component.getProvidedInterfaces()) {
                    HashMap map = this.f47662b;
                    if (map.containsKey(qualified)) {
                        arrayList2.add(new g((m) ((Provider) map.get(qualified)), provider, 0));
                    } else {
                        map.put(qualified, provider);
                    }
                }
            }
        }
        return arrayList2;
    }

    @Override // com.google.firebase.dynamicloading.ComponentLoader
    public void discoverComponents() {
        synchronized (this) {
            try {
                if (this.f47664d.isEmpty()) {
                    return;
                }
                a(new ArrayList());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f47661a.entrySet()) {
            Component component = (Component) entry.getKey();
            if (!component.isValue()) {
                Provider provider = (Provider) entry.getValue();
                for (Qualified qualified : component.getProvidedInterfaces()) {
                    if (!map.containsKey(qualified)) {
                        map.put(qualified, new HashSet());
                    }
                    ((Set) map.get(qualified)).add(provider);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            HashMap map2 = this.f47663c;
            if (map2.containsKey(key)) {
                j jVar = (j) map2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new b(jVar, (Provider) it.next(), 1));
                }
            } else {
                Qualified qualified2 = (Qualified) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                j jVar2 = new j();
                jVar2.f93580b = null;
                jVar2.f93579a = Collections.newSetFromMap(new ConcurrentHashMap());
                jVar2.f93579a.addAll(set);
                map2.put(qualified2, jVar2);
            }
        }
        return arrayList;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final /* synthetic */ Object get(Qualified qualified) {
        return tf.b.a(this, qualified);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final /* synthetic */ Deferred getDeferred(Class cls) {
        return tf.b.c(this, cls);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final /* synthetic */ Provider getProvider(Class cls) {
        return tf.b.d(this, cls);
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    @VisibleForTesting
    public void initializeAllComponentsForTests() {
        Iterator it = this.f47661a.values().iterator();
        while (it.hasNext()) {
            ((Provider) it.next()).get();
        }
    }

    public void initializeEagerComponents(boolean z10) {
        HashMap map;
        AtomicReference<Boolean> atomicReference = this.f47667g;
        Boolean boolValueOf = Boolean.valueOf(z10);
        while (!atomicReference.compareAndSet(null, boolValueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            map = new HashMap(this.f47661a);
        }
        b(map, z10);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final /* synthetic */ Set setOf(Qualified qualified) {
        return tf.b.e(this, qualified);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final /* synthetic */ Provider setOfProvider(Class cls) {
        return tf.b.g(this, cls);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final /* synthetic */ Object get(Class cls) {
        return tf.b.b(this, cls);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public <T> Deferred<T> getDeferred(Qualified<T> qualified) {
        Provider<T> provider = getProvider(qualified);
        if (provider == null) {
            return new m(m.f93583c, m.f93584d);
        }
        return provider instanceof m ? (m) provider : new m(null, provider);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public synchronized <T> Provider<T> getProvider(Qualified<T> qualified) {
        Preconditions.checkNotNull(qualified, "Null interface requested.");
        return (Provider) this.f47662b.get(qualified);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public final /* synthetic */ Set setOf(Class cls) {
        return tf.b.f(this, cls);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public synchronized <T> Provider<Set<T>> setOfProvider(Qualified<T> qualified) {
        j jVar = (j) this.f47663c.get(qualified);
        if (jVar != null) {
            return jVar;
        }
        return f47660i;
    }

    @Deprecated
    public ComponentRuntime(Executor executor, Iterable<ComponentRegistrar> iterable, Component<?>... componentArr) {
        ArrayList arrayList = new ArrayList();
        Iterator<ComponentRegistrar> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new e(it.next()));
        }
        this(executor, arrayList, Arrays.asList(componentArr), ComponentRegistrarProcessor.NOOP);
    }
}
