package net.ipsoft.amelia.sdk.internal.common;

import android.text.TextUtils;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import net.ipsoft.amelia.sdk.ContentDisplayOption;
import net.ipsoft.amelia.sdk.IResourceToDisplay;

/* JADX INFO: loaded from: classes12.dex */
public class l implements IResourceToDisplay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f84881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f84882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f84883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f84884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f84885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ContentDisplayOption f84886i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f84887j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f84888k;

    public l(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("objectId".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                this.f84878a = jsonReader.nextString();
            } else if ("bucketName".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                this.f84879b = jsonReader.nextString();
            } else if ("filename".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                this.f84880c = jsonReader.nextString();
            } else if ("title".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                this.f84881d = jsonReader.nextString();
            } else if ("byteCount".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                String strNextString = jsonReader.nextString();
                if (!TextUtils.isEmpty(strNextString)) {
                    this.f84887j = new Long(strNextString).longValue();
                }
            } else if ("fileSize".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                f(jsonReader.nextString());
            } else if ("description".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                this.f84882e = jsonReader.nextString();
            } else if ("previewStyle".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                String strNextString2 = jsonReader.nextString();
                ContentDisplayOption contentDisplayOption = ContentDisplayOption.INLINE_AND_POPUP;
                if (!strNextString2.equals(contentDisplayOption.name())) {
                    contentDisplayOption = ContentDisplayOption.INLINE_ONLY;
                    if (!strNextString2.equals(contentDisplayOption.name())) {
                        contentDisplayOption = ContentDisplayOption.POPUP_AND_INLINE;
                        if (!strNextString2.equals(contentDisplayOption.name())) {
                            contentDisplayOption = ContentDisplayOption.POPUP_ONLY;
                            if (!strNextString2.equals(contentDisplayOption.name())) {
                                contentDisplayOption = ContentDisplayOption.ATTACHMENT;
                                if (!strNextString2.equals(contentDisplayOption.name())) {
                                    contentDisplayOption = ContentDisplayOption.NO_PREVIEW;
                                }
                            }
                        }
                    }
                }
                a(contentDisplayOption);
            } else if ("download".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                String strNextString3 = jsonReader.nextString();
                if (strNextString3 != null && strNextString3.equals("DOWNLOAD_YES")) {
                    this.f84883f = true;
                }
            } else if ("displayFileName".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                a(jsonReader.nextString().equals("YES"));
            } else if (!"displayFileSize".equals(strNextName) || jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
            } else {
                b(jsonReader.nextString().equals("YES"));
            }
        }
        jsonReader.endObject();
    }

    public String a() {
        return this.f84878a;
    }

    public void b(boolean z10) {
        this.f84885h = z10;
    }

    public void f(String str) {
        this.f84888k = str;
    }

    @Override // net.ipsoft.amelia.sdk.IResourceToDisplay
    public String getBucketName() {
        return this.f84879b;
    }

    @Override // net.ipsoft.amelia.sdk.IResourceToDisplay
    public long getByteCount() {
        return this.f84887j;
    }

    @Override // net.ipsoft.amelia.sdk.IResourceToDisplay
    public String getDescription() {
        return this.f84882e;
    }

    @Override // net.ipsoft.amelia.sdk.IResourceToDisplay
    public ContentDisplayOption getDisplayOption() {
        return this.f84886i;
    }

    @Override // net.ipsoft.amelia.sdk.IResourceToDisplay
    public boolean getDownload() {
        return this.f84883f;
    }

    @Override // net.ipsoft.amelia.sdk.IResourceToDisplay
    public String getFileSize() {
        return this.f84888k;
    }

    @Override // net.ipsoft.amelia.sdk.IResourceToDisplay
    public String getFilename() {
        return this.f84880c;
    }

    @Override // net.ipsoft.amelia.sdk.IResourceToDisplay
    public String getLabel() {
        return this.f84881d;
    }

    @Override // net.ipsoft.amelia.sdk.IResourceToDisplay
    public boolean shouldDisplayFileName() {
        return this.f84884g;
    }

    @Override // net.ipsoft.amelia.sdk.IResourceToDisplay
    public boolean shouldDisplayFileSize() {
        return this.f84885h;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ ObjectId: ");
        sb2.append(this.f84878a);
        sb2.append(", bucketName");
        sb2.append(this.f84879b);
        sb2.append(", filename");
        sb2.append(this.f84880c);
        sb2.append(", label");
        sb2.append(this.f84881d);
        sb2.append(", description");
        sb2.append(this.f84882e);
        sb2.append(", download ");
        return androidx.appcompat.app.i.c(sb2, this.f84883f, " }");
    }

    public void a(long j10) {
        this.f84887j = j10;
    }

    public void a(ContentDisplayOption contentDisplayOption) {
        this.f84886i = contentDisplayOption;
    }

    public void a(boolean z10) {
        this.f84884g = z10;
    }
}
