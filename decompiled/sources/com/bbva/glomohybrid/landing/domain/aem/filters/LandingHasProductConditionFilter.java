package com.bbva.glomohybrid.landing.domain.aem.filters;

import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomohybrid.landing.domain.aem.extensions.LandingAEMItemModelExtensionsKt;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingProductsConditionFilter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/aem/filters/LandingHasProductConditionFilter;", "Lcom/bbva/glomohybrid/landing/domain/aem/filters/BaseLandingConditionFilter;", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingAEMModel;", "aemItemModel", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "user", "", "meetCondition", "(Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingAEMModel;Lcom/bbva/glomo/user/domain/model/RememberedUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;)V", "Companion", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingProductsConditionFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingProductsConditionFilter.kt\ncom/bbva/glomohybrid/landing/domain/aem/filters/LandingHasProductConditionFilter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n766#2:74\n857#2,2:75\n1549#2:77\n1620#2,3:78\n1855#2,2:81\n*S KotlinDebug\n*F\n+ 1 LandingProductsConditionFilter.kt\ncom/bbva/glomohybrid/landing/domain/aem/filters/LandingHasProductConditionFilter\n*L\n23#1:74\n23#1:75,2\n24#1:77\n24#1:78,3\n37#1:81,2\n*E\n"})
public final class LandingHasProductConditionFilter extends BaseLandingConditionFilter {

    @NotNull
    public static final String ID = "hasProductCode";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f32563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    public LandingHasProductConditionFilter(@NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f32563a = storage;
        this.id = ID;
    }

    @Override // com.bbva.glomohybrid.landing.domain.aem.filters.LandingAEMConditionFilter
    @NotNull
    public String getId() {
        return this.id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    @Override // com.bbva.glomohybrid.landing.domain.aem.filters.LandingAEMConditionFilter
    @Nullable
    public Object meetCondition(@NotNull LandingAEMModel landingAEMModel, @Nullable RememberedUser rememberedUser, @NotNull Continuation<? super Boolean> continuation) {
        ?? EmptyList;
        LandingAEMModel landingAEMModelCheckConditions = checkConditions(landingAEMModel);
        boolean z10 = true;
        if (landingAEMModelCheckConditions != null) {
            List<String> productsCode = LandingAEMItemModelExtensionsKt.getProductsCode(landingAEMModelCheckConditions);
            if (productsCode != null) {
                for (String str : productsCode) {
                    JsonArray asJsonArray = MainStorage.getJson$default(this.f32563a, LocalStorageConstantsKt.KEY_USER_PRODUCTS_CONTRACTED, false, null, 6, null).getAsJsonArray("value");
                    if (asJsonArray != null) {
                        ArrayList arrayList = new ArrayList();
                        for (JsonElement jsonElement : asJsonArray) {
                            if (!jsonElement.isJsonNull()) {
                                arrayList.add(jsonElement);
                            }
                        }
                        EmptyList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            String asString = ((JsonElement) it.next()).getAsString();
                            Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
                            String lowerCase = asString.toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            EmptyList.add(lowerCase);
                        }
                    } else {
                        EmptyList = CollectionsKt__CollectionsKt.emptyList();
                    }
                    if (EmptyList.contains(str)) {
                    }
                }
                z10 = false;
            } else {
                z10 = false;
            }
        }
        return Boxing.boxBoolean(z10);
    }
}
