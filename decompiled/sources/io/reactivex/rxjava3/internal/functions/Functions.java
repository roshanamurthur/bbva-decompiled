package io.reactivex.rxjava3.internal.functions;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.BiConsumer;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BooleanSupplier;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Function5;
import io.reactivex.rxjava3.functions.Function6;
import io.reactivex.rxjava3.functions.Function7;
import io.reactivex.rxjava3.functions.Function8;
import io.reactivex.rxjava3.functions.Function9;
import io.reactivex.rxjava3.functions.LongConsumer;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.schedulers.Timed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class Functions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f73969a = new w();
    public static final Runnable EMPTY_RUNNABLE = new q();
    public static final Action EMPTY_ACTION = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f73970b = new o();
    public static final Consumer<Throwable> ERROR_CONSUMER = new s();
    public static final Consumer<Throwable> ON_ERROR_MISSING = new f0();
    public static final LongConsumer EMPTY_LONG_CONSUMER = new p();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k0 f73971c = new k0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f73972d = new t();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e0 f73973e = new e0();
    public static final Consumer<Subscription> REQUEST_MAX = new z();

    public static class BoundedConsumer implements Consumer<Subscription> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final int f73974p0;

        public BoundedConsumer(int i10) {
            this.f73974p0 = i10;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public void accept(Subscription subscription) {
            subscription.request(this.f73974p0);
        }
    }

    public static final class a<T> implements Consumer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Action f73975p0;

        public a(Action action) {
            this.f73975p0 = action;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(T t10) throws Throwable {
            this.f73975p0.run();
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
        public final BiFunction<? super T1, ? super T2, ? extends R> f73976p0;

        public b(BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
            this.f73976p0 = biFunction;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object[] objArr) throws Throwable {
            Object[] objArr2 = objArr;
            if (objArr2.length == 2) {
                return this.f73976p0.apply(objArr2[0], objArr2[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr2.length);
        }
    }

    public static final class b0<T> implements Action {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Consumer<? super Notification<T>> f73977p0;

        public b0(Consumer<? super Notification<T>> consumer) {
            this.f73977p0 = consumer;
        }

        @Override // io.reactivex.rxjava3.functions.Action
        public final void run() throws Throwable {
            this.f73977p0.accept(Notification.createOnComplete());
        }
    }

    public static final class c<T1, T2, T3, R> implements Function<Object[], R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function3<T1, T2, T3, R> f73978p0;

        public c(Function3<T1, T2, T3, R> function3) {
            this.f73978p0 = function3;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object[] objArr) throws Throwable {
            Object[] objArr2 = objArr;
            if (objArr2.length != 3) {
                throw new IllegalArgumentException("Array of size 3 expected but got " + objArr2.length);
            }
            return this.f73978p0.apply((T1) objArr2[0], (T2) objArr2[1], (T3) objArr2[2]);
        }
    }

    public static final class c0<T> implements Consumer<Throwable> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Consumer<? super Notification<T>> f73979p0;

        public c0(Consumer<? super Notification<T>> consumer) {
            this.f73979p0 = consumer;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Throwable th2) throws Throwable {
            this.f73979p0.accept(Notification.createOnError(th2));
        }
    }

    public static final class d<T1, T2, T3, T4, R> implements Function<Object[], R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function4<T1, T2, T3, T4, R> f73980p0;

        public d(Function4<T1, T2, T3, T4, R> function4) {
            this.f73980p0 = function4;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object[] objArr) throws Throwable {
            Object[] objArr2 = objArr;
            if (objArr2.length != 4) {
                throw new IllegalArgumentException("Array of size 4 expected but got " + objArr2.length);
            }
            return this.f73980p0.apply((T1) objArr2[0], (T2) objArr2[1], (T3) objArr2[2], (T4) objArr2[3]);
        }
    }

    public static final class d0<T> implements Consumer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Consumer<? super Notification<T>> f73981p0;

        public d0(Consumer<? super Notification<T>> consumer) {
            this.f73981p0 = consumer;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(T t10) throws Throwable {
            this.f73981p0.accept(Notification.createOnNext(t10));
        }
    }

    public static final class e<T1, T2, T3, T4, T5, R> implements Function<Object[], R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function5<T1, T2, T3, T4, T5, R> f73982p0;

        public e(Function5<T1, T2, T3, T4, T5, R> function5) {
            this.f73982p0 = function5;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object[] objArr) throws Throwable {
            Object[] objArr2 = objArr;
            if (objArr2.length != 5) {
                throw new IllegalArgumentException("Array of size 5 expected but got " + objArr2.length);
            }
            return this.f73982p0.apply((T1) objArr2[0], (T2) objArr2[1], (T3) objArr2[2], (T4) objArr2[3], (T5) objArr2[4]);
        }
    }

    public static final class e0 implements Supplier<Object> {
        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() {
            return null;
        }
    }

    public static final class f<T1, T2, T3, T4, T5, T6, R> implements Function<Object[], R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function6<T1, T2, T3, T4, T5, T6, R> f73983p0;

        public f(Function6<T1, T2, T3, T4, T5, T6, R> function6) {
            this.f73983p0 = function6;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object[] objArr) throws Throwable {
            Object[] objArr2 = objArr;
            if (objArr2.length != 6) {
                throw new IllegalArgumentException("Array of size 6 expected but got " + objArr2.length);
            }
            return this.f73983p0.apply((T1) objArr2[0], (T2) objArr2[1], (T3) objArr2[2], (T4) objArr2[3], (T5) objArr2[4], (T6) objArr2[5]);
        }
    }

    public static final class f0 implements Consumer<Throwable> {
        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Throwable th2) throws Throwable {
            RxJavaPlugins.onError(new OnErrorNotImplementedException(th2));
        }
    }

    public static final class g<T1, T2, T3, T4, T5, T6, T7, R> implements Function<Object[], R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function7<T1, T2, T3, T4, T5, T6, T7, R> f73984p0;

        public g(Function7<T1, T2, T3, T4, T5, T6, T7, R> function7) {
            this.f73984p0 = function7;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object[] objArr) throws Throwable {
            Object[] objArr2 = objArr;
            if (objArr2.length != 7) {
                throw new IllegalArgumentException("Array of size 7 expected but got " + objArr2.length);
            }
            return this.f73984p0.apply((T1) objArr2[0], (T2) objArr2[1], (T3) objArr2[2], (T4) objArr2[3], (T5) objArr2[4], (T6) objArr2[5], (T7) objArr2[6]);
        }
    }

    public static final class g0<T> implements Function<T, Timed<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final TimeUnit f73985p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Scheduler f73986q0;

        public g0(TimeUnit timeUnit, Scheduler scheduler) {
            this.f73985p0 = timeUnit;
            this.f73986q0 = scheduler;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) throws Throwable {
            Scheduler scheduler = this.f73986q0;
            TimeUnit timeUnit = this.f73985p0;
            return new Timed(obj, scheduler.now(timeUnit), timeUnit);
        }
    }

    public static final class h<T1, T2, T3, T4, T5, T6, T7, T8, R> implements Function<Object[], R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> f73987p0;

        public h(Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> function8) {
            this.f73987p0 = function8;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object[] objArr) throws Throwable {
            Object[] objArr2 = objArr;
            if (objArr2.length != 8) {
                throw new IllegalArgumentException("Array of size 8 expected but got " + objArr2.length);
            }
            return this.f73987p0.apply((T1) objArr2[0], (T2) objArr2[1], (T3) objArr2[2], (T4) objArr2[3], (T5) objArr2[4], (T6) objArr2[5], (T7) objArr2[6], (T8) objArr2[7]);
        }
    }

    public static final class h0<K, T> implements BiConsumer<Map<K, T>, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function<? super T, ? extends K> f73988a;

        public h0(Function<? super T, ? extends K> function) {
            this.f73988a = function;
        }

        @Override // io.reactivex.rxjava3.functions.BiConsumer
        public final void accept(Object obj, Object obj2) throws Throwable {
            ((Map) obj).put(this.f73988a.apply(obj2), obj2);
        }
    }

    public static final class i<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements Function<Object[], R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f73989p0;

        public i(Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> function9) {
            this.f73989p0 = function9;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object[] objArr) throws Throwable {
            Object[] objArr2 = objArr;
            if (objArr2.length != 9) {
                throw new IllegalArgumentException("Array of size 9 expected but got " + objArr2.length);
            }
            return this.f73989p0.apply((T1) objArr2[0], (T2) objArr2[1], (T3) objArr2[2], (T4) objArr2[3], (T5) objArr2[4], (T6) objArr2[5], (T7) objArr2[6], (T8) objArr2[7], (T9) objArr2[8]);
        }
    }

    public static final class i0<K, V, T> implements BiConsumer<Map<K, V>, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function<? super T, ? extends V> f73990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function<? super T, ? extends K> f73991b;

        public i0(Function<? super T, ? extends V> function, Function<? super T, ? extends K> function2) {
            this.f73990a = function;
            this.f73991b = function2;
        }

        @Override // io.reactivex.rxjava3.functions.BiConsumer
        public final void accept(Object obj, Object obj2) throws Throwable {
            ((Map) obj).put(this.f73991b.apply(obj2), this.f73990a.apply(obj2));
        }
    }

    public static final class j<T> implements Supplier<List<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final int f73992p0;

        public j(int i10) {
            this.f73992p0 = i10;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Object get() throws Throwable {
            return new ArrayList(this.f73992p0);
        }
    }

    public static final class j0<K, V, T> implements BiConsumer<Map<K, Collection<V>>, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function<? super K, ? extends Collection<? super V>> f73993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function<? super T, ? extends V> f73994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Function<? super T, ? extends K> f73995c;

        public j0(Function<? super K, ? extends Collection<? super V>> function, Function<? super T, ? extends V> function2, Function<? super T, ? extends K> function3) {
            this.f73993a = function;
            this.f73994b = function2;
            this.f73995c = function3;
        }

        @Override // io.reactivex.rxjava3.functions.BiConsumer
        public final void accept(Object obj, Object obj2) throws Throwable {
            Map map = (Map) obj;
            K kApply = this.f73995c.apply(obj2);
            Collection<? super V> collectionApply = (Collection) map.get(kApply);
            if (collectionApply == null) {
                collectionApply = this.f73993a.apply(kApply);
                map.put(kApply, collectionApply);
            }
            collectionApply.add(this.f73994b.apply(obj2));
        }
    }

    public static final class k<T> implements Predicate<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final BooleanSupplier f73996p0;

        public k(BooleanSupplier booleanSupplier) {
            this.f73996p0 = booleanSupplier;
        }

        @Override // io.reactivex.rxjava3.functions.Predicate
        public final boolean test(T t10) throws Throwable {
            return !this.f73996p0.getAsBoolean();
        }
    }

    public static final class k0 implements Predicate<Object> {
        @Override // io.reactivex.rxjava3.functions.Predicate
        public final boolean test(Object obj) {
            return true;
        }
    }

    public static final class l<T, U> implements Function<T, U> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Class<U> f73997p0;

        public l(Class<U> cls) {
            this.f73997p0 = cls;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final U apply(T t10) {
            return this.f73997p0.cast(t10);
        }
    }

    public static final class m<T, U> implements Predicate<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Class<U> f73998p0;

        public m(Class<U> cls) {
            this.f73998p0 = cls;
        }

        @Override // io.reactivex.rxjava3.functions.Predicate
        public final boolean test(T t10) {
            return this.f73998p0.isInstance(t10);
        }
    }

    public static final class r<T> implements Predicate<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final T f73999p0;

        public r(T t10) {
            this.f73999p0 = t10;
        }

        @Override // io.reactivex.rxjava3.functions.Predicate
        public final boolean test(T t10) {
            return Objects.equals(t10, this.f73999p0);
        }
    }

    public static final class s implements Consumer<Throwable> {
        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Throwable th2) throws Throwable {
            RxJavaPlugins.onError(th2);
        }
    }

    public static final class t implements Predicate<Object> {
        @Override // io.reactivex.rxjava3.functions.Predicate
        public final boolean test(Object obj) {
            return false;
        }
    }

    public static final class u implements Action {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Future<?> f74000p0;

        public u(Future<?> future) {
            this.f74000p0 = future;
        }

        @Override // io.reactivex.rxjava3.functions.Action
        public final void run() throws Exception {
            this.f74000p0.get();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class v implements Supplier<Set<Object>> {
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

        @Override // io.reactivex.rxjava3.functions.Supplier
        public final Set<Object> get() throws Throwable {
            return new HashSet();
        }
    }

    public static final class x<T, U> implements Callable<U>, Supplier<U>, Function<T, U> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final U f74001p0;

        public x(U u2) {
            this.f74001p0 = u2;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final U apply(T t10) {
            return this.f74001p0;
        }

        @Override // java.util.concurrent.Callable
        public final U call() {
            return this.f74001p0;
        }

        @Override // io.reactivex.rxjava3.functions.Supplier
        public final U get() {
            return this.f74001p0;
        }
    }

    public static final class y<T> implements Function<List<T>, List<T>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Comparator<? super T> f74002p0;

        public y(Comparator<? super T> comparator) {
            this.f74002p0 = comparator;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) throws Throwable {
            List list = (List) obj;
            Collections.sort(list, this.f74002p0);
            return list;
        }
    }

    public static final class z implements Consumer<Subscription> {
        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Subscription subscription) throws Throwable {
            subscription.request(Long.MAX_VALUE);
        }
    }

    public Functions() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Consumer<T> actionConsumer(Action action) {
        return new a(action);
    }

    @NonNull
    public static <T> Predicate<T> alwaysFalse() {
        return f73972d;
    }

    @NonNull
    public static <T> Predicate<T> alwaysTrue() {
        return f73971c;
    }

    public static <T> Consumer<T> boundedConsumer(int i10) {
        return new BoundedConsumer(i10);
    }

    @NonNull
    public static <T, U> Function<T, U> castFunction(@NonNull Class<U> cls) {
        return new l(cls);
    }

    public static <T> Supplier<List<T>> createArrayList(int i10) {
        return new j(i10);
    }

    public static <T> Supplier<Set<T>> createHashSet() {
        return v.INSTANCE;
    }

    public static <T> Consumer<T> emptyConsumer() {
        return f73970b;
    }

    public static <T> Predicate<T> equalsWith(T t10) {
        return new r(t10);
    }

    @NonNull
    public static Action futureAction(@NonNull Future<?> future) {
        return new u(future);
    }

    @NonNull
    public static <T> Function<T, T> identity() {
        return f73969a;
    }

    public static <T, U> Predicate<T> isInstanceOf(Class<U> cls) {
        return new m(cls);
    }

    @NonNull
    public static <T> Callable<T> justCallable(@NonNull T t10) {
        return new x(t10);
    }

    @NonNull
    public static <T, U> Function<T, U> justFunction(@NonNull U u2) {
        return new x(u2);
    }

    @NonNull
    public static <T> Supplier<T> justSupplier(@NonNull T t10) {
        return new x(t10);
    }

    public static <T> Function<List<T>, List<T>> listSorter(Comparator<? super T> comparator) {
        return new y(comparator);
    }

    public static <T> Comparator<T> naturalComparator() {
        return a0.INSTANCE;
    }

    public static <T> Action notificationOnComplete(Consumer<? super Notification<T>> consumer) {
        return new b0(consumer);
    }

    public static <T> Consumer<Throwable> notificationOnError(Consumer<? super Notification<T>> consumer) {
        return new c0(consumer);
    }

    public static <T> Consumer<T> notificationOnNext(Consumer<? super Notification<T>> consumer) {
        return new d0(consumer);
    }

    @NonNull
    public static <T> Supplier<T> nullSupplier() {
        return f73973e;
    }

    public static <T> Predicate<T> predicateReverseFor(BooleanSupplier booleanSupplier) {
        return new k(booleanSupplier);
    }

    public static <T> Function<T, Timed<T>> timestampWith(TimeUnit timeUnit, Scheduler scheduler) {
        return new g0(timeUnit, scheduler);
    }

    @NonNull
    public static <T1, T2, R> Function<Object[], R> toFunction(@NonNull BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        return new b(biFunction);
    }

    public static <T, K> BiConsumer<Map<K, T>, T> toMapKeySelector(Function<? super T, ? extends K> function) {
        return new h0(function);
    }

    public static <T, K, V> BiConsumer<Map<K, V>, T> toMapKeyValueSelector(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return new i0(function2, function);
    }

    public static <T, K, V> BiConsumer<Map<K, Collection<V>>, T> toMultimapKeyValueSelector(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, Function<? super K, ? extends Collection<? super V>> function3) {
        return new j0(function3, function2, function);
    }

    @NonNull
    public static <T1, T2, T3, R> Function<Object[], R> toFunction(@NonNull Function3<T1, T2, T3, R> function3) {
        return new c(function3);
    }

    @NonNull
    public static <T1, T2, T3, T4, R> Function<Object[], R> toFunction(@NonNull Function4<T1, T2, T3, T4, R> function4) {
        return new d(function4);
    }

    @NonNull
    public static <T1, T2, T3, T4, T5, R> Function<Object[], R> toFunction(@NonNull Function5<T1, T2, T3, T4, T5, R> function5) {
        return new e(function5);
    }

    @NonNull
    public static <T1, T2, T3, T4, T5, T6, R> Function<Object[], R> toFunction(@NonNull Function6<T1, T2, T3, T4, T5, T6, R> function6) {
        return new f(function6);
    }

    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, R> Function<Object[], R> toFunction(@NonNull Function7<T1, T2, T3, T4, T5, T6, T7, R> function7) {
        return new g(function7);
    }

    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Function<Object[], R> toFunction(@NonNull Function8<T1, T2, T3, T4, T5, T6, T7, T8, R> function8) {
        return new h(function8);
    }

    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Function<Object[], R> toFunction(@NonNull Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> function9) {
        return new i(function9);
    }

    public static final class n implements Action {
        public final String toString() {
            return "EmptyAction";
        }

        @Override // io.reactivex.rxjava3.functions.Action
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

        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
        }
    }

    public static final class p implements LongConsumer {
        @Override // io.reactivex.rxjava3.functions.LongConsumer
        public final void accept(long j10) {
        }
    }

    public static final class w implements Function<Object, Object> {
        public final String toString() {
            return "IdentityFunction";
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Object apply(Object obj) {
            return obj;
        }
    }
}
