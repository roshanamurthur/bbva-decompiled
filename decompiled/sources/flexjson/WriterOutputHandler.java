package flexjson;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes7.dex */
public class WriterOutputHandler implements OutputHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Writer f68512a;

    public WriterOutputHandler(Writer writer) {
        this.f68512a = writer;
    }

    public String toString() {
        return this.f68512a.toString();
    }

    @Override // flexjson.OutputHandler
    public OutputHandler write(String str) {
        try {
            this.f68512a.write(str);
            return this;
        } catch (IOException e5) {
            throw new JSONException("There was a problem writing output to the Writer.", e5);
        }
    }

    @Override // flexjson.OutputHandler
    public int write(String str, int i10, int i11, String str2) {
        Writer writer = this.f68512a;
        try {
            writer.write(str, i10, i11 - i10);
            writer.write(str2);
            return i11 + 1;
        } catch (IOException e5) {
            throw new JSONException("There was a problem writing output to the Writer.", e5);
        }
    }

    @Override // flexjson.OutputHandler
    public int write(String str, int i10, int i11) {
        try {
            this.f68512a.write(str, i10, i11 - i10);
            return i11;
        } catch (IOException e5) {
            throw new JSONException("There was a problem writing output to the Writer.", e5);
        }
    }
}
