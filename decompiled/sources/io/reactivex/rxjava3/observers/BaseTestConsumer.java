package io.reactivex.rxjava3.observers;

import androidx.appcompat.widget.o1;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.VolatileSizeArrayList;
import io.reactivex.rxjava3.observers.BaseTestConsumer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseTestConsumer<T, U extends BaseTestConsumer<T, U>> {
    protected boolean checkSubscriptionOnce;
    protected long completions;
    protected Thread lastThread;
    protected CharSequence tag;
    protected boolean timeout;
    protected final List<T> values = new VolatileSizeArrayList();
    protected final List<Throwable> errors = new VolatileSizeArrayList();
    protected final CountDownLatch done = new CountDownLatch(1);

    @NonNull
    public static String valueAndClass(@Nullable Object obj) {
        if (obj == null) {
            return AbstractJsonLexerKt.NULL;
        }
        return obj + " (class: " + obj.getClass().getSimpleName() + ")";
    }

    @NonNull
    public final U assertComplete() {
        long j10 = this.completions;
        if (j10 == 0) {
            throw fail("Not completed");
        }
        if (j10 <= 1) {
            return this;
        }
        throw fail("Multiple completions: " + j10);
    }

    @NonNull
    public final U assertEmpty() {
        return (U) assertSubscribed().assertNoValues().assertNoErrors().assertNotComplete();
    }

    @NonNull
    public final U assertError(@NonNull Throwable th2) {
        return (U) assertError(Functions.equalsWith(th2));
    }

    @SafeVarargs
    @NonNull
    public final U assertFailure(@NonNull Class<? extends Throwable> cls, @NonNull T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertError(cls).assertNotComplete();
    }

    @NonNull
    public final U assertNoErrors() {
        if (this.errors.size() == 0) {
            return this;
        }
        throw fail("Error(s) present: " + this.errors);
    }

    @NonNull
    public final U assertNoValues() {
        return (U) assertValueCount(0);
    }

    @NonNull
    public final U assertNotComplete() {
        long j10 = this.completions;
        if (j10 == 1) {
            throw fail("Completed!");
        }
        if (j10 <= 1) {
            return this;
        }
        throw fail("Multiple completions: " + j10);
    }

    @SafeVarargs
    @NonNull
    public final U assertResult(@NonNull T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertNoErrors().assertComplete();
    }

    @NonNull
    public abstract U assertSubscribed();

    @NonNull
    public final U assertValue(@NonNull T t10) {
        if (this.values.size() != 1) {
            throw fail("expected: " + valueAndClass(t10) + " but was: " + this.values);
        }
        T t11 = this.values.get(0);
        if (Objects.equals(t10, t11)) {
            return this;
        }
        throw fail("expected: " + valueAndClass(t10) + " but was: " + valueAndClass(t11));
    }

    @NonNull
    public final U assertValueAt(int i10, @NonNull T t10) {
        int size = this.values.size();
        if (size == 0) {
            throw fail("No values");
        }
        if (i10 >= size) {
            throw fail("Invalid index: " + i10);
        }
        T t11 = this.values.get(i10);
        if (Objects.equals(t10, t11)) {
            return this;
        }
        throw fail("expected: " + valueAndClass(t10) + " but was: " + valueAndClass(t11));
    }

    @NonNull
    public final U assertValueCount(int i10) {
        int size = this.values.size();
        if (size == i10) {
            return this;
        }
        throw fail("Value counts differ; expected: " + i10 + " but was: " + size);
    }

    @NonNull
    public final U assertValueSequence(@NonNull Iterable<? extends T> iterable) {
        boolean zHasNext;
        boolean zHasNext2;
        Iterator<T> it = this.values.iterator();
        Iterator<? extends T> it2 = iterable.iterator();
        int i10 = 0;
        while (true) {
            zHasNext = it2.hasNext();
            zHasNext2 = it.hasNext();
            if (!zHasNext2 || !zHasNext) {
                break;
            }
            T next = it2.next();
            T next2 = it.next();
            if (!Objects.equals(next, next2)) {
                StringBuilder sbC = o1.c("Values at position ", i10, " differ; expected: ");
                sbC.append(valueAndClass(next));
                sbC.append(" but was: ");
                sbC.append(valueAndClass(next2));
                throw fail(sbC.toString());
            }
            i10++;
        }
        if (zHasNext2) {
            throw fail("More values received than expected (" + i10 + ")");
        }
        if (!zHasNext) {
            return this;
        }
        throw fail("Fewer values received than expected (" + i10 + ")");
    }

    @SafeVarargs
    @NonNull
    public final U assertValues(@NonNull T... tArr) {
        int size = this.values.size();
        if (size != tArr.length) {
            throw fail("Value count differs; expected: " + tArr.length + " " + Arrays.toString(tArr) + " but was: " + size + " " + this.values);
        }
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = this.values.get(i10);
            T t11 = tArr[i10];
            if (!Objects.equals(t11, t10)) {
                StringBuilder sbC = o1.c("Values at position ", i10, " differ; expected: ");
                sbC.append(valueAndClass(t11));
                sbC.append(" but was: ");
                sbC.append(valueAndClass(t10));
                throw fail(sbC.toString());
            }
        }
        return this;
    }

    @SafeVarargs
    @NonNull
    public final U assertValuesOnly(@NonNull T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertNoErrors().assertNotComplete();
    }

    @NonNull
    public final U await() throws InterruptedException {
        if (this.done.getCount() == 0) {
            return this;
        }
        this.done.await();
        return this;
    }

    @NonNull
    public final U awaitCount(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (System.currentTimeMillis() - jCurrentTimeMillis < 5000) {
            if (this.done.getCount() == 0 || this.values.size() >= i10) {
                return this;
            }
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e5) {
                throw new RuntimeException(e5);
            }
        }
        this.timeout = true;
        return this;
    }

    @NonNull
    public final U awaitDone(long j10, @NonNull TimeUnit timeUnit) {
        try {
            if (!this.done.await(j10, timeUnit)) {
                this.timeout = true;
                dispose();
            }
            return this;
        } catch (InterruptedException e5) {
            dispose();
            throw ExceptionHelper.wrapOrThrow(e5);
        }
    }

    public abstract void dispose();

    @NonNull
    public final AssertionError fail(@NonNull String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 64);
        sb2.append(str);
        sb2.append(" (latch = ");
        sb2.append(this.done.getCount());
        sb2.append(", values = ");
        sb2.append(this.values.size());
        sb2.append(", errors = ");
        sb2.append(this.errors.size());
        sb2.append(", completions = ");
        sb2.append(this.completions);
        if (this.timeout) {
            sb2.append(", timeout!");
        }
        if (isDisposed()) {
            sb2.append(", disposed!");
        }
        CharSequence charSequence = this.tag;
        if (charSequence != null) {
            sb2.append(", tag = ");
            sb2.append(charSequence);
        }
        sb2.append(RootService.CLOSE_BRACKET);
        AssertionError assertionError = new AssertionError(sb2.toString());
        if (!this.errors.isEmpty()) {
            if (this.errors.size() == 1) {
                assertionError.initCause(this.errors.get(0));
            } else {
                assertionError.initCause(new CompositeException(this.errors));
            }
        }
        return assertionError;
    }

    public abstract boolean isDisposed();

    @NonNull
    public final List<T> values() {
        return this.values;
    }

    @NonNull
    public final U withTag(@Nullable CharSequence charSequence) {
        this.tag = charSequence;
        return this;
    }

    @NonNull
    public final U assertError(@NonNull Class<? extends Throwable> cls) {
        return (U) assertError(Functions.isInstanceOf(cls));
    }

    @NonNull
    public final U assertError(@NonNull Predicate<Throwable> predicate) {
        int size = this.errors.size();
        if (size != 0) {
            Iterator<Throwable> it = this.errors.iterator();
            while (it.hasNext()) {
                try {
                    if (predicate.test(it.next())) {
                        if (size == 1) {
                            return this;
                        }
                        throw fail("Error present but other errors as well");
                    }
                } catch (Throwable th2) {
                    throw ExceptionHelper.wrapOrThrow(th2);
                }
            }
            throw fail("Error not present");
        }
        throw fail("No errors");
    }

    public final boolean await(long j10, @NonNull TimeUnit timeUnit) throws InterruptedException {
        boolean z10 = this.done.getCount() == 0 || this.done.await(j10, timeUnit);
        this.timeout = !z10;
        return z10;
    }

    @NonNull
    public final U assertValue(@NonNull Predicate<T> predicate) {
        assertValueAt(0, (Predicate) predicate);
        if (this.values.size() <= 1) {
            return this;
        }
        throw fail("Value present but other values as well");
    }

    @NonNull
    public final U assertValueAt(int i10, @NonNull Predicate<T> predicate) {
        if (this.values.size() != 0) {
            if (i10 < this.values.size()) {
                try {
                    if (predicate.test(this.values.get(i10))) {
                        return this;
                    }
                    throw fail("Value not present");
                } catch (Throwable th2) {
                    throw ExceptionHelper.wrapOrThrow(th2);
                }
            }
            throw fail("Invalid index: " + i10);
        }
        throw fail("No values");
    }
}
