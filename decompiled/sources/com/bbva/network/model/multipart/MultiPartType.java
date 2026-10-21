package com.bbva.network.model.multipart;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MultiPart.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/bbva/network/model/multipart/MultiPartType;", "", "", "rawType", "Ljava/lang/String;", "getRawType", "()Ljava/lang/String;", "Companion", "MIXED", "ALTERNATIVE", "DIGEST", "PARALLEL", "FORM", "network_release"}, k = 1, mv = {1, 8, 0})
public enum MultiPartType {
    MIXED("multipart/mixed"),
    ALTERNATIVE("multipart/alternative"),
    DIGEST("multipart/digest"),
    PARALLEL("multipart/parallel"),
    FORM("multipart/form-data");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String rawType;

    /* JADX INFO: compiled from: MultiPart.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/network/model/multipart/MultiPartType$Companion;", "", "()V", "fromRawType", "Lcom/bbva/network/model/multipart/MultiPartType;", "value", "", "network_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MultiPartType fromRawType(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            for (MultiPartType multiPartType : MultiPartType.values()) {
                if (Intrinsics.areEqual(multiPartType.getRawType(), value)) {
                    return multiPartType;
                }
            }
            return MultiPartType.FORM;
        }
    }

    MultiPartType(String str) {
        this.rawType = str;
    }

    @NotNull
    public final String getRawType() {
        return this.rawType;
    }
}
