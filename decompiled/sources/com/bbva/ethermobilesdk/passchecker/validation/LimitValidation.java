package com.bbva.ethermobilesdk.passchecker.validation;

import bk.g;
import com.bbva.ethermobilesdk.passchecker.model.api.output.PassCheckerError;
import com.bbva.ethermobilesdk.passchecker.model.internal.ValidationConfig;
import com.bbva.ethermobilesdk.passchecker.model.internal.ValidationEvaluation;
import com.bbva.ethermobilesdk.passchecker.util.UtilKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k7.e;
import k7.f;
import k7.h;
import k7.i;
import k7.j;
import k7.k;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LimitValidation.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/validation/LimitValidation;", "Lcom/bbva/ethermobilesdk/passchecker/validation/Validation;", "Lcom/bbva/ethermobilesdk/passchecker/model/internal/ValidationConfig;", "validationConfig", "Lcom/bbva/ethermobilesdk/passchecker/model/internal/ValidationEvaluation;", "validationEvaluation", "", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError;", "validate", "<init>", "()V", "passchecker_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLimitValidation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitValidation.kt\ncom/bbva/ethermobilesdk/passchecker/validation/LimitValidation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,143:1\n1#2:144\n1549#3:145\n1620#3,3:146\n1549#3:149\n1620#3,3:150\n1549#3:153\n1620#3,3:154\n1549#3:157\n1620#3,3:158\n*S KotlinDebug\n*F\n+ 1 LimitValidation.kt\ncom/bbva/ethermobilesdk/passchecker/validation/LimitValidation\n*L\n66#1:145\n66#1:146,3\n85#1:149\n85#1:150,3\n101#1:153\n101#1:154,3\n119#1:157\n119#1:158,3\n*E\n"})
public final class LimitValidation extends Validation {
    @Override // com.bbva.ethermobilesdk.passchecker.validation.Validation
    @NotNull
    public List<PassCheckerError> validate(@NotNull ValidationConfig validationConfig, @NotNull ValidationEvaluation validationEvaluation) {
        List<PassCheckerError> listEvaluate;
        List<PassCheckerError> listEvaluate2;
        List<PassCheckerError> listEvaluate3;
        Intrinsics.checkNotNullParameter(validationConfig, "validationConfig");
        Intrinsics.checkNotNullParameter(validationEvaluation, "validationEvaluation");
        ArrayList arrayList = new ArrayList();
        List<PassCheckerError> listEvaluate4 = null;
        List<PassCheckerError> listEvaluate5 = validationConfig.getPolicy().getLimit().getLength() > 0 ? UtilKt.evaluate(PassCheckerError.LimitLength.INSTANCE, new i(validationConfig)) : null;
        if (listEvaluate5 != null) {
            g.addAll(arrayList, CollectionsKt___CollectionsKt.asSequence(listEvaluate5));
        }
        List<PassCheckerError> listEvaluate6 = validationConfig.getPolicy().getLimit().getIdenticalChar() > 0 ? UtilKt.evaluate(PassCheckerError.LimitIdenticalChar.INSTANCE, new h(validationConfig)) : null;
        if (listEvaluate6 != null) {
            g.addAll(arrayList, CollectionsKt___CollectionsKt.asSequence(listEvaluate6));
        }
        if (validationConfig.getPolicy().getLimit().getConsecutiveNumber() > 0) {
            List<String> listChunked = StringsKt___StringsKt.chunked(validationConfig.getPassword(), 1);
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listChunked, 10));
            Iterator<T> it = listChunked.iterator();
            while (it.hasNext()) {
                char[] charArray = ((String) it.next()).toCharArray();
                Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
                arrayList2.add(Integer.valueOf(ArraysKt___ArraysKt.first(charArray)));
            }
            listEvaluate = UtilKt.evaluate(PassCheckerError.LimitConsecutiveNumber.INSTANCE, new k7.g(UtilKt.getConsecutiveNumbersByRange(arrayList2, 48, 57), validationConfig));
        } else {
            listEvaluate = null;
        }
        if (listEvaluate != null) {
            g.addAll(arrayList, CollectionsKt___CollectionsKt.asSequence(listEvaluate));
        }
        if (validationConfig.getPolicy().getLimit().getReverseConsecutiveNumber() > 0) {
            List<String> listChunked2 = StringsKt___StringsKt.chunked(StringsKt___StringsKt.reversed((CharSequence) validationConfig.getPassword()).toString(), 1);
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listChunked2, 10));
            Iterator<T> it2 = listChunked2.iterator();
            while (it2.hasNext()) {
                char[] charArray2 = ((String) it2.next()).toCharArray();
                Intrinsics.checkNotNullExpressionValue(charArray2, "this as java.lang.String).toCharArray()");
                arrayList3.add(Integer.valueOf(ArraysKt___ArraysKt.first(charArray2)));
            }
            listEvaluate2 = UtilKt.evaluate(PassCheckerError.LimitReverseConsecutiveNumber.INSTANCE, new k(UtilKt.getConsecutiveNumbersByRange(arrayList3, 48, 57), validationConfig));
        } else {
            listEvaluate2 = null;
        }
        if (listEvaluate2 != null) {
            g.addAll(arrayList, CollectionsKt___CollectionsKt.asSequence(listEvaluate2));
        }
        if (validationConfig.getPolicy().getLimit().getConsecutiveChar() > 0) {
            List<String> listChunked3 = StringsKt___StringsKt.chunked(validationConfig.getPassword(), 1);
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listChunked3, 10));
            Iterator<T> it3 = listChunked3.iterator();
            while (it3.hasNext()) {
                char[] charArray3 = ((String) it3.next()).toCharArray();
                Intrinsics.checkNotNullExpressionValue(charArray3, "this as java.lang.String).toCharArray()");
                arrayList4.add(Integer.valueOf(ArraysKt___ArraysKt.first(charArray3)));
            }
            listEvaluate3 = UtilKt.evaluate(PassCheckerError.LimitConsecutiveChar.INSTANCE, new f(UtilKt.getConsecutiveNumbers(arrayList4), validationConfig));
        } else {
            listEvaluate3 = null;
        }
        if (listEvaluate3 != null) {
            g.addAll(arrayList, CollectionsKt___CollectionsKt.asSequence(listEvaluate3));
        }
        if (validationConfig.getPolicy().getLimit().getReverseConsecutiveChar() > 0) {
            List<String> listChunked4 = StringsKt___StringsKt.chunked(StringsKt___StringsKt.reversed((CharSequence) validationConfig.getPassword()).toString(), 1);
            ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listChunked4, 10));
            Iterator<T> it4 = listChunked4.iterator();
            while (it4.hasNext()) {
                char[] charArray4 = ((String) it4.next()).toCharArray();
                Intrinsics.checkNotNullExpressionValue(charArray4, "this as java.lang.String).toCharArray()");
                arrayList5.add(Integer.valueOf(ArraysKt___ArraysKt.first(charArray4)));
            }
            listEvaluate4 = UtilKt.evaluate(PassCheckerError.LimitReverseConsecutiveChar.INSTANCE, new j(UtilKt.getConsecutiveNumbers(arrayList5), validationConfig));
        }
        if (listEvaluate4 != null) {
            g.addAll(arrayList, CollectionsKt___CollectionsKt.asSequence(listEvaluate4));
        }
        List<PassCheckerError> listEvaluate7 = UtilKt.evaluate(PassCheckerError.LimitCompromised.INSTANCE, new e(validationConfig, validationEvaluation));
        if (listEvaluate7 != null) {
            g.addAll(arrayList, CollectionsKt___CollectionsKt.asSequence(listEvaluate7));
        }
        return arrayList;
    }
}
