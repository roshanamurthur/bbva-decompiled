package io.reactivex.internal.functions;

import io.reactivex.Notification;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Function4;
import io.reactivex.functions.Function5;
import io.reactivex.functions.Function6;
import io.reactivex.functions.Function7;
import io.reactivex.functions.Function8;
import io.reactivex.functions.Function9;
import io.reactivex.functions.LongConsumer;
import io.reactivex.functions.Predicate;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Timed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes8.dex */
public final class Functions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f69894a = new w();
    public static final Runnable EMPTY_RUNNABLE = new q();
    public static final Action EMPTY_ACTION = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f69895b = new o();
    public static final Consumer<Throwable> ERROR_CONSUMER = new s();
    public static final Consumer<Throwable> ON_ERROR_MISSING = new g0();
    public static final LongConsumer EMPTY_LONG_CONSUMER = new p();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l0 f69896c = new l0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f69897d = new t();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f0 f69898e = new f0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b0 f69899f = new b0();
    public static final Consumer<Subscription> REQUEST_MAX = new z();

    public static class BoundedConsumer implements Consumer<Subscription> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final int f69900p0;

        public BoundedConsumer(int i10) {
            this.f69900p0 = i10;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Subscription subscription) throws Exception {
            subscription.request(this.f69900p0);
        }
    }

    public static final class a<T> implements Consumer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Action f69901p0;

        public a(Action action) {
            this.f69901p0 = action;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(T t10) throws Exception {
            this.f69901p0.run();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a0 implements Comparator<Object> {
        private static final /* synthetic */ a0[] $VALUES;
        public static final a0 INSTANCE;

        static {
            a0 a0Var = new a0("INSTANCE", 0);
            INSTANCE = a0Var;
            $VALUES = new a0[]{a0Var};
        }

        public a0() {
            throw null;
        }

        public static a0 valueOf(String str) {
            return (a0) Enum.valueOf(a0.class, str);
        }

        public static a0[] values() {
            return (a0[]) $VALUES.clone();
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    public static final class b<T1, T2, R> implements Function<Object[], R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final BiFunction<? super T1, ? super T2, ? extends R> f69902p0;

        public b(BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
            this.f69902p0 = biFunction;
        }

        @Override // io.reactivex.functions.Function
        public final Object apply(Object[] objArr) throws Exception {
            Object[] objArr2 = objArr;
            if (objArr2.length == 2) {
                return this.f69902p0.apply(objArr2[0], objArr2[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr2.length);
        }
    }

    public static final class b0 implements Comparator<Object> {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    public static final class c<T1, T2, T3, R> implements Function<Object[], R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function3<T1, T2, T3, R> f69903p0;

        public c(Function3<T1, T2, T3, R> function3) {
            this.f69903p0 = function3;
        }

        @Override // io.reactivex.functions.Function
        public final Object apply(Object[] objArr) throws Exception {
            Object[] objArr2 = objArr;
            if (objArr2.length != 3) {
                throw new IllegalArgumentException("Array of size 3 expected but got " + objArr2.length);
            }
            return this.f69903p0.apply((T1) objArr2[0], (T2) objArr2[1], (T3) objArr2[2]);
        }
    }

    public static final class c0<T> implements Action {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Consumer<? super Notification<T>> f69904p0;

        public c0(Consumer<? super Notification<T>> consumer) {
            this.f69904p0 = consumer;
        }

        @Override // io.reactivex.functions.Action
        public final void run() throws Exception {
            this.f69904p0.accept(Notification.createOnComplete());
        }
    }

    public static final class d<T1, T2, T3, T4, R> implements Function<Object[], R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function4<T1, T2, T3, T4, R> f69905p0;

        public d(Function4<T1, T2, T3, T4, R> function4) {
            this.f69905p0 = function4;
        }

        @Override // io.reactivex.functions.Function
        public final Object apply(Object[] objArr) throws Exception {
            Object[] objArr2 = objArr;
            if (objArr2.length != 4) {
                throw new IllegalArgumentException("Array of size 4 expected but got " + objArr2.length);
            }
            return this.f69905p0.apply((T1) objArr2[0], (T2) objArr2[1], (T3) objArr2[2], (T4) objArr2[3]);
        }
    }

    public static final class d0<T> implements Consumer<Throwable> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Consumer<? super Notification<T>> f69906p0;

        public d0(Consumer<? super Notification<T>> consumer) {
            this.f69906p0 = consumer;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Throwable th2) throws Exception {
            this.f69906p0.accept(Notification.createOnError(th2));
        }
    }

    public static final class e<T1, T2, T3, T4, T5, R> implements Function<Object[], R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function5<T1, T2, T3, T4, T5, R> f69907p0;

        public e(Function5<T1, T2, T3, T4, T5, R> function5) {
            this.f69907p0 = function5;
        }

        @Override // io.reactivex.functions.Function
        public final Object apply(Object[] objArr) throws Exception {
            Object[] objArr2 = objArr;
            if (objArr2.length != 5) {
                throw new IllegalArgumentException("Array of size 5 expected but got " + objArr2.length);
            }
            return this.f69907p0.apply((T1) objArr2[0], (T2) objArr2[1], (T3) objArr2[2], (T4) objArr2[3], (T5) objArr2[4]);
        }
    }

    public static final class e0<T> implements Consumer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Consumer<? super Notification<T>> f69908p0;

        public e0(Consumer<? super Notification<T>> consumer) {
            this.f69908p0 = consumer;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(T t10) throws Exception {
            this.f69908p0.accept(Notification.createOnNext(t10));
        }
    }

    public static final class f<T1, T2, T3, T4, T5, T6, R> implements Function<Object[], R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function6<T1, T2, T3, T4, T5, T6, R> f69909p0;

        public f(Function6<T1, T2, T3, T4, T5, T6, R> function6) {
            this.f69909p0 = function6;
        }

        @Override // io.reactivex.functions.Function
        public final Object apply(Object[] objArr) throws Exception {
            Object[] objArr2 = objArr;
            if (objArr2.length != 6) {
                throw new IllegalArgumentException("Array of size 6 expected but got " + objArr2.length);
            }
            return this.f69909p0.apply((T1) objArr2[0], (T2) objArr2[1], (T3) objArr2[2], (T4) objArr2[3], (T5) objArr2[4], (T6) objArr2[5]);
        }
    }

    public static final class f0 implements Callable<Object> {
        @Override // java.util.concurrent.Callable
        public final Object call() {
            return null;
        }
    }

    public static final class g<T1, T2, T3, T4, T5, T6, T7, R> implements Function<Object[], R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function7<T1, T2, T3, T4, T5, T6, T7, R> f69910p0;

        public g(Function7<T1, T2, T3, T4, T5, T6, T7, R> function7) {
            this.f69910p0 = function7;
        }

        @Override // io.reactivex.functions.Function
        public final Object apply(Object[] objArr) throws Exception {
            Object[] objArr2 = objArr;
            if (objArr2.length != 7) {
                throw new IllegalArgumentException("Array of size 7 expected but got " + objArr2.length);
            }
            return this.f69910p0.apply((T1) objArr2[0], (T2) objArr2[1], (T3) objArr2[2], (T4) objArr2[3], (T5) objArr2[4], (T6) objArr2[5], (T7) objArr2[6]);
        }
    }

    public static final class g0 implements Consumer<Throwable> {
        @Override // io.reactivex.functions.Consumer
        public final void accept(Throwable th2) throws Exception {
            RxJavaPlugins.onError(new OnErrorNotImplementedException(th2));
        }
    }

    public static final class h<T1, T2, T3, T4, T5, T6, T7, T8, R> implements Function<Object[], R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> f69911p0;

        public h(Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> function8) {
            this.f69911p0 = function8;
        }

        @Override // io.reactivex.functions.Function
        public final Object apply(Object[] objArr) throws Exception {
            Object[] objArr2 = objArr;
            if (objArr2.length != 8) {
                throw new IllegalArgumentException("Array of size 8 expected but got " + objArr2.length);
            }
            return this.f69911p0.apply((T1) objArr2[0], (T2) objArr2[1], (T3) objArr2[2], (T4) objArr2[3], (T5) objArr2[4], (T6) objArr2[5], (T7) objArr2[6], (T8) objArr2[7]);
        }
    }

    public static final class h0<T> implements Function<T, Timed<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final TimeUnit f69912p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Scheduler f69913q0;

        public h0(TimeUnit timeUnit, Scheduler scheduler) {
            this.f69912p0 = timeUnit;
            this.f69913q0 = scheduler;
        }

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) throws Exception {
            Scheduler scheduler = this.f69913q0;
            TimeUnit timeUnit = this.f69912p0;
            return new Timed(obj, scheduler.now(timeUnit), timeUnit);
        }
    }

    public static final class i<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements Function<Object[], R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f69914p0;

        public i(Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> function9) {
            this.f69914p0 = function9;
        }

        @Override // io.reactivex.functions.Function
        public final Object apply(Object[] objArr) throws Exception {
            Object[] objArr2 = objArr;
            if (objArr2.length != 9) {
                throw new IllegalArgumentException("Array of size 9 expected but got " + objArr2.length);
            }
            return this.f69914p0.apply((T1) objArr2[0], (T2) objArr2[1], (T3) objArr2[2], (T4) objArr2[3], (T5) objArr2[4], (T6) objArr2[5], (T7) objArr2[6], (T8) objArr2[7], (T9) objArr2[8]);
        }
    }

    public static final class i0<K, T> implements BiConsumer<Map<K, T>, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function<? super T, ? extends K> f69915a;

        public i0(Function<? super T, ? extends K> function) {
            this.f69915a = function;
        }

        @Override // io.reactivex.functions.BiConsumer
        public final void accept(Object obj, Object obj2) throws Exception {
            ((Map) obj).put(this.f69915a.apply(obj2), obj2);
        }
    }

    public static final class j<T> implements Callable<List<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final int f69916p0;

        public j(int i10) {
            this.f69916p0 = i10;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() throws Exception {
            return new ArrayList(this.f69916p0);
        }
    }

    public static final class j0<K, V, T> implements BiConsumer<Map<K, V>, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function<? super T, ? extends V> f69917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function<? super T, ? extends K> f69918b;

        public j0(Function<? super T, ? extends V> function, Function<? super T, ? extends K> function2) {
            this.f69917a = function;
            this.f69918b = function2;
        }

        @Override // io.reactivex.functions.BiConsumer
        public final void accept(Object obj, Object obj2) throws Exception {
            ((Map) obj).put(this.f69918b.apply(obj2), this.f69917a.apply(obj2));
        }
    }

    public static final class k<T> implements Predicate<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final BooleanSupplier f69919p0;

        public k(BooleanSupplier booleanSupplier) {
            this.f69919p0 = booleanSupplier;
        }

        @Override // io.reactivex.functions.Predicate
        public final boolean test(T t10) throws Exception {
            return !this.f69919p0.getAsBoolean();
        }
    }

    public static final class k0<K, V, T> implements BiConsumer<Map<K, Collection<V>>, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function<? super K, ? extends Collection<? super V>> f69920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function<? super T, ? extends V> f69921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Function<? super T, ? extends K> f69922c;

        public k0(Function<? super K, ? extends Collection<? super V>> function, Function<? super T, ? extends V> function2, Function<? super T, ? extends K> function3) {
            this.f69920a = function;
            this.f69921b = function2;
            this.f69922c = function3;
        }

        @Override // io.reactivex.functions.BiConsumer
        public final void accept(Object obj, Object obj2) throws Exception {
            Map map = (Map) obj;
            K kApply = this.f69922c.apply(obj2);
            Collection<? super V> collectionApply = (Collection) map.get(kApply);
            if (collectionApply == null) {
                collectionApply = this.f69920a.apply(kApply);
                map.put(kApply, collectionApply);
            }
            collectionApply.add(this.f69921b.apply(obj2));
        }
    }

    public static final class l<T, U> implements Function<T, U> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Class<U> f69923p0;

        public l(Class<U> cls) {
            this.f69923p0 = cls;
        }

        @Override // io.reactivex.functions.Function
        public final U apply(T t10) throws Exception {
            return this.f69923p0.cast(t10);
        }
    }

    public static final class l0 implements Predicate<Object> {
        @Override // io.reactivex.functions.Predicate
        public final boolean test(Object obj) {
            return true;
        }
    }

    public static final class m<T, U> implements Predicate<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Class<U> f69924p0;

        public m(Class<U> cls) {
            this.f69924p0 = cls;
        }

        @Override // io.reactivex.functions.Predicate
        public final boolean test(T t10) throws Exception {
            return this.f69924p0.isInstance(t10);
        }
    }

    public static final class r<T> implements Predicate<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final T f69925p0;

        public r(T t10) {
            this.f69925p0 = t10;
        }

        @Override // io.reactivex.functions.Predicate
        public final boolean test(T t10) throws Exception {
            return ObjectHelper.equals(t10, this.f69925p0);
        }
    }

    public static final class s implements Consumer<Throwable> {
        @Override // io.reactivex.functions.Consumer
        public final void accept(Throwable th2) throws Exception {
            RxJavaPlugins.onError(th2);
        }
    }

    public static final class t implements Predicate<Object> {
        @Override // io.reactivex.functions.Predicate
        public final boolean test(Object obj) {
            return false;
        }
    }

    public static final class u implements Action {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Future<?> f69926p0;

        public u(Future<?> future) {
            this.f69926p0 = future;
        }

        @Override // io.reactivex.functions.Action
        public final void run() throws Exception {
            this.f69926p0.get();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class v implements Callable<Set<Object>> {
        private static final /* synthetic */ v[] $VALUES;
        public static final v INSTANCE;

        static {
            v vVar = new v("INSTANCE", 0);
            INSTANCE = vVar;
            $VALUES = new v[]{vVar};
        }

        public v() {
            throw null;
        }

        public static v valueOf(String str) {
            return (v) Enum.valueOf(v.class, str);
        }

        public static v[] values() {
            return (v[]) $VALUES.clone();
        }

        @Override // java.util.concurrent.Callable
        public final Set<Object> call() throws Exception {
            return new HashSet();
        }
    }

    public static final class x<T, U> implements Callable<U>, Function<T, U> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final U f69927p0;

        public x(U u2) {
            this.f69927p0 = u2;
        }

        @Override // io.reactivex.functions.Function
        public final U apply(T t10) throws Exception {
            return this.f69927p0;
        }

        @Override // java.util.concurrent.Callable
        public final U call() throws Exception {
            return this.f69927p0;
        }
    }

    public static final class y<T> implements Function<List<T>, List<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Comparator<? super T> f69928p0;

        public y(Comparator<? super T> comparator) {
            this.f69928p0 = comparator;
        }

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) throws Exception {
            List list = (List) obj;
            Collections.sort(list, this.f69928p0);
            return list;
        }
    }

    public static final class z implements Consumer<Subscription> {
        @Override // io.reactivex.functions.Consumer
        public final void accept(Subscription subscription) throws Exception {
            subscription.request(Long.MAX_VALUE);
        }
    }

    public Functions() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Consumer<T> actionConsumer(Action action) {
        return new a(action);
    }

    public static <T> Predicate<T> alwaysFalse() {
        return f69897d;
    }

    public static <T> Predicate<T> alwaysTrue() {
        return f69896c;
    }

    public static <T> Consumer<T> boundedConsumer(int i10) {
        return new BoundedConsumer(i10);
    }

    public static <T, U> Function<T, U> castFunction(Class<U> cls) {
        return new l(cls);
    }

    public static <T> Callable<List<T>> createArrayList(int i10) {
        return new j(i10);
    }

    public static <T> Callable<Set<T>> createHashSet() {
        return v.INSTANCE;
    }

    public static <T> Consumer<T> emptyConsumer() {
        return f69895b;
    }

    public static <T> Predicate<T> equalsWith(T t10) {
        return new r(t10);
    }

    public static Action futureAction(Future<?> future) {
        return new u(future);
    }

    public static <T> Function<T, T> identity() {
        return f69894a;
    }

    public static <T, U> Predicate<T> isInstanceOf(Class<U> cls) {
        return new m(cls);
    }

    public static <T> Callable<T> justCallable(T t10) {
        return new x(t10);
    }

    public static <T, U> Function<T, U> justFunction(U u2) {
        return new x(u2);
    }

    public static <T> Function<List<T>, List<T>> listSorter(Comparator<? super T> comparator) {
        return new y(comparator);
    }

    public static <T> Comparator<T> naturalComparator() {
        return a0.INSTANCE;
    }

    public static <T> Comparator<T> naturalOrder() {
        return f69899f;
    }

    public static <T> Action notificationOnComplete(Consumer<? super Notification<T>> consumer) {
        return new c0(consumer);
    }

    public static <T> Consumer<Throwable> notificationOnError(Consumer<? super Notification<T>> consumer) {
        return new d0(consumer);
    }

    public static <T> Consumer<T> notificationOnNext(Consumer<? super Notification<T>> consumer) {
        return new e0(consumer);
    }

    public static <T> Callable<T> nullSupplier() {
        return f69898e;
    }

    public static <T> Predicate<T> predicateReverseFor(BooleanSupplier booleanSupplier) {
        return new k(booleanSupplier);
    }

    public static <T> Function<T, Timed<T>> timestampWith(TimeUnit timeUnit, Scheduler scheduler) {
        return new h0(timeUnit, scheduler);
    }

    public static <T1, T2, R> Function<Object[], R> toFunction(BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        ObjectHelper.requireNonNull(biFunction, "f is null");
        return new b(biFunction);
    }

    public static <T, K> BiConsumer<Map<K, T>, T> toMapKeySelector(Function<? super T, ? extends K> function) {
        return new i0(function);
    }

    public static <T, K, V> BiConsumer<Map<K, V>, T> toMapKeyValueSelector(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return new j0(function2, function);
    }

    public static <T, K, V> BiConsumer<Map<K, Collection<V>>, T> toMultimapKeyValueSelector(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, Function<? super K, ? extends Collection<? super V>> function3) {
        return new k0(function3, function2, function);
    }

    public static <T1, T2, T3, R> Function<Object[], R> toFunction(Function3<T1, T2, T3, R> function3) {
        ObjectHelper.requireNonNull(function3, "f is null");
        return new c(function3);
    }

    public static <T1, T2, T3, T4, R> Function<Object[], R> toFunction(Function4<T1, T2, T3, T4, R> function4) {
        ObjectHelper.requireNonNull(function4, "f is null");
        return new d(function4);
    }

    public static <T1, T2, T3, T4, T5, R> Function<Object[], R> toFunction(Function5<T1, T2, T3, T4, T5, R> function5) {
        ObjectHelper.requireNonNull(function5, "f is null");
        return new e(function5);
    }

    public static <T1, T2, T3, T4, T5, T6, R> Function<Object[], R> toFunction(Function6<T1, T2, T3, T4, T5, T6, R> function6) {
        ObjectHelper.requireNonNull(function6, "f is null");
        return new f(function6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Function<Object[], R> toFunction(Function7<T1, T2, T3, T4, T5, T6, T7, R> function7) {
        ObjectHelper.requireNonNull(function7, "f is null");
        return new g(function7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Function<Object[], R> toFunction(Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> function8) {
        ObjectHelper.requireNonNull(function8, "f is null");
        return new h(function8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Function<Object[], R> toFunction(Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> function9) {
        ObjectHelper.requireNonNull(function9, "f is null");
        return new i(function9);
    }

    public static final class n implements Action {
        public final String toString() {
            return "EmptyAction";
        }

        @Override // io.reactivex.functions.Action
        public final void run() {
        }
    }

    public static final class q implements Runnable {
        public final String toString() {
            return "EmptyRunnable";
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    public static final class o implements Consumer<Object> {
        public final String toString() {
            return "EmptyConsumer";
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) {
        }
    }

    public static final class p implements LongConsumer {
        @Override // io.reactivex.functions.LongConsumer
        public final void accept(long j10) {
        }
    }

    public static final class w implements Function<Object, Object> {
        public final String toString() {
            return "IdentityFunction";
        }

        @Override // io.reactivex.functions.Function
        public final Object apply(Object obj) {
            return obj;
        }
    }
}
