package com.bbva.component.dm.login.data.mapper;

import bk.d;
import com.bbva.component.dm.login.data.model.request.GrantingTicketDTO;
import com.bbva.component.dm.login.datamanager.config.GlobalLoginConfig;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GrantingTicketRequestMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/bbva/component/dm/login/data/mapper/GrantingTicketRequestMapper;", "", "", "user", "password", "Lcom/bbva/component/dm/login/datamanager/config/GlobalLoginConfig;", "config", "Lcom/bbva/component/dm/login/data/model/request/GrantingTicketDTO;", "toLoginDTO$component_dm_login_release", "(Ljava/lang/String;Ljava/lang/String;Lcom/bbva/component/dm/login/datamanager/config/GlobalLoginConfig;)Lcom/bbva/component/dm/login/data/model/request/GrantingTicketDTO;", "toLoginDTO", "toAnonymousLoginDTO$component_dm_login_release", "(Lcom/bbva/component/dm/login/datamanager/config/GlobalLoginConfig;)Lcom/bbva/component/dm/login/data/model/request/GrantingTicketDTO;", "toAnonymousLoginDTO", "<init>", "()V", "component-dm-login_release"}, k = 1, mv = {1, 5, 1})
public final class GrantingTicketRequestMapper {

    @NotNull
    public static final GrantingTicketRequestMapper INSTANCE = new GrantingTicketRequestMapper();

    public static GrantingTicketDTO.BackendUserRequest a(String str, GlobalLoginConfig globalLoginConfig) {
        GrantingTicketDTO.BackendUserRequest backendUserRequest = new GrantingTicketDTO.BackendUserRequest(null, null, null, null, 15, null);
        try {
            if (globalLoginConfig.isBackendUserRequired()) {
                if (str == null) {
                    str = "";
                }
                try {
                    backendUserRequest.setAccessCode(str);
                    backendUserRequest.setUserId(globalLoginConfig.getUsernameCode());
                } catch (NoSuchElementException unused) {
                }
                return backendUserRequest;
            }
        } catch (NoSuchElementException unused2) {
        }
        return null;
    }

    @NotNull
    public final GrantingTicketDTO toAnonymousLoginDTO$component_dm_login_release(@NotNull GlobalLoginConfig config) {
        GrantingTicketDTO.Authentication authentication;
        Intrinsics.checkNotNullParameter(config, "config");
        try {
            GrantingTicketDTO.Authentication authentication2 = new GrantingTicketDTO.Authentication(null, null, null, null, null, 31, null);
            authentication2.setUserID(config.getAnonymousConsumerId());
            authentication2.setConsumerID(config.getAnonymousConsumerId());
            authentication2.setAuthenticationType(config.getAnonymousAuthenticationType());
            INSTANCE.getClass();
            authentication2.setAuthenticationData(d.listOf(new GrantingTicketDTO.AuthenticationDatum(config.getIdAuthenticationData(), d.listOf(""), null, 4, null)));
            authentication = authentication2;
        } catch (NoSuchElementException unused) {
            authentication = new GrantingTicketDTO.Authentication(null, null, null, null, null, 31, null);
        }
        return new GrantingTicketDTO(authentication, a("", config), null, 4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        r1 = r11;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bbva.component.dm.login.data.model.request.GrantingTicketDTO toLoginDTO$component_dm_login_release(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.NotNull com.bbva.component.dm.login.datamanager.config.GlobalLoginConfig r13) {
        /*
            r10 = this;
            java.lang.String r0 = "user"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "password"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "config"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            com.bbva.component.dm.login.data.model.request.GrantingTicketDTO r0 = new com.bbva.component.dm.login.data.model.request.GrantingTicketDTO
            com.bbva.component.dm.login.data.model.request.GrantingTicketDTO$Authentication r9 = new com.bbva.component.dm.login.data.model.request.GrantingTicketDTO$Authentication
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 31
            r8 = 0
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r1 = r13.getUsernameBehaviour()     // Catch: java.util.NoSuchElementException -> L45
            java.lang.String r2 = "prefix"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)     // Catch: java.util.NoSuchElementException -> L45
            if (r2 == 0) goto L34
            java.lang.String r1 = r13.getUsernameCode()     // Catch: java.util.NoSuchElementException -> L45
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r11)     // Catch: java.util.NoSuchElementException -> L45
            goto L46
        L34:
            java.lang.String r2 = "suffix"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)     // Catch: java.util.NoSuchElementException -> L45
            if (r1 == 0) goto L45
            java.lang.String r1 = r13.getUsernameCode()     // Catch: java.util.NoSuchElementException -> L45
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r11, r1)     // Catch: java.util.NoSuchElementException -> L45
            goto L46
        L45:
            r1 = r11
        L46:
            r9.setUserID(r1)
            java.lang.String r1 = r13.getConsumerId()
            r9.setConsumerID(r1)
            java.lang.String r1 = r13.getAuthenticationType()
            r9.setAuthenticationType(r1)
            java.lang.String r3 = r13.getIdAuthenticationData()
            if (r12 != 0) goto L60
            r12 = 0
        L5e:
            r4 = r12
            goto L65
        L60:
            java.util.List r12 = bk.d.listOf(r12)
            goto L5e
        L65:
            r5 = 0
            r6 = 4
            r7 = 0
            com.bbva.component.dm.login.data.model.request.GrantingTicketDTO$AuthenticationDatum r12 = new com.bbva.component.dm.login.data.model.request.GrantingTicketDTO$AuthenticationDatum
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            java.util.List r12 = bk.d.listOf(r12)
            r9.setAuthenticationData(r12)
            com.bbva.component.dm.login.data.model.request.GrantingTicketDTO$BackendUserRequest r3 = a(r11, r13)
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r0
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbva.component.dm.login.data.mapper.GrantingTicketRequestMapper.toLoginDTO$component_dm_login_release(java.lang.String, java.lang.String, com.bbva.component.dm.login.datamanager.config.GlobalLoginConfig):com.bbva.component.dm.login.data.model.request.GrantingTicketDTO");
    }
}
