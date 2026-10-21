package net.ipsoft.amelia.sdk;

import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import net.ipsoft.amelia.sdk.internal.a.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class FormInputField {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f84558a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f84559b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected g f84560c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ArrayList<FormInputFieldOptions> f84561d = new ArrayList<>();

    public FormInputField() {
    }

    public String getFieldType() {
        return this.f84559b;
    }

    public String getName() {
        return this.f84558a;
    }

    public ArrayList<FormInputFieldOptions> getOptions() {
        return this.f84561d;
    }

    public g getSelectionUtteranceMetadata() {
        return this.f84560c;
    }

    public void serialize(JsonWriter jsonWriter) {
        jsonWriter.beginObject();
        if (this.f84558a != null) {
            jsonWriter.name("name");
            jsonWriter.value(this.f84558a);
        }
        if (this.f84559b != null) {
            jsonWriter.name("fieldType");
            jsonWriter.value(this.f84559b);
        }
        if (this.f84561d != null) {
            jsonWriter.name("options");
            jsonWriter.beginArray();
            for (int i10 = 0; i10 < this.f84561d.size(); i10++) {
                this.f84561d.get(i10).serialize(jsonWriter);
            }
            jsonWriter.endArray();
        }
        if (this.f84560c != null) {
            jsonWriter.name("selectionUtteranceMetadata");
            this.f84560c.a(jsonWriter);
        }
        jsonWriter.endObject();
    }

    public void setFieldType(String str) {
        this.f84559b = str;
    }

    public void setName(String str) {
        this.f84558a = str;
    }

    public void setOptions(ArrayList<FormInputFieldOptions> arrayList) {
        this.f84561d = arrayList;
    }

    public void setSelectionUtteranceMetadata(g gVar) {
        this.f84560c = gVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ name: ");
        sb2.append(this.f84558a);
        sb2.append(", fieldType: ");
        sb2.append(this.f84559b);
        sb2.append(", options: ");
        ArrayList<FormInputFieldOptions> arrayList = this.f84561d;
        sb2.append(arrayList == null ? null : Integer.valueOf(arrayList.hashCode()));
        sb2.append(" }");
        return sb2.toString();
    }

    public FormInputField(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("name".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                setName(jsonReader.nextString());
            } else if ("fieldType".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                setFieldType(jsonReader.nextString());
            } else if ("options".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                ArrayList<FormInputFieldOptions> arrayList = new ArrayList<>();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        arrayList.add(new FormInputFieldOptions(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endArray();
                setOptions(arrayList);
            } else if (!"selectionUtteranceMetadata".equals(strNextName) || jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
            } else {
                setSelectionUtteranceMetadata(new g(jsonReader));
            }
        }
        jsonReader.endObject();
    }

    public FormInputField(JSONObject jSONObject) throws JSONException {
        setName(jSONObject.optString("name"));
        setFieldType(jSONObject.optString("fieldType"));
        if (jSONObject.has("options") && !jSONObject.isNull("options")) {
            ArrayList<FormInputFieldOptions> arrayList = new ArrayList<>();
            JSONArray jSONArray = jSONObject.getJSONArray("options");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(new FormInputFieldOptions(jSONArray.getJSONObject(i10)));
            }
            setOptions(arrayList);
        }
        if (!jSONObject.has("selectionUtteranceMetadata") || jSONObject.isNull("selectionUtteranceMetadata")) {
            return;
        }
        setSelectionUtteranceMetadata(new g(jSONObject.getJSONObject("selectionUtteranceMetadata")));
    }
}
