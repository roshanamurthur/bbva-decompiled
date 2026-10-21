package com.bbva.network.model;

import com.bbva.contacts.ContactAccessor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ConnectionState.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/network/model/NetworkSpeed;", "", "", "toString", ContactAccessor.DISPLAY_NAME, "Ljava/lang/String;", "VERY_HIGH", "HIGH", "MODERATE", "LOW", "UNKNOWN", "network_release"}, k = 1, mv = {1, 8, 0})
public enum NetworkSpeed {
    VERY_HIGH("veryHigh"),
    HIGH("high"),
    MODERATE("moderate"),
    LOW("low"),
    UNKNOWN("unknown");


    @NotNull
    private final String displayName;

    NetworkSpeed(String str) {
        this.displayName = str;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.displayName;
    }
}
