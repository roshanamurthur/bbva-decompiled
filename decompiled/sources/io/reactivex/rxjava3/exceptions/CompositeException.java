package io.reactivex.rxjava3.exceptions;

import io.reactivex.rxjava3.annotations.NonNull;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class CompositeException extends RuntimeException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final List<Throwable> f73961p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f73962q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Throwable f73963r0;

    public static final class a extends RuntimeException {
        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public static abstract class b {
        public abstract void a(String str);
    }

    public static final class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PrintStream f73964a;

        public c(PrintStream printStream) {
            this.f73964a = printStream;
        }

        @Override // io.reactivex.rxjava3.exceptions.CompositeException.b
        public final void a(String str) {
            this.f73964a.println((Object) str);
        }
    }

    public static final class d extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PrintWriter f73965a;

        public d(PrintWriter printWriter) {
            this.f73965a = printWriter;
        }

        @Override // io.reactivex.rxjava3.exceptions.CompositeException.b
        public final void a(String str) {
            this.f73965a.println((Object) str);
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
        for (Throwable th2 : this.f73961p0) {
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
        int i10;
        try {
            if (this.f73963r0 == null) {
                String property = System.getProperty("line.separator");
                if (this.f73961p0.size() > 1) {
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Multiple exceptions (");
                    sb2.append(this.f73961p0.size());
                    sb2.append(")");
                    sb2.append(property);
                    for (Throwable cause : this.f73961p0) {
                        int i11 = 0;
                        while (cause != null) {
                            for (int i12 = 0; i12 < i11; i12++) {
                                sb2.append("  ");
                            }
                            sb2.append("|-- ");
                            sb2.append(cause.getClass().getCanonicalName());
                            sb2.append(": ");
                            String message = cause.getMessage();
                            if (message == null || !message.contains(property)) {
                                sb2.append(message);
                                sb2.append(property);
                            } else {
                                sb2.append(property);
                                for (String str : message.split(property)) {
                                    for (int i13 = 0; i13 < i11 + 2; i13++) {
                                        sb2.append("  ");
                                    }
                                    sb2.append(str);
                                    sb2.append(property);
                                }
                            }
                            int i14 = 0;
                            while (true) {
                                i10 = i11 + 2;
                                if (i14 >= i10) {
                                    break;
                                }
                                sb2.append("  ");
                                i14++;
                            }
                            StackTraceElement[] stackTrace = cause.getStackTrace();
                            if (stackTrace.length > 0) {
                                sb2.append("at ");
                                sb2.append(stackTrace[0]);
                                sb2.append(property);
                            }
                            if (identityHashMap.containsKey(cause)) {
                                Throwable cause2 = cause.getCause();
                                if (cause2 == null) {
                                    break;
                                }
                                for (int i15 = 0; i15 < i10; i15++) {
                                    sb2.append("  ");
                                }
                                sb2.append("|-- ");
                                sb2.append("(cause not expanded again) ");
                                sb2.append(cause2.getClass().getCanonicalName());
                                sb2.append(": ");
                                sb2.append(cause2.getMessage());
                                sb2.append(property);
                                break;
                            }
                            identityHashMap.put(cause, Boolean.TRUE);
                            cause = cause.getCause();
                            i11++;
                        }
                    }
                    this.f73963r0 = new a(sb2.toString().trim());
                } else {
                    this.f73963r0 = this.f73961p0.get(0);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f73963r0;
    }

    @NonNull
    public List<Throwable> getExceptions() {
        return this.f73961p0;
    }

    @Override // java.lang.Throwable
    @NonNull
    public String getMessage() {
        return this.f73962q0;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public int size() {
        return this.f73961p0.size();
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
            List<Throwable> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(linkedHashSet));
            this.f73961p0 = listUnmodifiableList;
            this.f73962q0 = listUnmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }
}
