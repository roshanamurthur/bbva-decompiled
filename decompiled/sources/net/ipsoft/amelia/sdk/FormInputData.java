package net.ipsoft.amelia.sdk;

import ad.d;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import net.ipsoft.amelia.sdk.internal.a.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class FormInputData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f84551a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f84552b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f84553c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ArrayList<FormInputField> f84554d = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected g f84555e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f84556f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f84557g = null;

    public FormInputData() {
    }

    public String getAllowedUserInputs() {
        return this.f84556f;
    }

    public ArrayList<FormInputField> getFields() {
        return this.f84554d;
    }

    public String getFormType() {
        return this.f84553c;
    }

    public String getInstructions() {
        return this.f84557g;
    }

    public String getName() {
        return this.f84551a;
    }

    public String getNameForDisplay() {
        return this.f84552b;
    }

    public g getSelectionUtteranceMetadata() {
        return this.f84555e;
    }

    public String serialize() throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(new BufferedWriter(stringWriter));
        jsonWriter.beginObject();
        if (this.f84551a != null) {
            jsonWriter.name("name");
            jsonWriter.value(this.f84551a);
        }
        if (this.f84552b != null) {
            jsonWriter.name("nameForDisplay");
            jsonWriter.value(this.f84552b);
        }
        if (this.f84557g != null) {
            jsonWriter.name("instructions");
            jsonWriter.value(this.f84557g);
        }
        if (this.f84553c != null) {
            jsonWriter.name("formType");
            jsonWriter.value(this.f84553c);
        }
        if (this.f84554d != null) {
            jsonWriter.name("fields");
            jsonWriter.beginArray();
            for (int i10 = 0; i10 < this.f84554d.size(); i10++) {
                this.f84554d.get(i10).serialize(jsonWriter);
            }
            jsonWriter.endArray();
        }
        if (this.f84555e != null) {
            jsonWriter.name("selectionUtteranceMetadata");
            this.f84555e.a(jsonWriter);
        }
        if (this.f84556f != null) {
            jsonWriter.name("allowedUserInputs");
            jsonWriter.value(this.f84556f);
        }
        jsonWriter.endObject();
        jsonWriter.close();
        return stringWriter.toString();
    }

    public String serializeSelectedFields() throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(new BufferedWriter(stringWriter));
        serializeSelectedFields(jsonWriter);
        jsonWriter.close();
        return stringWriter.toString();
    }

    public void setAllowedUserInputs(String str) {
        this.f84556f = str;
    }

    public void setFields(ArrayList<FormInputField> arrayList) {
        this.f84554d = arrayList;
    }

    public void setFormType(String str) {
        this.f84553c = str;
    }

    public void setInstructions(String str) {
        this.f84557g = str;
    }

    public void setName(String str) {
        this.f84551a = str;
    }

    public void setNameForDisplay(String str) {
        this.f84552b = str;
    }

    public void setSelectionUtteranceMetadata(g gVar) {
        this.f84555e = gVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ name: ");
        sb2.append(this.f84551a);
        sb2.append(", instructions: ");
        sb2.append(this.f84557g);
        sb2.append(",  nameForDisplay: ");
        sb2.append(this.f84552b);
        sb2.append(", formType: ");
        sb2.append(this.f84553c);
        sb2.append(", fields: ");
        ArrayList<FormInputField> arrayList = this.f84554d;
        sb2.append(arrayList == null ? null : Integer.valueOf(arrayList.hashCode()));
        sb2.append(", selectionUtteranceMetadata: ");
        g gVar = this.f84555e;
        sb2.append(gVar != null ? Integer.valueOf(gVar.hashCode()) : null);
        sb2.append(", allowedUserInputs: ");
        return d.f(sb2, this.f84556f, " }");
    }

    public FormInputData(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("name".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                setName(jsonReader.nextString());
            } else if ("nameForDisplay".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                setNameForDisplay(jsonReader.nextString());
            } else if ("formType".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                setFormType(jsonReader.nextString());
            } else if ("fields".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                ArrayList<FormInputField> arrayList = new ArrayList<>();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        arrayList.add(new FormInputField(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endArray();
                setFields(arrayList);
            } else if ("selectionUtteranceMetadata".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                setSelectionUtteranceMetadata(new g(jsonReader));
            } else if ("allowedUserInputs".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                setAllowedUserInputs(jsonReader.nextString());
            } else if (!"instructions".equals(strNextName) || jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
            } else {
                setInstructions(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
    }

    public void serializeSelectedFields(JsonWriter jsonWriter) throws IOException {
        jsonWriter.beginObject();
        if (this.f84554d != null) {
            for (int i10 = 0; i10 < this.f84554d.size(); i10++) {
                FormInputField formInputField = this.f84554d.get(i10);
                jsonWriter.name(formInputField.getName());
                jsonWriter.beginArray();
                if (formInputField.getOptions() != null) {
                    for (int i11 = 0; i11 < formInputField.getOptions().size(); i11++) {
                        FormInputFieldOptions formInputFieldOptions = formInputField.getOptions().get(i11);
                        if (formInputFieldOptions.f84568g) {
                            jsonWriter.value(formInputFieldOptions.f84562a);
                        }
                    }
                }
                jsonWriter.endArray();
            }
        }
        jsonWriter.endObject();
    }

    public FormInputData(JSONObject jSONObject) throws JSONException {
        setName(jSONObject.optString("name"));
        setInstructions(jSONObject.optString("instructions"));
        setNameForDisplay(jSONObject.optString("nameForDisplay"));
        setFormType(jSONObject.optString("formType"));
        if (jSONObject.has("fields") && !jSONObject.isNull("fields")) {
            ArrayList<FormInputField> arrayList = new ArrayList<>();
            JSONArray jSONArray = jSONObject.getJSONArray("fields");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(new FormInputField(jSONArray.getJSONObject(i10)));
            }
            setFields(arrayList);
        }
        if (jSONObject.has("selectionUtteranceMetadata") && !jSONObject.isNull("selectionUtteranceMetadata")) {
            setSelectionUtteranceMetadata(new g(jSONObject.getJSONObject("selectionUtteranceMetadata")));
        }
        setAllowedUserInputs(jSONObject.optString("allowedUserInputs"));
    }
}
