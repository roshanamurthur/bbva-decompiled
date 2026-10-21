package com.bbva.glomohybrid.landing.domain.aem.filters;

import com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingAEMConditionFilter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/aem/filters/BaseLandingConditionFilter;", "Lcom/bbva/glomohybrid/landing/domain/aem/filters/LandingAEMConditionFilter;", "()V", "checkConditions", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingAEMModel;", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLandingAEMConditionFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingAEMConditionFilter.kt\ncom/bbva/glomohybrid/landing/domain/aem/filters/BaseLandingConditionFilter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1603#2,9:35\n1855#2:44\n1856#2:46\n1612#2:47\n1#3:45\n1#3:48\n*S KotlinDebug\n*F\n+ 1 LandingAEMConditionFilter.kt\ncom/bbva/glomohybrid/landing/domain/aem/filters/BaseLandingConditionFilter\n*L\n29#1:35,9\n29#1:44\n29#1:46\n29#1:47\n29#1:45\n*E\n"})
public abstract class BaseLandingConditionFilter implements LandingAEMConditionFilter {
    @Nullable
    public LandingAEMModel checkConditions(@NotNull LandingAEMModel landingAEMModel) {
        Object next;
        Intrinsics.checkNotNullParameter(landingAEMModel, "<this>");
        List<String> conditions = landingAEMModel.getConditions();
        if (conditions != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = conditions.iterator();
            while (it.hasNext()) {
                String str = (String) CollectionsKt___CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default((CharSequence) it.next(), new String[]{LandingAEMModel.INSTANCE.getCONDITIONS_PARAMS_DELIMITER()}, false, 0, 6, (Object) null));
                if (str != null) {
                    arrayList.add(str);
                }
            }
            Iterator it2 = arrayList.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!StringsKt__StringsKt.contains$default((CharSequence) next, (CharSequence) getId(), false, 2, (Object) null));
            if (((String) next) != null) {
                return landingAEMModel;
            }
        }
        return null;
    }
}
