package com.bbva.component.ui.login.handler.validations;

import com.bbva.cellswidgets.model.ValidationRule;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DefaultEditTextValidator.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/component/ui/login/handler/validations/DefaultEditTextValidator;", "Lcom/bbva/component/ui/login/handler/validations/Validator;", "", "dataToValidate", "", "Lcom/bbva/cellswidgets/model/ValidationRule;", "validations", "", "execute", "<init>", "()V", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDefaultEditTextValidator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultEditTextValidator.kt\ncom/bbva/component/ui/login/handler/validations/DefaultEditTextValidator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,19:1\n1#2:20\n1726#3,3:21\n*S KotlinDebug\n*F\n+ 1 DefaultEditTextValidator.kt\ncom/bbva/component/ui/login/handler/validations/DefaultEditTextValidator\n*L\n14#1:21,3\n*E\n"})
public final class DefaultEditTextValidator implements Validator {
    /* JADX WARN: Code duplicated, block: B:19:0x0042 A[EDGE_INSN: B:19:0x0042->B:20:0x0043 BREAK  A[LOOP:0: B:14:0x002e->B:28:?]] */
    @Override // com.bbva.component.ui.login.handler.validations.Validator
    public boolean execute(@NotNull String dataToValidate, @NotNull List<ValidationRule> validations) {
        boolean z10;
        Intrinsics.checkNotNullParameter(dataToValidate, "dataToValidate");
        Intrinsics.checkNotNullParameter(validations, "validations");
        if (!(!validations.isEmpty())) {
            validations = null;
        }
        if (validations == null) {
            z10 = true;
            break;
        }
        List<ValidationRule> list = validations;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                if (!((ValidationRule) it.next()).isValid(dataToValidate)) {
                    z10 = false;
                    break;
                }
            }
        } else {
            z10 = true;
            break;
        }
        return dataToValidate.length() > 0 && z10;
    }
}
