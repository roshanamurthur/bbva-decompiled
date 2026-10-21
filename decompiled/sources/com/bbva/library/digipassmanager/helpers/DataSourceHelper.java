package com.bbva.library.digipassmanager.helpers;

import com.bbva.network.model.request.NetworkRequestBody;
import com.bbva.network.model.response.body.Body;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DataSourceHelper.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006J\u0018\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007¨\u0006\u000e"}, d2 = {"Lcom/bbva/library/digipassmanager/helpers/DataSourceHelper;", "", "()V", "getRequestBody", "Lcom/bbva/network/model/request/NetworkRequestBody;", "requestBody", "", "", "toJSON", "Lorg/json/JSONObject;", "body", "Lcom/bbva/network/model/response/body/Body;", "contentType", "Companion", "digipassmanager-library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DataSourceHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final DataSourceHelper f34942a = new DataSourceHelper();

    /* JADX INFO: compiled from: DataSourceHelper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/library/digipassmanager/helpers/DataSourceHelper$Companion;", "", "()V", "<set-?>", "Lcom/bbva/library/digipassmanager/helpers/DataSourceHelper;", "instance", "getInstance", "()Lcom/bbva/library/digipassmanager/helpers/DataSourceHelper;", "digipassmanager-library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DataSourceHelper getInstance() {
            return DataSourceHelper.f34942a;
        }
    }

    /* JADX INFO: compiled from: DataSourceHelper.kt */
    public static final class a extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f34943p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(StringBuilder sb2) {
            super(1);
            this.f34943p0 = sb2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f34943p0.append(it);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final NetworkRequestBody getRequestBody(@NotNull Map<String, ? extends Object> requestBody) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        String string = new JSONObject(requestBody).toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject(requestBody).toString()");
        byte[] bytes = string.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return new NetworkRequestBody.RequestBody(bytes, "application/json");
    }

    @Nullable
    public final JSONObject toJSON(@NotNull Body body, @NotNull String contentType) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        if (!Intrinsics.areEqual(contentType, "application/json")) {
            return null;
        }
        InputStream inputStream = body.inputStream();
        StringBuilder sb2 = new StringBuilder();
        TextStreamsKt.forEachLine(new BufferedReader(new InputStreamReader(inputStream, "UTF-8")), new a(sb2));
        return new JSONObject(sb2.toString());
    }
}
