package com.bbva.glomohybrid.landing.domain.aem.extensions;

import com.bbva.glomohybrid.landing.domain.aem.filters.LandingHasNotProductConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingHasProductConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingMaxAndroidSdkConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingMaxDateConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingMaxVersionConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingMinAndroidSdkConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingMinDateConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingMinVersionConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.filters.LandingUserConditionFilter;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel;
import com.bbva.glomoutils.StringDateExtensionsKt;
import com.bbva.glomoutils.semanticversion.GlomoSemanticVersion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingAEMItemModelExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0005\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0017\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0017\u0010\r\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0004\"\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\b\"\u0017\u0010\u0011\u001a\u0004\u0018\u00010\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\f\"\u001d\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0014*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u001d\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0014*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {LandingMaxDateConditionFilter.ID, "", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingAEMModel;", "getMaxDate", "(Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingAEMModel;)Ljava/lang/String;", "maxSdk", "", "getMaxSdk", "(Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingAEMModel;)Ljava/lang/Integer;", "maxVersion", "Lcom/bbva/glomoutils/semanticversion/GlomoSemanticVersion;", "getMaxVersion", "(Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingAEMModel;)Lcom/bbva/glomoutils/semanticversion/GlomoSemanticVersion;", LandingMinDateConditionFilter.ID, "getMinDate", "minSdk", "getMinSdk", "minVersion", "getMinVersion", "productsCode", "", "getProductsCode", "(Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingAEMModel;)Ljava/util/List;", "userIds", "getUserIds", "Landing_mexicoRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLandingAEMItemModelExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingAEMItemModelExtensions.kt\ncom/bbva/glomohybrid/landing/domain/aem/extensions/LandingAEMItemModelExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,83:1\n1#2:84\n1549#3:85\n1620#3,3:86\n*S KotlinDebug\n*F\n+ 1 LandingAEMItemModelExtensions.kt\ncom/bbva/glomohybrid/landing/domain/aem/extensions/LandingAEMItemModelExtensionsKt\n*L\n82#1:85\n82#1:86,3\n*E\n"})
public final class LandingAEMItemModelExtensionsKt {
    @Nullable
    public static final String getMaxDate(@NotNull LandingAEMModel landingAEMModel) {
        Object next;
        List listSplit$default;
        String str;
        Intrinsics.checkNotNullParameter(landingAEMModel, "<this>");
        List<String> conditions = landingAEMModel.getConditions();
        if (conditions == null) {
            return null;
        }
        Iterator<T> it = conditions.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!StringsKt__StringsKt.contains$default((CharSequence) next, (CharSequence) LandingMaxDateConditionFilter.ID, false, 2, (Object) null));
        String str2 = (String) next;
        if (str2 == null || (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{LandingAEMModel.INSTANCE.getCONDITIONS_PARAMS_DELIMITER()}, false, 0, 6, (Object) null)) == null || (str = (String) CollectionsKt___CollectionsKt.getOrNull(listSplit$default, 1)) == null) {
            return null;
        }
        return StringDateExtensionsKt.validateFormat$default(str, null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    @Nullable
    public static final Integer getMaxSdk(@NotNull LandingAEMModel landingAEMModel) {
        String str;
        Object objM5535constructorimpl;
        Object next;
        List listSplit$default;
        Intrinsics.checkNotNullParameter(landingAEMModel, "<this>");
        List<String> conditions = landingAEMModel.getConditions();
        if (conditions != null) {
            Iterator<T> it = conditions.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!StringsKt__StringsKt.contains$default((CharSequence) next, (CharSequence) LandingMaxAndroidSdkConditionFilter.ID, false, 2, (Object) null));
            String str2 = (String) next;
            if (str2 == null || (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{LandingAEMModel.INSTANCE.getCONDITIONS_PARAMS_DELIMITER()}, false, 0, 6, (Object) null)) == null) {
                str = null;
            } else {
                str = (String) CollectionsKt___CollectionsKt.getOrNull(listSplit$default, 1);
            }
        } else {
            str = null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(str != null ? Integer.valueOf(Integer.parseInt(str)) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        return (Integer) (Result.m5540isFailureimpl(objM5535constructorimpl) ? null : objM5535constructorimpl);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    @Nullable
    public static final GlomoSemanticVersion getMaxVersion(@NotNull LandingAEMModel landingAEMModel) {
        String str;
        Object next;
        List listSplit$default;
        Intrinsics.checkNotNullParameter(landingAEMModel, "<this>");
        List<String> conditions = landingAEMModel.getConditions();
        if (conditions != null) {
            Iterator<T> it = conditions.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!StringsKt__StringsKt.contains$default((CharSequence) next, (CharSequence) LandingMaxVersionConditionFilter.ID, false, 2, (Object) null));
            String str2 = (String) next;
            if (str2 == null || (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{LandingAEMModel.INSTANCE.getCONDITIONS_PARAMS_DELIMITER()}, false, 0, 6, (Object) null)) == null) {
                str = null;
            } else {
                str = (String) CollectionsKt___CollectionsKt.getOrNull(listSplit$default, 1);
            }
        } else {
            str = null;
        }
        if (str != null) {
            return new GlomoSemanticVersion(str);
        }
        return null;
    }

    @Nullable
    public static final String getMinDate(@NotNull LandingAEMModel landingAEMModel) {
        Object next;
        List listSplit$default;
        String str;
        Intrinsics.checkNotNullParameter(landingAEMModel, "<this>");
        List<String> conditions = landingAEMModel.getConditions();
        if (conditions == null) {
            return null;
        }
        Iterator<T> it = conditions.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!StringsKt__StringsKt.contains$default((CharSequence) next, (CharSequence) LandingMinDateConditionFilter.ID, false, 2, (Object) null));
        String str2 = (String) next;
        if (str2 == null || (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{LandingAEMModel.INSTANCE.getCONDITIONS_PARAMS_DELIMITER()}, false, 0, 6, (Object) null)) == null || (str = (String) CollectionsKt___CollectionsKt.getOrNull(listSplit$default, 1)) == null) {
            return null;
        }
        return StringDateExtensionsKt.validateFormat$default(str, null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    @Nullable
    public static final Integer getMinSdk(@NotNull LandingAEMModel landingAEMModel) {
        String str;
        Object objM5535constructorimpl;
        Object next;
        List listSplit$default;
        Intrinsics.checkNotNullParameter(landingAEMModel, "<this>");
        List<String> conditions = landingAEMModel.getConditions();
        if (conditions != null) {
            Iterator<T> it = conditions.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!StringsKt__StringsKt.contains$default((CharSequence) next, (CharSequence) LandingMinAndroidSdkConditionFilter.ID, false, 2, (Object) null));
            String str2 = (String) next;
            if (str2 == null || (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{LandingAEMModel.INSTANCE.getCONDITIONS_PARAMS_DELIMITER()}, false, 0, 6, (Object) null)) == null) {
                str = null;
            } else {
                str = (String) CollectionsKt___CollectionsKt.getOrNull(listSplit$default, 1);
            }
        } else {
            str = null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(str != null ? Integer.valueOf(Integer.parseInt(str)) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        return (Integer) (Result.m5540isFailureimpl(objM5535constructorimpl) ? null : objM5535constructorimpl);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    @Nullable
    public static final GlomoSemanticVersion getMinVersion(@NotNull LandingAEMModel landingAEMModel) {
        String str;
        Object next;
        List listSplit$default;
        Intrinsics.checkNotNullParameter(landingAEMModel, "<this>");
        List<String> conditions = landingAEMModel.getConditions();
        if (conditions != null) {
            Iterator<T> it = conditions.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!StringsKt__StringsKt.contains$default((CharSequence) next, (CharSequence) LandingMinVersionConditionFilter.ID, false, 2, (Object) null));
            String str2 = (String) next;
            if (str2 == null || (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{LandingAEMModel.INSTANCE.getCONDITIONS_PARAMS_DELIMITER()}, false, 0, 6, (Object) null)) == null) {
                str = null;
            } else {
                str = (String) CollectionsKt___CollectionsKt.getOrNull(listSplit$default, 1);
            }
        } else {
            str = null;
        }
        if (str != null) {
            return new GlomoSemanticVersion(str);
        }
        return null;
    }

    @Nullable
    public static final List<String> getProductsCode(@NotNull LandingAEMModel landingAEMModel) {
        Object next;
        String str;
        List listSplit$default;
        String str2;
        Intrinsics.checkNotNullParameter(landingAEMModel, "<this>");
        List<String> conditions = landingAEMModel.getConditions();
        ArrayList arrayList = null;
        if (conditions != null) {
            Iterator<T> it = conditions.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                str2 = (String) next;
                if (StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) LandingHasProductConditionFilter.ID, false, 2, (Object) null)) {
                    break;
                }
            } while (!StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) LandingHasNotProductConditionFilter.ID, false, 2, (Object) null));
            String str3 = (String) next;
            if (str3 != null) {
                LandingAEMModel.Companion companion = LandingAEMModel.INSTANCE;
                List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) str3, new String[]{companion.getCONDITIONS_PARAMS_DELIMITER()}, false, 0, 6, (Object) null);
                if (listSplit$default2 != null && (str = (String) CollectionsKt___CollectionsKt.getOrNull(listSplit$default2, 1)) != null && (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{companion.getMULTIPLE_PARAMS_DELIMITER()}, false, 0, 6, (Object) null)) != null) {
                    List list = listSplit$default;
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        String lowerCase = ((String) it2.next()).toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        arrayList.add(lowerCase);
                    }
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public static final List<String> getUserIds(@NotNull LandingAEMModel landingAEMModel) {
        Object next;
        String str;
        Intrinsics.checkNotNullParameter(landingAEMModel, "<this>");
        List<String> conditions = landingAEMModel.getConditions();
        if (conditions == null) {
            return null;
        }
        Iterator<T> it = conditions.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!StringsKt__StringsKt.contains$default((CharSequence) next, (CharSequence) LandingUserConditionFilter.ID, false, 2, (Object) null));
        String str2 = (String) next;
        if (str2 == null) {
            return null;
        }
        LandingAEMModel.Companion companion = LandingAEMModel.INSTANCE;
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{companion.getCONDITIONS_PARAMS_DELIMITER()}, false, 0, 6, (Object) null);
        if (listSplit$default == null || (str = (String) CollectionsKt___CollectionsKt.getOrNull(listSplit$default, 1)) == null) {
            return null;
        }
        return StringsKt__StringsKt.split$default((CharSequence) str, new String[]{companion.getMULTIPLE_PARAMS_DELIMITER()}, false, 0, 6, (Object) null);
    }
}
