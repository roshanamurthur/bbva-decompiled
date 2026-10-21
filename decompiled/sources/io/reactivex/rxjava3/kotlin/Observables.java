package io.reactivex.rxjava3.kotlin;

import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.SchedulerSupport;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function3;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Observables.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JJ\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u00050\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0004H\u0007Jh\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\n0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\n*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\u001a\b\u0004\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\n0\fH\u0087\bø\u0001\u0000Jh\u0010\u0003\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000e0\r0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\u000e*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0004H\u0007J\u0086\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\n0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\u000e*\u00020\u0001\"\b\b\u0003\u0010\n*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00042 \b\u0004\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\n0\u0010H\u0087\bø\u0001\u0000J¤\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\n0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\u000e*\u00020\u0001\"\b\b\u0003\u0010\u0011*\u00020\u0001\"\b\b\u0004\u0010\n*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00042&\b\u0004\u0010\u000b\u001a \u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\n0\u0013H\u0087\bø\u0001\u0000JÂ\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\n0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\u000e*\u00020\u0001\"\b\b\u0003\u0010\u0011*\u00020\u0001\"\b\b\u0004\u0010\u0014*\u00020\u0001\"\b\b\u0005\u0010\n*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00042,\b\u0004\u0010\u000b\u001a&\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\n0\u0016H\u0087\bø\u0001\u0000Jà\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\n0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\u000e*\u00020\u0001\"\b\b\u0003\u0010\u0011*\u00020\u0001\"\b\b\u0004\u0010\u0014*\u00020\u0001\"\b\b\u0005\u0010\u0017*\u00020\u0001\"\b\b\u0006\u0010\n*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u000422\b\u0004\u0010\u000b\u001a,\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\n0\u0019H\u0087\bø\u0001\u0000Jþ\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\n0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\u000e*\u00020\u0001\"\b\b\u0003\u0010\u0011*\u00020\u0001\"\b\b\u0004\u0010\u0014*\u00020\u0001\"\b\b\u0005\u0010\u0017*\u00020\u0001\"\b\b\u0006\u0010\u001a*\u00020\u0001\"\b\b\u0007\u0010\n*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u000428\b\u0004\u0010\u000b\u001a2\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u001a\u0012\u0004\u0012\u0002H\n0\u001cH\u0087\bø\u0001\u0000J\u009c\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\n0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\u000e*\u00020\u0001\"\b\b\u0003\u0010\u0011*\u00020\u0001\"\b\b\u0004\u0010\u0014*\u00020\u0001\"\b\b\u0005\u0010\u0017*\u00020\u0001\"\b\b\u0006\u0010\u001a*\u00020\u0001\"\b\b\u0007\u0010\u001d*\u00020\u0001\"\b\b\b\u0010\n*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u00042>\b\u0004\u0010\u000b\u001a8\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u001a\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\n0\u001fH\u0087\bø\u0001\u0000Jº\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\n0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\u000e*\u00020\u0001\"\b\b\u0003\u0010\u0011*\u00020\u0001\"\b\b\u0004\u0010\u0014*\u00020\u0001\"\b\b\u0005\u0010\u0017*\u00020\u0001\"\b\b\u0006\u0010\u001a*\u00020\u0001\"\b\b\u0007\u0010\u001d*\u00020\u0001\"\b\b\b\u0010 *\u00020\u0001\"\b\b\t\u0010\n*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u00042\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H 0\u00042D\b\u0004\u0010\u000b\u001a>\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u001a\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H \u0012\u0004\u0012\u0002H\n0\"H\u0087\bø\u0001\u0000JJ\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u00050\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0004H\u0007Jh\u0010#\u001a\b\u0012\u0004\u0012\u0002H\n0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\n*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\u001a\b\u0004\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\n0\fH\u0087\bø\u0001\u0000Jh\u0010#\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000e0\r0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\u000e*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0004H\u0007J\u0086\u0001\u0010#\u001a\b\u0012\u0004\u0012\u0002H\n0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\u000e*\u00020\u0001\"\b\b\u0003\u0010\n*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00042 \b\u0004\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\n0\u0010H\u0087\bø\u0001\u0000J¤\u0001\u0010#\u001a\b\u0012\u0004\u0012\u0002H\n0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\u000e*\u00020\u0001\"\b\b\u0003\u0010\u0011*\u00020\u0001\"\b\b\u0004\u0010\n*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00042&\b\u0004\u0010\u000b\u001a \u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\n0\u0013H\u0087\bø\u0001\u0000JÂ\u0001\u0010#\u001a\b\u0012\u0004\u0012\u0002H\n0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\u000e*\u00020\u0001\"\b\b\u0003\u0010\u0011*\u00020\u0001\"\b\b\u0004\u0010\u0014*\u00020\u0001\"\b\b\u0005\u0010\n*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00042,\b\u0004\u0010\u000b\u001a&\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\n0\u0016H\u0087\bø\u0001\u0000Jà\u0001\u0010#\u001a\b\u0012\u0004\u0012\u0002H\n0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\u000e*\u00020\u0001\"\b\b\u0003\u0010\u0011*\u00020\u0001\"\b\b\u0004\u0010\u0014*\u00020\u0001\"\b\b\u0005\u0010\u0017*\u00020\u0001\"\b\b\u0006\u0010\n*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u000422\b\u0004\u0010\u000b\u001a,\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\n0\u0019H\u0087\bø\u0001\u0000Jþ\u0001\u0010#\u001a\b\u0012\u0004\u0012\u0002H\n0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\u000e*\u00020\u0001\"\b\b\u0003\u0010\u0011*\u00020\u0001\"\b\b\u0004\u0010\u0014*\u00020\u0001\"\b\b\u0005\u0010\u0017*\u00020\u0001\"\b\b\u0006\u0010\u001a*\u00020\u0001\"\b\b\u0007\u0010\n*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u000428\b\u0004\u0010\u000b\u001a2\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u001a\u0012\u0004\u0012\u0002H\n0\u001cH\u0087\bø\u0001\u0000J\u009c\u0002\u0010#\u001a\b\u0012\u0004\u0012\u0002H\n0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\u000e*\u00020\u0001\"\b\b\u0003\u0010\u0011*\u00020\u0001\"\b\b\u0004\u0010\u0014*\u00020\u0001\"\b\b\u0005\u0010\u0017*\u00020\u0001\"\b\b\u0006\u0010\u001a*\u00020\u0001\"\b\b\u0007\u0010\u001d*\u00020\u0001\"\b\b\b\u0010\n*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u00042>\b\u0004\u0010\u000b\u001a8\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u001a\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\n0\u001fH\u0087\bø\u0001\u0000Jº\u0002\u0010#\u001a\b\u0012\u0004\u0012\u0002H\n0\u0004\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\b\b\u0001\u0010\u0007*\u00020\u0001\"\b\b\u0002\u0010\u000e*\u00020\u0001\"\b\b\u0003\u0010\u0011*\u00020\u0001\"\b\b\u0004\u0010\u0014*\u00020\u0001\"\b\b\u0005\u0010\u0017*\u00020\u0001\"\b\b\u0006\u0010\u001a*\u00020\u0001\"\b\b\u0007\u0010\u001d*\u00020\u0001\"\b\b\b\u0010 *\u00020\u0001\"\b\b\t\u0010\n*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u00042\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H 0\u00042D\b\u0004\u0010\u000b\u001a>\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u0017\u0012\u0004\u0012\u0002H\u001a\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H \u0012\u0004\u0012\u0002H\n0\"H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006$"}, d2 = {"Lio/reactivex/rxjava3/kotlin/Observables;", "", "()V", "combineLatest", "Lio/reactivex/rxjava3/core/Observable;", "Lkotlin/Pair;", "T1", "T2", "source1", "source2", "R", "combineFunction", "Lkotlin/Function2;", "Lkotlin/Triple;", "T3", "source3", "Lkotlin/Function3;", "T4", "source4", "Lkotlin/Function4;", "T5", "source5", "Lkotlin/Function5;", "T6", "source6", "Lkotlin/Function6;", DigipassManagerConstants.T7, "source7", "Lkotlin/Function7;", "T8", "source8", "Lkotlin/Function8;", "T9", "source9", "Lkotlin/Function9;", "zip", "rxkotlin"}, k = 1, mv = {1, 4, 0})
public final class Observables {
    public static final Observables INSTANCE = new Observables();

