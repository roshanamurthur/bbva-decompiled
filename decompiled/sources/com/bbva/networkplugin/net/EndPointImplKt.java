package com.bbva.networkplugin.net;

import com.bbva.glomohybrid.documents.common.repository.dataSource.DiskFileDataSource;
import com.bbva.network.constant.ConstantsKt;
import com.bbva.network.model.response.body.Body;
import com.bbva.network.multipart_extensions.response.NetworkBodyPart;
import com.bbva.networkplugin.utils.JsonUtils;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: EndPointImpl.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"network-plugin_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEndPointImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EndPointImpl.kt\ncom/bbva/networkplugin/net/EndPointImplKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,105:1\n1747#2,3:106\n32#3,2:109\n*S KotlinDebug\n*F\n+ 1 EndPointImpl.kt\ncom/bbva/networkplugin/net/EndPointImplKt\n*L\n87#1:106,3\n100#1:109,2\n*E\n"})
public final class EndPointImplKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final List<String> f35267a = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{DiskFileDataSource.APPLICATION_PDF, AuthConstants.IMAGE, "video", "multipart", "octet-stream", ConstantsKt.DEFAULT_MEDIATYPE, "application/zip"});

    public static final String a(Body body, String str, Base64Encoder base64Encoder) throws IOException {
        List<String> list = f35267a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (String str2 : list) {
                if (str != null) {
                    if (l.startsWith$default(str, str2, false, 2, null)) {
                        InputStream inputStream = body.inputStream();
                        return base64Encoder.toBase64(inputStream != null ? ByteStreamsKt.readBytes(inputStream) : null);
                    }
                }
            }
        }
        String strString = body.string();
        return strString == null ? "" : strString;
    }

    public static final JSONObject access$toJson(NetworkBodyPart networkBodyPart, Base64Encoder base64Encoder) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("headers", JsonUtils.toJson(networkBodyPart.getHeaders()));
        jSONObject.put("content", a(networkBodyPart, networkBodyPart.getContentType(), base64Encoder));
        jSONObject.put("filename", networkBodyPart.getFilename());
        jSONObject.put("contentType", networkBodyPart.getContentType());
        return jSONObject;
    }
}
