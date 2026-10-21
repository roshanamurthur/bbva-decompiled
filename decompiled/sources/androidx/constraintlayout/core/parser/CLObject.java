package androidx.constraintlayout.core.parser;

import androidx.annotation.NonNull;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class CLObject extends CLContainer implements Iterable<CLKey> {

    public static class a implements Iterator<CLKey> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public CLObject f18967p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f18968q0;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f18968q0 < this.f18967p0.size();
        }

        @Override // java.util.Iterator
        public final CLKey next() {
            CLKey cLKey = (CLKey) this.f18967p0.f18962r0.get(this.f18968q0);
            this.f18968q0++;
            return cLKey;
        }
    }

    public CLObject(char[] cArr) {
        super(cArr);
    }

    public static CLObject allocate(char[] cArr) {
        return new CLObject(cArr);
    }

    @Override // java.lang.Iterable
    public Iterator<CLKey> iterator() {
        a aVar = new a();
        aVar.f18968q0 = 0;
        aVar.f18967p0 = this;
        return aVar;
    }

    public String toFormattedJSON() {
        return toFormattedJSON(0, 0);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        StringBuilder sb2 = new StringBuilder(getDebugName() + "{ ");
        boolean z10 = true;
        for (CLElement cLElement : this.f18962r0) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(cLElement.toJSON());
        }
        sb2.append(" }");
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(getDebugName());
        sb2.append("{\n");
        boolean z10 = true;
        for (CLElement cLElement : this.f18962r0) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(",\n");
            }
            sb2.append(cLElement.toFormattedJSON(CLElement.sBaseIndent + i10, i11 - 1));
        }
        sb2.append(RootService.LINE_BREAK);
        addIndent(sb2, i10);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement
    @NonNull
    /* JADX INFO: renamed from: clone */
    public CLObject mo4633clone() {
        return (CLObject) super.mo4633clone();
    }
}
