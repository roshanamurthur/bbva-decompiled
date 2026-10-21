package com.bbva.semaas.client;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.semaas.Cipher;
import com.bbva.semaas.FileCache;
import com.bbva.semaas.ReactiveRepository;
import com.bbva.semaas.ServiceConfig;
import com.bbva.semaas.datasource.DataSource;
import com.bbva.semaas.extension.StringKt;
import ik.e;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Client.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0002\u0010\rJ\u0006\u0010\u0012\u001a\u00020\u0013R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/semaas/client/Client;", ExifInterface.GPS_DIRECTION_TRUE, "", "context", "Landroid/content/Context;", "config", "Lcom/bbva/semaas/ServiceConfig;", "dataSource", "Lcom/bbva/semaas/datasource/DataSource;", "cipher", "Lcom/bbva/semaas/Cipher;", "serializer", "Lkotlinx/serialization/KSerializer;", "(Landroid/content/Context;Lcom/bbva/semaas/ServiceConfig;Lcom/bbva/semaas/datasource/DataSource;Lcom/bbva/semaas/Cipher;Lkotlinx/serialization/KSerializer;)V", "repository", "Lcom/bbva/semaas/ReactiveRepository;", "getRepository", "()Lcom/bbva/semaas/ReactiveRepository;", "loadPreviouslySavedWork", "", "semaas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Client<T> {

    @NotNull
    private final ReactiveRepository<T> repository;

    public Client(@NotNull Context context, @NotNull ServiceConfig config, @NotNull DataSource<T> dataSource, @NotNull Cipher cipher, @NotNull KSerializer<T> serializer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        File filesDir = context.getFilesDir();
        Intrinsics.checkNotNullExpressionValue(filesDir, "context.filesDir");
        this.repository = new ReactiveRepository<>(new FileCache(e.resolve(filesDir, StringKt.sha256(config.getHost())), cipher, serializer), config.getTimeSpan(), config.getChunkSize(), dataSource);
    }

    @NotNull
    public final ReactiveRepository<T> getRepository() {
        return this.repository;
    }

    public final void loadPreviouslySavedWork() {
        ThreadsKt.thread$default(false, false, null, null, 0, new Function0<Unit>(this) { // from class: com.bbva.semaas.client.Client.loadPreviouslySavedWork.1
            final /* synthetic */ Client<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.getRepository().loadFromCache();
            }
        }, 31, null);
    }
}
