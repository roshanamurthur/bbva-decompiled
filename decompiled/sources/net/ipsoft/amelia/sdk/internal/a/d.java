package net.ipsoft.amelia.sdk.internal.a;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bbva.glomohybrid.infoscreen.optionlist.handler.OptionListAnalyticsHandler;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.ipsoft.amelia.sdk.BpnExecutionEvent;
import net.ipsoft.amelia.sdk.FormInputData;
import net.ipsoft.amelia.sdk.IAmeliaOutboundMessage;
import net.ipsoft.amelia.sdk.IResourceToDisplay;
import net.ipsoft.amelia.sdk.IResourceToRequest;
import net.ipsoft.amelia.sdk.UploadMessage;

/* JADX INFO: loaded from: classes12.dex */
public class d implements IAmeliaOutboundMessage {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected net.ipsoft.amelia.sdk.internal.common.h f84599n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected UploadMessage f84600o;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected List<String> f84608w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected boolean f84609x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected boolean f84610y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected boolean f84611z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f84587a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f84588b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f84589c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f84590d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f84591e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f84592f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f84593g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected String f84594h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected String f84595i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected String f84596j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected String f84597k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected String f84598l = null;
    protected Map<String, String> m = new HashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected BpnExecutionEvent f84601p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected String f84602q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected FormInputData f84603r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected IResourceToDisplay f84604s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected IResourceToRequest f84605t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected String f84606u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected String f84607v = null;

