package com.bbva.ethermobilesdk.passchecker.validation;

import bk.g;
import com.bbva.ethermobilesdk.passchecker.model.api.output.PassCheckerError;
import com.bbva.ethermobilesdk.passchecker.model.internal.ValidationConfig;
import com.bbva.ethermobilesdk.passchecker.model.internal.ValidationEvaluation;
import com.bbva.ethermobilesdk.passchecker.util.UtilKt;
import java.util.ArrayList;
import java.util.List;
import k7.l;
import k7.m;
import k7.n;
import k7.o;
import k7.p;
import k7.q;
import k7.r;
import k7.s;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RequireValidation.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/validation/RequireValidation;", "Lcom/bbva/ethermobilesdk/passchecker/validation/Validation;", "Lcom/bbva/ethermobilesdk/passchecker/model/internal/ValidationConfig;", "validationConfig", "Lcom/bbva/ethermobilesdk/passchecker/model/internal/ValidationEvaluation;", "validationEvaluation", "", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError;", "validate", "<init>", "()V", "passchecker_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRequireValidation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequireValidation.kt\ncom/bbva/ethermobilesdk/passchecker/validation/RequireValidation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1#2:130\n*E\n"})
public final class RequireValidation extends Validation {
    @Override // com.bbva.ethermobilesdk.passchecker.validation.Validation
    @NotNull
    public List<PassCheckerError> validate(@NotNull ValidationConfig validationConfig, @NotNull ValidationEvaluation validationEvaluation) {
        Intrinsics.checkNotNullParameter(validationConfig, "validationConfig");
        Intrinsics.checkNotNullParameter(validationEvaluation, "validationEvaluation");
        ArrayList arrayList = new ArrayList();
        List<PassCheckerError> listEvaluate = UtilKt.evaluate(PassCheckerError.RequireLength.INSTANCE, new m(validationConfig));
        if (listEvaluate != null) {
            g.addAll(arrayList, CollectionsKt___CollectionsKt.asSequence(listEvaluate));
        }
        List<PassCheckerError> listEvaluate2 = validationConfig.getPolicy().getRequire().getUppercaseLetters() > 0 ? UtilKt.evaluate(PassCheckerError.RequireUppercaseLetters.INSTANCE, new s(validationConfig)) : null;
        if (listEvaluate2 != null) {
            g.addAll(arrayList, CollectionsKt___CollectionsKt.asSequence(listEvaluate2));
        }
        List<PassCheckerError> listEvaluate3 = validationConfig.getPolicy().getRequire().getLowercaseLetters() > 0 ? UtilKt.evaluate(PassCheckerError.RequireLowercaseLetters.INSTANCE, new o(validationConfig)) : null;
        if (listEvaluate3 != null) {
            g.addAll(arrayList, CollectionsKt___CollectionsKt.asSequence(listEvaluate3));
        }
        List<PassCheckerError> listEvaluate4 = validationConfig.getPolicy().getRequire().getLetters() > 0 ? UtilKt.evaluate(PassCheckerError.RequireLetters.INSTANCE, new n(validationConfig)) : null;
        if (listEvaluate4 != null) {
            g.addAll(arrayList, CollectionsKt___CollectionsKt.asSequence(listEvaluate4));
        }
        List<PassCheckerError> listEvaluate5 = validationConfig.getPolicy().getRequire().getNumbers() > 0 ? UtilKt.evaluate(PassCheckerError.RequireNumbers.INSTANCE, new p(validationConfig)) : null;
        if (listEvaluate5 != null) {
            g.addAll(arrayList, CollectionsKt___CollectionsKt.asSequence(listEvaluate5));
        }
        List<PassCheckerError> listEvaluate6 = validationConfig.getPolicy().getRequire().getSpecial() > 0 ? UtilKt.evaluate(PassCheckerError.RequireSpecial.INSTANCE, new r(validationConfig)) : null;
        if (listEvaluate6 != null) {
            g.addAll(arrayList, CollectionsKt___CollectionsKt.asSequence(listEvaluate6));
        }
        List<PassCheckerError> listEvaluate7 = validationConfig.getPolicy().getRequire().getQuality() > 0 ? UtilKt.evaluate(PassCheckerError.RequireQuality.INSTANCE, new q(validationConfig, validationEvaluation)) : null;
        if (listEvaluate7 != null) {
            g.addAll(arrayList, CollectionsKt___CollectionsKt.asSequence(listEvaluate7));
        }
        List<PassCheckerError> listEvaluate8 = validationConfig.getPolicy().getRequire().getDistance() > 0 ? UtilKt.evaluate(PassCheckerError.RequireDistance.INSTANCE, new l(validationConfig, validationEvaluation)) : null;
        if (listEvaluate8 != null) {
            g.addAll(arrayList, CollectionsKt___CollectionsKt.asSequence(listEvaluate8));
        }
        return arrayList;
    }
}
