package com.bbva.ethermobilesdk.tokencompat.extension;

import com.bbva.ethermobilesdk.tokencompat.model.R1ServerResponse;
import com.bbva.ethermobilesdk.tokencompat.model.TokenCompatActivationResponse;
import com.bbva.ethermobilesdk.tokencompat.util.R1ParserHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: R1Response.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¨\u0006\u0004"}, d2 = {"", "Lcom/bbva/ethermobilesdk/tokencompat/model/R1ServerResponse;", "Lcom/bbva/ethermobilesdk/tokencompat/model/TokenCompatActivationResponse;", "extractActivationResponse", "ethertoken-compat_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nR1Response.kt\nKotlin\n*S Kotlin\n*F\n+ 1 R1Response.kt\ncom/bbva/ethermobilesdk/tokencompat/extension/R1ResponseKt\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,31:1\n32#2,2:32\n*S KotlinDebug\n*F\n+ 1 R1Response.kt\ncom/bbva/ethermobilesdk/tokencompat/extension/R1ResponseKt\n*L\n19#1:32,2\n*E\n"})
public final class R1ResponseKt {
    @NotNull
    public static final TokenCompatActivationResponse extractActivationResponse(@NotNull List<R1ServerResponse> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        String value = "";
        String value2 = value;
        String value3 = value2;
        for (R1ServerResponse r1ServerResponse : list) {
            String code = r1ServerResponse.getCode();
            if (code != null) {
                int iHashCode = code.hashCode();
                if (iHashCode != -443983076) {
                    if (iHashCode != -97606115) {
                        if (iHashCode == 543484429 && code.equals(R1ParserHandler.STS_ENROLL_SEED) && (value2 = r1ServerResponse.getValue()) == null) {
                            value2 = "";
                        }
                    } else if (code.equals(R1ParserHandler.STS_ENROLL_XML_CONFIG) && (value3 = r1ServerResponse.getValue()) == null) {
                        value3 = "";
                    }
                } else if (code.equals(R1ParserHandler.STS_ENROLL_ACTIVATION_DATA) && (value = r1ServerResponse.getValue()) == null) {
                    value = "";
                }
            }
        }
        return new TokenCompatActivationResponse(new TokenCompatActivationResponse.Data(value, value2, value3));
    }
}