    public d(JsonReader jsonReader) throws IOException {
        ArrayList arrayList;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("sourceClass".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                c(jsonReader.nextString());
            } else if ("messageText".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                d(jsonReader.nextString());
            } else if ("messageType".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                e(jsonReader.nextString());
            } else if ("inResponseToMessageId".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                f(jsonReader.nextString());
            } else if (OptionListAnalyticsHandler.RETRY.equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                a(jsonReader.nextBoolean());
            } else if ("sourceSessionId".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                g(jsonReader.nextString());
            } else if ("conversationId".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                h(jsonReader.nextString());
            } else if ("contextId".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                j(jsonReader.nextString());
            } else if ("fromUserDisplayName".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                i(jsonReader.nextString());
            } else if ("id".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                k(jsonReader.nextString());
            } else if ("voice".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                b(jsonReader.nextString());
            } else if ("hintText".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                a(jsonReader.nextString());
            } else if ("emoticon".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                l(jsonReader.nextString());
            } else if ("formInputData".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                a(new FormInputData(jsonReader));
            } else if ("integrationMessageData".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                m(jsonReader.nextString());
            } else if ("avatarVoice".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                n(jsonReader.nextString());
            } else if ("bml".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                String strNextString = jsonReader.nextString();
                if (strNextString != null) {
                    arrayList = new ArrayList();
                    JsonReader jsonReader2 = new JsonReader(new BufferedReader(new StringReader(strNextString)));
                    try {
                        try {
                            jsonReader2.beginArray();
                            while (jsonReader2.hasNext()) {
                                jsonReader2.beginArray();
                                while (jsonReader2.hasNext()) {
                                    JsonReader jsonReader3 = new JsonReader(new BufferedReader(new StringReader(jsonReader2.nextString())));
                                    try {
                                        try {
                                            jsonReader3.beginObject();
                                            while (jsonReader3.hasNext()) {
                                                if (!jsonReader3.nextName().contains("Speech") || jsonReader3.peek() == JsonToken.NULL) {
                                                    jsonReader3.skipValue();
                                                } else {
                                                    jsonReader3.beginObject();
                                                    while (jsonReader3.hasNext()) {
                                                        if (!"text".equals(jsonReader3.nextName()) || jsonReader3.peek() == JsonToken.NULL) {
                                                            jsonReader3.skipValue();
                                                        } else {
                                                            String strNextString2 = jsonReader3.nextString();
                                                            if (!strNextString2.toLowerCase().contains("amelia-mmo") && !strNextString2.contains("UPLOAD_REQUEST_MESSAGE_EVENT")) {
                                                                arrayList.add(strNextString2.replaceAll("_SyncWord\\d+_", "").replaceAll("<nospeak>.*?</nospeak>", ""));
                                                            }
                                                        }
                                                    }
                                                    jsonReader3.endObject();
                                                }
                                            }
                                            jsonReader3.endObject();
                                        } catch (IOException e5) {
                                            e5.printStackTrace();
                                        }
                                        try {
                                            jsonReader3.close();
                                        } catch (IOException unused) {
                                        }
                                    } catch (Throwable th2) {
                                        try {
                                            jsonReader3.close();
                                        } catch (IOException unused2) {
                                        }
                                        throw th2;
                                    }
                                }
                                jsonReader2.endArray();
                            }
                            jsonReader2.endArray();
                        } catch (Throwable th3) {
                            try {
                                jsonReader2.close();
                            } catch (IOException unused3) {
                            }
                            throw th3;
                        }
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                    try {
                        jsonReader2.close();
                    } catch (IOException unused4) {
                    }
                } else {
                    arrayList = null;
                }
                a(arrayList);
            } else if ("secureResponse".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                b(jsonReader.nextBoolean());
            } else if ("resourceToPresent".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                a(new net.ipsoft.amelia.sdk.internal.common.l(jsonReader));
            } else if ("resourceToRequest".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                a(new net.ipsoft.amelia.sdk.internal.common.m(jsonReader));
            } else if ("event".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                a(new BpnExecutionEvent(jsonReader));
            } else if ("cancellable".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                d(jsonReader.nextBoolean());
            } else if (!"multiple".equals(strNextName) || jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
            } else {
                c(jsonReader.nextBoolean());
            }
        }
        jsonReader.endObject();
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaOutboundMessage
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public net.ipsoft.amelia.sdk.internal.common.h getDownloadMessage() {
        return this.f84599n;
    }

    public void b(String str) {
        this.f84598l = str;
    }

    public void c(String str) {
        this.f84587a = str;
    }

    public void d(String str) {
        this.f84588b = str;
    }

    public void e(String str) {
        this.f84589c = str;
    }

    public void f(String str) {
        this.f84590d = str;
    }

    public void g(String str) {
        this.f84593g = str;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaOutboundMessage
    public String getAvatarVoice() {
        return this.f84607v;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaOutboundMessage
    public BpnExecutionEvent getBpnExecutionEvent() {
        return this.f84601p;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaOutboundMessage
    public String getContextId() {
        return this.f84595i;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaOutboundMessage
    public String getConversationId() {
        return this.f84594h;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaOutboundMessage
    public FormInputData getFormInputData() {
        return this.f84603r;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaOutboundMessage
    public String getFromUserDisplayName() {
        return this.f84596j;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaOutboundMessage
    public String getHeader(String str) {
        return this.m.get(str);
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaOutboundMessage
    public Map<String, String> getHeaders() {
        return this.m;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaOutboundMessage
    public String getHintText() {
        return this.f84592f;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaOutboundMessage
    public String getId() {
        return this.f84597k;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaOutboundMessage
    public String getInResponseToMessageId() {
        return this.f84590d;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaOutboundMessage
    public String getIntegrationMessageData() {
        return this.f84606u;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaOutboundMessage
    public String getMessageText() {
        return this.f84588b;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaOutboundMessage
    public String getMessageType() {
        return this.f84589c;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaOutboundMessage
    public String getMood() {
        return this.f84602q;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaOutboundMessage
    public IResourceToDisplay getResourceToDisplay() {
        return this.f84604s;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaOutboundMessage
    public IResourceToRequest getResourceToRequest() {
        return this.f84605t;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaOutboundMessage
    public boolean getRetry() {
        return this.f84591e;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaOutboundMessage
    public String getSourceClass() {
        return this.f84587a;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaOutboundMessage
    public String getSourceSessionId() {
        return this.f84593g;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaOutboundMessage
    public List<String> getSpeech() {
        return this.f84608w;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaOutboundMessage
    public UploadMessage getUploadMessage() {
        return this.f84600o;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaOutboundMessage
    public String getVoice() {
        return this.f84598l;
    }

    public void h(String str) {
        this.f84594h = str;
    }

    public void i(String str) {
        this.f84596j = str;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaOutboundMessage
    public boolean isCancellable() {
        return this.f84611z;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaOutboundMessage
    public boolean isMultiple() {
        return this.f84610y;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaOutboundMessage
    public boolean isSelfEcho() {
        return "true".equals(getHeader("X-Amelia-Self-Echo").trim());
    }

    public void j(String str) {
        this.f84595i = str;
    }

    public void k(String str) {
        this.f84597k = str;
    }

    public void l(String str) {
        this.f84602q = str;
    }

    public void m(String str) {
        this.f84606u = str;
    }

    public void n(String str) {
        this.f84607v = str;
    }

    @Override // net.ipsoft.amelia.sdk.IAmeliaOutboundMessage
    public boolean shouldSecureInput() {
        return this.f84609x;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{ sourceClass: ");
        sb2.append(this.f84587a);
        sb2.append(", messageText: ");
        sb2.append(this.f84588b);
        sb2.append(", messageType: ");
        sb2.append(this.f84589c);
        sb2.append(", inResponseToMessageId: ");
        sb2.append(this.f84590d);
        sb2.append(", retry: ");
        sb2.append(this.f84591e);
        sb2.append(", sourceSessionId: ");
        sb2.append(this.f84593g);
        sb2.append(", conversationId: ");
        sb2.append(this.f84594h);
        sb2.append(", fromUserDisplayName: ");
        sb2.append(this.f84596j);
        sb2.append(", id: ");
        sb2.append(this.f84597k);
        sb2.append("voice: ");
        return ad.d.f(sb2, this.f84598l, " }");
    }

    public void a(String str) {
        this.f84592f = str;
    }

    public void b(boolean z10) {
        this.f84609x = z10;
    }

    public void c(boolean z10) {
        this.f84610y = z10;
    }

    public void d(boolean z10) {
        this.f84611z = z10;
    }

    public void a(String str, String str2) {
        this.m.put(str, str2);
    }

    public void a(List<String> list) {
        this.f84608w = list;
    }

    public void a(BpnExecutionEvent bpnExecutionEvent) {
        this.f84601p = bpnExecutionEvent;
    }

    public void a(FormInputData formInputData) {
        this.f84603r = formInputData;
    }

    public void a(IResourceToDisplay iResourceToDisplay) {
        this.f84604s = iResourceToDisplay;
    }

    public void a(IResourceToRequest iResourceToRequest) {
        this.f84605t = iResourceToRequest;
    }

    public void a(UploadMessage uploadMessage) {
        this.f84600o = uploadMessage;
    }

    public void a(net.ipsoft.amelia.sdk.internal.common.h hVar) {
        this.f84599n = hVar;
    }

    public void a(boolean z10) {
        this.f84591e = z10;
    }
}
