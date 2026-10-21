package kotlin.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ReadWrite.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class LinesSequence implements Sequence<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BufferedReader f79654a;

    /* JADX INFO: renamed from: kotlin.io.LinesSequence$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: ReadWrite.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¨\u0006\u0006"}, d2 = {"kotlin/io/LinesSequence$iterator$1", "", "", "", "hasNext", "next", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    public static final class AnonymousClass1 implements Iterator<String>, KMappedMarker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @Nullable
        public String f79655p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f79656q0;

        public AnonymousClass1() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            if (this.f79655p0 == null && !this.f79656q0) {
                String line = LinesSequence.this.f79654a.readLine();
                this.f79655p0 = line;
                if (line == null) {
                    this.f79656q0 = true;
                }
            }
            return this.f79655p0 != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Iterator
        @NotNull
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f79655p0;
            this.f79655p0 = null;
            Intrinsics.checkNotNull(str);
            return str;
        }
    }

    public LinesSequence(@NotNull BufferedReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f79654a = reader;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<String> iterator() {
        return new AnonymousClass1();
    }
}
