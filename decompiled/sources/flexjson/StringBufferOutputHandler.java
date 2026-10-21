package flexjson;

/* JADX INFO: loaded from: classes7.dex */
public class StringBufferOutputHandler implements OutputHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuffer f68506a;

    public StringBufferOutputHandler(StringBuffer stringBuffer) {
        this.f68506a = stringBuffer;
    }

    public String toString() {
        return this.f68506a.toString();
    }

    @Override // flexjson.OutputHandler
    public OutputHandler write(String str) {
        this.f68506a.append(str);
        return this;
    }

    @Override // flexjson.OutputHandler
    public int write(String str, int i10, int i11, String str2) {
        StringBuffer stringBuffer = this.f68506a;
        stringBuffer.append((CharSequence) str, i10, i11);
        stringBuffer.append(str2);
        return i11 + 1;
    }

    @Override // flexjson.OutputHandler
    public int write(String str, int i10, int i11) {
        this.f68506a.append((CharSequence) str, i10, i11);
        return i11;
    }
}
