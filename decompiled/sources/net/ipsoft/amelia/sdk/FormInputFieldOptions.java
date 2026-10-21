package net.ipsoft.amelia.sdk;

import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import androidx.appcompat.app.i;
import com.bbva.ui.component.menu.model.BaseMenuItem;
import java.io.IOException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class FormInputFieldOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f84562a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f84563b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f84564c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f84565d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String f84566e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f84567f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f84568g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f84569h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected boolean f84570i = false;

    public FormInputFieldOptions() {
    }

    public boolean getDisabled() {
        return this.f84569h;
    }

    public boolean getHidden() {
        return this.f84570i;
    }

    public String getImageAlternativeText() {
        return this.f84565d;
    }

    public String getImageBase64() {
        return this.f84564c;
    }

    public String getName() {
        return this.f84562a;
    }

    public String getNameForDisplay() {
        return this.f84567f;
    }

    public boolean getSelected() {
        return this.f84568g;
    }

    public String getValue() {
        return this.f84563b;
    }

    public String getValueForDisplay() {
        return this.f84566e;
    }

    public boolean isDisabled() {
        return this.f84569h;
    }

    public boolean isHidden() {
        return this.f84570i;
    }

    public boolean isSelected() {
        return this.f84568g;
    }

    public void serialize(JsonWriter jsonWriter) throws IOException {
        jsonWriter.beginObject();
        if (this.f84562a != null) {
            jsonWriter.name("name");
            jsonWriter.value(this.f84562a);
        }
        if (this.f84563b != null) {
            jsonWriter.name("value");
            jsonWriter.value(this.f84563b);
        }
        if (this.f84564c != null) {
            jsonWriter.name("imageBase64");
            jsonWriter.value(this.f84564c);
        }
        if (this.f84565d != null) {
            jsonWriter.name("imageAltText");
            jsonWriter.value(this.f84565d);
        }
        if (this.f84566e != null) {
            jsonWriter.name("valueForDisplay");
            jsonWriter.value(this.f84566e);
        }
        if (this.f84567f != null) {
            jsonWriter.name("nameForDisplay");
            jsonWriter.value(this.f84567f);
        }
        jsonWriter.name("selected");
        jsonWriter.value(this.f84568g);
        jsonWriter.name(BaseMenuItem.STATE_DISABLED);
        jsonWriter.value(this.f84569h);
        jsonWriter.name(BaseMenuItem.STATE_HIDDEN);
        jsonWriter.value(this.f84570i);
        jsonWriter.endObject();
    }

    public void setDisabled(boolean z10) {
        this.f84569h = z10;
    }

    public void setHidden(boolean z10) {
        this.f84570i = z10;
    }

    public void setImageAlternativeText(String str) {
        this.f84565d = str;
    }

    public void setImageBase64(String str) {
        this.f84564c = str;
    }

    public void setName(String str) {
        this.f84562a = str;
    }

    public void setNameForDisplay(String str) {
        this.f84567f = str;
    }

    public void setSelected(boolean z10) {
        this.f84568g = z10;
    }

    public void setValue(String str) {
        this.f84563b = str;
    }

    public void setValueForDisplay(String str) {
        this.f84566e = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ name: ");
        sb2.append(this.f84562a);
        sb2.append(", value: ");
        sb2.append(this.f84563b);
        sb2.append(", selected: ");
        sb2.append(this.f84568g);
        sb2.append(", disabled: ");
        sb2.append(this.f84569h);
        sb2.append(", hidden: ");
        return i.c(sb2, this.f84570i, " }");
    }

    public FormInputFieldOptions(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("name".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                setName(jsonReader.nextString());
            } else if ("value".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                setValue(jsonReader.nextString());
            } else if ("imageBase64".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                setImageBase64(jsonReader.nextString());
            } else if ("imageAltText".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                setImageAlternativeText(jsonReader.nextString());
            } else if ("valueForDisplay".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                setValueForDisplay(jsonReader.nextString());
            } else if ("nameForDisplay".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                setNameForDisplay(jsonReader.nextString());
            } else if ("selected".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                setSelected(jsonReader.nextBoolean());
            } else if (BaseMenuItem.STATE_DISABLED.equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                setDisabled(jsonReader.nextBoolean());
            } else if (!BaseMenuItem.STATE_HIDDEN.equals(strNextName) || jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
            } else {
                setHidden(jsonReader.nextBoolean());
            }
        }
        jsonReader.endObject();
    }

    public FormInputFieldOptions(JSONObject jSONObject) {
        setName(jSONObject.optString("name"));
        setValue(jSONObject.optString("value"));
        setSelected(jSONObject.optBoolean("selected"));
        setDisabled(jSONObject.optBoolean(BaseMenuItem.STATE_DISABLED));
        setHidden(jSONObject.optBoolean(BaseMenuItem.STATE_HIDDEN));
        setImageBase64(jSONObject.optString("imageBase64"));
        setImageAlternativeText(jSONObject.optString("imageAltText"));
        setValueForDisplay(jSONObject.optString("valueForDisplay"));
        setNameForDisplay(jSONObject.optString("nameForDisplay"));
    }
}
