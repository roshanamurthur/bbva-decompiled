package flexjson;

import java.util.LinkedList;
import java.util.List;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes7.dex */
public class Path {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList<String> f68502a = new LinkedList<>();

    public Path() {
    }

    public static Path parse(String str) {
        return str != null ? new Path(str.split("\\.")) : new Path();
    }

    public Path enqueue(String str) {
        this.f68502a.add(str);
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f68502a.equals(((Path) obj).f68502a);
    }

    public List<String> getPath() {
        return this.f68502a;
    }

    public int hashCode() {
        return this.f68502a.hashCode();
    }

    public int length() {
        return this.f68502a.size();
    }

    public String pop() {
        return this.f68502a.removeLast();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[ ");
        boolean z10 = false;
        for (String str : this.f68502a) {
            if (z10) {
                sb2.append(Constant.DOT_STRING);
            }
            sb2.append(str);
            z10 = true;
        }
        sb2.append(" ]");
        return sb2.toString();
    }

    public Path(String... strArr) {
        for (String str : strArr) {
            this.f68502a.add(str);
        }
    }
}
