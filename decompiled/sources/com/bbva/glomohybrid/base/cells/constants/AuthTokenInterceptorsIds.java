package com.bbva.glomohybrid.base.cells.constants;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: AuthTokenInterceptorsIds.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/base/cells/constants/AuthTokenInterceptorsIds;", "", "GLOMO", "TENANT", "C_LINEA", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class AuthTokenInterceptorsIds {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AuthTokenInterceptorsIds[] $VALUES;
    public static final AuthTokenInterceptorsIds C_LINEA;
    public static final AuthTokenInterceptorsIds GLOMO;
    public static final AuthTokenInterceptorsIds TENANT;

    static {
        AuthTokenInterceptorsIds authTokenInterceptorsIds = new AuthTokenInterceptorsIds("GLOMO", 0);
        GLOMO = authTokenInterceptorsIds;
        AuthTokenInterceptorsIds authTokenInterceptorsIds2 = new AuthTokenInterceptorsIds("TENANT", 1);
        TENANT = authTokenInterceptorsIds2;
        AuthTokenInterceptorsIds authTokenInterceptorsIds3 = new AuthTokenInterceptorsIds("C_LINEA", 2);
        C_LINEA = authTokenInterceptorsIds3;
        AuthTokenInterceptorsIds[] authTokenInterceptorsIdsArr = {authTokenInterceptorsIds, authTokenInterceptorsIds2, authTokenInterceptorsIds3};
        $VALUES = authTokenInterceptorsIdsArr;
        $ENTRIES = EnumEntriesKt.enumEntries(authTokenInterceptorsIdsArr);
    }

    public AuthTokenInterceptorsIds() {
        throw null;
    }

    @NotNull
    public static EnumEntries<AuthTokenInterceptorsIds> getEntries() {
        return $ENTRIES;
    }

    public static AuthTokenInterceptorsIds valueOf(String str) {
        return (AuthTokenInterceptorsIds) Enum.valueOf(AuthTokenInterceptorsIds.class, str);
    }

    public static AuthTokenInterceptorsIds[] values() {
        return (AuthTokenInterceptorsIds[]) $VALUES.clone();
    }
}
