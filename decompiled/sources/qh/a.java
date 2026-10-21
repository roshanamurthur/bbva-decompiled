package qh;

import com.jakewharton.rxrelay3.AppendOnlyLinkedArrayList;
import com.jakewharton.rxrelay3.Relay;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observer;

/* JADX INFO: compiled from: SerializedRelay.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a<T> extends Relay<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Relay<T> f92872p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f92873q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public AppendOnlyLinkedArrayList<T> f92874r0;

    public a(Relay<T> relay) {
        this.f92872p0 = relay;
    }

    @Override // com.jakewharton.rxrelay3.Relay, io.reactivex.rxjava3.functions.Consumer
    public final void accept(@NonNull T t10) {
        synchronized (this) {
            try {
                if (!this.f92873q0) {
                    this.f92873q0 = true;
                    this.f92872p0.accept(t10);
                    d();
                } else {
                    AppendOnlyLinkedArrayList<T> appendOnlyLinkedArrayList = this.f92874r0;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>();
                        this.f92874r0 = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.a(t10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void d() {
        AppendOnlyLinkedArrayList<T> appendOnlyLinkedArrayList;
        Object[] objArr;
        while (true) {
            synchronized (this) {
                try {
                    appendOnlyLinkedArrayList = this.f92874r0;
                    if (appendOnlyLinkedArrayList == null) {
                        this.f92873q0 = false;
                        return;
                    }
                    this.f92874r0 = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Relay<T> relay = this.f92872p0;
            for (Object[] objArr2 = appendOnlyLinkedArrayList.f50719a; objArr2 != null; objArr2 = objArr2[4]) {
                for (int i10 = 0; i10 < 4 && (objArr = objArr2[i10]) != null; i10++) {
                    relay.accept(objArr);
                }
            }
        }
    }

    @Override // com.jakewharton.rxrelay3.Relay
    public final boolean hasObservers() {
        return this.f92872p0.hasObservers();
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer<? super T> observer) {
        this.f92872p0.subscribe(observer);
    }
}
