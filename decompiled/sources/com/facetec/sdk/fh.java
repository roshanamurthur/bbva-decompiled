package com.facetec.sdk;

import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes9.dex */
public final class fh {
    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new b(appendable);
    }

    public static ec d(fz fzVar) throws eg {
        boolean z10;
        try {
            try {
                fzVar.j();
                z10 = false;
                try {
                    return ft.D.a(fzVar);
                } catch (EOFException e5) {
                    e = e5;
                    if (z10) {
                        return ef.f41465b;
                    }
                    throw new en(e);
                }
            } catch (EOFException e7) {
                e = e7;
                z10 = true;
            }
        } catch (gh e10) {
            throw new en(e10);
        } catch (IOException e11) {
            throw new ed(e11);
        } catch (NumberFormatException e12) {
            throw new en(e12);
        }
    }

    public static void e(ec ecVar, ga gaVar) throws IOException {
        ft.D.b(gaVar, ecVar);
    }

    public static final class b extends Writer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Appendable f41594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f41595b = new c();

        public static class c implements CharSequence {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            char[] f41596a;

            @Override // java.lang.CharSequence
            public final char charAt(int i10) {
                return this.f41596a[i10];
            }

            @Override // java.lang.CharSequence
            public final int length() {
                return this.f41596a.length;
            }

            @Override // java.lang.CharSequence
            public final CharSequence subSequence(int i10, int i11) {
                return new String(this.f41596a, i10, i11 - i10);
            }
        }

        public b(Appendable appendable) {
            this.f41594a = appendable;
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i10, int i11) throws IOException {
            c cVar = this.f41595b;
            cVar.f41596a = cArr;
            this.f41594a.append(cVar, i10, i11 + i10);
        }

        @Override // java.io.Writer
        public final void write(int i10) throws IOException {
            this.f41594a.append((char) i10);
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
        }
    }
}
