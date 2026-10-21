package io.reactivex.exceptions;

import io.reactivex.annotations.NonNull;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class CompositeException extends RuntimeException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final List<Throwable> f69886p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f69887q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public a f69888r0;

    public static final class a extends RuntimeException {
        @Override // java.lang.Throwable
        public final String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    public static abstract class b {
        public abstract void a(String str);
    }

    public static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PrintStream f69889a;

        public c(PrintStream printStream) {
            this.f69889a = printStream;
        }

        @Override // io.reactivex.exceptions.CompositeException.b
        public final void a(String str) {
            this.f69889a.println((Object) str);
        }
    }

    public static final class d extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PrintWriter f69890a;

        public d(PrintWriter printWriter) {
            this.f69890a = printWriter;
        }

        @Override // io.reactivex.exceptions.CompositeException.b
        public final void a(String str) {
            this.f69890a.println((Object) str);
        }
    }

    public CompositeException(@NonNull Throwable... thArr) {
        this(thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    public static void a(StringBuilder sb2, Throwable th2, String str) {
        sb2.append(str);
        sb2.append(th2);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            sb2.append("\t\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        if (th2.getCause() != null) {
            sb2.append("\tCaused by: ");
            a(sb2, th2.getCause(), "");
        }
    }

    public final void b(b bVar) {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(this);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb2.append("\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        int i10 = 1;
        for (Throwable th2 : this.f69886p0) {
            sb2.append("  ComposedException ");
            sb2.append(i10);
            sb2.append(" :\n");
            a(sb2, th2, "\t");
            i10++;
        }
        bVar.a(sb2.toString());
    }

    @Override // java.lang.Throwable
    @NonNull
    public synchronized Throwable getCause() {
        try {
            if (this.f69888r0 == null) {
                a aVar = new a();
                HashSet hashSet = new HashSet();
                Iterator<Throwable> it = this.f69886p0.iterator();
                a aVar2 = aVar;
                while (it.hasNext()) {
                    Throwable next = it.next();
                    if (!hashSet.contains(next)) {
                        hashSet.add(next);
                        ArrayList<Throwable> arrayList = new ArrayList();
                        Throwable cause = next.getCause();
                        if (cause != null && cause != next) {
                            while (true) {
                                arrayList.add(cause);
                                Throwable cause2 = cause.getCause();
                                if (cause2 == null || cause2 == cause) {
                                    break;
                                    break;
                                }
                                cause = cause2;
                            }
                        }
                        for (Throwable th2 : arrayList) {
                            if (hashSet.contains(th2)) {
                                next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th2);
                            }
                        }
                        try {
                            aVar2.initCause(next);
                        } catch (Throwable unused) {
                        }
                        Throwable cause3 = aVar2.getCause();
                        if (cause3 != null && aVar2 != cause3) {
                            while (true) {
                                Throwable cause4 = cause3.getCause();
                                if (cause4 == null || cause4 == cause3) {
                                    break;
                                    break;
                                }
                                cause3 = cause4;
                            }
                            aVar2 = cause3;
                        }
                    }
                }
                this.f69888r0 = aVar;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.f69888r0;
    }

    @NonNull
    public List<Throwable> getExceptions() {
        return this.f69886p0;
    }

    @Override // java.lang.Throwable
    @NonNull
    public String getMessage() {
        return this.f69887q0;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public int size() {
        return this.f69886p0.size();
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        b(new c(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        b(new d(printWriter));
    }

    public CompositeException(@NonNull Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th2 : iterable) {
                if (th2 instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th2).getExceptions());
                } else if (th2 != null) {
                    linkedHashSet.add(th2);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List<Throwable> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            this.f69886p0 = listUnmodifiableList;
            this.f69887q0 = listUnmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }
}
