package net.ipsoft.amelia.sdk.internal.common;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bbva.image.transform.ScaleToMaxSideTransformer;
import java.io.IOException;
import java.util.Stack;
import net.ipsoft.amelia.sdk.IResourceToRequest;

/* JADX INFO: loaded from: classes12.dex */
public class m implements IResourceToRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String[] f84889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f84890b = 5000000L;

    public m(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals(ScaleToMaxSideTransformer.SIDE) && jsonReader.peek() != JsonToken.NULL) {
                a(Long.valueOf(jsonReader.nextLong()));
            } else if (!strNextName.equals("fileExtensions") || jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
            } else {
                Stack stack = new Stack();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    stack.push(jsonReader.nextString());
                }
                jsonReader.endArray();
                a((String[]) stack.toArray(new String[stack.size()]));
            }
        }
        jsonReader.endObject();
    }

    public void a(Long l6) {
        this.f84890b = l6;
    }

    @Override // net.ipsoft.amelia.sdk.IResourceToRequest
    public Long getMaxSize() {
        return this.f84890b;
    }

    @Override // net.ipsoft.amelia.sdk.IResourceToRequest
    public String[] getSupportedFileExtensions() {
        return this.f84889a;
    }

    public void a(String[] strArr) {
        this.f84889a = strArr;
    }
}
