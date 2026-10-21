package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StringBuilderJVM.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/n;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final n f82369a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final String f82370b;

    static {
        String property = System.getProperty("line.separator");
        Intrinsics.checkNotNull(property);
        f82370b = property;
    }
}
