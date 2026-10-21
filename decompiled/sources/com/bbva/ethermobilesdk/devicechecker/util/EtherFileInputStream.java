package com.bbva.ethermobilesdk.devicechecker.util;

import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EtherFileInputStream.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¨\u0006\r"}, d2 = {"Lcom/bbva/ethermobilesdk/devicechecker/util/EtherFileInputStream;", "", "", "data", "", "readAndClose", "", "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "Lcom/bbva/ethermobilesdk/devicechecker/util/EtherFile;", "file", "<init>", "(Lcom/bbva/ethermobilesdk/devicechecker/util/EtherFile;)V", "devicechecker_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEtherFileInputStream.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EtherFileInputStream.kt\ncom/bbva/ethermobilesdk/devicechecker/util/EtherFileInputStream\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,18:1\n1#2:19\n1#2:21\n52#3:20\n1247#4,2:22\n*S KotlinDebug\n*F\n+ 1 EtherFileInputStream.kt\ncom/bbva/ethermobilesdk/devicechecker/util/EtherFileInputStream\n*L\n14#1:21\n14#1:20\n15#1:22,2\n*E\n"})
public final class EtherFileInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final EtherFile f29508a;

    public EtherFileInputStream(@NotNull EtherFile file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.f29508a = file;
    }

    public final boolean contains(@NotNull String data) {
        boolean z10;
        Intrinsics.checkNotNullParameter(data, "data");
        Reader inputStreamReader = new InputStreamReader(new FileInputStream(this.f29508a.getFile()), Charsets.UTF_8);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            Iterator<String> it = TextStreamsKt.lineSequence(bufferedReader).iterator();
            while (it.hasNext()) {
                z10 = true;
                if (StringsKt__StringsKt.contains((CharSequence) it.next(), (CharSequence) data, true)) {
                    CloseableKt.closeFinally(bufferedReader, null);
                    return z10;
                }
            }
            z10 = false;
            CloseableKt.closeFinally(bufferedReader, null);
            return z10;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(bufferedReader, th2);
                throw th3;
            }
        }
    }

    public final int readAndClose(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        FileInputStream fileInputStream = new FileInputStream(this.f29508a.getFile());
        try {
            int i10 = fileInputStream.read(data);
            CloseableKt.closeFinally(fileInputStream, null);
            return i10;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(fileInputStream, th2);
                throw th3;
            }
        }
    }
}