    /* JADX INFO: compiled from: Observables.kt */
    public static final class a<T1, T2, R> implements BiFunction<T1, T2, Pair<? extends T1, ? extends T2>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f78166p0 = new a();

        @Override // io.reactivex.rxjava3.functions.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return TuplesKt.to(obj, obj2);
        }
    }

    /* JADX INFO: compiled from: Observables.kt */
    public static final class b<T1, T2, T3, R> implements Function3<T1, T2, T3, Triple<? extends T1, ? extends T2, ? extends T3>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f78167a = new b();

        @Override // io.reactivex.rxjava3.functions.Function3
        public final Object apply(Object obj, Object obj2, Object obj3) {
            return new Triple(obj, obj2, obj3);
        }
    }

    /* JADX INFO: compiled from: Observables.kt */
    public static final class c<T1, T2, R> implements BiFunction<T1, T2, Pair<? extends T1, ? extends T2>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f78168p0 = new c();

        @Override // io.reactivex.rxjava3.functions.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return TuplesKt.to(obj, obj2);
        }
    }

    /* JADX INFO: compiled from: Observables.kt */
    public static final class d<T1, T2, T3, R> implements Function3<T1, T2, T3, Triple<? extends T1, ? extends T2, ? extends T3>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f78177a = new d();

        @Override // io.reactivex.rxjava3.functions.Function3
        public final Object apply(Object obj, Object obj2, Object obj3) {
            return new Triple(obj, obj2, obj3);
        }
    }

    @CheckReturnValue
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "New type inference algorithm in Kotlin 1.4 makes this method obsolete. Method will be removed in future RxKotlin release.", replaceWith = @ReplaceWith(expression = "Observable.combineLatest(source1, source2, combineFunction)", imports = {"io.reactivex.Observable"}))
    @SchedulerSupport("none")
    public final <T1, T2, R> Observable<R> combineLatest(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull final Function2<? super T1, ? super T2, ? extends R> combineFunction) {
        Intrinsics.checkNotNullParameter(source1, "source1");
        Intrinsics.checkNotNullParameter(source2, "source2");
        Intrinsics.checkNotNullParameter(combineFunction, "combineFunction");
        Observable<R> observableCombineLatest = Observable.combineLatest(source1, source2, new BiFunction<T1, T2, R>() { // from class: io.reactivex.rxjava3.kotlin.Observables.combineLatest.1
            @Override // io.reactivex.rxjava3.functions.BiFunction
            public final R apply(T1 t10, T2 t11) {
                Intrinsics.checkNotNullExpressionValue(t10, "t1");
                Intrinsics.checkNotNullExpressionValue(t11, "t2");
                return (R) combineFunction.invoke(t10, t11);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        return observableCombineLatest;
    }

    @CheckReturnValue
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "New type inference algorithm in Kotlin 1.4 makes this method obsolete. Method will be removed in future RxKotlin release.", replaceWith = @ReplaceWith(expression = "Observable.zip(source1, source2, combineFunction)", imports = {"io.reactivex.Observable"}))
    @SchedulerSupport("none")
    public final <T1, T2, R> Observable<R> zip(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull final Function2<? super T1, ? super T2, ? extends R> combineFunction) {
        Intrinsics.checkNotNullParameter(source1, "source1");
        Intrinsics.checkNotNullParameter(source2, "source2");
        Intrinsics.checkNotNullParameter(combineFunction, "combineFunction");
        Observable<R> observableZip = Observable.zip(source1, source2, new BiFunction<T1, T2, R>() { // from class: io.reactivex.rxjava3.kotlin.Observables.zip.1
            @Override // io.reactivex.rxjava3.functions.BiFunction
            public final R apply(T1 t10, T2 t11) {
                Intrinsics.checkNotNullExpressionValue(t10, "t1");
                Intrinsics.checkNotNullExpressionValue(t11, "t2");
                return (R) combineFunction.invoke(t10, t11);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableZip, "Observable.zip(source1, …ombineFunction(t1, t2) })");
        return observableZip;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final <T1, T2> Observable<Pair<T1, T2>> combineLatest(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2) {
        Intrinsics.checkNotNullParameter(source1, "source1");
        Intrinsics.checkNotNullParameter(source2, "source2");
        Observable<Pair<T1, T2>> observableCombineLatest = Observable.combineLatest(source1, source2, a.f78166p0);
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "Observable.combineLatest…> { t1, t2 -> t1 to t2 })");
        return observableCombineLatest;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final <T1, T2> Observable<Pair<T1, T2>> zip(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2) {
        Intrinsics.checkNotNullParameter(source1, "source1");
        Intrinsics.checkNotNullParameter(source2, "source2");
        Observable<Pair<T1, T2>> observableZip = Observable.zip(source1, source2, c.f78168p0);
        Intrinsics.checkNotNullExpressionValue(observableZip, "Observable.zip(source1, …> { t1, t2 -> t1 to t2 })");
        return observableZip;
    }

    @CheckReturnValue
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "New type inference algorithm in Kotlin 1.4 makes this method obsolete. Method will be removed in future RxKotlin release.", replaceWith = @ReplaceWith(expression = "Observable.combineLatest(source1, source2, source3, combineFunction)", imports = {"io.reactivex.Observable"}))
    @SchedulerSupport("none")
    public final <T1, T2, T3, R> Observable<R> combineLatest(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull final kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super T3, ? extends R> combineFunction) {
        Intrinsics.checkNotNullParameter(source1, "source1");
        Intrinsics.checkNotNullParameter(source2, "source2");
        Intrinsics.checkNotNullParameter(source3, "source3");
        Intrinsics.checkNotNullParameter(combineFunction, "combineFunction");
        Observable<R> observableCombineLatest = Observable.combineLatest(source1, source2, source3, new Function3<T1, T2, T3, R>() { // from class: io.reactivex.rxjava3.kotlin.Observables.combineLatest.3
            @Override // io.reactivex.rxjava3.functions.Function3
            public final R apply(@NotNull T1 t10, @NotNull T2 t11, @NotNull T3 t12) {
                Intrinsics.checkNotNullParameter(t10, "t1");
                Intrinsics.checkNotNullParameter(t11, "t2");
                Intrinsics.checkNotNullParameter(t12, "t3");
                return (R) combineFunction.invoke(t10, t11, t12);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "Observable.combineLatest…neFunction(t1, t2, t3) })");
        return observableCombineLatest;
    }

    @CheckReturnValue
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "New type inference algorithm in Kotlin 1.4 makes this method obsolete. Method will be removed in future RxKotlin release.", replaceWith = @ReplaceWith(expression = "Observable.zip(source1, source2, source3, combineFunction)", imports = {"io.reactivex.Observable"}))
    @SchedulerSupport("none")
    public final <T1, T2, T3, R> Observable<R> zip(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull final kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super T3, ? extends R> combineFunction) {
        Intrinsics.checkNotNullParameter(source1, "source1");
        Intrinsics.checkNotNullParameter(source2, "source2");
        Intrinsics.checkNotNullParameter(source3, "source3");
        Intrinsics.checkNotNullParameter(combineFunction, "combineFunction");
        Observable<R> observableZip = Observable.zip(source1, source2, source3, new Function3<T1, T2, T3, R>() { // from class: io.reactivex.rxjava3.kotlin.Observables.zip.3
            @Override // io.reactivex.rxjava3.functions.Function3
            public final R apply(@NotNull T1 t10, @NotNull T2 t11, @NotNull T3 t12) {
                Intrinsics.checkNotNullParameter(t10, "t1");
                Intrinsics.checkNotNullParameter(t11, "t2");
                Intrinsics.checkNotNullParameter(t12, "t3");
                return (R) combineFunction.invoke(t10, t11, t12);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableZip, "Observable.zip(source1, …neFunction(t1, t2, t3) })");
        return observableZip;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final <T1, T2, T3> Observable<Triple<T1, T2, T3>> combineLatest(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3) {
        Intrinsics.checkNotNullParameter(source1, "source1");
        Intrinsics.checkNotNullParameter(source2, "source2");
        Intrinsics.checkNotNullParameter(source3, "source3");
        Observable<Triple<T1, T2, T3>> observableCombineLatest = Observable.combineLatest(source1, source2, source3, b.f78167a);
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "Observable.combineLatest… -> Triple(t1, t2, t3) })");
        return observableCombineLatest;
    }

    @CheckReturnValue
    @SchedulerSupport("none")
    @NotNull
    public final <T1, T2, T3> Observable<Triple<T1, T2, T3>> zip(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3) {
        Intrinsics.checkNotNullParameter(source1, "source1");
        Intrinsics.checkNotNullParameter(source2, "source2");
        Intrinsics.checkNotNullParameter(source3, "source3");
        Observable<Triple<T1, T2, T3>> observableZip = Observable.zip(source1, source2, source3, d.f78177a);
        Intrinsics.checkNotNullExpressionValue(observableZip, "Observable.zip(source1, … -> Triple(t1, t2, t3) })");
        return observableZip;
    }

    @CheckReturnValue
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "New type inference algorithm in Kotlin 1.4 makes this method obsolete. Method will be removed in future RxKotlin release.", replaceWith = @ReplaceWith(expression = "Observable.combineLatest(source1, source2, source3, source4, combineFunction)", imports = {"io.reactivex.Observable"}))
    @SchedulerSupport("none")
    public final <T1, T2, T3, T4, R> Observable<R> combineLatest(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull Observable<T4> source4, @NotNull final Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> combineFunction) {
        Intrinsics.checkNotNullParameter(source1, "source1");
        Intrinsics.checkNotNullParameter(source2, "source2");
        Intrinsics.checkNotNullParameter(source3, "source3");
        Intrinsics.checkNotNullParameter(source4, "source4");
        Intrinsics.checkNotNullParameter(combineFunction, "combineFunction");
        Observable<R> observableCombineLatest = Observable.combineLatest(source1, source2, source3, source4, new io.reactivex.rxjava3.functions.Function4<T1, T2, T3, T4, R>() { // from class: io.reactivex.rxjava3.kotlin.Observables.combineLatest.5
            @Override // io.reactivex.rxjava3.functions.Function4
            public final R apply(@NotNull T1 t10, @NotNull T2 t11, @NotNull T3 t12, @NotNull T4 t13) {
                Intrinsics.checkNotNullParameter(t10, "t1");
                Intrinsics.checkNotNullParameter(t11, "t2");
                Intrinsics.checkNotNullParameter(t12, "t3");
                Intrinsics.checkNotNullParameter(t13, "t4");
                return (R) combineFunction.invoke(t10, t11, t12, t13);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "Observable.combineLatest…nction(t1, t2, t3, t4) })");
        return observableCombineLatest;
    }

    @CheckReturnValue
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "New type inference algorithm in Kotlin 1.4 makes this method obsolete. Method will be removed in future RxKotlin release.", replaceWith = @ReplaceWith(expression = "Observable.zip(source1, source2, source3, source4, combineFunction)", imports = {"io.reactivex.Observable"}))
    @SchedulerSupport("none")
    public final <T1, T2, T3, T4, R> Observable<R> zip(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull Observable<T4> source4, @NotNull final Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> combineFunction) {
        Intrinsics.checkNotNullParameter(source1, "source1");
        Intrinsics.checkNotNullParameter(source2, "source2");
        Intrinsics.checkNotNullParameter(source3, "source3");
        Intrinsics.checkNotNullParameter(source4, "source4");
        Intrinsics.checkNotNullParameter(combineFunction, "combineFunction");
        Observable<R> observableZip = Observable.zip(source1, source2, source3, source4, new io.reactivex.rxjava3.functions.Function4<T1, T2, T3, T4, R>() { // from class: io.reactivex.rxjava3.kotlin.Observables.zip.5
            @Override // io.reactivex.rxjava3.functions.Function4
            public final R apply(@NotNull T1 t10, @NotNull T2 t11, @NotNull T3 t12, @NotNull T4 t13) {
                Intrinsics.checkNotNullParameter(t10, "t1");
                Intrinsics.checkNotNullParameter(t11, "t2");
                Intrinsics.checkNotNullParameter(t12, "t3");
                Intrinsics.checkNotNullParameter(t13, "t4");
                return (R) combineFunction.invoke(t10, t11, t12, t13);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableZip, "Observable.zip(source1, …nction(t1, t2, t3, t4) })");
        return observableZip;
    }

    @CheckReturnValue
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "New type inference algorithm in Kotlin 1.4 makes this method obsolete. Method will be removed in future RxKotlin release.", replaceWith = @ReplaceWith(expression = "Observable.combineLatest(source1, source2, source3, source4, source5, combineFunction)", imports = {"io.reactivex.Observable"}))
    @SchedulerSupport("none")
    public final <T1, T2, T3, T4, T5, R> Observable<R> combineLatest(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull Observable<T4> source4, @NotNull Observable<T5> source5, @NotNull final Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> combineFunction) {
        Intrinsics.checkNotNullParameter(source1, "source1");
        Intrinsics.checkNotNullParameter(source2, "source2");
        Intrinsics.checkNotNullParameter(source3, "source3");
        Intrinsics.checkNotNullParameter(source4, "source4");
        Intrinsics.checkNotNullParameter(source5, "source5");
        Intrinsics.checkNotNullParameter(combineFunction, "combineFunction");
        Observable<R> observableCombineLatest = Observable.combineLatest(source1, source2, source3, source4, source5, new io.reactivex.rxjava3.functions.Function5<T1, T2, T3, T4, T5, R>() { // from class: io.reactivex.rxjava3.kotlin.Observables.combineLatest.6
            @Override // io.reactivex.rxjava3.functions.Function5
            public final R apply(@NotNull T1 t10, @NotNull T2 t11, @NotNull T3 t12, @NotNull T4 t13, @NotNull T5 t14) {
                Intrinsics.checkNotNullParameter(t10, "t1");
                Intrinsics.checkNotNullParameter(t11, "t2");
                Intrinsics.checkNotNullParameter(t12, "t3");
                Intrinsics.checkNotNullParameter(t13, "t4");
                Intrinsics.checkNotNullParameter(t14, "t5");
                return (R) combineFunction.invoke(t10, t11, t12, t13, t14);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "Observable.combineLatest…on(t1, t2, t3, t4, t5) })");
        return observableCombineLatest;
    }

    @CheckReturnValue
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "New type inference algorithm in Kotlin 1.4 makes this method obsolete. Method will be removed in future RxKotlin release.", replaceWith = @ReplaceWith(expression = "Observable.zip(source1, source2, source3, source4, source5, combineFunction)", imports = {"io.reactivex.Observable"}))
    @SchedulerSupport("none")
    public final <T1, T2, T3, T4, T5, R> Observable<R> zip(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull Observable<T4> source4, @NotNull Observable<T5> source5, @NotNull final Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> combineFunction) {
        Intrinsics.checkNotNullParameter(source1, "source1");
        Intrinsics.checkNotNullParameter(source2, "source2");
        Intrinsics.checkNotNullParameter(source3, "source3");
        Intrinsics.checkNotNullParameter(source4, "source4");
        Intrinsics.checkNotNullParameter(source5, "source5");
        Intrinsics.checkNotNullParameter(combineFunction, "combineFunction");
        Observable<R> observableZip = Observable.zip(source1, source2, source3, source4, source5, new io.reactivex.rxjava3.functions.Function5<T1, T2, T3, T4, T5, R>() { // from class: io.reactivex.rxjava3.kotlin.Observables.zip.6
            @Override // io.reactivex.rxjava3.functions.Function5
            public final R apply(@NotNull T1 t10, @NotNull T2 t11, @NotNull T3 t12, @NotNull T4 t13, @NotNull T5 t14) {
                Intrinsics.checkNotNullParameter(t10, "t1");
                Intrinsics.checkNotNullParameter(t11, "t2");
                Intrinsics.checkNotNullParameter(t12, "t3");
                Intrinsics.checkNotNullParameter(t13, "t4");
                Intrinsics.checkNotNullParameter(t14, "t5");
                return (R) combineFunction.invoke(t10, t11, t12, t13, t14);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableZip, "Observable.zip(source1, …on(t1, t2, t3, t4, t5) })");
        return observableZip;
    }

    @CheckReturnValue
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "New type inference algorithm in Kotlin 1.4 makes this method obsolete. Method will be removed in future RxKotlin release.", replaceWith = @ReplaceWith(expression = "Observable.combineLatest(source1, source2, source3, source4, source5, source6, combineFunction)", imports = {"io.reactivex.Observable"}))
    @SchedulerSupport("none")
    public final <T1, T2, T3, T4, T5, T6, R> Observable<R> combineLatest(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull Observable<T4> source4, @NotNull Observable<T5> source5, @NotNull Observable<T6> source6, @NotNull final Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> combineFunction) {
        Intrinsics.checkNotNullParameter(source1, "source1");
        Intrinsics.checkNotNullParameter(source2, "source2");
        Intrinsics.checkNotNullParameter(source3, "source3");
        Intrinsics.checkNotNullParameter(source4, "source4");
        Intrinsics.checkNotNullParameter(source5, "source5");
        Intrinsics.checkNotNullParameter(source6, "source6");
        Intrinsics.checkNotNullParameter(combineFunction, "combineFunction");
        Observable<R> observableCombineLatest = Observable.combineLatest(source1, source2, source3, source4, source5, source6, new io.reactivex.rxjava3.functions.Function6<T1, T2, T3, T4, T5, T6, R>() { // from class: io.reactivex.rxjava3.kotlin.Observables.combineLatest.7
            @Override // io.reactivex.rxjava3.functions.Function6
            public final R apply(@NotNull T1 t10, @NotNull T2 t11, @NotNull T3 t12, @NotNull T4 t13, @NotNull T5 t14, @NotNull T6 t15) {
                Intrinsics.checkNotNullParameter(t10, "t1");
                Intrinsics.checkNotNullParameter(t11, "t2");
                Intrinsics.checkNotNullParameter(t12, "t3");
                Intrinsics.checkNotNullParameter(t13, "t4");
                Intrinsics.checkNotNullParameter(t14, "t5");
                Intrinsics.checkNotNullParameter(t15, "t6");
                return (R) combineFunction.invoke(t10, t11, t12, t13, t14, t15);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "Observable.combineLatest…1, t2, t3, t4, t5, t6) })");
        return observableCombineLatest;
    }

    @CheckReturnValue
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "New type inference algorithm in Kotlin 1.4 makes this method obsolete. Method will be removed in future RxKotlin release.", replaceWith = @ReplaceWith(expression = "Observable.zip(source1, source2, source3, source4, source5, source6, combineFunction)", imports = {"io.reactivex.Observable"}))
    @SchedulerSupport("none")
    public final <T1, T2, T3, T4, T5, T6, R> Observable<R> zip(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull Observable<T4> source4, @NotNull Observable<T5> source5, @NotNull Observable<T6> source6, @NotNull final Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> combineFunction) {
        Intrinsics.checkNotNullParameter(source1, "source1");
        Intrinsics.checkNotNullParameter(source2, "source2");
        Intrinsics.checkNotNullParameter(source3, "source3");
        Intrinsics.checkNotNullParameter(source4, "source4");
        Intrinsics.checkNotNullParameter(source5, "source5");
        Intrinsics.checkNotNullParameter(source6, "source6");
        Intrinsics.checkNotNullParameter(combineFunction, "combineFunction");
        Observable<R> observableZip = Observable.zip(source1, source2, source3, source4, source5, source6, new io.reactivex.rxjava3.functions.Function6<T1, T2, T3, T4, T5, T6, R>() { // from class: io.reactivex.rxjava3.kotlin.Observables.zip.7
            @Override // io.reactivex.rxjava3.functions.Function6
            public final R apply(@NotNull T1 t10, @NotNull T2 t11, @NotNull T3 t12, @NotNull T4 t13, @NotNull T5 t14, @NotNull T6 t15) {
                Intrinsics.checkNotNullParameter(t10, "t1");
                Intrinsics.checkNotNullParameter(t11, "t2");
                Intrinsics.checkNotNullParameter(t12, "t3");
                Intrinsics.checkNotNullParameter(t13, "t4");
                Intrinsics.checkNotNullParameter(t14, "t5");
                Intrinsics.checkNotNullParameter(t15, "t6");
                return (R) combineFunction.invoke(t10, t11, t12, t13, t14, t15);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableZip, "Observable.zip(source1, …1, t2, t3, t4, t5, t6) })");
        return observableZip;
    }

    @CheckReturnValue
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "New type inference algorithm in Kotlin 1.4 makes this method obsolete. Method will be removed in future RxKotlin release.", replaceWith = @ReplaceWith(expression = "Observable.combineLatest(source1, source2, source3, source4, source5, source6, source7, combineFunction)", imports = {"io.reactivex.Observable"}))
    @SchedulerSupport("none")
    public final <T1, T2, T3, T4, T5, T6, T7, R> Observable<R> combineLatest(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull Observable<T4> source4, @NotNull Observable<T5> source5, @NotNull Observable<T6> source6, @NotNull Observable<T7> source7, @NotNull final Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> combineFunction) {
        Intrinsics.checkNotNullParameter(source1, "source1");
        Intrinsics.checkNotNullParameter(source2, "source2");
        Intrinsics.checkNotNullParameter(source3, "source3");
        Intrinsics.checkNotNullParameter(source4, "source4");
        Intrinsics.checkNotNullParameter(source5, "source5");
        Intrinsics.checkNotNullParameter(source6, "source6");
        Intrinsics.checkNotNullParameter(source7, "source7");
        Intrinsics.checkNotNullParameter(combineFunction, "combineFunction");
        Observable<R> observableCombineLatest = Observable.combineLatest(source1, source2, source3, source4, source5, source6, source7, new io.reactivex.rxjava3.functions.Function7<T1, T2, T3, T4, T5, T6, T7, R>() { // from class: io.reactivex.rxjava3.kotlin.Observables.combineLatest.8
            @Override // io.reactivex.rxjava3.functions.Function7
            public final R apply(@NotNull T1 t10, @NotNull T2 t11, @NotNull T3 t12, @NotNull T4 t13, @NotNull T5 t14, @NotNull T6 t15, @NotNull T7 t16) {
                Intrinsics.checkNotNullParameter(t10, "t1");
                Intrinsics.checkNotNullParameter(t11, "t2");
                Intrinsics.checkNotNullParameter(t12, "t3");
                Intrinsics.checkNotNullParameter(t13, "t4");
                Intrinsics.checkNotNullParameter(t14, "t5");
                Intrinsics.checkNotNullParameter(t15, "t6");
                Intrinsics.checkNotNullParameter(t16, "t7");
                return (R) combineFunction.invoke(t10, t11, t12, t13, t14, t15, t16);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "Observable.combineLatest…2, t3, t4, t5, t6, t7) })");
        return observableCombineLatest;
    }

    @CheckReturnValue
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "New type inference algorithm in Kotlin 1.4 makes this method obsolete. Method will be removed in future RxKotlin release.", replaceWith = @ReplaceWith(expression = "Observable.zip(source1, source2, source3, source4, source5, source6, source7, combineFunction)", imports = {"io.reactivex.Observable"}))
    @SchedulerSupport("none")
    public final <T1, T2, T3, T4, T5, T6, T7, R> Observable<R> zip(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull Observable<T4> source4, @NotNull Observable<T5> source5, @NotNull Observable<T6> source6, @NotNull Observable<T7> source7, @NotNull final Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> combineFunction) {
        Intrinsics.checkNotNullParameter(source1, "source1");
        Intrinsics.checkNotNullParameter(source2, "source2");
        Intrinsics.checkNotNullParameter(source3, "source3");
        Intrinsics.checkNotNullParameter(source4, "source4");
        Intrinsics.checkNotNullParameter(source5, "source5");
        Intrinsics.checkNotNullParameter(source6, "source6");
        Intrinsics.checkNotNullParameter(source7, "source7");
        Intrinsics.checkNotNullParameter(combineFunction, "combineFunction");
        Observable<R> observableZip = Observable.zip(source1, source2, source3, source4, source5, source6, source7, new io.reactivex.rxjava3.functions.Function7<T1, T2, T3, T4, T5, T6, T7, R>() { // from class: io.reactivex.rxjava3.kotlin.Observables.zip.8
            @Override // io.reactivex.rxjava3.functions.Function7
            public final R apply(@NotNull T1 t10, @NotNull T2 t11, @NotNull T3 t12, @NotNull T4 t13, @NotNull T5 t14, @NotNull T6 t15, @NotNull T7 t16) {
                Intrinsics.checkNotNullParameter(t10, "t1");
                Intrinsics.checkNotNullParameter(t11, "t2");
                Intrinsics.checkNotNullParameter(t12, "t3");
                Intrinsics.checkNotNullParameter(t13, "t4");
                Intrinsics.checkNotNullParameter(t14, "t5");
                Intrinsics.checkNotNullParameter(t15, "t6");
                Intrinsics.checkNotNullParameter(t16, "t7");
                return (R) combineFunction.invoke(t10, t11, t12, t13, t14, t15, t16);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableZip, "Observable.zip(source1, …2, t3, t4, t5, t6, t7) })");
        return observableZip;
    }

    @CheckReturnValue
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "New type inference algorithm in Kotlin 1.4 makes this method obsolete. Method will be removed in future RxKotlin release.", replaceWith = @ReplaceWith(expression = "Observable.combineLatest(source1, source2, source3, source4, source5, source6, source7, source8, combineFunction)", imports = {"io.reactivex.Observable"}))
    @SchedulerSupport("none")
    public final <T1, T2, T3, T4, T5, T6, T7, T8, R> Observable<R> combineLatest(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull Observable<T4> source4, @NotNull Observable<T5> source5, @NotNull Observable<T6> source6, @NotNull Observable<T7> source7, @NotNull Observable<T8> source8, @NotNull final Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> combineFunction) {
        Intrinsics.checkNotNullParameter(source1, "source1");
        Intrinsics.checkNotNullParameter(source2, "source2");
        Intrinsics.checkNotNullParameter(source3, "source3");
        Intrinsics.checkNotNullParameter(source4, "source4");
        Intrinsics.checkNotNullParameter(source5, "source5");
        Intrinsics.checkNotNullParameter(source6, "source6");
        Intrinsics.checkNotNullParameter(source7, "source7");
        Intrinsics.checkNotNullParameter(source8, "source8");
        Intrinsics.checkNotNullParameter(combineFunction, "combineFunction");
        Observable<R> observableCombineLatest = Observable.combineLatest(source1, source2, source3, source4, source5, source6, source7, source8, new io.reactivex.rxjava3.functions.Function8<T1, T2, T3, T4, T5, T6, T7, T8, R>() { // from class: io.reactivex.rxjava3.kotlin.Observables.combineLatest.9
            @Override // io.reactivex.rxjava3.functions.Function8
            public final R apply(@NotNull T1 t10, @NotNull T2 t11, @NotNull T3 t12, @NotNull T4 t13, @NotNull T5 t14, @NotNull T6 t15, @NotNull T7 t16, @NotNull T8 t17) {
                Intrinsics.checkNotNullParameter(t10, "t1");
                Intrinsics.checkNotNullParameter(t11, "t2");
                Intrinsics.checkNotNullParameter(t12, "t3");
                Intrinsics.checkNotNullParameter(t13, "t4");
                Intrinsics.checkNotNullParameter(t14, "t5");
                Intrinsics.checkNotNullParameter(t15, "t6");
                Intrinsics.checkNotNullParameter(t16, "t7");
                Intrinsics.checkNotNullParameter(t17, "t8");
                return (R) combineFunction.invoke(t10, t11, t12, t13, t14, t15, t16, t17);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "Observable.combineLatest…3, t4, t5, t6, t7, t8) })");
        return observableCombineLatest;
    }

    @CheckReturnValue
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "New type inference algorithm in Kotlin 1.4 makes this method obsolete. Method will be removed in future RxKotlin release.", replaceWith = @ReplaceWith(expression = "Observable.zip(source1, source2, source3, source4, source5, source6, source7, source8, combineFunction)", imports = {"io.reactivex.Observable"}))
    @SchedulerSupport("none")
    public final <T1, T2, T3, T4, T5, T6, T7, T8, R> Observable<R> zip(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull Observable<T4> source4, @NotNull Observable<T5> source5, @NotNull Observable<T6> source6, @NotNull Observable<T7> source7, @NotNull Observable<T8> source8, @NotNull final Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> combineFunction) {
        Intrinsics.checkNotNullParameter(source1, "source1");
        Intrinsics.checkNotNullParameter(source2, "source2");
        Intrinsics.checkNotNullParameter(source3, "source3");
        Intrinsics.checkNotNullParameter(source4, "source4");
        Intrinsics.checkNotNullParameter(source5, "source5");
        Intrinsics.checkNotNullParameter(source6, "source6");
        Intrinsics.checkNotNullParameter(source7, "source7");
        Intrinsics.checkNotNullParameter(source8, "source8");
        Intrinsics.checkNotNullParameter(combineFunction, "combineFunction");
        Observable<R> observableZip = Observable.zip(source1, source2, source3, source4, source5, source6, source7, source8, new io.reactivex.rxjava3.functions.Function8<T1, T2, T3, T4, T5, T6, T7, T8, R>() { // from class: io.reactivex.rxjava3.kotlin.Observables.zip.9
            @Override // io.reactivex.rxjava3.functions.Function8
            public final R apply(@NotNull T1 t10, @NotNull T2 t11, @NotNull T3 t12, @NotNull T4 t13, @NotNull T5 t14, @NotNull T6 t15, @NotNull T7 t16, @NotNull T8 t17) {
                Intrinsics.checkNotNullParameter(t10, "t1");
                Intrinsics.checkNotNullParameter(t11, "t2");
                Intrinsics.checkNotNullParameter(t12, "t3");
                Intrinsics.checkNotNullParameter(t13, "t4");
                Intrinsics.checkNotNullParameter(t14, "t5");
                Intrinsics.checkNotNullParameter(t15, "t6");
                Intrinsics.checkNotNullParameter(t16, "t7");
                Intrinsics.checkNotNullParameter(t17, "t8");
                return (R) combineFunction.invoke(t10, t11, t12, t13, t14, t15, t16, t17);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableZip, "Observable.zip(source1, …3, t4, t5, t6, t7, t8) })");
        return observableZip;
    }

    @CheckReturnValue
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "New type inference algorithm in Kotlin 1.4 makes this method obsolete. Method will be removed in future RxKotlin release.", replaceWith = @ReplaceWith(expression = "Observable.combineLatest(source1, source2, source3, source4, source5, source6, source7, source8, source9, combineFunction)", imports = {"io.reactivex.Observable"}))
    @SchedulerSupport("none")
    public final <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Observable<R> combineLatest(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull Observable<T4> source4, @NotNull Observable<T5> source5, @NotNull Observable<T6> source6, @NotNull Observable<T7> source7, @NotNull Observable<T8> source8, @NotNull Observable<T9> source9, @NotNull final Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> combineFunction) {
        Intrinsics.checkNotNullParameter(source1, "source1");
        Intrinsics.checkNotNullParameter(source2, "source2");
        Intrinsics.checkNotNullParameter(source3, "source3");
        Intrinsics.checkNotNullParameter(source4, "source4");
        Intrinsics.checkNotNullParameter(source5, "source5");
        Intrinsics.checkNotNullParameter(source6, "source6");
        Intrinsics.checkNotNullParameter(source7, "source7");
        Intrinsics.checkNotNullParameter(source8, "source8");
        Intrinsics.checkNotNullParameter(source9, "source9");
        Intrinsics.checkNotNullParameter(combineFunction, "combineFunction");
        Observable<R> observableCombineLatest = Observable.combineLatest(source1, source2, source3, source4, source5, source6, source7, source8, source9, new io.reactivex.rxjava3.functions.Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R>() { // from class: io.reactivex.rxjava3.kotlin.Observables.combineLatest.10
            @Override // io.reactivex.rxjava3.functions.Function9
            public final R apply(@NotNull T1 t10, @NotNull T2 t11, @NotNull T3 t12, @NotNull T4 t13, @NotNull T5 t14, @NotNull T6 t15, @NotNull T7 t16, @NotNull T8 t17, @NotNull T9 t18) {
                Intrinsics.checkNotNullParameter(t10, "t1");
                Intrinsics.checkNotNullParameter(t11, "t2");
                Intrinsics.checkNotNullParameter(t12, "t3");
                Intrinsics.checkNotNullParameter(t13, "t4");
                Intrinsics.checkNotNullParameter(t14, "t5");
                Intrinsics.checkNotNullParameter(t15, "t6");
                Intrinsics.checkNotNullParameter(t16, "t7");
                Intrinsics.checkNotNullParameter(t17, "t8");
                Intrinsics.checkNotNullParameter(t18, "t9");
                return (R) combineFunction.invoke(t10, t11, t12, t13, t14, t15, t16, t17, t18);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "Observable.combineLatest…4, t5, t6, t7, t8, t9) })");
        return observableCombineLatest;
    }

    @CheckReturnValue
    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "New type inference algorithm in Kotlin 1.4 makes this method obsolete. Method will be removed in future RxKotlin release.", replaceWith = @ReplaceWith(expression = "Observable.zip(source1, source2, source3, source4, source5, source6, source7, source8, source9, combineFunction)", imports = {"io.reactivex.Observable"}))
    @SchedulerSupport("none")
    public final <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Observable<R> zip(@NotNull Observable<T1> source1, @NotNull Observable<T2> source2, @NotNull Observable<T3> source3, @NotNull Observable<T4> source4, @NotNull Observable<T5> source5, @NotNull Observable<T6> source6, @NotNull Observable<T7> source7, @NotNull Observable<T8> source8, @NotNull Observable<T9> source9, @NotNull final Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> combineFunction) {
        Intrinsics.checkNotNullParameter(source1, "source1");
        Intrinsics.checkNotNullParameter(source2, "source2");
        Intrinsics.checkNotNullParameter(source3, "source3");
        Intrinsics.checkNotNullParameter(source4, "source4");
        Intrinsics.checkNotNullParameter(source5, "source5");
        Intrinsics.checkNotNullParameter(source6, "source6");
        Intrinsics.checkNotNullParameter(source7, "source7");
        Intrinsics.checkNotNullParameter(source8, "source8");
        Intrinsics.checkNotNullParameter(source9, "source9");
        Intrinsics.checkNotNullParameter(combineFunction, "combineFunction");
        Observable<R> observableZip = Observable.zip(source1, source2, source3, source4, source5, source6, source7, source8, source9, new io.reactivex.rxjava3.functions.Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R>() { // from class: io.reactivex.rxjava3.kotlin.Observables.zip.10
            @Override // io.reactivex.rxjava3.functions.Function9
            public final R apply(@NotNull T1 t10, @NotNull T2 t11, @NotNull T3 t12, @NotNull T4 t13, @NotNull T5 t14, @NotNull T6 t15, @NotNull T7 t16, @NotNull T8 t17, @NotNull T9 t18) {
                Intrinsics.checkNotNullParameter(t10, "t1");
                Intrinsics.checkNotNullParameter(t11, "t2");
                Intrinsics.checkNotNullParameter(t12, "t3");
                Intrinsics.checkNotNullParameter(t13, "t4");
                Intrinsics.checkNotNullParameter(t14, "t5");
                Intrinsics.checkNotNullParameter(t15, "t6");
                Intrinsics.checkNotNullParameter(t16, "t7");
                Intrinsics.checkNotNullParameter(t17, "t8");
                Intrinsics.checkNotNullParameter(t18, "t9");
                return (R) combineFunction.invoke(t10, t11, t12, t13, t14, t15, t16, t17, t18);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableZip, "Observable.zip(source1, …4, t5, t6, t7, t8, t9) })");
        return observableZip;
    }
}
