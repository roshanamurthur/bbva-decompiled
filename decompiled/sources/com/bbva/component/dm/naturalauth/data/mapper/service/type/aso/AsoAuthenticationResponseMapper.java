package com.bbva.component.dm.naturalauth.data.mapper.service.type.aso;

import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.component.dm.naturalauth.data.helper.JsonExtensionsKt;
import com.bbva.component.dm.naturalauth.domain.model.AuthenticationResponse;
import com.bbva.glomoutils.Mapper;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AsoAuthenticationResponseMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/component/dm/naturalauth/data/mapper/service/type/aso/AsoAuthenticationResponseMapper;", "Lcom/bbva/glomoutils/Mapper;", "", "Lcom/bbva/component/dm/naturalauth/domain/model/AuthenticationResponse;", "input", "map", "<init>", "()V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAsoAuthenticationResponseMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsoAuthenticationResponseMapper.kt\ncom/bbva/component/dm/naturalauth/data/mapper/service/type/aso/AsoAuthenticationResponseMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1#2:38\n*E\n"})
public final class AsoAuthenticationResponseMapper implements Mapper<String, AuthenticationResponse> {

    /* JADX INFO: compiled from: AsoAuthenticationResponseMapper.kt */
    public static final class a extends Lambda implements Function1<JsonElement, String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f27828p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(JsonElement jsonElement) {
            JsonElement jsonElement2 = jsonElement;
            Intrinsics.checkNotNullParameter(jsonElement2, "jsonElement");
            JsonElement jsonElement3 = jsonElement2.getAsJsonObject().get(Constants.authenticationData).getAsJsonArray().get(0);
            if (jsonElement3 != null) {
                return jsonElement3.getAsString();
            }
            return null;
        }
    }

    public static String a(JsonObject jsonObject, String str) {
        JsonElement next;
        JsonElement jsonElement;
        JsonArray asJsonArray = jsonObject.get(Constants.authenticationResponse).getAsJsonObject().get(Constants.authenticationData).getAsJsonArray();
        Intrinsics.checkNotNull(asJsonArray);
        Iterator<JsonElement> it = asJsonArray.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            jsonElement = next;
            Intrinsics.checkNotNull(jsonElement);
        } while (!JsonExtensionsKt.byId(jsonElement, str));
        JsonElement jsonElement2 = next;
        String str2 = jsonElement2 != null ? (String) JsonExtensionsKt.map(jsonElement2, a.f27828p0) : null;
        return str2 == null ? "" : str2;
    }

    @Override // com.bbva.glomoutils.Mapper
    @NotNull
    public AuthenticationResponse map(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        JsonObject asJsonObject = JsonParser.parseString(input).getAsJsonObject();
        Intrinsics.checkNotNull(asJsonObject);
        return new AuthenticationResponse(a(asJsonObject, "message"), Util.toLongOrDefault(a(asJsonObject, Constants.lifeTime), 0L), JsonExtensionsKt.getValueForKeyOrEmpty(asJsonObject, "multistepProcessId"));
    }
}
