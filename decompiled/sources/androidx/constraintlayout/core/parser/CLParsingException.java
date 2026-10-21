package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes.dex */
public class CLParsingException extends Exception {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f18972p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f18973q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final String f18974r0;

    public CLParsingException(String str, CLElement cLElement) {
        super(str);
        this.f18972p0 = str;
        if (cLElement != null) {
            this.f18974r0 = cLElement.getStrClass();
            this.f18973q0 = cLElement.getLine();
        } else {
            this.f18974r0 = "unknown";
            this.f18973q0 = 0;
        }
    }

    public String reason() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f18972p0);
        sb2.append(" (");
        sb2.append(this.f18974r0);
        sb2.append(" at line ");
        return androidx.appcompat.widget.a.c(sb2, this.f18973q0, ")");
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + reason();
    }
}
