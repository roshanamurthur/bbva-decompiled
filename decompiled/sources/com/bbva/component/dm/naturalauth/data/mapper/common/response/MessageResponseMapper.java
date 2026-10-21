package com.bbva.component.dm.naturalauth.data.mapper.common.response;

import com.bbva.glomoutils.Mapper;
import com.google.gson.JsonParser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MessageResponseMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/dm/naturalauth/data/mapper/common/response/MessageResponseMapper;", "Lcom/bbva/glomoutils/Mapper;", "", "()V", "map", "input", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MessageResponseMapper implements Mapper<String, String> {
    @Override // com.bbva.glomoutils.Mapper
    @NotNull
    public String map(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        String asString = JsonParser.parseString(input).getAsJsonObject().get("data").getAsJsonObject().get("message").getAsString();
        Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
        return asString;
    }
}
