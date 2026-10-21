package com.bbva.component.dm.akamai.interceptor.models;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: AkamaiErrorType.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/component/dm/akamai/interceptor/models/AkamaiErrorType;", "", "BOT_ERROR", "component-ic-akamai_release"}, k = 1, mv = {1, 8, 0})
public final class AkamaiErrorType {
    private static final /* synthetic */ AkamaiErrorType[] $VALUES;
    public static final AkamaiErrorType BOT_ERROR;

    static {
        AkamaiErrorType akamaiErrorType = new AkamaiErrorType("BOT_ERROR", 0);
        BOT_ERROR = akamaiErrorType;
        $VALUES = new AkamaiErrorType[]{akamaiErrorType};
    }

    public AkamaiErrorType() {
        throw null;
    }

    public static AkamaiErrorType valueOf(String str) {
        return (AkamaiErrorType) Enum.valueOf(AkamaiErrorType.class, str);
    }

    public static AkamaiErrorType[] values() {
        return (AkamaiErrorType[]) $VALUES.clone();
    }
}
