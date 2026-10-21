package com.salesforce.marketingcloud.events.predicates;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\"\u00020\u0001¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0005\u001a\u00020\u0004H\u0014R\u001e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/salesforce/marketingcloud/events/predicates/e;", "Lcom/salesforce/marketingcloud/events/predicates/f;", "", "a", "", "c", "", "e", "[Lcom/salesforce/marketingcloud/events/predicates/f;", "predicates", "<init>", "([Lcom/salesforce/marketingcloud/events/predicates/f;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOrPredicate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrPredicate.kt\ncom/salesforce/marketingcloud/events/predicates/OrPredicate\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,15:1\n13579#2,2:16\n*S KotlinDebug\n*F\n+ 1 OrPredicate.kt\ncom/salesforce/marketingcloud/events/predicates/OrPredicate\n*L\n6#1:16,2\n*E\n"})
public final class e extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private f[] predicates;

    public e(@NotNull f... predicates) {
        Intrinsics.checkNotNullParameter(predicates, "predicates");
        this.predicates = predicates;
    }

    @Override // com.salesforce.marketingcloud.events.predicates.f
    public boolean a() {
        for (f fVar : this.predicates) {
            if (fVar.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.salesforce.marketingcloud.events.predicates.f
    @NotNull
    public String c() {
        return "Or";
    }
}
