package androidx.databinding;

import com.nulabinc.zxcvbn.matchers.DateMatcher;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class CallbackRegistry<C, T, A> implements Cloneable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ArrayList f20517p0 = new ArrayList();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public long f20518q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public long[] f20519r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f20520s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final NotifierCallback<C, T, A> f20521t0;

    public static abstract class NotifierCallback<C, T, A> {
        public abstract void onNotifyCallback(C c10, T t10, int i10, A a10);
    }

    public CallbackRegistry(NotifierCallback<C, T, A> notifierCallback) {
        this.f20521t0 = notifierCallback;
    }

    public final boolean a(int i10) {
        int i11;
        if (i10 < 64) {
            return ((1 << i10) & this.f20518q0) != 0;
        }
        long[] jArr = this.f20519r0;
        if (jArr != null && (i11 = (i10 / 64) - 1) < jArr.length) {
            return ((1 << (i10 % 64)) & jArr[i11]) != 0;
        }
        return false;
    }

    public synchronized void add(C c10) {
        try {
            if (c10 == null) {
                throw new IllegalArgumentException("callback cannot be null");
            }
            int iLastIndexOf = this.f20517p0.lastIndexOf(c10);
            if (iLastIndexOf < 0 || a(iLastIndexOf)) {
                this.f20517p0.add(c10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b(T t10, int i10, A a10, int i11, int i12, long j10) {
        long j11 = 1;
        while (i11 < i12) {
            if ((j10 & j11) == 0) {
                this.f20521t0.onNotifyCallback((C) this.f20517p0.get(i11), t10, i10, a10);
            }
            j11 <<= 1;
            i11++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(int i10, Object obj, int i11, Object obj2) {
        if (i11 < 0) {
            b(obj, i10, obj2, 0, Math.min(64, this.f20517p0.size()), this.f20518q0);
            return;
        }
        long j10 = this.f20519r0[i11];
        int i12 = (i11 + 1) * 64;
        int iMin = Math.min(this.f20517p0.size(), i12 + 64);
        c(i10, obj, i11 - 1, obj2);
        b(obj, i10, obj2, i12, iMin, j10);
    }

    public synchronized void clear() {
        try {
            if (this.f20520s0 == 0) {
                this.f20517p0.clear();
            } else if (!this.f20517p0.isEmpty()) {
                for (int size = this.f20517p0.size() - 1; size >= 0; size--) {
                    e(size);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized ArrayList<C> copyCallbacks() {
        DateMatcher.d dVar;
        dVar = (ArrayList<C>) new ArrayList(this.f20517p0.size());
        int size = this.f20517p0.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!a(i10)) {
                dVar.add(this.f20517p0.get(i10));
            }
        }
        return dVar;
    }

    public final void d(int i10, long j10) {
        long j11 = Long.MIN_VALUE;
        for (int i11 = i10 + 63; i11 >= i10; i11--) {
            if ((j10 & j11) != 0) {
                this.f20517p0.remove(i11);
            }
            j11 >>>= 1;
        }
    }

    public final void e(int i10) {
        if (i10 < 64) {
            this.f20518q0 = (1 << i10) | this.f20518q0;
            return;
        }
        int i11 = (i10 / 64) - 1;
        long[] jArr = this.f20519r0;
        if (jArr == null) {
            this.f20519r0 = new long[this.f20517p0.size() / 64];
        } else if (jArr.length <= i11) {
            long[] jArr2 = new long[this.f20517p0.size() / 64];
            long[] jArr3 = this.f20519r0;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f20519r0 = jArr2;
        }
        long j10 = 1 << (i10 % 64);
        long[] jArr4 = this.f20519r0;
        jArr4[i11] = j10 | jArr4[i11];
    }

    public synchronized boolean isEmpty() {
        if (this.f20517p0.isEmpty()) {
            return true;
        }
        if (this.f20520s0 == 0) {
            return false;
        }
        int size = this.f20517p0.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!a(i10)) {
                return false;
            }
        }
        return true;
    }

    public synchronized void notifyCallbacks(T t10, int i10, A a10) {
        try {
            this.f20520s0++;
            int size = this.f20517p0.size();
            long[] jArr = this.f20519r0;
            int length = jArr == null ? -1 : jArr.length - 1;
            c(i10, t10, length, a10);
            b(t10, i10, a10, (length + 2) * 64, size, 0L);
            int i11 = this.f20520s0 - 1;
            this.f20520s0 = i11;
            if (i11 == 0) {
                long[] jArr2 = this.f20519r0;
                if (jArr2 != null) {
                    for (int length2 = jArr2.length - 1; length2 >= 0; length2--) {
                        long j10 = this.f20519r0[length2];
                        if (j10 != 0) {
                            d((length2 + 1) * 64, j10);
                            this.f20519r0[length2] = 0;
                        }
                    }
                }
                long j11 = this.f20518q0;
                if (j11 != 0) {
                    d(0, j11);
                    this.f20518q0 = 0L;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void remove(C c10) {
        try {
            if (this.f20520s0 == 0) {
                this.f20517p0.remove(c10);
            } else {
                int iLastIndexOf = this.f20517p0.lastIndexOf(c10);
                if (iLastIndexOf >= 0) {
                    e(iLastIndexOf);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public synchronized CallbackRegistry<C, T, A> m4639clone() {
        CallbackRegistry<C, T, A> callbackRegistry;
        CloneNotSupportedException e5;
        try {
            callbackRegistry = (CallbackRegistry) super.clone();
            try {
                callbackRegistry.f20518q0 = 0L;
                callbackRegistry.f20519r0 = null;
                callbackRegistry.f20520s0 = 0;
                callbackRegistry.f20517p0 = new ArrayList();
                int size = this.f20517p0.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (!a(i10)) {
                        callbackRegistry.f20517p0.add(this.f20517p0.get(i10));
                    }
                }
            } catch (CloneNotSupportedException e7) {
                e5 = e7;
                e5.printStackTrace();
            }
        } catch (CloneNotSupportedException e10) {
            callbackRegistry = null;
            e5 = e10;
        }
        return callbackRegistry;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void copyCallbacks(List<C> list) {
        list.clear();
        int size = this.f20517p0.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!a(i10)) {
                list.add(this.f20517p0.get(i10));
            }
        }
    }
}
