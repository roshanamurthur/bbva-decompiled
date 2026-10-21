package com.bbva.ethermobilesdk.devicemanager.model.output;

import androidx.annotation.Keep;
import androidx.appcompat.app.i;
import androidx.camera.core.impl.a;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceInfoResponse.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\bV\b\u0087\b\u0018\u00002\u00020\u0001BÓ\u0004\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0003\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0003\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u0002010\u0003¢\u0006\u0004\b3\u00104J\u000f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0003J\u000f\u0010[\u001a\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003J\u000f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003J\u000f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003HÆ\u0003J\u000f\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0003J\u000f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010c\u001a\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003J\u000f\u0010d\u001a\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003J\u000f\u0010e\u001a\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003J\u000f\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0003J\u000f\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0003J\u000f\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010l\u001a\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003J\u000f\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010p\u001a\b\u0012\u0004\u0012\u00020 0\u0003HÆ\u0003J\u000f\u0010q\u001a\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003J\u000f\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010z\u001a\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003J\u000f\u0010{\u001a\b\u0012\u0004\u0012\u00020\t0\u0003HÆ\u0003J\u000f\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010}\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u0002010\u0003HÆ\u0003J\u0010\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u0002010\u0003HÆ\u0003Jª\u0005\u0010\u0082\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00032\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00032\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u0002010\u0003HÆ\u0001J\u0015\u0010\u0083\u0001\u001a\u00020\t2\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0007HÖ\u0001J\n\u0010\u0086\u0001\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u00106R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u00106R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u00106R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u00106R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u00106R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u00106R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u00106R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u00106R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u00106R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u00106R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u00106R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u00106R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u00106R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u00106R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u00106R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u00106R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u00106R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u00106R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u00106R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u00106R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u00106R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u00106R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u00106R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u00106R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u00106R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u00106R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u00106R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u00106R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u00106R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u00106R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u00106R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u00106R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u00106R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u00106R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u00106R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u00106R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\bS\u00106R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u00106R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u00106R\u0017\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u00106R\u0017\u00102\u001a\b\u0012\u0004\u0012\u0002010\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u00106¨\u0006\u0087\u0001"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/model/output/DeviceInfoResponse;", "", "applicationVersionCode", "Lcom/bbva/ethermobile/help/kit/result/Result;", "", "applicationVersionName", "batteryLevelPercent", "", "isBluetoothEnabled", "", "isMicrophonePresent", Constants.manufacturer, "model", "nfcStatus", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/NfcState;", "ramUsedPercent", "languageCode", "languageName", "isCaptivePortal", "isProxy", "isWifiSecured", "networkSignalStrength", "networkIpAddressVersion4", "networkIpAddressVersion6", "screenBrightnessLevelPercent", "screenHeight", "screenWidth", "screenIsLocked", "storageTotal", "storageTotalUnit", "currentTimeZone", "systemCurrentTheme", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/SystemThemeStateResponse;", "isGmsAvailable", "systemPlatformName", "systemPlatformVersionName", "systemPlatformVersionCode", "systemPropertiesJavaVmName", "systemPropertiesJavaVmVersion", "systemPropertiesOsVersion", "systemPropertiesRuntimeName", "systemPropertiesRuntimeVersion", "isAutomaticZone", "isAutomaticDateAndTime", "currentDate", "currentDateIso", "currentDateNtp", "currentDateNtpIso", "currentTime", "", "currentTimeNtp", "<init>", "(Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;Lcom/bbva/ethermobile/help/kit/result/Result;)V", "getApplicationVersionCode", "()Lcom/bbva/ethermobile/help/kit/result/Result;", "getApplicationVersionName", "getBatteryLevelPercent", "getManufacturer", "getModel", "getNfcStatus", "getRamUsedPercent", "getLanguageCode", "getLanguageName", "getNetworkSignalStrength", "getNetworkIpAddressVersion4", "getNetworkIpAddressVersion6", "getScreenBrightnessLevelPercent", "getScreenHeight", "getScreenWidth", "getScreenIsLocked", "getStorageTotal", "getStorageTotalUnit", "getCurrentTimeZone", "getSystemCurrentTheme", "getSystemPlatformName", "getSystemPlatformVersionName", "getSystemPlatformVersionCode", "getSystemPropertiesJavaVmName", "getSystemPropertiesJavaVmVersion", "getSystemPropertiesOsVersion", "getSystemPropertiesRuntimeName", "getSystemPropertiesRuntimeVersion", "getCurrentDate", "getCurrentDateIso", "getCurrentDateNtp", "getCurrentDateNtpIso", "getCurrentTime", "getCurrentTimeNtp", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceInfoResponse {

    @NotNull
    private final Result<String> applicationVersionCode;

    @NotNull
    private final Result<String> applicationVersionName;

    @NotNull
    private final Result<Integer> batteryLevelPercent;

    @NotNull
    private final Result<String> currentDate;

    @NotNull
    private final Result<String> currentDateIso;

    @NotNull
    private final Result<String> currentDateNtp;

    @NotNull
    private final Result<String> currentDateNtpIso;

    @NotNull
    private final Result<Long> currentTime;

    @NotNull
    private final Result<Long> currentTimeNtp;

    @NotNull
    private final Result<String> currentTimeZone;

    @NotNull
    private final Result<Boolean> isAutomaticDateAndTime;

    @NotNull
    private final Result<Boolean> isAutomaticZone;

    @NotNull
    private final Result<Boolean> isBluetoothEnabled;

    @NotNull
    private final Result<Boolean> isCaptivePortal;

    @NotNull
    private final Result<Boolean> isGmsAvailable;

    @NotNull
    private final Result<Boolean> isMicrophonePresent;

    @NotNull
    private final Result<Boolean> isProxy;

    @NotNull
    private final Result<Boolean> isWifiSecured;

    @NotNull
    private final Result<String> languageCode;

    @NotNull
    private final Result<String> languageName;

    @NotNull
    private final Result<String> manufacturer;

    @NotNull
    private final Result<String> model;

    @NotNull
    private final Result<String> networkIpAddressVersion4;

    @NotNull
    private final Result<String> networkIpAddressVersion6;

    @NotNull
    private final Result<Integer> networkSignalStrength;

    @NotNull
    private final Result<NfcState> nfcStatus;

    @NotNull
    private final Result<Integer> ramUsedPercent;

    @NotNull
    private final Result<Integer> screenBrightnessLevelPercent;

    @NotNull
    private final Result<String> screenHeight;

    @NotNull
    private final Result<Boolean> screenIsLocked;

    @NotNull
    private final Result<String> screenWidth;

    @NotNull
    private final Result<String> storageTotal;

    @NotNull
    private final Result<String> storageTotalUnit;

    @NotNull
    private final Result<SystemThemeStateResponse> systemCurrentTheme;

    @NotNull
    private final Result<String> systemPlatformName;

    @NotNull
    private final Result<String> systemPlatformVersionCode;

    @NotNull
    private final Result<String> systemPlatformVersionName;

    @NotNull
    private final Result<String> systemPropertiesJavaVmName;

    @NotNull
    private final Result<String> systemPropertiesJavaVmVersion;

    @NotNull
    private final Result<String> systemPropertiesOsVersion;

    @NotNull
    private final Result<String> systemPropertiesRuntimeName;

    @NotNull
    private final Result<String> systemPropertiesRuntimeVersion;

    public DeviceInfoResponse(@NotNull Result<String> applicationVersionCode, @NotNull Result<String> applicationVersionName, @NotNull Result<Integer> batteryLevelPercent, @NotNull Result<Boolean> isBluetoothEnabled, @NotNull Result<Boolean> isMicrophonePresent, @NotNull Result<String> manufacturer, @NotNull Result<String> model, @NotNull Result<NfcState> nfcStatus, @NotNull Result<Integer> ramUsedPercent, @NotNull Result<String> languageCode, @NotNull Result<String> languageName, @NotNull Result<Boolean> isCaptivePortal, @NotNull Result<Boolean> isProxy, @NotNull Result<Boolean> isWifiSecured, @NotNull Result<Integer> networkSignalStrength, @NotNull Result<String> networkIpAddressVersion4, @NotNull Result<String> networkIpAddressVersion6, @NotNull Result<Integer> screenBrightnessLevelPercent, @NotNull Result<String> screenHeight, @NotNull Result<String> screenWidth, @NotNull Result<Boolean> screenIsLocked, @NotNull Result<String> storageTotal, @NotNull Result<String> storageTotalUnit, @NotNull Result<String> currentTimeZone, @NotNull Result<SystemThemeStateResponse> systemCurrentTheme, @NotNull Result<Boolean> isGmsAvailable, @NotNull Result<String> systemPlatformName, @NotNull Result<String> systemPlatformVersionName, @NotNull Result<String> systemPlatformVersionCode, @NotNull Result<String> systemPropertiesJavaVmName, @NotNull Result<String> systemPropertiesJavaVmVersion, @NotNull Result<String> systemPropertiesOsVersion, @NotNull Result<String> systemPropertiesRuntimeName, @NotNull Result<String> systemPropertiesRuntimeVersion, @NotNull Result<Boolean> isAutomaticZone, @NotNull Result<Boolean> isAutomaticDateAndTime, @NotNull Result<String> currentDate, @NotNull Result<String> currentDateIso, @NotNull Result<String> currentDateNtp, @NotNull Result<String> currentDateNtpIso, @NotNull Result<Long> currentTime, @NotNull Result<Long> currentTimeNtp) {
        Intrinsics.checkNotNullParameter(applicationVersionCode, "applicationVersionCode");
        Intrinsics.checkNotNullParameter(applicationVersionName, "applicationVersionName");
        Intrinsics.checkNotNullParameter(batteryLevelPercent, "batteryLevelPercent");
        Intrinsics.checkNotNullParameter(isBluetoothEnabled, "isBluetoothEnabled");
        Intrinsics.checkNotNullParameter(isMicrophonePresent, "isMicrophonePresent");
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(nfcStatus, "nfcStatus");
        Intrinsics.checkNotNullParameter(ramUsedPercent, "ramUsedPercent");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(languageName, "languageName");
        Intrinsics.checkNotNullParameter(isCaptivePortal, "isCaptivePortal");
        Intrinsics.checkNotNullParameter(isProxy, "isProxy");
        Intrinsics.checkNotNullParameter(isWifiSecured, "isWifiSecured");
        Intrinsics.checkNotNullParameter(networkSignalStrength, "networkSignalStrength");
        Intrinsics.checkNotNullParameter(networkIpAddressVersion4, "networkIpAddressVersion4");
        Intrinsics.checkNotNullParameter(networkIpAddressVersion6, "networkIpAddressVersion6");
        Intrinsics.checkNotNullParameter(screenBrightnessLevelPercent, "screenBrightnessLevelPercent");
        Intrinsics.checkNotNullParameter(screenHeight, "screenHeight");
        Intrinsics.checkNotNullParameter(screenWidth, "screenWidth");
        Intrinsics.checkNotNullParameter(screenIsLocked, "screenIsLocked");
        Intrinsics.checkNotNullParameter(storageTotal, "storageTotal");
        Intrinsics.checkNotNullParameter(storageTotalUnit, "storageTotalUnit");
        Intrinsics.checkNotNullParameter(currentTimeZone, "currentTimeZone");
        Intrinsics.checkNotNullParameter(systemCurrentTheme, "systemCurrentTheme");
        Intrinsics.checkNotNullParameter(isGmsAvailable, "isGmsAvailable");
        Intrinsics.checkNotNullParameter(systemPlatformName, "systemPlatformName");
        Intrinsics.checkNotNullParameter(systemPlatformVersionName, "systemPlatformVersionName");
        Intrinsics.checkNotNullParameter(systemPlatformVersionCode, "systemPlatformVersionCode");
        Intrinsics.checkNotNullParameter(systemPropertiesJavaVmName, "systemPropertiesJavaVmName");
        Intrinsics.checkNotNullParameter(systemPropertiesJavaVmVersion, "systemPropertiesJavaVmVersion");
        Intrinsics.checkNotNullParameter(systemPropertiesOsVersion, "systemPropertiesOsVersion");
        Intrinsics.checkNotNullParameter(systemPropertiesRuntimeName, "systemPropertiesRuntimeName");
        Intrinsics.checkNotNullParameter(systemPropertiesRuntimeVersion, "systemPropertiesRuntimeVersion");
        Intrinsics.checkNotNullParameter(isAutomaticZone, "isAutomaticZone");
        Intrinsics.checkNotNullParameter(isAutomaticDateAndTime, "isAutomaticDateAndTime");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(currentDateIso, "currentDateIso");
        Intrinsics.checkNotNullParameter(currentDateNtp, "currentDateNtp");
        Intrinsics.checkNotNullParameter(currentDateNtpIso, "currentDateNtpIso");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        Intrinsics.checkNotNullParameter(currentTimeNtp, "currentTimeNtp");
        this.applicationVersionCode = applicationVersionCode;
        this.applicationVersionName = applicationVersionName;
        this.batteryLevelPercent = batteryLevelPercent;
        this.isBluetoothEnabled = isBluetoothEnabled;
        this.isMicrophonePresent = isMicrophonePresent;
        this.manufacturer = manufacturer;
        this.model = model;
        this.nfcStatus = nfcStatus;
        this.ramUsedPercent = ramUsedPercent;
        this.languageCode = languageCode;
        this.languageName = languageName;
        this.isCaptivePortal = isCaptivePortal;
        this.isProxy = isProxy;
        this.isWifiSecured = isWifiSecured;
        this.networkSignalStrength = networkSignalStrength;
        this.networkIpAddressVersion4 = networkIpAddressVersion4;
        this.networkIpAddressVersion6 = networkIpAddressVersion6;
        this.screenBrightnessLevelPercent = screenBrightnessLevelPercent;
        this.screenHeight = screenHeight;
        this.screenWidth = screenWidth;
        this.screenIsLocked = screenIsLocked;
        this.storageTotal = storageTotal;
        this.storageTotalUnit = storageTotalUnit;
        this.currentTimeZone = currentTimeZone;
        this.systemCurrentTheme = systemCurrentTheme;
        this.isGmsAvailable = isGmsAvailable;
        this.systemPlatformName = systemPlatformName;
        this.systemPlatformVersionName = systemPlatformVersionName;
        this.systemPlatformVersionCode = systemPlatformVersionCode;
        this.systemPropertiesJavaVmName = systemPropertiesJavaVmName;
        this.systemPropertiesJavaVmVersion = systemPropertiesJavaVmVersion;
        this.systemPropertiesOsVersion = systemPropertiesOsVersion;
        this.systemPropertiesRuntimeName = systemPropertiesRuntimeName;
        this.systemPropertiesRuntimeVersion = systemPropertiesRuntimeVersion;
        this.isAutomaticZone = isAutomaticZone;
        this.isAutomaticDateAndTime = isAutomaticDateAndTime;
        this.currentDate = currentDate;
        this.currentDateIso = currentDateIso;
        this.currentDateNtp = currentDateNtp;
        this.currentDateNtpIso = currentDateNtpIso;
        this.currentTime = currentTime;
        this.currentTimeNtp = currentTimeNtp;
    }

    @NotNull
    public final Result<String> component1() {
        return this.applicationVersionCode;
    }

    @NotNull
    public final Result<String> component10() {
        return this.languageCode;
    }

    @NotNull
    public final Result<String> component11() {
        return this.languageName;
    }

    @NotNull
    public final Result<Boolean> component12() {
        return this.isCaptivePortal;
    }

    @NotNull
    public final Result<Boolean> component13() {
        return this.isProxy;
    }

    @NotNull
    public final Result<Boolean> component14() {
        return this.isWifiSecured;
    }

    @NotNull
    public final Result<Integer> component15() {
        return this.networkSignalStrength;
    }

    @NotNull
    public final Result<String> component16() {
        return this.networkIpAddressVersion4;
    }

    @NotNull
    public final Result<String> component17() {
        return this.networkIpAddressVersion6;
    }

    @NotNull
    public final Result<Integer> component18() {
        return this.screenBrightnessLevelPercent;
    }

    @NotNull
    public final Result<String> component19() {
        return this.screenHeight;
    }

    @NotNull
    public final Result<String> component2() {
        return this.applicationVersionName;
    }

    @NotNull
    public final Result<String> component20() {
        return this.screenWidth;
    }

    @NotNull
    public final Result<Boolean> component21() {
        return this.screenIsLocked;
    }

    @NotNull
    public final Result<String> component22() {
        return this.storageTotal;
    }

    @NotNull
    public final Result<String> component23() {
        return this.storageTotalUnit;
    }

    @NotNull
    public final Result<String> component24() {
        return this.currentTimeZone;
    }

    @NotNull
    public final Result<SystemThemeStateResponse> component25() {
        return this.systemCurrentTheme;
    }

    @NotNull
    public final Result<Boolean> component26() {
        return this.isGmsAvailable;
    }

    @NotNull
    public final Result<String> component27() {
        return this.systemPlatformName;
    }

    @NotNull
    public final Result<String> component28() {
        return this.systemPlatformVersionName;
    }

    @NotNull
    public final Result<String> component29() {
        return this.systemPlatformVersionCode;
    }

    @NotNull
    public final Result<Integer> component3() {
        return this.batteryLevelPercent;
    }

    @NotNull
    public final Result<String> component30() {
        return this.systemPropertiesJavaVmName;
    }

    @NotNull
    public final Result<String> component31() {
        return this.systemPropertiesJavaVmVersion;
    }

    @NotNull
    public final Result<String> component32() {
        return this.systemPropertiesOsVersion;
    }

    @NotNull
    public final Result<String> component33() {
        return this.systemPropertiesRuntimeName;
    }

    @NotNull
    public final Result<String> component34() {
        return this.systemPropertiesRuntimeVersion;
    }

    @NotNull
    public final Result<Boolean> component35() {
        return this.isAutomaticZone;
    }

    @NotNull
    public final Result<Boolean> component36() {
        return this.isAutomaticDateAndTime;
    }

    @NotNull
    public final Result<String> component37() {
        return this.currentDate;
    }

    @NotNull
    public final Result<String> component38() {
        return this.currentDateIso;
    }

    @NotNull
    public final Result<String> component39() {
        return this.currentDateNtp;
    }

    @NotNull
    public final Result<Boolean> component4() {
        return this.isBluetoothEnabled;
    }

    @NotNull
    public final Result<String> component40() {
        return this.currentDateNtpIso;
    }

    @NotNull
    public final Result<Long> component41() {
        return this.currentTime;
    }

    @NotNull
    public final Result<Long> component42() {
        return this.currentTimeNtp;
    }

    @NotNull
    public final Result<Boolean> component5() {
        return this.isMicrophonePresent;
    }

    @NotNull
    public final Result<String> component6() {
        return this.manufacturer;
    }

    @NotNull
    public final Result<String> component7() {
        return this.model;
    }

    @NotNull
    public final Result<NfcState> component8() {
        return this.nfcStatus;
    }

    @NotNull
    public final Result<Integer> component9() {
        return this.ramUsedPercent;
    }

    @NotNull
    public final DeviceInfoResponse copy(@NotNull Result<String> applicationVersionCode, @NotNull Result<String> applicationVersionName, @NotNull Result<Integer> batteryLevelPercent, @NotNull Result<Boolean> isBluetoothEnabled, @NotNull Result<Boolean> isMicrophonePresent, @NotNull Result<String> manufacturer, @NotNull Result<String> model, @NotNull Result<NfcState> nfcStatus, @NotNull Result<Integer> ramUsedPercent, @NotNull Result<String> languageCode, @NotNull Result<String> languageName, @NotNull Result<Boolean> isCaptivePortal, @NotNull Result<Boolean> isProxy, @NotNull Result<Boolean> isWifiSecured, @NotNull Result<Integer> networkSignalStrength, @NotNull Result<String> networkIpAddressVersion4, @NotNull Result<String> networkIpAddressVersion6, @NotNull Result<Integer> screenBrightnessLevelPercent, @NotNull Result<String> screenHeight, @NotNull Result<String> screenWidth, @NotNull Result<Boolean> screenIsLocked, @NotNull Result<String> storageTotal, @NotNull Result<String> storageTotalUnit, @NotNull Result<String> currentTimeZone, @NotNull Result<SystemThemeStateResponse> systemCurrentTheme, @NotNull Result<Boolean> isGmsAvailable, @NotNull Result<String> systemPlatformName, @NotNull Result<String> systemPlatformVersionName, @NotNull Result<String> systemPlatformVersionCode, @NotNull Result<String> systemPropertiesJavaVmName, @NotNull Result<String> systemPropertiesJavaVmVersion, @NotNull Result<String> systemPropertiesOsVersion, @NotNull Result<String> systemPropertiesRuntimeName, @NotNull Result<String> systemPropertiesRuntimeVersion, @NotNull Result<Boolean> isAutomaticZone, @NotNull Result<Boolean> isAutomaticDateAndTime, @NotNull Result<String> currentDate, @NotNull Result<String> currentDateIso, @NotNull Result<String> currentDateNtp, @NotNull Result<String> currentDateNtpIso, @NotNull Result<Long> currentTime, @NotNull Result<Long> currentTimeNtp) {
        Intrinsics.checkNotNullParameter(applicationVersionCode, "applicationVersionCode");
        Intrinsics.checkNotNullParameter(applicationVersionName, "applicationVersionName");
        Intrinsics.checkNotNullParameter(batteryLevelPercent, "batteryLevelPercent");
        Intrinsics.checkNotNullParameter(isBluetoothEnabled, "isBluetoothEnabled");
        Intrinsics.checkNotNullParameter(isMicrophonePresent, "isMicrophonePresent");
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(nfcStatus, "nfcStatus");
        Intrinsics.checkNotNullParameter(ramUsedPercent, "ramUsedPercent");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(languageName, "languageName");
        Intrinsics.checkNotNullParameter(isCaptivePortal, "isCaptivePortal");
        Intrinsics.checkNotNullParameter(isProxy, "isProxy");
        Intrinsics.checkNotNullParameter(isWifiSecured, "isWifiSecured");
        Intrinsics.checkNotNullParameter(networkSignalStrength, "networkSignalStrength");
        Intrinsics.checkNotNullParameter(networkIpAddressVersion4, "networkIpAddressVersion4");
        Intrinsics.checkNotNullParameter(networkIpAddressVersion6, "networkIpAddressVersion6");
        Intrinsics.checkNotNullParameter(screenBrightnessLevelPercent, "screenBrightnessLevelPercent");
        Intrinsics.checkNotNullParameter(screenHeight, "screenHeight");
        Intrinsics.checkNotNullParameter(screenWidth, "screenWidth");
        Intrinsics.checkNotNullParameter(screenIsLocked, "screenIsLocked");
        Intrinsics.checkNotNullParameter(storageTotal, "storageTotal");
        Intrinsics.checkNotNullParameter(storageTotalUnit, "storageTotalUnit");
        Intrinsics.checkNotNullParameter(currentTimeZone, "currentTimeZone");
        Intrinsics.checkNotNullParameter(systemCurrentTheme, "systemCurrentTheme");
        Intrinsics.checkNotNullParameter(isGmsAvailable, "isGmsAvailable");
        Intrinsics.checkNotNullParameter(systemPlatformName, "systemPlatformName");
        Intrinsics.checkNotNullParameter(systemPlatformVersionName, "systemPlatformVersionName");
        Intrinsics.checkNotNullParameter(systemPlatformVersionCode, "systemPlatformVersionCode");
        Intrinsics.checkNotNullParameter(systemPropertiesJavaVmName, "systemPropertiesJavaVmName");
        Intrinsics.checkNotNullParameter(systemPropertiesJavaVmVersion, "systemPropertiesJavaVmVersion");
        Intrinsics.checkNotNullParameter(systemPropertiesOsVersion, "systemPropertiesOsVersion");
        Intrinsics.checkNotNullParameter(systemPropertiesRuntimeName, "systemPropertiesRuntimeName");
        Intrinsics.checkNotNullParameter(systemPropertiesRuntimeVersion, "systemPropertiesRuntimeVersion");
        Intrinsics.checkNotNullParameter(isAutomaticZone, "isAutomaticZone");
        Intrinsics.checkNotNullParameter(isAutomaticDateAndTime, "isAutomaticDateAndTime");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(currentDateIso, "currentDateIso");
        Intrinsics.checkNotNullParameter(currentDateNtp, "currentDateNtp");
        Intrinsics.checkNotNullParameter(currentDateNtpIso, "currentDateNtpIso");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        Intrinsics.checkNotNullParameter(currentTimeNtp, "currentTimeNtp");
        return new DeviceInfoResponse(applicationVersionCode, applicationVersionName, batteryLevelPercent, isBluetoothEnabled, isMicrophonePresent, manufacturer, model, nfcStatus, ramUsedPercent, languageCode, languageName, isCaptivePortal, isProxy, isWifiSecured, networkSignalStrength, networkIpAddressVersion4, networkIpAddressVersion6, screenBrightnessLevelPercent, screenHeight, screenWidth, screenIsLocked, storageTotal, storageTotalUnit, currentTimeZone, systemCurrentTheme, isGmsAvailable, systemPlatformName, systemPlatformVersionName, systemPlatformVersionCode, systemPropertiesJavaVmName, systemPropertiesJavaVmVersion, systemPropertiesOsVersion, systemPropertiesRuntimeName, systemPropertiesRuntimeVersion, isAutomaticZone, isAutomaticDateAndTime, currentDate, currentDateIso, currentDateNtp, currentDateNtpIso, currentTime, currentTimeNtp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceInfoResponse)) {
            return false;
        }
        DeviceInfoResponse deviceInfoResponse = (DeviceInfoResponse) other;
        return Intrinsics.areEqual(this.applicationVersionCode, deviceInfoResponse.applicationVersionCode) && Intrinsics.areEqual(this.applicationVersionName, deviceInfoResponse.applicationVersionName) && Intrinsics.areEqual(this.batteryLevelPercent, deviceInfoResponse.batteryLevelPercent) && Intrinsics.areEqual(this.isBluetoothEnabled, deviceInfoResponse.isBluetoothEnabled) && Intrinsics.areEqual(this.isMicrophonePresent, deviceInfoResponse.isMicrophonePresent) && Intrinsics.areEqual(this.manufacturer, deviceInfoResponse.manufacturer) && Intrinsics.areEqual(this.model, deviceInfoResponse.model) && Intrinsics.areEqual(this.nfcStatus, deviceInfoResponse.nfcStatus) && Intrinsics.areEqual(this.ramUsedPercent, deviceInfoResponse.ramUsedPercent) && Intrinsics.areEqual(this.languageCode, deviceInfoResponse.languageCode) && Intrinsics.areEqual(this.languageName, deviceInfoResponse.languageName) && Intrinsics.areEqual(this.isCaptivePortal, deviceInfoResponse.isCaptivePortal) && Intrinsics.areEqual(this.isProxy, deviceInfoResponse.isProxy) && Intrinsics.areEqual(this.isWifiSecured, deviceInfoResponse.isWifiSecured) && Intrinsics.areEqual(this.networkSignalStrength, deviceInfoResponse.networkSignalStrength) && Intrinsics.areEqual(this.networkIpAddressVersion4, deviceInfoResponse.networkIpAddressVersion4) && Intrinsics.areEqual(this.networkIpAddressVersion6, deviceInfoResponse.networkIpAddressVersion6) && Intrinsics.areEqual(this.screenBrightnessLevelPercent, deviceInfoResponse.screenBrightnessLevelPercent) && Intrinsics.areEqual(this.screenHeight, deviceInfoResponse.screenHeight) && Intrinsics.areEqual(this.screenWidth, deviceInfoResponse.screenWidth) && Intrinsics.areEqual(this.screenIsLocked, deviceInfoResponse.screenIsLocked) && Intrinsics.areEqual(this.storageTotal, deviceInfoResponse.storageTotal) && Intrinsics.areEqual(this.storageTotalUnit, deviceInfoResponse.storageTotalUnit) && Intrinsics.areEqual(this.currentTimeZone, deviceInfoResponse.currentTimeZone) && Intrinsics.areEqual(this.systemCurrentTheme, deviceInfoResponse.systemCurrentTheme) && Intrinsics.areEqual(this.isGmsAvailable, deviceInfoResponse.isGmsAvailable) && Intrinsics.areEqual(this.systemPlatformName, deviceInfoResponse.systemPlatformName) && Intrinsics.areEqual(this.systemPlatformVersionName, deviceInfoResponse.systemPlatformVersionName) && Intrinsics.areEqual(this.systemPlatformVersionCode, deviceInfoResponse.systemPlatformVersionCode) && Intrinsics.areEqual(this.systemPropertiesJavaVmName, deviceInfoResponse.systemPropertiesJavaVmName) && Intrinsics.areEqual(this.systemPropertiesJavaVmVersion, deviceInfoResponse.systemPropertiesJavaVmVersion) && Intrinsics.areEqual(this.systemPropertiesOsVersion, deviceInfoResponse.systemPropertiesOsVersion) && Intrinsics.areEqual(this.systemPropertiesRuntimeName, deviceInfoResponse.systemPropertiesRuntimeName) && Intrinsics.areEqual(this.systemPropertiesRuntimeVersion, deviceInfoResponse.systemPropertiesRuntimeVersion) && Intrinsics.areEqual(this.isAutomaticZone, deviceInfoResponse.isAutomaticZone) && Intrinsics.areEqual(this.isAutomaticDateAndTime, deviceInfoResponse.isAutomaticDateAndTime) && Intrinsics.areEqual(this.currentDate, deviceInfoResponse.currentDate) && Intrinsics.areEqual(this.currentDateIso, deviceInfoResponse.currentDateIso) && Intrinsics.areEqual(this.currentDateNtp, deviceInfoResponse.currentDateNtp) && Intrinsics.areEqual(this.currentDateNtpIso, deviceInfoResponse.currentDateNtpIso) && Intrinsics.areEqual(this.currentTime, deviceInfoResponse.currentTime) && Intrinsics.areEqual(this.currentTimeNtp, deviceInfoResponse.currentTimeNtp);
    }

    @NotNull
    public final Result<String> getApplicationVersionCode() {
        return this.applicationVersionCode;
    }

    @NotNull
    public final Result<String> getApplicationVersionName() {
        return this.applicationVersionName;
    }

    @NotNull
    public final Result<Integer> getBatteryLevelPercent() {
        return this.batteryLevelPercent;
    }

    @NotNull
    public final Result<String> getCurrentDate() {
        return this.currentDate;
    }

    @NotNull
    public final Result<String> getCurrentDateIso() {
        return this.currentDateIso;
    }

    @NotNull
    public final Result<String> getCurrentDateNtp() {
        return this.currentDateNtp;
    }

    @NotNull
    public final Result<String> getCurrentDateNtpIso() {
        return this.currentDateNtpIso;
    }

    @NotNull
    public final Result<Long> getCurrentTime() {
        return this.currentTime;
    }

    @NotNull
    public final Result<Long> getCurrentTimeNtp() {
        return this.currentTimeNtp;
    }

    @NotNull
    public final Result<String> getCurrentTimeZone() {
        return this.currentTimeZone;
    }

    @NotNull
    public final Result<String> getLanguageCode() {
        return this.languageCode;
    }

    @NotNull
    public final Result<String> getLanguageName() {
        return this.languageName;
    }

    @NotNull
    public final Result<String> getManufacturer() {
        return this.manufacturer;
    }

    @NotNull
    public final Result<String> getModel() {
        return this.model;
    }

    @NotNull
    public final Result<String> getNetworkIpAddressVersion4() {
        return this.networkIpAddressVersion4;
    }

    @NotNull
    public final Result<String> getNetworkIpAddressVersion6() {
        return this.networkIpAddressVersion6;
    }

    @NotNull
    public final Result<Integer> getNetworkSignalStrength() {
        return this.networkSignalStrength;
    }

    @NotNull
    public final Result<NfcState> getNfcStatus() {
        return this.nfcStatus;
    }

    @NotNull
    public final Result<Integer> getRamUsedPercent() {
        return this.ramUsedPercent;
    }

    @NotNull
    public final Result<Integer> getScreenBrightnessLevelPercent() {
        return this.screenBrightnessLevelPercent;
    }

    @NotNull
    public final Result<String> getScreenHeight() {
        return this.screenHeight;
    }

    @NotNull
    public final Result<Boolean> getScreenIsLocked() {
        return this.screenIsLocked;
    }

    @NotNull
    public final Result<String> getScreenWidth() {
        return this.screenWidth;
    }

    @NotNull
    public final Result<String> getStorageTotal() {
        return this.storageTotal;
    }

    @NotNull
    public final Result<String> getStorageTotalUnit() {
        return this.storageTotalUnit;
    }

    @NotNull
    public final Result<SystemThemeStateResponse> getSystemCurrentTheme() {
        return this.systemCurrentTheme;
    }

    @NotNull
    public final Result<String> getSystemPlatformName() {
        return this.systemPlatformName;
    }

    @NotNull
    public final Result<String> getSystemPlatformVersionCode() {
        return this.systemPlatformVersionCode;
    }

    @NotNull
    public final Result<String> getSystemPlatformVersionName() {
        return this.systemPlatformVersionName;
    }

    @NotNull
    public final Result<String> getSystemPropertiesJavaVmName() {
        return this.systemPropertiesJavaVmName;
    }

    @NotNull
    public final Result<String> getSystemPropertiesJavaVmVersion() {
        return this.systemPropertiesJavaVmVersion;
    }

    @NotNull
    public final Result<String> getSystemPropertiesOsVersion() {
        return this.systemPropertiesOsVersion;
    }

    @NotNull
    public final Result<String> getSystemPropertiesRuntimeName() {
        return this.systemPropertiesRuntimeName;
    }

    @NotNull
    public final Result<String> getSystemPropertiesRuntimeVersion() {
        return this.systemPropertiesRuntimeVersion;
    }

    public int hashCode() {
        return this.currentTimeNtp.hashCode() + a.b(this.currentTime, a.b(this.currentDateNtpIso, a.b(this.currentDateNtp, a.b(this.currentDateIso, a.b(this.currentDate, a.b(this.isAutomaticDateAndTime, a.b(this.isAutomaticZone, a.b(this.systemPropertiesRuntimeVersion, a.b(this.systemPropertiesRuntimeName, a.b(this.systemPropertiesOsVersion, a.b(this.systemPropertiesJavaVmVersion, a.b(this.systemPropertiesJavaVmName, a.b(this.systemPlatformVersionCode, a.b(this.systemPlatformVersionName, a.b(this.systemPlatformName, a.b(this.isGmsAvailable, a.b(this.systemCurrentTheme, a.b(this.currentTimeZone, a.b(this.storageTotalUnit, a.b(this.storageTotal, a.b(this.screenIsLocked, a.b(this.screenWidth, a.b(this.screenHeight, a.b(this.screenBrightnessLevelPercent, a.b(this.networkIpAddressVersion6, a.b(this.networkIpAddressVersion4, a.b(this.networkSignalStrength, a.b(this.isWifiSecured, a.b(this.isProxy, a.b(this.isCaptivePortal, a.b(this.languageName, a.b(this.languageCode, a.b(this.ramUsedPercent, a.b(this.nfcStatus, a.b(this.model, a.b(this.manufacturer, a.b(this.isMicrophonePresent, a.b(this.isBluetoothEnabled, a.b(this.batteryLevelPercent, a.b(this.applicationVersionName, this.applicationVersionCode.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public final Result<Boolean> isAutomaticDateAndTime() {
        return this.isAutomaticDateAndTime;
    }

    @NotNull
    public final Result<Boolean> isAutomaticZone() {
        return this.isAutomaticZone;
    }

    @NotNull
    public final Result<Boolean> isBluetoothEnabled() {
        return this.isBluetoothEnabled;
    }

    @NotNull
    public final Result<Boolean> isCaptivePortal() {
        return this.isCaptivePortal;
    }

    @NotNull
    public final Result<Boolean> isGmsAvailable() {
        return this.isGmsAvailable;
    }

    @NotNull
    public final Result<Boolean> isMicrophonePresent() {
        return this.isMicrophonePresent;
    }

    @NotNull
    public final Result<Boolean> isProxy() {
        return this.isProxy;
    }

    @NotNull
    public final Result<Boolean> isWifiSecured() {
        return this.isWifiSecured;
    }

    @NotNull
    public String toString() {
        Result<String> result = this.applicationVersionCode;
        Result<String> result2 = this.applicationVersionName;
        Result<Integer> result3 = this.batteryLevelPercent;
        Result<Boolean> result4 = this.isBluetoothEnabled;
        Result<Boolean> result5 = this.isMicrophonePresent;
        Result<String> result6 = this.manufacturer;
        Result<String> result7 = this.model;
        Result<NfcState> result8 = this.nfcStatus;
        Result<Integer> result9 = this.ramUsedPercent;
        Result<String> result10 = this.languageCode;
        Result<String> result11 = this.languageName;
        Result<Boolean> result12 = this.isCaptivePortal;
        Result<Boolean> result13 = this.isProxy;
        Result<Boolean> result14 = this.isWifiSecured;
        Result<Integer> result15 = this.networkSignalStrength;
        Result<String> result16 = this.networkIpAddressVersion4;
        Result<String> result17 = this.networkIpAddressVersion6;
        Result<Integer> result18 = this.screenBrightnessLevelPercent;
        Result<String> result19 = this.screenHeight;
        Result<String> result20 = this.screenWidth;
        Result<Boolean> result21 = this.screenIsLocked;
        Result<String> result22 = this.storageTotal;
        Result<String> result23 = this.storageTotalUnit;
        Result<String> result24 = this.currentTimeZone;
        Result<SystemThemeStateResponse> result25 = this.systemCurrentTheme;
        Result<Boolean> result26 = this.isGmsAvailable;
        Result<String> result27 = this.systemPlatformName;
        Result<String> result28 = this.systemPlatformVersionName;
        Result<String> result29 = this.systemPlatformVersionCode;
        Result<String> result30 = this.systemPropertiesJavaVmName;
        Result<String> result31 = this.systemPropertiesJavaVmVersion;
        Result<String> result32 = this.systemPropertiesOsVersion;
        Result<String> result33 = this.systemPropertiesRuntimeName;
        Result<String> result34 = this.systemPropertiesRuntimeVersion;
        Result<Boolean> result35 = this.isAutomaticZone;
        Result<Boolean> result36 = this.isAutomaticDateAndTime;
        Result<String> result37 = this.currentDate;
        Result<String> result38 = this.currentDateIso;
        Result<String> result39 = this.currentDateNtp;
        Result<String> result40 = this.currentDateNtpIso;
        Result<Long> result41 = this.currentTime;
        Result<Long> result42 = this.currentTimeNtp;
        StringBuilder sb2 = new StringBuilder("DeviceInfoResponse(applicationVersionCode=");
        sb2.append(result);
        sb2.append(", applicationVersionName=");
        sb2.append(result2);
        sb2.append(", batteryLevelPercent=");
        i.g(sb2, result3, ", isBluetoothEnabled=", result4, ", isMicrophonePresent=");
        i.g(sb2, result5, ", manufacturer=", result6, ", model=");
        i.g(sb2, result7, ", nfcStatus=", result8, ", ramUsedPercent=");
        i.g(sb2, result9, ", languageCode=", result10, ", languageName=");
        i.g(sb2, result11, ", isCaptivePortal=", result12, ", isProxy=");
        i.g(sb2, result13, ", isWifiSecured=", result14, ", networkSignalStrength=");
        i.g(sb2, result15, ", networkIpAddressVersion4=", result16, ", networkIpAddressVersion6=");
        i.g(sb2, result17, ", screenBrightnessLevelPercent=", result18, ", screenHeight=");
        i.g(sb2, result19, ", screenWidth=", result20, ", screenIsLocked=");
        i.g(sb2, result21, ", storageTotal=", result22, ", storageTotalUnit=");
        i.g(sb2, result23, ", currentTimeZone=", result24, ", systemCurrentTheme=");
        i.g(sb2, result25, ", isGmsAvailable=", result26, ", systemPlatformName=");
        i.g(sb2, result27, ", systemPlatformVersionName=", result28, ", systemPlatformVersionCode=");
        i.g(sb2, result29, ", systemPropertiesJavaVmName=", result30, ", systemPropertiesJavaVmVersion=");
        i.g(sb2, result31, ", systemPropertiesOsVersion=", result32, ", systemPropertiesRuntimeName=");
        i.g(sb2, result33, ", systemPropertiesRuntimeVersion=", result34, ", isAutomaticZone=");
        i.g(sb2, result35, ", isAutomaticDateAndTime=", result36, ", currentDate=");
        i.g(sb2, result37, ", currentDateIso=", result38, ", currentDateNtp=");
        i.g(sb2, result39, ", currentDateNtpIso=", result40, ", currentTime=");
        sb2.append(result41);
        sb2.append(", currentTimeNtp=");
        sb2.append(result42);
        sb2.append(")");
        return sb2.toString();
    }
}
