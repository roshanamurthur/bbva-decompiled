package d8;

import com.bbva.glomohybrid.base.file.receipts.ReceiptsStore;
import com.bbva.io.file.FileIOKt;
import com.bbva.io.file.Source;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ReceiptsStore.kt */
/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.base.file.receipts.ReceiptsStore$getImageFromBase64$2", f = "ReceiptsStore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nReceiptsStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReceiptsStore.kt\ncom/bbva/glomohybrid/base/file/receipts/ReceiptsStore$getImageFromBase64$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ReceiptsStore f68130p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ String f68131q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ String f68132r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ReceiptsStore receiptsStore, String str, String str2, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f68130p0 = receiptsStore;
        this.f68131q0 = str;
        this.f68132r0 = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f68130p0, this.f68131q0, this.f68132r0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ReceiptsStore receiptsStore = this.f68130p0;
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            File file = new File(((File) receiptsStore.f31370p0.getValue()).getAbsolutePath(), ReceiptsStore.access$buildFileName(receiptsStore, this.f68131q0));
            FileIOKt.write(file, new Source.Base64Source(this.f68132r0));
            return file.getAbsolutePath();
        } catch (Exception unused) {
            return null;
        }
    }
}
