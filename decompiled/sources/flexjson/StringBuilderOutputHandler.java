package flexjson;

/* JADX INFO: loaded from: classes7.dex */
public class StringBuilderOutputHandler implements OutputHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f68507a;

    public StringBuilderOutputHandler(StringBuilder sb2) {
        this.f68507a = sb2;
    }

    public String toString() {
        return this.f68507a.toString();
    }

    @Override // flexjson.OutputHandler
    public OutputHandler write(String str) {
        this.f68507a.append(str);
        return this;
    }

    @Override // flexjson.OutputHandler
    public int write(String str, int i10, int i11, String str2) {
        StringBuilder sb2 = this.f68507a;
        sb2.append((CharSequence) str, i10, i11);
        sb2.append(str2);
        return i11 + 1;
    }

    @Override // flexjson.OutputHandler
    public int write(String str, int i10, int i11) {
        this.f68507a.append((CharSequence) str, i10, i11);
        return i11;
    }
}
