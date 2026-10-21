package un;

import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* JADX INFO: compiled from: ScalarResponseBodyConverters.java */
/* JADX INFO: loaded from: classes13.dex */
public final class d implements Converter<ResponseBody, Character> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f93903a = new d();

    @Override // retrofit2.Converter
    public final Character convert(ResponseBody responseBody) throws IOException {
        String strString = responseBody.string();
        if (strString.length() == 1) {
            return Character.valueOf(strString.charAt(0));
        }
        throw new IOException("Expected body of length 1 for Character conversion but was " + strString.length());
    }
}
