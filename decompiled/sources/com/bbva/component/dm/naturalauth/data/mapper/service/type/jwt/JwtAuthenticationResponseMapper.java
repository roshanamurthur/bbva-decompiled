package com.bbva.component.dm.naturalauth.data.mapper.service.type.jwt;

import com.bbva.component.dm.naturalauth.data.mapper.common.response.MessageResponseMapper;
import com.bbva.component.dm.naturalauth.domain.model.AuthenticationResponse;
import com.bbva.glomoutils.Mapper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JwtAuthenticationResponseMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/component/dm/naturalauth/data/mapper/service/type/jwt/JwtAuthenticationResponseMapper;", "Lcom/bbva/glomoutils/Mapper;", "", "Lcom/bbva/component/dm/naturalauth/domain/model/AuthenticationResponse;", "input", "map", "messageMapper", "<init>", "(Lcom/bbva/glomoutils/Mapper;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
public final class JwtAuthenticationResponseMapper implements Mapper<String, AuthenticationResponse> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Mapper<String, String> f27829a;

    /* JADX WARN: Multi-variable type inference failed */
    public JwtAuthenticationResponseMapper() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JwtAuthenticationResponseMapper(@NotNull Mapper<? super String, String> messageMapper) {
        Intrinsics.checkNotNullParameter(messageMapper, "messageMapper");
        this.f27829a = messageMapper;
    }

    @Override // com.bbva.glomoutils.Mapper
    @NotNull
    public AuthenticationResponse map(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return new AuthenticationResponse(this.f27829a.map(input), 0L, "");
    }

    public /* synthetic */ JwtAuthenticationResponseMapper(Mapper mapper, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new MessageResponseMapper() : mapper);
    }
}
