package com.mypinpad.tsdk.isolation;

import bk.p;
import com.mypinpad.tsdk.api.models.CurrencyCustomFormatting;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nSdkCurrencyCustomFormatting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdkCurrencyCustomFormatting.kt\ncom/mypinpad/tsdk/internal/sdk/models/SdkCurrencyCustomFormattingKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,45:1\n442#2:46\n392#2:47\n1238#3,4:48\n*S KotlinDebug\n*F\n+ 1 SdkCurrencyCustomFormatting.kt\ncom/mypinpad/tsdk/internal/sdk/models/SdkCurrencyCustomFormattingKt\n*L\n32#1:46\n32#1:47\n32#1:48,4\n*E\n"})
public final class si {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f60873a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f60874b = 1;

    @NotNull
    public static final Map<Currency, sf> setX(@NotNull Map<Currency, CurrencyCustomFormatting> map) {
        return (Map) setY(new Object[]{map}, -768936710, 768936710, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        sf sfVar;
        Object obj;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~(i13 | i14);
        if ((i15 * 576) + (((~(i10 | (~i12) | i14)) | (~(i11 | i13))) * 576) + (((~(i14 | i12)) | i15) * 576) + (i11 * (-575)) + (i10 * (-575)) != 1) {
            Map map = (Map) objArr[0];
            Intrinsics.checkNotNullParameter(map, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap(p.mapCapacity(map.size()));
            Iterator it = map.entrySet().iterator();
            int i16 = f60873a + 7;
            while (true) {
                f60874b = i16 % 128;
                int i17 = i16 % 2;
                if (!it.hasNext()) {
                    break;
                }
                int i18 = f60874b;
                int i19 = (i18 ^ 11) + ((i18 & 11) << 1);
                f60873a = i19 % 128;
                int i20 = i19 % 2;
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), (sf) setY(new Object[]{(CurrencyCustomFormatting) entry.getValue()}, 121569991, -121569990, (int) System.currentTimeMillis()));
                i16 = f60873a + 123;
            }
            int i21 = f60874b;
            int i22 = i21 | 75;
            int i23 = (i22 << 1) - ((~(i21 & 75)) & i22);
            f60873a = i23 % 128;
            obj = linkedHashMap;
            if (i23 % 2 != 0) {
                throw null;
            }
        } else {
            CurrencyCustomFormatting currencyCustomFormatting = (CurrencyCustomFormatting) objArr[0];
            Intrinsics.checkNotNullParameter(currencyCustomFormatting, "");
            sfVar = new sf(currencyCustomFormatting.getDisplaySymbol(), currencyCustomFormatting.getDesignatorAfterValue(), currencyCustomFormatting.getDisplayExponent(), currencyCustomFormatting.getAmountGroupSeparator(), currencyCustomFormatting.getDecimalSeparator());
            int i24 = f60873a;
            int i25 = ((i24 & (-28)) | ((~i24) & 27)) + ((i24 & 27) << 1);
            f60874b = i25 % 128;
            if (i25 % 2 == 0) {
                obj = sfVar;
                throw null;
            }
        }
        obj = sfVar;
        return obj;
    }
}
