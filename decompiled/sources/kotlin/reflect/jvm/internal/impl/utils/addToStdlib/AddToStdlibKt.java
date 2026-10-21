package kotlin.reflect.jvm.internal.impl.utils.addToStdlib;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: addToStdlib.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\naddToStdlib.kt\nKotlin\n*S Kotlin\n*F\n+ 1 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,352:1\n20#1,2:353\n289#1,16:359\n327#1,13:375\n3792#2:355\n4307#2,2:356\n1#3:358\n*S KotlinDebug\n*F\n+ 1 addToStdlib.kt\norg/jetbrains/kotlin/utils/addToStdlib/AddToStdlibKt\n*L\n66#1:353,2\n281#1:359,16\n343#1:375,13\n132#1:355\n132#1:356,2\n*E\n"})
public final class AddToStdlibKt {
    static {
        new ConcurrentHashMap();
    }

    @NotNull
    public static final Void shouldNotBeCalled(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new IllegalStateException(message.toString());
    }

    public static /* synthetic */ Void shouldNotBeCalled$default(String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "should not be called";
        }
        return shouldNotBeCalled(str);
    }
}
