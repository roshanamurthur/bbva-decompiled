package k7;

import com.bbva.ethermobilesdk.passchecker.model.internal.ValidationConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: LimitValidation.kt */
/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nLimitValidation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitValidation.kt\ncom/bbva/ethermobilesdk/passchecker/validation/LimitValidation$limitReverseConsecutiveChar$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,143:1\n2620#2,3:144\n*S KotlinDebug\n*F\n+ 1 LimitValidation.kt\ncom/bbva/ethermobilesdk/passchecker/validation/LimitValidation$limitReverseConsecutiveChar$1$1\n*L\n124#1:144,3\n*E\n"})
public final class j extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ List<List<Integer>> f79229p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ValidationConfig f79230q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(List<? extends List<Integer>> list, ValidationConfig validationConfig) {
        super(0);
        this.f79229p0 = list;
        this.f79230q0 = validationConfig;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        List<List<Integer>> list = this.f79229p0;
        boolean z10 = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((List) it.next()).size() > this.f79230q0.getPolicy().getLimit().getReverseConsecutiveChar()) {
                    z10 = false;
                    break;
                }
            }
        }
        return Boolean.valueOf(z10);
    }
}
