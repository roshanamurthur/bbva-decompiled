package com.bbva.ethermobilesdk.passchecker.validation;

import bk.g;
import com.bbva.ethermobilesdk.passchecker.extension.StringKt;
import com.bbva.ethermobilesdk.passchecker.model.api.output.PassCheckerError;
import com.bbva.ethermobilesdk.passchecker.model.internal.ValidationConfig;
import com.bbva.ethermobilesdk.passchecker.model.internal.ValidationEvaluation;
import com.bbva.ethermobilesdk.passchecker.util.UtilKt;
import java.util.ArrayList;
import java.util.List;
import k7.a;
import k7.b;
import k7.c;
import k7.d;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AllowValidation.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/ethermobilesdk/passchecker/validation/AllowValidation;", "Lcom/bbva/ethermobilesdk/passchecker/validation/Validation;", "Lcom/bbva/ethermobilesdk/passchecker/model/internal/ValidationConfig;", "validationConfig", "Lcom/bbva/ethermobilesdk/passchecker/model/internal/ValidationEvaluation;", "validationEvaluation", "", "Lcom/bbva/ethermobilesdk/passchecker/model/api/output/PassCheckerError;", "validate", "<init>", "()V", "passchecker_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAllowValidation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AllowValidation.kt\ncom/bbva/ethermobilesdk/passchecker/validation/AllowValidation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
public final class AllowValidation extends Validation {
    @Override // com.bbva.ethermobilesdk.passchecker.validation.Validation
    @NotNull
    public List<PassCheckerError> validate(@NotNull ValidationConfig validationConfig, @NotNull ValidationEvaluation validationEvaluation) {
        Intrinsics.checkNotNullParameter(validationConfig, "validationConfig");
        Intrinsics.checkNotNullParameter(validationEvaluation, "validationEvaluation");
        ArrayList arrayList = new ArrayList();
        List<PassCheckerError> listEvaluate = !validationConfig.getPolicy().getAllow().getLetters() ? UtilKt.evaluate(PassCheckerError.AllowLetters.INSTANCE, new a(StringKt.validateLetters(validationConfig.getPassword()), validationConfig)) : null;
        if (listEvaluate != null) {
            g.addAll(arrayList, CollectionsKt___CollectionsKt.asSequence(listEvaluate));
        }
        List<PassCheckerError> listEvaluate2 = !validationConfig.getPolicy().getAllow().getNumbers() ? UtilKt.evaluate(PassCheckerError.AllowNumbers.INSTANCE, new b(StringKt.validateNumbers(validationConfig.getPassword()), validationConfig)) : null;
        if (listEvaluate2 != null) {
            g.addAll(arrayList, CollectionsKt___CollectionsKt.asSequence(listEvaluate2));
        }
        List<PassCheckerError> listEvaluate3 = validationConfig.getPolicy().getAllow().getSpecial() ? null : UtilKt.evaluate(PassCheckerError.AllowSpecial.INSTANCE, new c(StringKt.validateSpecials(validationConfig.getPassword()), validationConfig));
        if (listEvaluate3 != null) {
            g.addAll(arrayList, CollectionsKt___CollectionsKt.asSequence(listEvaluate3));
        }
        List<PassCheckerError> listEvaluate4 = UtilKt.evaluate(PassCheckerError.AllowOnlyValid.INSTANCE, new d(StringKt.validateSpecialsMatches(validationConfig.getPassword(), validationConfig.getPolicy().getAllow().getExtraValidChars() + "A-Za-z0-9")));
        if (listEvaluate4 != null) {
            g.addAll(arrayList, CollectionsKt___CollectionsKt.asSequence(listEvaluate4));
        }
        return arrayList;
    }
}
