package com.google.android.datatransport.cct.internal;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes9.dex */
@AutoValue
public abstract class LogResponse {
    @NonNull
    public static LogResponse fromJson(@NonNull Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        td.b bVar = new td.b(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return bVar;
                    }
                    td.b bVar2 = new td.b(jsonReader.nextLong());
                    jsonReader.close();
                    return bVar2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th2) {
            jsonReader.close();
            throw th2;
        }
    }

    public abstract long getNextRequestWaitMillis();
}
