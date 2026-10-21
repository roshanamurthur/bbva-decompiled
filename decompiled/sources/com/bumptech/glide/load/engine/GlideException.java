package com.bumptech.glide.load.engine;

import androidx.annotation.Nullable;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class GlideException extends Exception {
    public static final StackTraceElement[] v0 = new StackTraceElement[0];

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final List<Throwable> f38204p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Key f38205q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public DataSource f38206r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Class<?> f38207s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f38208t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    public Exception f38209u0;

    public GlideException(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    public static void a(Throwable th2, ArrayList arrayList) {
        if (!(th2 instanceof GlideException)) {
            arrayList.add(th2);
            return;
        }
        Iterator<Throwable> it = ((GlideException) th2).getCauses().iterator();
        while (it.hasNext()) {
            a(it.next(), arrayList);
        }
    }

    public static void b(List list, a aVar) {
        try {
            c(list, aVar);
        } catch (IOException e5) {
            throw new RuntimeException(e5);
        }
    }

    public static void c(List list, a aVar) throws IOException {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            aVar.append("Cause (");
            int i11 = i10 + 1;
            aVar.append(String.valueOf(i11));
            aVar.append(" of ");
            aVar.append(String.valueOf(size));
            aVar.append("): ");
            Throwable th2 = (Throwable) list.get(i10);
            if (th2 instanceof GlideException) {
                GlideException glideException = (GlideException) th2;
                glideException.getClass();
                d(glideException, aVar);
                b(glideException.getCauses(), new a(aVar));
            } else {
                d(th2, aVar);
            }
            i10 = i11;
        }
    }

    public static void d(Throwable th2, Appendable appendable) {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    public List<Throwable> getCauses() {
        return this.f38204p0;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f38208t0);
        sb2.append(this.f38207s0 != null ? ", " + this.f38207s0 : "");
        sb2.append(this.f38206r0 != null ? ", " + this.f38206r0 : "");
        sb2.append(this.f38205q0 != null ? ", " + this.f38205q0 : "");
        List<Throwable> rootCauses = getRootCauses();
        if (rootCauses.isEmpty()) {
            return sb2.toString();
        }
        if (rootCauses.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(rootCauses.size());
            sb2.append(" root causes:");
        }
        for (Throwable th2 : rootCauses) {
            sb2.append('\n');
            sb2.append(th2.getClass().getName());
            sb2.append(RootService.OPEN_BRACKET);
            sb2.append(th2.getMessage());
            sb2.append(RootService.CLOSE_BRACKET);
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    @Nullable
    public Exception getOrigin() {
        return this.f38209u0;
    }

    public List<Throwable> getRootCauses() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    public void logRootCauses(String str) {
        List<Throwable> rootCauses = getRootCauses();
        int size = rootCauses.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            rootCauses.get(i10);
            i10 = i11;
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void setOrigin(@Nullable Exception exc) {
        this.f38209u0 = exc;
    }

    public GlideException(String str, Throwable th2) {
        this(str, (List<Throwable>) Collections.singletonList(th2));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        d(this, printStream);
        b(getCauses(), new a(printStream));
    }

    public GlideException(String str, List<Throwable> list) {
        this.f38208t0 = str;
        setStackTrace(v0);
        this.f38204p0 = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        d(this, printWriter);
        b(getCauses(), new a(printWriter));
    }

    public static final class a implements Appendable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Appendable f38210p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f38211q0 = true;

        public a(Appendable appendable) {
            this.f38210p0 = appendable;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c10) throws IOException {
            boolean z10 = this.f38211q0;
            Appendable appendable = this.f38210p0;
            if (z10) {
                this.f38211q0 = false;
                appendable.append("  ");
            }
            this.f38211q0 = c10 == '\n';
            appendable.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(@Nullable CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(@Nullable CharSequence charSequence, int i10, int i11) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z10 = this.f38211q0;
            Appendable appendable = this.f38210p0;
            boolean z11 = false;
            if (z10) {
                this.f38211q0 = false;
                appendable.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i11 - 1) == '\n') {
                z11 = true;
            }
            this.f38211q0 = z11;
            appendable.append(charSequence, i10, i11);
            return this;
        }
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }
}
