package hf;

import com.google.crypto.tink.internal.JsonParser;
import com.google.crypto.tink.jwt.JwtInvalidException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.IOException;

/* JADX INFO: compiled from: JsonUtil.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static JsonObject a(String str) throws JwtInvalidException {
        try {
            return JsonParser.parse(str).getAsJsonObject();
        } catch (JsonParseException | IOException | IllegalStateException e5) {
            throw new JwtInvalidException(c2.b.d("invalid JSON: ", e5));
        }
    }
}
