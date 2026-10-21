package com.bbva.networkplugin.net;

import bk.q;
import com.bbva.androidtoolkit.plugin.response.SimpleResponse;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.NetworkWorker;
import com.bbva.network.exceptions.ConnectionException;
import com.bbva.network.exceptions.NotConnectionAvailable;
import com.bbva.network.model.NetworkRequest;
import com.bbva.network.model.response.NetworkResponse;
import com.bbva.network.multipart_extensions.response.MultipartNetworkResponse;
import com.bbva.network.multipart_extensions.response.NetworkBodyPart;
import com.bbva.networkplugin.utils.ExtensionsKt;
import com.bbva.networkplugin.utils.JsonUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.mail.MessagingException;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: EndPointImpl.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lcom/bbva/networkplugin/net/EndPointImpl;", "Lcom/bbva/networkplugin/net/EndPoint;", "", "cleanAllCookies", "Lcom/bbva/network/model/NetworkRequest;", "request", "Lorg/json/JSONObject;", "execute", "Lcom/bbva/network/NetworkWorker;", "client", "Lcom/bbva/networkplugin/net/Base64Encoder;", "base64Encoder", "<init>", "(Lcom/bbva/network/NetworkWorker;Lcom/bbva/networkplugin/net/Base64Encoder;)V", "network-plugin_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEndPointImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EndPointImpl.kt\ncom/bbva/networkplugin/net/EndPointImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1549#2:106\n1620#2,3:107\n1#3:110\n*S KotlinDebug\n*F\n+ 1 EndPointImpl.kt\ncom/bbva/networkplugin/net/EndPointImpl\n*L\n61#1:106\n61#1:107,3\n*E\n"})
public final class EndPointImpl implements EndPoint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f35265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Base64Encoder f35266b;

    public EndPointImpl(@NotNull NetworkWorker client, @NotNull Base64Encoder base64Encoder) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(base64Encoder, "base64Encoder");
        this.f35265a = client;
        this.f35266b = base64Encoder;
    }

    @Override // com.bbva.networkplugin.net.EndPoint
    public boolean cleanAllCookies() {
        return this.f35265a.cleanAllCookies();
    }

    @Override // com.bbva.networkplugin.net.EndPoint
    @NotNull
    public JSONObject execute(@NotNull NetworkRequest request) throws NotConnectionAvailable, JSONException, MessagingException, ConnectionException, IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        NetworkResponse networkResponseExecute = this.f35265a.execute(request);
        JSONObject json = JsonUtils.toJson(networkResponseExecute.getHeaders());
        Intrinsics.checkNotNullExpressionValue(json, "toJson(response.headers)");
        String str = (String) ExtensionsKt.getIgnoreCase(networkResponseExecute.getHeaders(), DigipassManagerConstants.KEY_CONTENT_TYPE);
        String strBoundary = com.bbva.network.multipart_extensions.ExtensionsKt.boundary(networkResponseExecute);
        Base64Encoder base64Encoder = this.f35266b;
        if (strBoundary == null) {
            String strA = EndPointImplKt.a(networkResponseExecute.getBody(), str, base64Encoder);
            JSONObject json2 = SimpleResponse.toJson(q.mapOf(TuplesKt.to("headers", json.toString()), TuplesKt.to(DigipassManagerConstants.KEY_RESPONSE, strA), TuplesKt.to("data", strA), TuplesKt.to("status", Integer.valueOf(networkResponseExecute.getCode())), TuplesKt.to("responseURL", networkResponseExecute.getUrl())));
            Intrinsics.checkNotNullExpressionValue(json2, "toJson(\n            mapO…l\n            )\n        )");
            return json2;
        }
        String strMultipartMixedOf = com.bbva.network.multipart_extensions.ExtensionsKt.multipartMixedOf(strBoundary);
        JSONObject json3 = JsonUtils.toJson(networkResponseExecute.getHeaders());
        Intrinsics.checkNotNullExpressionValue(json3, "toJson(response.headers)");
        List<NetworkBodyPart> listParts = new MultipartNetworkResponse(networkResponseExecute).getMultipartBody().parts(strMultipartMixedOf, true);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listParts, 10));
        Iterator<T> it = listParts.iterator();
        while (it.hasNext()) {
            arrayList.add(EndPointImplKt.access$toJson((NetworkBodyPart) it.next(), base64Encoder));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("parts", new JSONArray((Collection) arrayList));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("headers", json3.toString());
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("data", jSONObject);
        Unit unit = Unit.INSTANCE;
        jSONObject2.put(DigipassManagerConstants.KEY_RESPONSE, jSONObject3);
        jSONObject2.put("status", networkResponseExecute.getCode());
        return jSONObject2;
    }

    public /* synthetic */ EndPointImpl(NetworkWorker networkWorker, Base64Encoder base64Encoder, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(networkWorker, (i10 & 2) != 0 ? new Base64Encoder() : base64Encoder);
    }
}
