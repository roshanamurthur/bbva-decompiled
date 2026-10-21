package com.bbva.cells.pluginkit.filesystem;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WebFile.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.bbva.cells.pluginkit.filesystem.WebFile$Companion$from$6", f = "WebFile.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super WebFile>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ String f26828p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Context f26829q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function1 f26830r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, String str, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f26828p0 = str;
        this.f26829q0 = context;
        this.f26830r0 = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new a(this.f26829q0, this.f26828p0, this.f26830r0, completion);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super WebFile> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            String str = UUID.randomUUID() + '.' + this.f26828p0;
            URL url = new URL("https://appassets.androidplatform.net/public/" + str);
            File file = new File(this.f26829q0.getCacheDir(), "cells_plugin/" + str);
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                this.f26830r0.invoke(fileOutputStream);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream, null);
                return new WebFile(file, url, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable unused) {
            return null;
        }
    }
}
