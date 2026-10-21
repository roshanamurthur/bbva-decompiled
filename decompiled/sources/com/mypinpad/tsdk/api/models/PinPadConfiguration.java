package com.mypinpad.tsdk.api.models;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.exifinterface.media.ExifInterface;
import c2.b;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import com.esotericsoftware.asm.Opcodes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bx\b\u0086\b\u0018\u0000 ¦\u00012\u00020\u0001:\u0002¦\u0001B\u009f\u0003\b\u0007\u0012\b\b\u0002\u00101\u001a\u00020\u0005\u0012\n\b\u0003\u00102\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u00103\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u00104\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u00106\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u00108\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u00109\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010:\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010;\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010=\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010>\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010@\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010A\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010B\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010D\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010F\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010H\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010J\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010K\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010O\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010P\u001a\u00020*\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010.¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÇ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\bHÇ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\bHÇ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\u0004J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\bHÇ\u0003¢\u0006\u0004\b\u000e\u0010\nJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÇ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÇ\u0003¢\u0006\u0004\b\u0012\u0010\nJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÇ\u0003¢\u0006\u0004\b\u0013\u0010\nJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÇ\u0003¢\u0006\u0004\b\u0014\u0010\nJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÇ\u0003¢\u0006\u0004\b\u0015\u0010\nJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u000fHÇ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÇ\u0003¢\u0006\u0004\b\u0017\u0010\nJ\u0012\u0010\u0018\u001a\u0004\u0018\u00010\bHÇ\u0003¢\u0006\u0004\b\u0018\u0010\nJ\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000fHÇ\u0003¢\u0006\u0004\b\u0019\u0010\u0011J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\bHÇ\u0003¢\u0006\u0004\b\u001a\u0010\nJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÇ\u0003¢\u0006\u0004\b\u001b\u0010\nJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÇ\u0003¢\u0006\u0004\b\u001c\u0010\nJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000fHÇ\u0003¢\u0006\u0004\b\u001d\u0010\u0011J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\bHÇ\u0003¢\u0006\u0004\b\u001e\u0010\nJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\u001f\u0010\u0004J\u0012\u0010 \u001a\u0004\u0018\u00010\bHÇ\u0003¢\u0006\u0004\b \u0010\nJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b!\u0010\u0004J\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÇ\u0003¢\u0006\u0004\b\"\u0010\nJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b#\u0010\u0004J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÇ\u0003¢\u0006\u0004\b$\u0010\nJ\u0012\u0010%\u001a\u0004\u0018\u00010\bHÇ\u0003¢\u0006\u0004\b%\u0010\nJ\u0012\u0010&\u001a\u0004\u0018\u00010\u000fHÇ\u0003¢\u0006\u0004\b&\u0010\u0011J\u0012\u0010'\u001a\u0004\u0018\u00010\bHÇ\u0003¢\u0006\u0004\b'\u0010\nJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b(\u0010\u0004J\u0012\u0010)\u001a\u0004\u0018\u00010\bHÇ\u0003¢\u0006\u0004\b)\u0010\nJ\u0010\u0010+\u001a\u00020*HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b-\u0010\u0004J\u0012\u0010/\u001a\u0004\u0018\u00010.HÇ\u0003¢\u0006\u0004\b/\u00100J¤\u0003\u0010S\u001a\u00020\u00002\b\b\u0002\u00101\u001a\u00020\u00052\n\b\u0003\u00102\u001a\u0004\u0018\u00010\b2\n\b\u0003\u00103\u001a\u0004\u0018\u00010\b2\n\b\u0003\u00104\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u00106\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u00108\u001a\u0004\u0018\u00010\b2\n\b\u0003\u00109\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010:\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010;\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010=\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010>\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010@\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010A\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010B\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010D\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010F\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010H\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010J\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010K\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010O\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010P\u001a\u00020*2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010R\u001a\u0004\u0018\u00010.HÇ\u0001¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020\bHÖ\u0001¢\u0006\u0004\bU\u0010VJ\u001a\u0010X\u001a\u00020*2\b\u0010W\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bX\u0010YR\u001a\u00101\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010\u0007R\u001c\u00102\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010\nR\u001c\u00103\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b`\u0010^\u001a\u0004\ba\u0010\nR\u001c\u00104\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010^\u001a\u0004\bc\u0010\nR\u001c\u00105\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010\u0004R\u001c\u00106\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bg\u0010^\u001a\u0004\bh\u0010\nR\u001c\u00107\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010\u0011R\u001c\u00108\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bl\u0010^\u001a\u0004\bm\u0010\nR\u001c\u00109\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bn\u0010^\u001a\u0004\bo\u0010\nR\u001c\u0010:\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bp\u0010^\u001a\u0004\bq\u0010\nR\u001c\u0010;\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\br\u0010^\u001a\u0004\bs\u0010\nR\u001c\u0010<\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bt\u0010j\u001a\u0004\bu\u0010\u0011R\u001c\u0010=\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bv\u0010^\u001a\u0004\bw\u0010\nR\u001c\u0010>\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bx\u0010^\u001a\u0004\by\u0010\nR\u001c\u0010?\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bz\u0010j\u001a\u0004\b{\u0010\u0011R\u001c\u0010@\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b|\u0010^\u001a\u0004\b}\u0010\nR\u001c\u0010A\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b~\u0010^\u001a\u0004\b\u007f\u0010\nR\u001e\u0010B\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010^\u001a\u0005\b\u0081\u0001\u0010\nR\u001e\u0010C\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010j\u001a\u0005\b\u0083\u0001\u0010\u0011R\u001e\u0010D\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010^\u001a\u0005\b\u0085\u0001\u0010\nR\u001e\u0010E\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010e\u001a\u0005\b\u0087\u0001\u0010\u0004R\u001e\u0010F\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010^\u001a\u0005\b\u0089\u0001\u0010\nR\u001e\u0010G\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010e\u001a\u0005\b\u008b\u0001\u0010\u0004R\u001e\u0010H\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010^\u001a\u0005\b\u008d\u0001\u0010\nR\u001e\u0010I\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010e\u001a\u0005\b\u008f\u0001\u0010\u0004R\u001e\u0010J\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010^\u001a\u0005\b\u0091\u0001\u0010\nR\u001e\u0010K\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010^\u001a\u0005\b\u0093\u0001\u0010\nR\u001e\u0010L\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010j\u001a\u0005\b\u0095\u0001\u0010\u0011R\u001e\u0010M\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010^\u001a\u0005\b\u0097\u0001\u0010\nR\u001e\u0010N\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010e\u001a\u0005\b\u0099\u0001\u0010\u0004R\u001e\u0010O\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009a\u0001\u0010^\u001a\u0005\b\u009b\u0001\u0010\nR\u001d\u0010P\u001a\u00020*8\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0005\b\u009e\u0001\u0010,R\u001e\u0010Q\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010e\u001a\u0005\b \u0001\u0010\u0004R\u001f\u0010R\u001a\u0004\u0018\u00010.8\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0005\b£\u0001\u00100"}, d2 = {"Lcom/mypinpad/tsdk/api/models/PinPadConfiguration;", "", "", "toString", "()Ljava/lang/String;", "Lcom/mypinpad/tsdk/api/models/PinPadType;", "component1", "()Lcom/mypinpad/tsdk/api/models/PinPadType;", "", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "", "component7", "()Ljava/lang/Float;", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "", "component32", "()Z", "component33", "Lcom/mypinpad/tsdk/api/models/PinViewports;", "component34", "()Lcom/mypinpad/tsdk/api/models/PinViewports;", "pinPadType", "statusBarColor", "generalBgColor", "navBarBgColor", "navBarTitleString", "navBarTextColor", "navBarTextSizeSp", "pinDigitTintColor", "pinDigitBgColor", "amountFieldBgColor", "amountFieldTextColor", "amountFieldTextSizeSp", "detailsFieldBgColor", "detailsFieldTextColor", "detailsFieldTextSizeSp", "pinGridBgColor", "pinGridButtonTextColor", "pinGridButtonBgColor", "pinGridButtonNumFontSizeSp", "cancelButtonIconDrawableId", "cancelButtonText", "clearButtonIconDrawableId", "clearButtonText", "enterButtonIconDrawableId", "enterButtonText", "dynamicButtonBackgroundColor", "dynamicButtonTextColor", "dynamicButtonTextSizeSp", "dynamicButtonIconTextSpacingDp", "tooFewDigitsMessage", "progressBarColor", "immersiveMode", "revealSystemBarToastMessage", "pinViewports", "copy", "(Lcom/mypinpad/tsdk/api/models/PinPadType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;Lcom/mypinpad/tsdk/api/models/PinViewports;)Lcom/mypinpad/tsdk/api/models/PinPadConfiguration;", GenerateActivationFormCommand.HASH_CODE, "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/mypinpad/tsdk/api/models/PinPadType;", "getPinPadType", "b", "Ljava/lang/Integer;", "getStatusBarColor", "c", "getGeneralBgColor", "d", "getNavBarBgColor", "e", "Ljava/lang/String;", "getNavBarTitleString", "f", "getNavBarTextColor", "g", "Ljava/lang/Float;", "getNavBarTextSizeSp", "h", "getPinDigitTintColor", "i", "getPinDigitBgColor", "j", "getAmountFieldBgColor", "k", "getAmountFieldTextColor", "l", "getAmountFieldTextSizeSp", "m", "getDetailsFieldBgColor", "n", "getDetailsFieldTextColor", "o", "getDetailsFieldTextSizeSp", "p", "getPinGridBgColor", "q", "getPinGridButtonTextColor", "r", "getPinGridButtonBgColor", "s", "getPinGridButtonNumFontSizeSp", "t", "getCancelButtonIconDrawableId", "u", "getCancelButtonText", SharedPrefsStorage.VERSION_KEY, "getClearButtonIconDrawableId", "w", "getClearButtonText", "x", "getEnterButtonIconDrawableId", "y", "getEnterButtonText", "z", "getDynamicButtonBackgroundColor", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getDynamicButtonTextColor", "B", "getDynamicButtonTextSizeSp", "C", "getDynamicButtonIconTextSpacingDp", "D", "getTooFewDigitsMessage", ExifInterface.LONGITUDE_EAST, "getProgressBarColor", "F", "Z", "getImmersiveMode", "G", "getRevealSystemBarToastMessage", "H", "Lcom/mypinpad/tsdk/api/models/PinViewports;", "getPinViewports", "<init>", "(Lcom/mypinpad/tsdk/api/models/PinPadType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;Lcom/mypinpad/tsdk/api/models/PinViewports;)V", "Companion"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PinPadConfiguration {
    public static final boolean DEFAULT_IMMERSIVE_MODE = true;
    public static int I = 0;
    public static int J = 1;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public final Integer dynamicButtonTextColor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public final Float dynamicButtonTextSizeSp;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public final Integer dynamicButtonIconTextSpacingDp;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public final String tooFewDigitsMessage;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public final Integer progressBarColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public final boolean immersiveMode;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    public final String revealSystemBarToastMessage;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Nullable
    public final PinViewports pinViewports;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PinPadType pinPadType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer statusBarColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer generalBgColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer navBarBgColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String navBarTitleString;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer navBarTextColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Float navBarTextSizeSp;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer pinDigitTintColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer pinDigitBgColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer amountFieldBgColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer amountFieldTextColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Float amountFieldTextSizeSp;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public final Integer detailsFieldBgColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer detailsFieldTextColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Float detailsFieldTextSizeSp;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer pinGridBgColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer pinGridButtonTextColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer pinGridButtonBgColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Float pinGridButtonNumFontSizeSp;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer cancelButtonIconDrawableId;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String cancelButtonText;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer clearButtonIconDrawableId;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String clearButtonText;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer enterButtonIconDrawableId;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String enterButtonText;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer dynamicButtonBackgroundColor;

    static {
        int i10 = I;
        int i11 = ((i10 & 82) + (i10 | 82)) - 1;
        J = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 45 / 0;
        }
    }

    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4, @Nullable Float f6, @ColorInt @Nullable Integer num5, @ColorInt @Nullable Integer num6, @ColorInt @Nullable Integer num7, @ColorInt @Nullable Integer num8, @Nullable Float f10, @ColorInt @Nullable Integer num9, @ColorInt @Nullable Integer num10, @Nullable Float f11, @ColorInt @Nullable Integer num11, @ColorInt @Nullable Integer num12, @ColorInt @Nullable Integer num13, @Nullable Float f12, @DrawableRes @Nullable Integer num14, @Nullable String str2, @DrawableRes @Nullable Integer num15, @Nullable String str3, @DrawableRes @Nullable Integer num16, @Nullable String str4, @ColorInt @Nullable Integer num17, @ColorInt @Nullable Integer num18, @Nullable Float f13, @Nullable Integer num19, @Nullable String str5, @ColorInt @Nullable Integer num20, boolean z10, @Nullable String str6, @Nullable PinViewports pinViewports) {
        Intrinsics.checkNotNullParameter(pinPadType, "");
        this.pinPadType = pinPadType;
        this.statusBarColor = num;
        this.generalBgColor = num2;
        this.navBarBgColor = num3;
        this.navBarTitleString = str;
        this.navBarTextColor = num4;
        this.navBarTextSizeSp = f6;
        this.pinDigitTintColor = num5;
        this.pinDigitBgColor = num6;
        this.amountFieldBgColor = num7;
        this.amountFieldTextColor = num8;
        this.amountFieldTextSizeSp = f10;
        this.detailsFieldBgColor = num9;
        this.detailsFieldTextColor = num10;
        this.detailsFieldTextSizeSp = f11;
        this.pinGridBgColor = num11;
        this.pinGridButtonTextColor = num12;
        this.pinGridButtonBgColor = num13;
        this.pinGridButtonNumFontSizeSp = f12;
        this.cancelButtonIconDrawableId = num14;
        this.cancelButtonText = str2;
        this.clearButtonIconDrawableId = num15;
        this.clearButtonText = str3;
        this.enterButtonIconDrawableId = num16;
        this.enterButtonText = str4;
        this.dynamicButtonBackgroundColor = num17;
        this.dynamicButtonTextColor = num18;
        this.dynamicButtonTextSizeSp = f13;
        this.dynamicButtonIconTextSpacingDp = num19;
        this.tooFewDigitsMessage = str5;
        this.progressBarColor = num20;
        this.immersiveMode = z10;
        this.revealSystemBarToastMessage = str6;
        this.pinViewports = pinViewports;
    }

    public static /* synthetic */ PinPadConfiguration copy$default(PinPadConfiguration pinPadConfiguration, PinPadType pinPadType, Integer num, Integer num2, Integer num3, String str, Integer num4, Float f6, Integer num5, Integer num6, Integer num7, Integer num8, Float f10, Integer num9, Integer num10, Float f11, Integer num11, Integer num12, Integer num13, Float f12, Integer num14, String str2, Integer num15, String str3, Integer num16, String str4, Integer num17, Integer num18, Float f13, Integer num19, String str5, Integer num20, boolean z10, String str6, PinViewports pinViewports, int i10, int i11, Object obj) {
        PinPadType pinPadType2;
        Integer num21;
        Integer num22;
        Integer num23;
        String str7;
        Integer num24;
        Float f14;
        Integer num25;
        Integer num26;
        Integer num27;
        Integer num28;
        Float f15;
        Integer num29;
        Integer num30;
        Float f16;
        Integer num31;
        Integer num32;
        Integer num33;
        Float f17;
        Integer num34;
        String str8;
        Integer num35;
        String str9;
        Integer num36;
        String str10;
        Integer num37;
        Integer num38;
        Float f18;
        Integer num39;
        String str11;
        Integer num40;
        boolean z11;
        String str12;
        PinViewports pinViewports2;
        int i12 = J;
        int i13 = i12 & 15;
        int i14 = (i12 ^ 15) | i13;
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        int i16 = i15 % 128;
        I = i16;
        int i17 = i15 % 2;
        if ((i10 & 1) != 0) {
            int i18 = ((-1) << 1) - (((i16 ^ 60) + ((i16 & 60) << 1)) ^ (-1));
            J = i18 % 128;
            if (i18 % 2 == 0) {
                PinPadType pinPadType3 = pinPadConfiguration.pinPadType;
                throw null;
            }
            pinPadType2 = pinPadConfiguration.pinPadType;
        } else {
            pinPadType2 = pinPadType;
        }
        if ((i10 & 2) != 0) {
            int i19 = J;
            int i20 = i19 & 55;
            int i21 = (((i19 | 55) & (~i20)) - (~(-(-(i20 << 1))))) - 1;
            I = i21 % 128;
            if (i21 % 2 != 0) {
                Integer num41 = pinPadConfiguration.statusBarColor;
                throw null;
            }
            num21 = pinPadConfiguration.statusBarColor;
        } else {
            num21 = num;
        }
        int i22 = ~i10;
        if ((i10 & 4) != 0) {
            int i23 = (~i10) & (i22 | i10);
            int i24 = ((-1496134754) & i23) | ((~i23) & 1496134753);
            int i25 = i23 & 1496134753;
            int i26 = ~((i25 & i24) | (i24 ^ i25));
            int i27 = 571655060 ^ i26;
            int i28 = i26 & 571655060;
            int i29 = -(-(((i28 & i27) | (i27 ^ i28)) * (-108)));
            int i30 = (-77523743) & i29;
            int i31 = -(-((i29 ^ (-77523743)) | i30));
            int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
            int i33 = ((-722723829) ^ i10) | ((-722723829) & i10);
            int i34 = (i33 | (~i33)) & (~i33);
            int i35 = (i34 & 1345065985) | (i34 ^ 1345065985);
            int i36 = ((-722723829) & i22) | ((~i22) & 722723828);
            int i37 = i22 & 722723828;
            int i38 = (i36 & i37) | (i36 ^ i37);
            int i39 = (i38 | (~i38)) & (~i38);
            int i40 = i35 & i39;
            int i41 = (i39 | i35) & (~i40);
            int i42 = -(~(-(-(((i41 & i40) | (i41 ^ i40)) * 54))));
            int i43 = ((i32 | i42) << 1) - (i42 ^ i32);
            int i44 = (i43 ^ (-1)) + (i43 << 1);
            int i45 = ((-1345065986) & i10) | (1345065985 & i22);
            int i46 = i10 & 1345065985;
            int i47 = ((i45 & i46) | (i45 ^ i46)) * 54;
            if (-1396839189 <= (i44 & i47) + (i44 | i47)) {
                num22 = pinPadConfiguration.generalBgColor;
                int i48 = 64 / 0;
            } else {
                num22 = pinPadConfiguration.generalBgColor;
            }
        } else {
            num22 = num2;
        }
        if ((i10 & 8) != 0) {
            int i49 = J;
            int i50 = (((i49 | 38) << 1) - (i49 ^ 38)) - 1;
            I = i50 % 128;
            int i51 = i50 % 2;
            num23 = pinPadConfiguration.navBarBgColor;
        } else {
            num23 = num3;
        }
        if ((i10 & 16) != 0) {
            int i52 = ((-1) << 1) - ((I + 68) ^ (-1));
            J = i52 % 128;
            int i53 = i52 % 2;
            str7 = pinPadConfiguration.navBarTitleString;
        } else {
            str7 = str;
        }
        if ((i10 & 32) != 0) {
            int i54 = J + 105;
            I = i54 % 128;
            if (i54 % 2 != 0) {
                Integer num42 = pinPadConfiguration.navBarTextColor;
                throw null;
            }
            num24 = pinPadConfiguration.navBarTextColor;
        } else {
            num24 = num4;
        }
        if ((i10 & 64) != 0) {
            int i55 = I;
            int i56 = ((i55 | 47) << 1) - (i55 ^ 47);
            int i57 = i56 % 128;
            J = i57;
            if (i56 % 2 == 0) {
                f14 = pinPadConfiguration.navBarTextSizeSp;
                int i58 = 45 / 0;
            } else {
                f14 = pinPadConfiguration.navBarTextSizeSp;
            }
            int i59 = (((i57 ^ 97) | (i57 & 97)) << 1) - (((~i57) & 97) | (i57 & (-98)));
            I = i59 % 128;
            int i60 = i59 % 2;
        } else {
            f14 = f6;
        }
        if ((i10 & 128) != 0) {
            int i61 = I;
            int i62 = i61 & 107;
            int i63 = i62 + ((i61 ^ 107) | i62);
            J = i63 % 128;
            int i64 = i63 % 2;
            num25 = pinPadConfiguration.pinDigitTintColor;
        } else {
            num25 = num5;
        }
        if ((i10 & 256) != 0) {
            int i65 = J + 39;
            int i66 = i65 % 128;
            I = i66;
            int i67 = i65 % 2;
            num26 = pinPadConfiguration.pinDigitBgColor;
            int i68 = i66 ^ 75;
            int i69 = -(-((i66 & 75) << 1));
            int i70 = ((i68 | i69) << 1) - (i69 ^ i68);
            J = i70 % 128;
            int i71 = i70 % 2;
        } else {
            num26 = num6;
        }
        if ((i10 & 512) != 0) {
            int i72 = I;
            int i73 = i72 & 99;
            int i74 = ((~i73) & (i72 | 99)) + (i73 << 1);
            J = i74 % 128;
            if (i74 % 2 == 0) {
                Integer num43 = pinPadConfiguration.amountFieldBgColor;
                throw null;
            }
            num27 = pinPadConfiguration.amountFieldBgColor;
        } else {
            num27 = num7;
        }
        if ((i10 & 1024) != 0) {
            int i75 = I;
            int i76 = (i75 ^ 5) + ((i75 & 5) << 1);
            J = i76 % 128;
            int i77 = i76 % 2;
            num28 = pinPadConfiguration.amountFieldTextColor;
            int i78 = i75 & 125;
            int i79 = (i78 - (~((i75 ^ 125) | i78))) - 1;
            J = i79 % 128;
            int i80 = i79 % 2;
        } else {
            num28 = num8;
        }
        if ((i10 & 2048) != 0) {
            int i81 = J;
            int i82 = (i81 & 27) + (i81 | 27);
            I = i82 % 128;
            if (i82 % 2 != 0) {
                Float f19 = pinPadConfiguration.amountFieldTextSizeSp;
                throw null;
            }
            f15 = pinPadConfiguration.amountFieldTextSizeSp;
        } else {
            f15 = f10;
        }
        if ((i10 & 4096) != 0) {
            int i83 = J;
            int i84 = (i83 | 21) << 1;
            int i85 = -(i83 ^ 21);
            int i86 = (i84 ^ i85) + ((i84 & i85) << 1);
            I = i86 % 128;
            int i87 = i86 % 2;
            num29 = pinPadConfiguration.detailsFieldBgColor;
        } else {
            num29 = num9;
        }
        if ((i10 & 8192) != 0) {
            int i88 = I;
            int i89 = ((i88 ^ 62) + ((i88 & 62) << 1)) - 1;
            J = i89 % 128;
            if (i89 % 2 == 0) {
                Integer num44 = pinPadConfiguration.detailsFieldTextColor;
                throw null;
            }
            num30 = pinPadConfiguration.detailsFieldTextColor;
        } else {
            num30 = num10;
        }
        if ((i10 & 16384) != 0) {
            int i90 = I;
            int i91 = ((i90 ^ 37) - (~(-(-((i90 & 37) << 1))))) - 1;
            J = i91 % 128;
            int i92 = i91 % 2;
            f16 = pinPadConfiguration.detailsFieldTextSizeSp;
        } else {
            f16 = f11;
        }
        if ((32768 & i10) != 0) {
            int i93 = J;
            int i94 = i93 & 21;
            int i95 = i94 + ((i93 ^ 21) | i94);
            I = i95 % 128;
            if (i95 % 2 != 0) {
                Integer num45 = pinPadConfiguration.pinGridBgColor;
                throw null;
            }
            num31 = pinPadConfiguration.pinGridBgColor;
        } else {
            num31 = num11;
        }
        if ((65536 & i10) != 0) {
            int i96 = I;
            int i97 = i96 ^ 37;
            int i98 = (i96 & 37) << 1;
            int i99 = ((i97 | i98) << 1) - (i97 ^ i98);
            J = i99 % 128;
            int i100 = i99 % 2;
            num32 = pinPadConfiguration.pinGridButtonTextColor;
        } else {
            num32 = num12;
        }
        if ((131072 & i10) != 0) {
            int i101 = I + 81;
            J = i101 % 128;
            if (i101 % 2 == 0) {
                Integer num46 = pinPadConfiguration.pinGridButtonBgColor;
                throw null;
            }
            num33 = pinPadConfiguration.pinGridButtonBgColor;
        } else {
            num33 = num13;
        }
        if ((262144 & i10) != 0) {
            int i102 = J;
            int i103 = ((i102 ^ 4) + ((i102 & 4) << 1)) - 1;
            I = i103 % 128;
            int i104 = i103 % 2;
            f17 = pinPadConfiguration.pinGridButtonNumFontSizeSp;
            int i105 = (i102 & 63) + (i102 | 63);
            I = i105 % 128;
            int i106 = i105 % 2;
        } else {
            f17 = f12;
        }
        if ((524288 & i10) != 0) {
            int i107 = J;
            int i108 = ((i107 & 113) - (~(i107 | 113))) - 1;
            int i109 = i108 % 128;
            I = i109;
            if (i108 % 2 != 0) {
                Integer num47 = pinPadConfiguration.cancelButtonIconDrawableId;
                throw null;
            }
            int i110 = i109 + 29;
            num34 = pinPadConfiguration.cancelButtonIconDrawableId;
            J = i110 % 128;
            int i111 = i110 % 2;
        } else {
            num34 = num14;
        }
        if ((1048576 & i10) != 0) {
            int i112 = I + 39;
            int i113 = i112 % 128;
            J = i113;
            int i114 = i112 % 2;
            int i115 = ((i113 | 111) << 1) - (i113 ^ 111);
            str8 = pinPadConfiguration.cancelButtonText;
            I = i115 % 128;
            int i116 = i115 % 2;
        } else {
            str8 = str2;
        }
        if ((2097152 & i10) != 0) {
            int i117 = J;
            int i118 = i117 & 91;
            int i119 = (i118 - (~(-(-((i117 ^ 91) | i118))))) - 1;
            I = i119 % 128;
            int i120 = i119 % 2;
            num35 = pinPadConfiguration.clearButtonIconDrawableId;
        } else {
            num35 = num15;
        }
        if ((4194304 & i10) != 0) {
            int i121 = I;
            int i122 = ((i121 | 43) << 1) - (i121 ^ 43);
            J = i122 % 128;
            if (i122 % 2 == 0) {
                String str13 = pinPadConfiguration.clearButtonText;
                throw null;
            }
            str9 = pinPadConfiguration.clearButtonText;
        } else {
            str9 = str3;
        }
        if ((8388608 & i10) != 0) {
            int i123 = J;
            int i124 = i123 & 107;
            int i125 = -(-((i123 ^ 107) | i124));
            int i126 = ((i124 | i125) << 1) - (i124 ^ i125);
            I = i126 % 128;
            if (i126 % 2 != 0) {
                Integer num48 = pinPadConfiguration.enterButtonIconDrawableId;
                throw null;
            }
            num36 = pinPadConfiguration.enterButtonIconDrawableId;
        } else {
            num36 = num16;
        }
        if ((16777216 & i10) != 0) {
            int i127 = J + 76;
            int i128 = (i127 ^ (-1)) + (i127 << 1);
            int i129 = i128 % 128;
            I = i129;
            if (i128 % 2 != 0) {
                String str14 = pinPadConfiguration.enterButtonText;
                throw null;
            }
            int i130 = ((i129 | 5) << 1) - (i129 ^ 5);
            str10 = pinPadConfiguration.enterButtonText;
            J = i130 % 128;
            int i131 = i130 % 2;
        } else {
            str10 = str4;
        }
        if ((33554432 & i10) != 0) {
            int i132 = ((-1225278049) & i10) | ((-1225278049) ^ i10);
            int i133 = ((~i132) | i132) & (~i132);
            int i134 = ~((2099147643 & i10) | (2099147643 & i22) | (i10 & (-2099147644)));
            int i135 = ((~i133) & i134) | ((~i134) & i133);
            int i136 = i133 & i134;
            int i137 = ((i136 & i135) | (i135 ^ i136)) * 69;
            int i138 = ((~i137) & (-1529602588)) | (1529602587 & i137);
            int i139 = (i137 & (-1529602588)) << 1;
            int i140 = (i138 & i139) + (i139 | i138);
            int i141 = ((-2031637097) & i22) | (2031637096 & i10);
            int i142 = (-2031637097) & i10;
            int i143 = ~((i142 & i141) | (i141 ^ i142));
            int i144 = (i143 & 806359048) | (806359048 ^ i143);
            int i145 = (1292788595 & i22) | (i10 & (-1292788596));
            int i146 = 1292788595 & i10;
            int i147 = ~((i145 ^ i146) | (i146 & i145));
            int i148 = ((~i144) & i147) | ((~i147) & i144);
            int i149 = i144 & i147;
            int i150 = (i140 - (~(-(~(((i149 & i148) | (i148 ^ i149)) * (-69)))))) - (-363260445);
            int i151 = (-1799264543) & i10;
            int i152 = (~i151) & ((-1799264543) | i10);
            int i153 = (i151 & i152) | (i152 ^ i151);
            int i154 = (i153 | (~i153)) & (~i153);
            int i155 = ~i10;
            int i156 = (i155 ^ 1900930482) | (1900930482 & i155);
            int i157 = (~i156) & ((~i156) | i156);
            int i158 = (i157 & i154) | (i154 ^ i157);
            int i159 = ~(((-1799264543) & i155) | ((~i155) & 1799264542) | (i155 & 1799264542));
            int i160 = ((~i159) & i158) | ((~i158) & i159);
            int i161 = i158 & i159;
            int i162 = (-1514789761) - (~(((i161 & i160) | (i160 ^ i161)) * (-516)));
            int i163 = (-1628209427) & i10;
            int i164 = ((-1628209427) | i10) & (~i163);
            int i165 = (i164 & i163) | (i164 ^ i163);
            int i166 = (i165 | (~i165)) & (~i165);
            int i167 = ((-1900930483) & i22) | ((-1900930483) ^ i22);
            int i168 = i167 & 1799264542;
            int i169 = ~(((~i168) & (i167 | 1799264542)) | i168);
            int i170 = ((~i169) & i166) | ((~i166) & i169);
            int i171 = i166 & i169;
            int i172 = -(~(((i171 & i170) | (i170 ^ i171)) * LibMCryptConstants.IND_HEX_SEGMENTO2));
            int i173 = ((-1) << 1) - ((((i162 | i172) << 1) - (i172 ^ i162)) ^ (-1));
            int i174 = (i22 & 1799264542) | (i22 ^ 1799264542);
            int i175 = (i174 | (~i174)) & (~i174);
            int i176 = 272721056 ^ i175;
            int i177 = i175 & 272721056;
            int i178 = -(-(((i177 & i176) | (i176 ^ i177)) * LibMCryptConstants.IND_HEX_SEGMENTO2));
            int i179 = i173 & i178;
            int i180 = i173 | i178;
            if (i150 > (i179 ^ i180) + ((i180 & i179) << 1)) {
                Integer num49 = pinPadConfiguration.dynamicButtonBackgroundColor;
                throw null;
            }
            num37 = pinPadConfiguration.dynamicButtonBackgroundColor;
            int i181 = J;
            int i182 = i181 & 65;
            int i183 = ((i181 ^ 65) | i182) << 1;
            int i184 = -((i181 | 65) & (~i182));
            int i185 = ((i183 | i184) << 1) - (i184 ^ i183);
            I = i185 % 128;
            int i186 = i185 % 2;
        } else {
            num37 = num17;
        }
        if ((67108864 & i10) != 0) {
            int i187 = I;
            int i188 = i187 + 125;
            J = i188 % 128;
            int i189 = i188 % 2;
            num38 = pinPadConfiguration.dynamicButtonTextColor;
            int i190 = ((i187 ^ 75) | (i187 & 75)) << 1;
            int i191 = -(((~i187) & 75) | (i187 & (-76)));
            int i192 = ((i190 | i191) << 1) - (i191 ^ i190);
            J = i192 % 128;
            int i193 = i192 % 2;
        } else {
            num38 = num18;
        }
        if ((134217728 & i10) != 0) {
            int i194 = I;
            int i195 = i194 & 3;
            int i196 = i195 + ((i194 ^ 3) | i195);
            J = i196 % 128;
            int i197 = i196 % 2;
            f18 = pinPadConfiguration.dynamicButtonTextSizeSp;
        } else {
            f18 = f13;
        }
        if ((268435456 & i10) != 0) {
            int i198 = I;
            int i199 = i198 & 49;
            int i200 = (i198 ^ 49) | i199;
            int i201 = ((i199 | i200) << 1) - (i200 ^ i199);
            J = i201 % 128;
            int i202 = i201 % 2;
            num39 = pinPadConfiguration.dynamicButtonIconTextSpacingDp;
        } else {
            num39 = num19;
        }
        if ((536870912 & i10) != 0) {
            int i203 = J;
            int i204 = i203 & 111;
            int i205 = i203 | 111;
            int i206 = ((i204 | i205) << 1) - (i204 ^ i205);
            I = i206 % 128;
            int i207 = i206 % 2;
            str11 = pinPadConfiguration.tooFewDigitsMessage;
            int i208 = i203 + 90;
            int i209 = (i208 ^ (-1)) + (i208 << 1);
            I = i209 % 128;
            int i210 = i209 % 2;
        } else {
            str11 = str5;
        }
        if ((1073741824 & i10) != 0) {
            int i211 = J;
            int i212 = ((i211 | 33) << 1) - (i211 ^ 33);
            int i213 = i212 % 128;
            I = i213;
            int i214 = i212 % 2;
            num40 = pinPadConfiguration.progressBarColor;
            int i215 = ((i213 ^ 22) + ((i213 & 22) << 1)) - 1;
            J = i215 % 128;
            int i216 = i215 % 2;
        } else {
            num40 = num20;
        }
        if ((i10 & Integer.MIN_VALUE) != 0) {
            int i217 = I;
            int i218 = (i217 & 71) + (i217 | 71);
            J = i218 % 128;
            if (i218 % 2 == 0) {
                boolean z12 = pinPadConfiguration.immersiveMode;
                throw null;
            }
            z11 = pinPadConfiguration.immersiveMode;
        } else {
            z11 = z10;
        }
        if ((i11 & 1) != 0) {
            int i219 = J;
            int i220 = i219 + 49;
            I = i220 % 128;
            int i221 = i220 % 2;
            str12 = pinPadConfiguration.revealSystemBarToastMessage;
            int i222 = ((((i219 ^ 81) | (i219 & 81)) << 1) - (~(-((i219 & (-82)) | ((~i219) & 81))))) - 1;
            I = i222 % 128;
            int i223 = i222 % 2;
        } else {
            str12 = str6;
        }
        if ((i11 & 2) != 0) {
            int i224 = I;
            int i225 = i224 & 25;
            int i226 = -(-((i224 ^ 25) | i225));
            int i227 = ((i225 | i226) << 1) - (i226 ^ i225);
            int i228 = i227 % 128;
            J = i228;
            if (i227 % 2 == 0) {
                PinViewports pinViewports3 = pinPadConfiguration.pinViewports;
                throw null;
            }
            int i229 = ((i228 & 80) + (i228 | 80)) - 1;
            pinViewports2 = pinPadConfiguration.pinViewports;
            I = i229 % 128;
            int i230 = i229 % 2;
        } else {
            pinViewports2 = pinViewports;
        }
        PinPadConfiguration pinPadConfigurationCopy = pinPadConfiguration.copy(pinPadType2, num21, num22, num23, str7, num24, f14, num25, num26, num27, num28, f15, num29, num30, f16, num31, num32, num33, f17, num34, str8, num35, str9, num36, str10, num37, num38, f18, num39, str11, num40, z11, str12, pinViewports2);
        int i231 = J;
        int i232 = i231 & 105;
        int i233 = ((((i231 ^ 105) | i232) << 1) - (~(-((i231 | 105) & (~i232))))) - 1;
        I = i233 % 128;
        int i234 = i233 % 2;
        return pinPadConfigurationCopy;
    }

    @NotNull
    public final PinPadType component1() {
        int i10 = I;
        int i11 = i10 & 15;
        int i12 = ((i10 ^ 15) | i11) << 1;
        int i13 = -((~i11) & (i10 | 15));
        int i14 = (i12 & i13) + (i12 | i13);
        J = i14 % 128;
        int i15 = i14 % 2;
        int i16 = ((i10 ^ 102) + ((i10 & 102) << 1)) - 1;
        J = i16 % 128;
        int i17 = i16 % 2;
        return this.pinPadType;
    }

    @Nullable
    public final Integer component10() {
        int i10 = I + 7;
        int i11 = i10 % 128;
        J = i11;
        int i12 = i10 % 2;
        int i13 = (i11 & 13) + (i11 | 13);
        I = i13 % 128;
        if (i13 % 2 == 0) {
            return this.amountFieldBgColor;
        }
        throw null;
    }

    @Nullable
    public final Integer component11() {
        int i10 = J + 73;
        int i11 = i10 % 128;
        I = i11;
        int i12 = i10 % 2;
        int i13 = i11 & 11;
        int i14 = (i13 - (~((i11 ^ 11) | i13))) - 1;
        J = i14 % 128;
        if (i14 % 2 != 0) {
            return this.amountFieldTextColor;
        }
        throw null;
    }

    @Nullable
    public final Float component12() {
        int i10 = J;
        int i11 = (i10 & (-104)) | ((~i10) & 103);
        int i12 = (i10 & 103) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        I = i13 % 128;
        if (i13 % 2 == 0) {
            return this.amountFieldTextSizeSp;
        }
        throw null;
    }

    @Nullable
    public final Integer component13() {
        int i10 = J;
        int i11 = (i10 & 6) + (i10 | 6);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        int i13 = i12 % 128;
        I = i13;
        int i14 = i12 % 2;
        int i15 = (i13 & (-126)) | ((~i13) & 125);
        int i16 = -(-((i13 & 125) << 1));
        int i17 = (i15 & i16) + (i15 | i16);
        J = i17 % 128;
        int i18 = i17 % 2;
        return this.detailsFieldBgColor;
    }

    @Nullable
    public final Integer component14() {
        int i10 = I;
        int i11 = i10 ^ 39;
        int i12 = (i10 & 39) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        J = i13 % 128;
        if (i13 % 2 != 0) {
            return this.detailsFieldTextColor;
        }
        throw null;
    }

    @Nullable
    public final Float component15() {
        int i10 = I;
        int i11 = i10 ^ 33;
        int i12 = ((i10 & 33) | i11) << 1;
        int i13 = -i11;
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        int i15 = i14 % 128;
        J = i15;
        int i16 = i14 % 2;
        int i17 = ((i15 | 107) << 1) - (((~i15) & 107) | (i15 & (-108)));
        I = i17 % 128;
        int i18 = i17 % 2;
        return this.detailsFieldTextSizeSp;
    }

    @Nullable
    public final Integer component16() {
        int i10 = J + 49;
        I = i10 % 128;
        if (i10 % 2 == 0) {
            return this.pinGridBgColor;
        }
        throw null;
    }

    @Nullable
    public final Integer component17() {
        int i10 = I;
        int i11 = (i10 & (-68)) | ((~i10) & 67);
        int i12 = -(-((i10 & 67) << 1));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        J = i14;
        if (i13 % 2 == 0) {
            throw null;
        }
        int i15 = (i14 & 47) + (i14 | 47);
        I = i15 % 128;
        int i16 = i15 % 2;
        return this.pinGridButtonTextColor;
    }

    @Nullable
    public final Integer component18() {
        int i10 = J;
        int i11 = (((i10 | 118) << 1) - (i10 ^ 118)) - 1;
        I = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        int i12 = ((i10 ^ 89) | (i10 & 89)) << 1;
        int i13 = -(((~i10) & 89) | (i10 & (-90)));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        I = i14 % 128;
        int i15 = i14 % 2;
        return this.pinGridButtonBgColor;
    }

    @Nullable
    public final Float component19() {
        int i10 = J;
        int i11 = (((i10 | 10) << 1) - (i10 ^ 10)) - 1;
        I = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        int i12 = ((-1) << 1) - ((-1) ^ (((i10 | 76) << 1) - (i10 ^ 76)));
        I = i12 % 128;
        int i13 = i12 % 2;
        Float f6 = this.pinGridButtonNumFontSizeSp;
        if (i13 != 0) {
            int i14 = 42 / 0;
        }
        return f6;
    }

    @Nullable
    public final Integer component2() {
        int i10 = I;
        int i11 = (i10 | 93) << 1;
        int i12 = -(i10 ^ 93);
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        J = i13 % 128;
        int i14 = i13 % 2;
        int i15 = i10 & 89;
        int i16 = (i10 ^ 89) | i15;
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        J = i17 % 128;
        int i18 = i17 % 2;
        Integer num = this.statusBarColor;
        if (i18 == 0) {
            int i19 = 94 / 0;
        }
        return num;
    }

    @Nullable
    public final Integer component20() {
        int i10 = J;
        int i11 = i10 & 25;
        int i12 = (i10 ^ 25) | i11;
        int i13 = (i11 & i12) + (i12 | i11);
        int i14 = i13 % 128;
        I = i14;
        if (i13 % 2 != 0) {
            throw null;
        }
        int i15 = i14 & 9;
        int i16 = -(-((i14 ^ 9) | i15));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        J = i17 % 128;
        int i18 = i17 % 2;
        return this.cancelButtonIconDrawableId;
    }

    @Nullable
    public final String component21() {
        int i10 = I;
        int i11 = i10 & 115;
        int i12 = i10 | 115;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        J = i13 % 128;
        int i14 = i13 % 2;
        int iIdentityHashCode = System.identityHashCode(this);
        int i15 = ~iIdentityHashCode;
        int i16 = ~i15;
        int i17 = 740660642 & i15;
        int i18 = (740660642 | i15) & (~i17);
        int i19 = -(-(((i18 & i17) | (i18 ^ i17)) * (-757)));
        int i20 = (((~i19) & (-54556536)) | (54556535 & i19)) + ((i19 & (-54556536)) << 1);
        int i21 = ~iIdentityHashCode;
        int i22 = (1878366114 & i21) | ((-1878366115) & iIdentityHashCode);
        int i23 = 1878366114 & iIdentityHashCode;
        int i24 = (~((i23 & i22) | (i22 ^ i23))) * 1514;
        int i25 = (i20 ^ i24) + ((i20 & i24) << 1);
        int i26 = (i16 & 1137776258) | ((-1137776259) & i15);
        int i27 = i15 & 1137776258;
        int i28 = ~((i27 & i26) | (i26 ^ i27));
        int i29 = 740589856 & i28;
        int i30 = (i28 | 740589856) & (~i29);
        int i31 = (i30 & i29) | (i30 ^ i29);
        int i32 = ~((iIdentityHashCode & (-1137705473)) | (i21 & (-1137705473)) | (1137705472 & iIdentityHashCode));
        int i33 = i31 & i32;
        int i34 = (i32 | i31) & (~i33);
        int i35 = ((-1) << 1) - ((i25 - (~(((i34 & i33) | (i34 ^ i33)) * 757))) ^ (-1));
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i36 = ~iIdentityHashCode2;
        int i37 = (-1380496013) & i36;
        int i38 = (~i37) & ((-1380496013) | i36);
        int i39 = ~((i37 & i38) | (i38 ^ i37));
        int i40 = (~iIdentityHashCode2) & (i36 | iIdentityHashCode2);
        int i41 = ~((i40 & 91773864) | ((~i40) & 91773864) | (i40 & (-91773865)));
        int i42 = i39 & i41;
        int i43 = (((i39 | i41) & (~i42)) | i42) * (-867);
        int i44 = 1919326636 & i43;
        int i45 = ((i43 | 1919326636) & (~i44)) + (i44 << 1);
        int i46 = ((-1380496013) & i36) | (1380496012 & iIdentityHashCode2);
        int i47 = (-1380496013) & iIdentityHashCode2;
        int i48 = ~((i47 & i46) | (i46 ^ i47));
        int i49 = 1375772676 ^ i48;
        int i50 = i48 & 1375772676;
        int i51 = (i50 & i49) | (i49 ^ i50);
        int i52 = (91773864 & i36) | (iIdentityHashCode2 & (-91773865));
        int i53 = 91773864 & iIdentityHashCode2;
        int i54 = (i52 & i53) | (i52 ^ i53);
        int i55 = (i54 | (~i54)) & (~i54);
        int i56 = i51 & i55;
        int i57 = ((((i51 | i55) & (~i56)) | i56) * (-1734)) + i45;
        int i58 = (-1375772677) & i36;
        int i59 = (i36 | (-1375772677)) & (~i58);
        int i60 = (i59 & i58) | (i59 ^ i58);
        int i61 = (i60 | (~i60)) & (~i60);
        int i62 = (-4723337) & iIdentityHashCode2;
        int i63 = ((-4723337) | iIdentityHashCode2) & (~i62);
        int i64 = ~((i63 & i62) | (i63 ^ i62));
        int i65 = ((~i64) & i61) | ((~i61) & i64);
        int i66 = i61 & i64;
        int i67 = (i66 & i65) | (i65 ^ i66);
        int i68 = 1467546540 ^ iIdentityHashCode2;
        int i69 = iIdentityHashCode2 & 1467546540;
        int i70 = ~((i69 & i68) | (i68 ^ i69));
        int i71 = i67 ^ i70;
        int i72 = i70 & i67;
        if (i35 <= (i57 - (~(-(-(((i72 & i71) | (i71 ^ i72)) * 867))))) - 1) {
            return this.cancelButtonText;
        }
        throw null;
    }

    @Nullable
    public final Integer component22() {
        int i10 = J;
        int i11 = (i10 & (-48)) | ((~i10) & 47);
        int i12 = -(-((i10 & 47) << 1));
        int i13 = (i11 & i12) + (i11 | i12);
        I = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        int i14 = i10 ^ 81;
        int i15 = ((i10 & 81) | i14) << 1;
        int i16 = -i14;
        int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
        I = i17 % 128;
        int i18 = i17 % 2;
        return this.clearButtonIconDrawableId;
    }

    @Nullable
    public final String component23() {
        int i10 = J;
        int i11 = i10 + 45;
        I = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 & 11;
        int i14 = ((((i10 ^ 11) | i13) << 1) - (~(-((i10 | 11) & (~i13))))) - 1;
        I = i14 % 128;
        int i15 = i14 % 2;
        return this.clearButtonText;
    }

    @Nullable
    public final Integer component24() {
        int i10 = I;
        int i11 = i10 | 77;
        int i12 = i11 << 1;
        int i13 = -((~(i10 & 77)) & i11);
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        J = i14 % 128;
        if (i14 % 2 != 0) {
            return this.enterButtonIconDrawableId;
        }
        throw null;
    }

    @Nullable
    public final String component25() {
        int i10 = J;
        int i11 = ((i10 ^ 121) - (~(-(-((i10 & 121) << 1))))) - 1;
        I = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        System.identityHashCode(this);
        System.identityHashCode(this);
        return this.enterButtonText;
    }

    @Nullable
    public final Integer component26() {
        int i10 = I;
        int i11 = i10 & 119;
        int i12 = (i10 ^ 119) | i11;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        J = i14;
        int i15 = i13 % 2;
        int i16 = i14 & 113;
        int i17 = (((i14 ^ 113) | i16) << 1) - ((i14 | 113) & (~i16));
        I = i17 % 128;
        int i18 = i17 % 2;
        return this.dynamicButtonBackgroundColor;
    }

    @Nullable
    public final Integer component27() {
        int i10 = J;
        int i11 = i10 & 39;
        int i12 = (i10 | 39) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 & i13) + (i12 | i13);
        I = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 74 / 0;
        }
        return this.dynamicButtonTextColor;
    }

    @Nullable
    public final Float component28() {
        int i10 = I;
        int i11 = i10 & 107;
        int i12 = i11 + ((i10 ^ 107) | i11);
        J = i12 % 128;
        if (i12 % 2 != 0) {
            return this.dynamicButtonTextSizeSp;
        }
        throw null;
    }

    @Nullable
    public final Integer component29() {
        int i10 = J;
        int i11 = (i10 ^ 29) + ((i10 & 29) << 1);
        int i12 = i11 % 128;
        I = i12;
        int i13 = i11 % 2;
        int i14 = i12 + 81;
        J = i14 % 128;
        int i15 = i14 % 2;
        return this.dynamicButtonIconTextSpacingDp;
    }

    @Nullable
    public final Integer component3() {
        int i10 = J;
        int i11 = i10 + 91;
        I = i11 % 128;
        int i12 = i11 % 2;
        int i13 = (i10 & 76) + (i10 | 76);
        int i14 = (i13 ^ (-1)) + (i13 << 1);
        I = i14 % 128;
        if (i14 % 2 == 0) {
            return this.generalBgColor;
        }
        throw null;
    }

    @Nullable
    public final String component30() {
        int i10 = J;
        int i11 = ((i10 & 98) + (i10 | 98)) - 1;
        I = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 & 9;
        int i14 = (i13 - (~(-(-((i10 ^ 9) | i13))))) - 1;
        I = i14 % 128;
        int i15 = i14 % 2;
        return this.tooFewDigitsMessage;
    }

    @Nullable
    public final Integer component31() {
        int i10 = J;
        int i11 = i10 + 25;
        I = i11 % 128;
        int i12 = i11 % 2;
        int i13 = (i10 & (-36)) | ((~i10) & 35);
        int i14 = (i10 & 35) << 1;
        int i15 = (i13 & i14) + (i14 | i13);
        I = i15 % 128;
        if (i15 % 2 == 0) {
            return this.progressBarColor;
        }
        throw null;
    }

    public final boolean component32() {
        int i10 = J;
        int i11 = i10 & 25;
        int i12 = -(-((i10 ^ 25) | i11));
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        I = i13 % 128;
        int i14 = i13 % 2;
        int i15 = (i10 & (-74)) | ((~i10) & 73);
        int i16 = -(-((i10 & 73) << 1));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        I = i17 % 128;
        int i18 = i17 % 2;
        boolean z10 = this.immersiveMode;
        if (i18 != 0) {
            int i19 = 31 / 0;
        }
        return z10;
    }

    @Nullable
    public final String component33() {
        System.identityHashCode(this);
        System.identityHashCode(this);
        System.identityHashCode(this);
        System.identityHashCode(this);
        return this.revealSystemBarToastMessage;
    }

    @Nullable
    public final PinViewports component34() {
        int i10 = J;
        int i11 = (i10 ^ 29) + ((i10 & 29) << 1);
        int i12 = i11 % 128;
        I = i12;
        int i13 = i11 % 2;
        int i14 = i12 & 43;
        int i15 = -(-((i12 ^ 43) | i14));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        J = i16 % 128;
        int i17 = i16 % 2;
        return this.pinViewports;
    }

    @Nullable
    public final Integer component4() {
        int i10 = J;
        int i11 = (((i10 & (-26)) | ((~i10) & 25)) - (~((i10 & 25) << 1))) - 1;
        I = i11 % 128;
        if (i11 % 2 == 0) {
            return this.navBarBgColor;
        }
        throw null;
    }

    @Nullable
    public final String component5() {
        int i10 = I;
        int i11 = i10 + 107;
        J = i11 % 128;
        int i12 = i11 % 2;
        int i13 = ((i10 ^ 113) | (i10 & 113)) << 1;
        int i14 = -(((~i10) & 113) | (i10 & (-114)));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        J = i15 % 128;
        int i16 = i15 % 2;
        return this.navBarTitleString;
    }

    @Nullable
    public final Integer component6() {
        int i10 = J;
        int i11 = ((i10 ^ 7) | (i10 & 7)) << 1;
        int i12 = -(((~i10) & 7) | (i10 & (-8)));
        int i13 = (i11 & i12) + (i12 | i11);
        I = i13 % 128;
        if (i13 % 2 == 0) {
            return this.navBarTextColor;
        }
        throw null;
    }

    @Nullable
    public final Float component7() {
        int i10 = I;
        int i11 = i10 & 115;
        int i12 = (i10 | 115) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        int i15 = i14 % 128;
        J = i15;
        if (i14 % 2 == 0) {
            int i16 = 60 / 0;
        }
        int i17 = i15 & 33;
        int i18 = (i15 ^ 33) | i17;
        int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
        I = i19 % 128;
        int i20 = i19 % 2;
        Float f6 = this.navBarTextSizeSp;
        if (i20 != 0) {
            int i21 = 80 / 0;
        }
        return f6;
    }

    @Nullable
    public final Integer component8() {
        int i10 = J;
        int i11 = i10 & 17;
        int i12 = (i10 ^ 17) | i11;
        int i13 = (i11 & i12) + (i12 | i11);
        int i14 = i13 % 128;
        I = i14;
        int i15 = i13 % 2;
        int i16 = i14 + 85;
        J = i16 % 128;
        if (i16 % 2 != 0) {
            return this.pinDigitTintColor;
        }
        throw null;
    }

    @Nullable
    public final Integer component9() {
        int i10 = J;
        int i11 = ((i10 ^ 16) + ((i10 & 16) << 1)) - 1;
        int i12 = i11 % 128;
        I = i12;
        int i13 = i11 % 2;
        int i14 = i12 + 25;
        J = i14 % 128;
        if (i14 % 2 != 0) {
            return this.pinDigitBgColor;
        }
        throw null;
    }

    @NotNull
    public final PinPadConfiguration copy(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer statusBarColor, @ColorInt @Nullable Integer generalBgColor, @ColorInt @Nullable Integer navBarBgColor, @Nullable String navBarTitleString, @ColorInt @Nullable Integer navBarTextColor, @Nullable Float navBarTextSizeSp, @ColorInt @Nullable Integer pinDigitTintColor, @ColorInt @Nullable Integer pinDigitBgColor, @ColorInt @Nullable Integer amountFieldBgColor, @ColorInt @Nullable Integer amountFieldTextColor, @Nullable Float amountFieldTextSizeSp, @ColorInt @Nullable Integer detailsFieldBgColor, @ColorInt @Nullable Integer detailsFieldTextColor, @Nullable Float detailsFieldTextSizeSp, @ColorInt @Nullable Integer pinGridBgColor, @ColorInt @Nullable Integer pinGridButtonTextColor, @ColorInt @Nullable Integer pinGridButtonBgColor, @Nullable Float pinGridButtonNumFontSizeSp, @DrawableRes @Nullable Integer cancelButtonIconDrawableId, @Nullable String cancelButtonText, @DrawableRes @Nullable Integer clearButtonIconDrawableId, @Nullable String clearButtonText, @DrawableRes @Nullable Integer enterButtonIconDrawableId, @Nullable String enterButtonText, @ColorInt @Nullable Integer dynamicButtonBackgroundColor, @ColorInt @Nullable Integer dynamicButtonTextColor, @Nullable Float dynamicButtonTextSizeSp, @Nullable Integer dynamicButtonIconTextSpacingDp, @Nullable String tooFewDigitsMessage, @ColorInt @Nullable Integer progressBarColor, boolean immersiveMode, @Nullable String revealSystemBarToastMessage, @Nullable PinViewports pinViewports) {
        Intrinsics.checkNotNullParameter(pinPadType, "");
        PinPadConfiguration pinPadConfiguration = new PinPadConfiguration(pinPadType, statusBarColor, generalBgColor, navBarBgColor, navBarTitleString, navBarTextColor, navBarTextSizeSp, pinDigitTintColor, pinDigitBgColor, amountFieldBgColor, amountFieldTextColor, amountFieldTextSizeSp, detailsFieldBgColor, detailsFieldTextColor, detailsFieldTextSizeSp, pinGridBgColor, pinGridButtonTextColor, pinGridButtonBgColor, pinGridButtonNumFontSizeSp, cancelButtonIconDrawableId, cancelButtonText, clearButtonIconDrawableId, clearButtonText, enterButtonIconDrawableId, enterButtonText, dynamicButtonBackgroundColor, dynamicButtonTextColor, dynamicButtonTextSizeSp, dynamicButtonIconTextSpacingDp, tooFewDigitsMessage, progressBarColor, immersiveMode, revealSystemBarToastMessage, pinViewports);
        int i10 = I;
        int i11 = i10 & 69;
        int i12 = (i11 - (~(-(-((i10 ^ 69) | i11))))) - 1;
        J = i12 % 128;
        if (i12 % 2 != 0) {
            return pinPadConfiguration;
        }
        throw null;
    }

    public final boolean equals(@Nullable Object other) {
        int i10 = J;
        int i11 = (((i10 | 124) << 1) - (i10 ^ 124)) - 1;
        int i12 = i11 % 128;
        I = i12;
        int i13 = i11 % 2;
        if (this == other) {
            int i14 = i12 & 89;
            int i15 = -(-((i12 ^ 89) | i14));
            int i16 = (i14 & i15) + (i14 | i15);
            J = i16 % 128;
            int i17 = i16 % 2;
            int i18 = ((i12 | 39) << 1) - (i12 ^ 39);
            J = i18 % 128;
            int i19 = i18 % 2;
            return true;
        }
        if (!(other instanceof PinPadConfiguration)) {
            int i20 = (i12 & (-30)) | ((~i12) & 29);
            int i21 = -(-((i12 & 29) << 1));
            int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
            int i23 = i22 % 128;
            J = i23;
            int i24 = i22 % 2;
            int i25 = i23 + 7;
            I = i25 % 128;
            if (i25 % 2 == 0) {
                return false;
            }
            throw null;
        }
        PinPadConfiguration pinPadConfiguration = (PinPadConfiguration) other;
        if (this.pinPadType != pinPadConfiguration.pinPadType) {
            int i26 = i12 + 27;
            int i27 = i26 % 128;
            J = i27;
            int i28 = i26 % 2;
            int i29 = i27 + 68;
            int i30 = (i29 ^ (-1)) + (i29 << 1);
            I = i30 % 128;
            if (i30 % 2 != 0) {
                int i31 = 86 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.statusBarColor, pinPadConfiguration.statusBarColor)) {
            int i32 = I;
            int i33 = ((i32 & 19) - (~(i32 | 19))) - 1;
            J = i33 % 128;
            int i34 = i33 % 2;
            int i35 = i32 & 119;
            int i36 = ((i32 ^ 119) | i35) << 1;
            int i37 = -((i32 | 119) & (~i35));
            int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
            J = i38 % 128;
            if (i38 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.generalBgColor, pinPadConfiguration.generalBgColor)) {
            int i39 = J;
            int i40 = (i39 & (-30)) | ((~i39) & 29);
            int i41 = -(-((i39 & 29) << 1));
            int i42 = (i40 & i41) + (i41 | i40);
            I = i42 % 128;
            int i43 = i42 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.navBarBgColor, pinPadConfiguration.navBarBgColor)) {
            int i44 = J;
            int i45 = i44 | 79;
            int i46 = i45 << 1;
            int i47 = -((~(i44 & 79)) & i45);
            int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
            I = i48 % 128;
            int i49 = i48 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.navBarTitleString, pinPadConfiguration.navBarTitleString)) {
            int i50 = J;
            int i51 = (i50 ^ 37) + ((i50 & 37) << 1);
            int i52 = i51 % 128;
            I = i52;
            int i53 = i51 % 2;
            int i54 = i52 & 77;
            int i55 = (i54 - (~((i52 ^ 77) | i54))) - 1;
            J = i55 % 128;
            if (i55 % 2 == 0) {
                int i56 = 42 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.navBarTextColor, pinPadConfiguration.navBarTextColor)) {
            int i57 = I;
            int i58 = (i57 & 67) + (i57 | 67);
            J = i58 % 128;
            int i59 = i58 % 2;
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.navBarTextSizeSp, (Object) pinPadConfiguration.navBarTextSizeSp)) {
            int i60 = I + 85;
            J = i60 % 128;
            return i60 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.pinDigitTintColor, pinPadConfiguration.pinDigitTintColor)) {
            int i61 = J;
            int i62 = i61 & 23;
            int i63 = (i62 - (~((i61 ^ 23) | i62))) - 1;
            I = i63 % 128;
            int i64 = i63 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.pinDigitBgColor, pinPadConfiguration.pinDigitBgColor)) {
            int i65 = I;
            int i66 = (i65 | 119) << 1;
            int i67 = -(((~i65) & 119) | (i65 & (-120)));
            int i68 = ((i66 | i67) << 1) - (i67 ^ i66);
            J = i68 % 128;
            int i69 = i68 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.amountFieldBgColor, pinPadConfiguration.amountFieldBgColor)) {
            int i70 = I;
            int i71 = i70 & 83;
            int i72 = (i70 ^ 83) | i71;
            int i73 = (i71 & i72) + (i72 | i71);
            J = i73 % 128;
            int i74 = i73 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.amountFieldTextColor, pinPadConfiguration.amountFieldTextColor)) {
            int i75 = I;
            int i76 = ((-1) << 1) - (((i75 ^ 34) + ((i75 & 34) << 1)) ^ (-1));
            J = i76 % 128;
            int i77 = i76 % 2;
            int i78 = ((i75 & 84) + (i75 | 84)) - 1;
            J = i78 % 128;
            int i79 = i78 % 2;
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.amountFieldTextSizeSp, (Object) pinPadConfiguration.amountFieldTextSizeSp)) {
            int i80 = I;
            int i81 = i80 | 79;
            int i82 = i81 << 1;
            int i83 = -((~(i80 & 79)) & i81);
            int i84 = ((i82 | i83) << 1) - (i83 ^ i82);
            int i85 = i84 % 128;
            J = i85;
            int i86 = i84 % 2;
            int i87 = i85 + 113;
            I = i87 % 128;
            int i88 = i87 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.detailsFieldBgColor, pinPadConfiguration.detailsFieldBgColor)) {
            int i89 = J;
            int i90 = i89 & 11;
            int i91 = ((i89 ^ 11) | i90) << 1;
            int i92 = -((i89 | 11) & (~i90));
            int i93 = ((i91 | i92) << 1) - (i92 ^ i91);
            I = i93 % 128;
            return i93 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.detailsFieldTextColor, pinPadConfiguration.detailsFieldTextColor)) {
            int i94 = J;
            int i95 = i94 | 119;
            int i96 = ((i95 << 1) - (~(-((~(i94 & 119)) & i95)))) - 1;
            I = i96 % 128;
            int i97 = i96 % 2;
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.detailsFieldTextSizeSp, (Object) pinPadConfiguration.detailsFieldTextSizeSp)) {
            int i98 = I;
            int i99 = ((((i98 ^ 43) | (i98 & 43)) << 1) - (~(-(((~i98) & 43) | (i98 & (-44)))))) - 1;
            J = i99 % 128;
            int i100 = i99 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.pinGridBgColor, pinPadConfiguration.pinGridBgColor)) {
            int i101 = I + 13;
            J = i101 % 128;
            int i102 = i101 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.pinGridButtonTextColor, pinPadConfiguration.pinGridButtonTextColor)) {
            int i103 = I;
            int i104 = ((-1) << 1) - ((i103 + 54) ^ (-1));
            J = i104 % 128;
            int i105 = i104 % 2;
            int i106 = (i103 ^ 73) + ((i103 & 73) << 1);
            J = i106 % 128;
            int i107 = i106 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.pinGridButtonBgColor, pinPadConfiguration.pinGridButtonBgColor)) {
            int i108 = J;
            int i109 = ((i108 | 8) << 1) - (i108 ^ 8);
            int i110 = (i109 ^ (-1)) + (i109 << 1);
            I = i110 % 128;
            int i111 = i110 % 2;
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.pinGridButtonNumFontSizeSp, (Object) pinPadConfiguration.pinGridButtonNumFontSizeSp)) {
            int i112 = J;
            int i113 = i112 & 87;
            int i114 = (i112 | 87) & (~i113);
            int i115 = -(-(i113 << 1));
            int i116 = (i114 ^ i115) + ((i114 & i115) << 1);
            I = i116 % 128;
            int i117 = i116 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.cancelButtonIconDrawableId, pinPadConfiguration.cancelButtonIconDrawableId)) {
            int i118 = J;
            int i119 = i118 ^ 59;
            int i120 = ((((i118 & 59) | i119) << 1) - (~(-i119))) - 1;
            I = i120 % 128;
            int i121 = i120 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.cancelButtonText, pinPadConfiguration.cancelButtonText)) {
            int i122 = J;
            int i123 = (i122 & 19) + (i122 | 19);
            I = i123 % 128;
            boolean z10 = i123 % 2 != 0;
            int i124 = ((i122 & 70) + (i122 | 70)) - 1;
            I = i124 % 128;
            if (i124 % 2 == 0) {
                return z10;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.clearButtonIconDrawableId, pinPadConfiguration.clearButtonIconDrawableId)) {
            int i125 = I;
            int i126 = (i125 & 75) + (i125 | 75);
            int i127 = i126 % 128;
            J = i127;
            int i128 = i126 % 2;
            int i129 = i127 + 73;
            I = i129 % 128;
            if (i129 % 2 != 0) {
                int i130 = 58 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.clearButtonText, pinPadConfiguration.clearButtonText)) {
            int i131 = J;
            int i132 = (i131 ^ 116) + ((i131 & 116) << 1);
            int i133 = (i132 ^ (-1)) + (i132 << 1);
            I = i133 % 128;
            int i134 = i133 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.enterButtonIconDrawableId, pinPadConfiguration.enterButtonIconDrawableId)) {
            int i135 = J;
            int i136 = (i135 ^ 1) + ((i135 & 1) << 1);
            I = i136 % 128;
            return i136 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.enterButtonText, pinPadConfiguration.enterButtonText)) {
            int i137 = I;
            int i138 = (i137 & (-30)) | ((~i137) & 29);
            int i139 = (i137 & 29) << 1;
            int i140 = (i138 ^ i139) + ((i139 & i138) << 1);
            J = i140 % 128;
            int i141 = i140 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.dynamicButtonBackgroundColor, pinPadConfiguration.dynamicButtonBackgroundColor)) {
            int i142 = J;
            int i143 = (i142 | 81) << 1;
            int i144 = -(((~i142) & 81) | (i142 & (-82)));
            int i145 = (i143 & i144) + (i144 | i143);
            I = i145 % 128;
            return i145 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.dynamicButtonTextColor, pinPadConfiguration.dynamicButtonTextColor)) {
            int i146 = J + 113;
            I = i146 % 128;
            int i147 = i146 % 2;
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.dynamicButtonTextSizeSp, (Object) pinPadConfiguration.dynamicButtonTextSizeSp)) {
            int i148 = J;
            int i149 = ((i148 & 82) + (i148 | 82)) - 1;
            I = i149 % 128;
            int i150 = i149 % 2;
            int i151 = (i148 | 85) << 1;
            int i152 = -(i148 ^ 85);
            int i153 = ((i151 | i152) << 1) - (i152 ^ i151);
            I = i153 % 128;
            if (i153 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.dynamicButtonIconTextSpacingDp, pinPadConfiguration.dynamicButtonIconTextSpacingDp)) {
            int i154 = I;
            int i155 = (i154 ^ 113) + ((i154 & 113) << 1);
            J = i155 % 128;
            boolean z11 = i155 % 2 == 0;
            int i156 = i154 + 87;
            J = i156 % 128;
            if (i156 % 2 != 0) {
                return z11;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.tooFewDigitsMessage, pinPadConfiguration.tooFewDigitsMessage)) {
            int i157 = J;
            int i158 = ((i157 | 16) << 1) - (i157 ^ 16);
            int i159 = (i158 ^ (-1)) + (i158 << 1);
            int i160 = i159 % 128;
            I = i160;
            int i161 = i159 % 2;
            int i162 = (i160 & 15) + (i160 | 15);
            J = i162 % 128;
            if (i162 % 2 == 0) {
                int i163 = 36 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.progressBarColor, pinPadConfiguration.progressBarColor)) {
            int i164 = J;
            int i165 = ((-1) << 1) - (((i164 & 102) + (i164 | 102)) ^ (-1));
            I = i165 % 128;
            int i166 = i165 % 2;
            return false;
        }
        if (this.immersiveMode != pinPadConfiguration.immersiveMode) {
            int i167 = J;
            int i168 = ((i167 | 18) << 1) - (i167 ^ 18);
            int i169 = (i168 ^ (-1)) + (i168 << 1);
            I = i169 % 128;
            int i170 = i169 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.revealSystemBarToastMessage, pinPadConfiguration.revealSystemBarToastMessage)) {
            int i171 = I + 17;
            J = i171 % 128;
            int i172 = i171 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.pinViewports, pinPadConfiguration.pinViewports))) {
            return true;
        }
        int i173 = I;
        int i174 = ((-1) << 1) - ((((i173 | 90) << 1) - (i173 ^ 90)) ^ (-1));
        J = i174 % 128;
        return i174 % 2 == 0;
    }

    @JvmName(name = "getAmountFieldBgColor")
    @Nullable
    public final Integer getAmountFieldBgColor() {
        int i10 = I;
        int i11 = i10 & 105;
        int i12 = ((i10 ^ 105) | i11) << 1;
        int i13 = -((~i11) & (i10 | 105));
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        J = i14 % 128;
        int i15 = i14 % 2;
        int i16 = i10 & 87;
        int i17 = (i16 - (~(-(-((i10 ^ 87) | i16))))) - 1;
        J = i17 % 128;
        int i18 = i17 % 2;
        return this.amountFieldBgColor;
    }

    @JvmName(name = "getAmountFieldTextColor")
    @Nullable
    public final Integer getAmountFieldTextColor() {
        int i10 = J;
        int i11 = ((((i10 ^ 67) | (i10 & 67)) << 1) - (~(-(((~i10) & 67) | (i10 & (-68)))))) - 1;
        I = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 79 / 0;
        }
        return this.amountFieldTextColor;
    }

    @JvmName(name = "getAmountFieldTextSizeSp")
    @Nullable
    public final Float getAmountFieldTextSizeSp() {
        int i10 = J;
        int i11 = i10 & 43;
        int i12 = ((i10 | 43) & (~i11)) + (i11 << 1);
        int i13 = i12 % 128;
        I = i13;
        if (i12 % 2 != 0) {
            throw null;
        }
        int i14 = (i13 ^ 33) + ((i13 & 33) << 1);
        J = i14 % 128;
        int i15 = i14 % 2;
        return this.amountFieldTextSizeSp;
    }

    @JvmName(name = "getCancelButtonIconDrawableId")
    @Nullable
    public final Integer getCancelButtonIconDrawableId() {
        int i10 = I;
        int i11 = (((i10 | 120) << 1) - (i10 ^ 120)) - 1;
        J = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 65 / 0;
        }
        int i13 = i10 & 47;
        int i14 = i13 + ((i10 ^ 47) | i13);
        J = i14 % 128;
        int i15 = i14 % 2;
        Integer num = this.cancelButtonIconDrawableId;
        if (i15 == 0) {
            int i16 = 8 / 0;
        }
        return num;
    }

    @JvmName(name = "getCancelButtonText")
    @Nullable
    public final String getCancelButtonText() {
        int i10 = I;
        int i11 = ((i10 & (-22)) | ((~i10) & 21)) + ((i10 & 21) << 1);
        J = i11 % 128;
        if (i11 % 2 != 0) {
            return this.cancelButtonText;
        }
        throw null;
    }

    @JvmName(name = "getClearButtonIconDrawableId")
    @Nullable
    public final Integer getClearButtonIconDrawableId() {
        int i10 = J;
        int i11 = i10 + 108;
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        I = i12 % 128;
        int i13 = i12 % 2;
        int i14 = i10 & 91;
        int i15 = (i10 | 91) & (~i14);
        int i16 = i14 << 1;
        int i17 = (i15 & i16) + (i15 | i16);
        I = i17 % 128;
        int i18 = i17 % 2;
        return this.clearButtonIconDrawableId;
    }

    @JvmName(name = "getClearButtonText")
    @Nullable
    public final String getClearButtonText() {
        int i10 = I;
        int i11 = (((i10 | 58) << 1) - (i10 ^ 58)) - 1;
        J = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 & 79;
        int i14 = -(-(i10 | 79));
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        J = i15 % 128;
        int i16 = i15 % 2;
        return this.clearButtonText;
    }

    @JvmName(name = "getDetailsFieldBgColor")
    @Nullable
    public final Integer getDetailsFieldBgColor() {
        int i10 = J;
        int i11 = ((i10 & (-102)) | ((~i10) & 101)) + ((i10 & 101) << 1);
        I = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 51 / 0;
        }
        int i13 = i10 & 43;
        int i14 = (i10 | 43) & (~i13);
        int i15 = i13 << 1;
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        I = i16 % 128;
        int i17 = i16 % 2;
        Integer num = this.detailsFieldBgColor;
        if (i17 != 0) {
            int i18 = 25 / 0;
        }
        return num;
    }

    @JvmName(name = "getDetailsFieldTextColor")
    @Nullable
    public final Integer getDetailsFieldTextColor() {
        int i10 = I;
        int i11 = i10 & 89;
        int i12 = (i11 - (~(-(-((i10 ^ 89) | i11))))) - 1;
        J = i12 % 128;
        int i13 = i12 % 2;
        int i14 = i10 + 47;
        J = i14 % 128;
        int i15 = i14 % 2;
        return this.detailsFieldTextColor;
    }

    @JvmName(name = "getDetailsFieldTextSizeSp")
    @Nullable
    public final Float getDetailsFieldTextSizeSp() {
        int i10 = I;
        int i11 = i10 & 63;
        int i12 = -(-((i10 ^ 63) | i11));
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        J = i13 % 128;
        int i14 = i13 % 2;
        int i15 = ((-1) << 1) - ((-1) ^ ((i10 ^ 48) + ((i10 & 48) << 1)));
        J = i15 % 128;
        int i16 = i15 % 2;
        return this.detailsFieldTextSizeSp;
    }

    @JvmName(name = "getDynamicButtonBackgroundColor")
    @Nullable
    public final Integer getDynamicButtonBackgroundColor() {
        int i10 = J + 93;
        I = i10 % 128;
        if (i10 % 2 == 0) {
            return this.dynamicButtonBackgroundColor;
        }
        throw null;
    }

    @JvmName(name = "getDynamicButtonIconTextSpacingDp")
    @Nullable
    public final Integer getDynamicButtonIconTextSpacingDp() {
        int i10 = J;
        int i11 = (i10 & (-48)) | ((~i10) & 47);
        int i12 = -(-((i10 & 47) << 1));
        int i13 = (i11 & i12) + (i11 | i12);
        I = i13 % 128;
        int i14 = i13 % 2;
        int i15 = ((i10 | 5) << 1) - (i10 ^ 5);
        I = i15 % 128;
        int i16 = i15 % 2;
        return this.dynamicButtonIconTextSpacingDp;
    }

    @JvmName(name = "getDynamicButtonTextColor")
    @Nullable
    public final Integer getDynamicButtonTextColor() {
        int i10 = I;
        int i11 = i10 ^ 109;
        int i12 = (i10 & 109) << 1;
        int i13 = (i11 & i12) + (i12 | i11);
        int i14 = i13 % 128;
        J = i14;
        int i15 = i13 % 2;
        int i16 = (i14 ^ 37) + ((i14 & 37) << 1);
        I = i16 % 128;
        int i17 = i16 % 2;
        Integer num = this.dynamicButtonTextColor;
        if (i17 != 0) {
            int i18 = 11 / 0;
        }
        return num;
    }

    @JvmName(name = "getDynamicButtonTextSizeSp")
    @Nullable
    public final Float getDynamicButtonTextSizeSp() {
        int i10 = I;
        int i11 = i10 & 65;
        int i12 = (((i10 ^ 65) | i11) << 1) - ((~i11) & (i10 | 65));
        J = i12 % 128;
        int i13 = i12 % 2;
        int i14 = ((i10 | 93) << 1) - (i10 ^ 93);
        J = i14 % 128;
        int i15 = i14 % 2;
        return this.dynamicButtonTextSizeSp;
    }

    @JvmName(name = "getEnterButtonIconDrawableId")
    @Nullable
    public final Integer getEnterButtonIconDrawableId() {
        int i10 = I;
        int i11 = i10 + 99;
        J = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 26;
        int i14 = (i13 ^ (-1)) + (i13 << 1);
        J = i14 % 128;
        if (i14 % 2 != 0) {
            return this.enterButtonIconDrawableId;
        }
        throw null;
    }

    @JvmName(name = "getEnterButtonText")
    @Nullable
    public final String getEnterButtonText() {
        int i10 = I;
        int i11 = (i10 & (-114)) | ((~i10) & 113);
        int i12 = (i10 & 113) << 1;
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        J = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 14 / 0;
        }
        int i15 = ((i10 ^ 79) | (i10 & 79)) << 1;
        int i16 = -(((~i10) & 79) | (i10 & (-80)));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        J = i17 % 128;
        if (i17 % 2 != 0) {
            return this.enterButtonText;
        }
        throw null;
    }

    @JvmName(name = "getGeneralBgColor")
    @Nullable
    public final Integer getGeneralBgColor() {
        int i10 = J;
        int i11 = i10 ^ 5;
        int i12 = -(-((i10 & 5) << 1));
        int i13 = (i11 & i12) + (i11 | i12);
        I = i13 % 128;
        int i14 = i13 % 2;
        int i15 = i10 + 15;
        I = i15 % 128;
        int i16 = i15 % 2;
        return this.generalBgColor;
    }

    @JvmName(name = "getImmersiveMode")
    public final boolean getImmersiveMode() {
        int i10 = J;
        int i11 = (i10 & 45) + (i10 | 45);
        I = i11 % 128;
        int i12 = i11 % 2;
        int iIdentityHashCode = System.identityHashCode(this);
        int i13 = ((iIdentityHashCode ^ (-1040089070)) | (iIdentityHashCode & (-1040089070))) * 988;
        int i14 = (-1300549140) & i13;
        int i15 = (i14 - (~(-(-((i13 ^ (-1300549140)) | i14))))) - 1;
        int i16 = ~iIdentityHashCode;
        int i17 = ~((i16 & (-342756709)) | (i16 ^ (-342756709)));
        int i18 = -(-(((i17 & 6554884) | (6554884 ^ i17)) * (-1976)));
        int i19 = ((i15 & i18) - (~(i18 | i15))) - 1;
        int i20 = (-703887246) ^ iIdentityHashCode;
        int i21 = (-703887246) & iIdentityHashCode;
        int i22 = ~((i21 & i20) | (i20 ^ i21));
        int i23 = ((~i22) & (-1040089070)) | (1040089069 & i22);
        int i24 = (-1040089070) & i22;
        int i25 = (i24 & i23) | (i23 ^ i24);
        int i26 = ~iIdentityHashCode;
        int i27 = i26 & 703887245;
        int i28 = (i26 | 703887245) & (~i27);
        int i29 = ~((i28 & i27) | (i28 ^ i27));
        int i30 = ((i29 & i25) | ((~i29) & i25) | ((~i25) & i29)) * 988;
        int i31 = i19 & i30;
        int i32 = (i31 - (~((i30 ^ i19) | i31))) - 1;
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i33 = ~iIdentityHashCode2;
        int i34 = ~(((-1343444666) ^ i33) | ((-1343444666) & i33));
        int i35 = ((~i34) & 1074872360) | ((-1074872361) & i34);
        int i36 = i34 & 1074872360;
        int i37 = (i36 & i35) | (i35 ^ i36);
        int i38 = (-192979201) ^ iIdentityHashCode2;
        int i39 = (-192979201) & iIdentityHashCode2;
        int i40 = (i38 & i39) | (i38 ^ i39);
        int i41 = (i40 | (~i40)) & (~i40);
        int i42 = ((~i41) & i37) | ((~i37) & i41);
        int i43 = i37 & i41;
        int i44 = ((i43 & i42) | (i42 ^ i43)) * (-252);
        int i45 = (((-219330165) | i44) << 1) - (i44 ^ (-219330165));
        int i46 = (((i45 | 1386118397) << 1) - (1386118397 ^ i45)) - 1;
        int i47 = (-1343444666) ^ i33;
        int i48 = i33 & (-1343444666);
        int i49 = (i48 & i47) | (i47 ^ i48);
        int i50 = i49 & (-461551506);
        int i51 = ~(((i49 | (-461551506)) & (~i50)) | i50);
        int i52 = (iIdentityHashCode2 & (-192979201)) | ((-192979201) ^ iIdentityHashCode2);
        int i53 = (i52 | (~i52)) & (~i52);
        int i54 = i51 ^ i53;
        int i55 = i53 & i51;
        int i56 = ((i55 & i54) | (i54 ^ i55)) * 252;
        int i57 = i46 & i56;
        int i58 = (i56 ^ i46) | i57;
        if (i32 <= ((i57 | i58) << 1) - (i58 ^ i57)) {
            return this.immersiveMode;
        }
        throw null;
    }

    @JvmName(name = "getNavBarBgColor")
    @Nullable
    public final Integer getNavBarBgColor() {
        int i10 = I;
        int i11 = i10 & 13;
        int i12 = (((i10 | 13) & (~i11)) - (~(i11 << 1))) - 1;
        int i13 = i12 % 128;
        J = i13;
        int i14 = i12 % 2;
        int i15 = (((i13 | 80) << 1) - (i13 ^ 80)) - 1;
        I = i15 % 128;
        int i16 = i15 % 2;
        return this.navBarBgColor;
    }

    @JvmName(name = "getNavBarTextColor")
    @Nullable
    public final Integer getNavBarTextColor() {
        int i10 = I;
        int i11 = (((i10 | 28) << 1) - (i10 ^ 28)) - 1;
        J = i11 % 128;
        int i12 = i11 % 2;
        int i13 = (i10 | 27) << 1;
        int i14 = -(((~i10) & 27) | (i10 & (-28)));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        J = i15 % 128;
        int i16 = i15 % 2;
        return this.navBarTextColor;
    }

    @JvmName(name = "getNavBarTextSizeSp")
    @Nullable
    public final Float getNavBarTextSizeSp() {
        int i10 = I;
        int i11 = i10 & 35;
        int i12 = (~i11) & (i10 | 35);
        int i13 = i11 << 1;
        int i14 = (i12 & i13) + (i13 | i12);
        J = i14 % 128;
        int i15 = i14 % 2;
        int i16 = ((i10 ^ 3) | (i10 & 3)) << 1;
        int i17 = -(((~i10) & 3) | (i10 & (-4)));
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        J = i18 % 128;
        int i19 = i18 % 2;
        Float f6 = this.navBarTextSizeSp;
        if (i19 == 0) {
            int i20 = 70 / 0;
        }
        return f6;
    }

    @JvmName(name = "getNavBarTitleString")
    @Nullable
    public final String getNavBarTitleString() {
        int i10 = J;
        int i11 = ((-1) << 1) - ((-1) ^ (((i10 | 46) << 1) - (i10 ^ 46)));
        int i12 = i11 % 128;
        I = i12;
        int i13 = i11 % 2;
        int i14 = i12 & 75;
        int i15 = -(-((i12 ^ 75) | i14));
        int i16 = (i14 & i15) + (i15 | i14);
        J = i16 % 128;
        int i17 = i16 % 2;
        return this.navBarTitleString;
    }

    @JvmName(name = "getPinDigitBgColor")
    @Nullable
    public final Integer getPinDigitBgColor() {
        int i10 = J;
        int i11 = (i10 ^ 71) + ((i10 & 71) << 1);
        int i12 = i11 % 128;
        I = i12;
        int i13 = i11 % 2;
        int i14 = i12 + 57;
        J = i14 % 128;
        int i15 = i14 % 2;
        return this.pinDigitBgColor;
    }

    @JvmName(name = "getPinDigitTintColor")
    @Nullable
    public final Integer getPinDigitTintColor() {
        int i10 = J;
        int i11 = (i10 ^ 50) + ((i10 & 50) << 1);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        I = i12 % 128;
        int i13 = i12 % 2;
        int i14 = i10 & 39;
        int i15 = ((i10 ^ 39) | i14) << 1;
        int i16 = -((i10 | 39) & (~i14));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        I = i17 % 128;
        int i18 = i17 % 2;
        return this.pinDigitTintColor;
    }

    @JvmName(name = "getPinGridBgColor")
    @Nullable
    public final Integer getPinGridBgColor() {
        int i10 = J;
        int i11 = i10 & 41;
        int i12 = (i10 | 41) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 & i13) + (i12 | i13);
        I = i14 % 128;
        if (i14 % 2 == 0) {
            return this.pinGridBgColor;
        }
        throw null;
    }

    @JvmName(name = "getPinGridButtonBgColor")
    @Nullable
    public final Integer getPinGridButtonBgColor() {
        int i10 = J;
        int i11 = i10 ^ 65;
        int i12 = ((i10 & 65) | i11) << 1;
        int i13 = -i11;
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        I = i14 % 128;
        int i15 = i14 % 2;
        int i16 = ((i10 | 123) << 1) - (i10 ^ 123);
        I = i16 % 128;
        int i17 = i16 % 2;
        return this.pinGridButtonBgColor;
    }

    @JvmName(name = "getPinGridButtonNumFontSizeSp")
    @Nullable
    public final Float getPinGridButtonNumFontSizeSp() {
        int i10 = J;
        int i11 = i10 ^ 115;
        int i12 = ((i10 & 115) | i11) << 1;
        int i13 = -i11;
        int i14 = (i12 & i13) + (i12 | i13);
        I = i14 % 128;
        if (i14 % 2 == 0) {
            return this.pinGridButtonNumFontSizeSp;
        }
        throw null;
    }

    @JvmName(name = "getPinGridButtonTextColor")
    @Nullable
    public final Integer getPinGridButtonTextColor() {
        int i10 = J;
        int i11 = (i10 & (-80)) | ((~i10) & 79);
        int i12 = (i10 & 79) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        I = i14;
        int i15 = i13 % 2;
        int i16 = i14 + 50;
        int i17 = (i16 ^ (-1)) + (i16 << 1);
        J = i17 % 128;
        if (i17 % 2 != 0) {
            return this.pinGridButtonTextColor;
        }
        throw null;
    }

    @JvmName(name = "getPinPadType")
    @NotNull
    public final PinPadType getPinPadType() {
        int i10 = J;
        int i11 = ((i10 ^ 15) | (i10 & 15)) << 1;
        int i12 = -(((~i10) & 15) | (i10 & (-16)));
        int i13 = (i11 & i12) + (i12 | i11);
        I = i13 % 128;
        if (i13 % 2 == 0) {
            return this.pinPadType;
        }
        throw null;
    }

    @JvmName(name = "getPinViewports")
    @Nullable
    public final PinViewports getPinViewports() {
        int i10 = I;
        int i11 = i10 & 27;
        int i12 = (((i10 ^ 27) | i11) << 1) - ((~i11) & (i10 | 27));
        J = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 1 / 0;
        }
        int i14 = i10 + 95;
        J = i14 % 128;
        if (i14 % 2 != 0) {
            return this.pinViewports;
        }
        throw null;
    }

    @JvmName(name = "getProgressBarColor")
    @Nullable
    public final Integer getProgressBarColor() {
        int i10 = J;
        int i11 = ((i10 ^ 90) + ((i10 & 90) << 1)) - 1;
        int i12 = i11 % 128;
        I = i12;
        if (i11 % 2 != 0) {
            int i13 = 0 / 0;
        }
        int i14 = (((i12 | 118) << 1) - (i12 ^ 118)) - 1;
        J = i14 % 128;
        int i15 = i14 % 2;
        Integer num = this.progressBarColor;
        if (i15 == 0) {
            int i16 = 97 / 0;
        }
        return num;
    }

    @JvmName(name = "getRevealSystemBarToastMessage")
    @Nullable
    public final String getRevealSystemBarToastMessage() {
        int i10 = I + 17;
        int i11 = i10 % 128;
        J = i11;
        if (i10 % 2 == 0) {
            int i12 = 23 / 0;
        }
        int i13 = (i11 ^ 47) + ((i11 & 47) << 1);
        I = i13 % 128;
        int i14 = i13 % 2;
        String str = this.revealSystemBarToastMessage;
        if (i14 != 0) {
            int i15 = 51 / 0;
        }
        return str;
    }

    @JvmName(name = "getStatusBarColor")
    @Nullable
    public final Integer getStatusBarColor() {
        int i10 = ((-1) << 1) - ((I + 86) ^ (-1));
        int i11 = i10 % 128;
        J = i11;
        int i12 = i10 % 2;
        int i13 = i11 & 7;
        int i14 = (i13 - (~((i11 ^ 7) | i13))) - 1;
        I = i14 % 128;
        if (i14 % 2 == 0) {
            return this.statusBarColor;
        }
        throw null;
    }

    @JvmName(name = "getTooFewDigitsMessage")
    @Nullable
    public final String getTooFewDigitsMessage() {
        int i10 = I;
        int i11 = ((i10 ^ 31) | (i10 & 31)) << 1;
        int i12 = -(((~i10) & 31) | (i10 & (-32)));
        int i13 = (i11 & i12) + (i12 | i11);
        int i14 = i13 % 128;
        J = i14;
        if (i13 % 2 == 0) {
            throw null;
        }
        int i15 = ((i14 | 75) << 1) - (i14 ^ 75);
        I = i15 % 128;
        int i16 = i15 % 2;
        return this.tooFewDigitsMessage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v158, types: [int] */
    /* JADX WARN: Type inference failed for: r3v178 */
    /* JADX WARN: Type inference failed for: r3v312 */
    /* JADX WARN: Type inference failed for: r7v184 */
    /* JADX WARN: Type inference failed for: r9v159 */
    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int iHashCode7;
        int iHashCode8;
        int iHashCode9;
        int iHashCode10;
        int iHashCode11;
        int iHashCode12;
        int iHashCode13;
        int iHashCode14;
        int iHashCode15;
        int iHashCode16;
        int iHashCode17;
        int iHashCode18;
        int iHashCode19;
        int iHashCode20;
        int iHashCode21;
        int iHashCode22;
        int iHashCode23;
        int iHashCode24;
        int iHashCode25;
        int iHashCode26;
        int iHashCode27;
        int iHashCode28;
        int iHashCode29;
        int iHashCode30;
        int iHashCode31;
        int iHashCode32;
        int i10 = J;
        int i11 = (i10 & 47) + (i10 | 47);
        I = i11 % 128;
        int i12 = i11 % 2;
        int iHashCode33 = this.pinPadType.hashCode() * 31;
        Integer num = this.statusBarColor;
        if (num == null) {
            int i13 = J;
            int i14 = ((i13 | 123) << 1) - (i13 ^ 123);
            I = i14 % 128;
            iHashCode = i14 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = num.hashCode();
        }
        int iE = b.e(iHashCode33 ^ iHashCode, ~((iHashCode33 & iHashCode) << 1), 1, 31);
        Integer num2 = this.generalBgColor;
        if (num2 == null) {
            int i15 = J;
            int i16 = i15 & 63;
            int i17 = (((i15 ^ 63) | i16) << 1) - ((i15 | 63) & (~i16));
            I = i17 % 128;
            int i18 = i17 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = num2.hashCode();
            int i19 = J;
            int i20 = ((i19 ^ 123) - (~((i19 & 123) << 1))) - 1;
            I = i20 % 128;
            int i21 = i20 % 2;
        }
        int i22 = -(-iHashCode2);
        int i23 = ((((~i22) & iE) | ((~iE) & i22)) + ((iE & i22) << 1)) * 31;
        Integer num3 = this.navBarBgColor;
        if (num3 == null) {
            int i24 = I;
            int i25 = i24 & 97;
            int i26 = ((i24 | 97) & (~i25)) + (i25 << 1);
            J = i26 % 128;
            int i27 = i26 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = num3.hashCode();
        }
        int i28 = -(~iHashCode3);
        int i29 = (i23 ^ i28) + ((i28 & i23) << 1);
        int i30 = ((i29 ^ (-1)) + (i29 << 1)) * 31;
        String str = this.navBarTitleString;
        if (str == null) {
            int i31 = I;
            int i32 = (i31 & 25) + (i31 | 25);
            J = i32 % 128;
            int i33 = i32 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str.hashCode();
            int i34 = J;
            int i35 = i34 ^ 35;
            int i36 = ((i34 & 35) | i35) << 1;
            int i37 = -i35;
            int i38 = (i36 ^ i37) + ((i36 & i37) << 1);
            I = i38 % 128;
            int i39 = i38 % 2;
        }
        int i40 = i30 & iHashCode4;
        int i41 = ((i30 | iHashCode4) & (~i40)) + (i40 << 1);
        int i42 = i41 * 31;
        Integer num4 = this.navBarTextColor;
        if (num4 == null) {
            System.identityHashCode(this);
            System.identityHashCode(this);
            iHashCode5 = 0;
        } else {
            iHashCode5 = num4.hashCode();
        }
        int iIdentityHashCode = System.identityHashCode(this);
        int i43 = iHashCode5 * (-661);
        int i44 = i41 * (-20491);
        int i45 = i43 & i44;
        int i46 = ((i44 | i43) & (~i45)) + (i45 << 1);
        int i47 = ~iIdentityHashCode;
        int i48 = (~iHashCode5) & ((~iHashCode5) | iHashCode5);
        int i49 = ~i42;
        int i50 = ~i42;
        int i51 = i49 & (i50 | i42);
        int i52 = ~((i48 & i51) | (i48 ^ i51));
        int i53 = ((~i52) & i47) | ((~i47) & i52);
        int i54 = i47 & i52;
        int i55 = ((i54 & i53) | (i53 ^ i54)) * 1324;
        int i56 = (i46 ^ i55) + ((i46 & i55) << 1);
        int i57 = iHashCode5 & iIdentityHashCode;
        int i58 = (~i57) & (iHashCode5 | iIdentityHashCode);
        int i59 = ~((i57 & i58) | (i58 ^ i57));
        int i60 = iIdentityHashCode | i42;
        int i61 = (i60 | (~i60)) & (~i60);
        int i62 = -(~(((i59 & i61) | (i59 ^ i61)) * (-1324)));
        int i63 = (((i56 | i62) << 1) - (i62 ^ i56)) - 1;
        int i64 = ~iHashCode5;
        int i65 = ~((i64 & i42) | (i64 ^ i42));
        int i66 = i50 & iHashCode5;
        int i67 = (iHashCode5 | i50) & (~i66);
        int i68 = ~((i66 & i67) | (i67 ^ i66));
        int i69 = -(~(-(-(((i65 & i68) | (i65 ^ i68)) * 662))));
        int i70 = ((i63 | i69) << 1) - (i69 ^ i63);
        int i71 = ((i70 ^ (-1)) + (i70 << 1)) * 31;
        Float f6 = this.navBarTextSizeSp;
        if (f6 == null) {
            System.identityHashCode(this);
            System.identityHashCode(this);
            iHashCode6 = 0;
        } else {
            iHashCode6 = f6.hashCode();
        }
        int i72 = -(-iHashCode6);
        int i73 = i71 & i72;
        int i74 = i73 + ((i71 ^ i72) | i73);
        int i75 = i74 * 31;
        Integer num5 = this.pinDigitTintColor;
        if (num5 == null) {
            int i76 = J;
            int i77 = (i76 & (-126)) | ((~i76) & 125);
            int i78 = -(-((i76 & 125) << 1));
            int i79 = ((i77 | i78) << 1) - (i78 ^ i77);
            I = i79 % 128;
            iHashCode7 = i79 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode7 = num5.hashCode();
        }
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i80 = iHashCode7 * 758;
        int i81 = -(-(i74 * (-23436)));
        int i82 = ((((i80 ^ i81) | (i80 & i81)) << 1) - (~(-((i81 & (~i80)) | ((~i81) & i80))))) - 1;
        int i83 = ~iIdentityHashCode2;
        int i84 = iHashCode7 & i83;
        int i85 = (i83 | iHashCode7) & (~i84);
        int i86 = ((i85 & i84) | (i85 ^ i84)) * (-757);
        int i87 = i82 & i86;
        int i88 = ((i86 | i82) & (~i87)) + (i87 << 1);
        int i89 = ~i75;
        int i90 = (~i75) | i75;
        int i91 = i89 & i90;
        int i92 = ~iHashCode7;
        int i93 = (i91 & i92) | ((~i91) & iHashCode7);
        int i94 = i91 & iHashCode7;
        int i95 = (i94 & i93) | (i93 ^ i94);
        int i96 = i95 & iIdentityHashCode2;
        int i97 = (i95 | iIdentityHashCode2) & (~i96);
        int i98 = ~iIdentityHashCode2;
        int i99 = (i97 & i96) | (i97 ^ i96);
        int i100 = ((i99 | (~i99)) & (~i99)) * 1514;
        int i101 = i88 & i100;
        int i102 = ((i88 ^ i100) | i101) << 1;
        int i103 = -((i88 | i100) & (~i101));
        int i104 = (i102 ^ i103) + ((i103 & i102) << 1);
        int i105 = ((~i89) & i92) | ((~i92) & i89);
        int i106 = i89 & i92;
        int i107 = ~((i105 & i106) | (i105 ^ i106));
        int i108 = (~i75) & i90;
        int i109 = i108 & i98;
        int i110 = ((i108 | i98) & (~i109)) | i109;
        int i111 = (i110 | (~i110)) & (~i110);
        int i112 = i107 & i111;
        int i113 = ((i107 | i111) & (~i112)) | i112;
        int i114 = (i75 & iHashCode7) | (iHashCode7 ^ i75);
        int i115 = ~((i114 & iIdentityHashCode2) | (i114 ^ iIdentityHashCode2));
        int i116 = i113 & i115;
        int i117 = (((i115 | i113) & (~i116)) | i116) * 757;
        int i118 = i104 & i117;
        int i119 = -(-((i117 ^ i104) | i118));
        int i120 = (i118 & i119) + (i119 | i118);
        int i121 = i120 * 31;
        Integer num6 = this.pinDigitBgColor;
        if (num6 == null) {
            int i122 = J;
            int i123 = (((i122 | 28) << 1) - (i122 ^ 28)) - 1;
            I = i123 % 128;
            iHashCode8 = i123 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode8 = num6.hashCode();
        }
        int iIdentityHashCode3 = System.identityHashCode(this);
        int i124 = (i120 * 1426) + (iHashCode8 * 46);
        int i125 = ~i121;
        int i126 = ~iIdentityHashCode3;
        int i127 = ~iIdentityHashCode3;
        int i128 = (i127 | iIdentityHashCode3) & i126;
        int i129 = ~((i128 & i125) | ((~i128) & i125) | ((~i125) & i128));
        int i130 = iHashCode8 & i129;
        int i131 = (i129 | iHashCode8) & (~i130);
        int i132 = ((i131 & i130) | (i131 ^ i130)) * (-90);
        int i133 = i124 & i132;
        int i134 = i133 + ((i124 ^ i132) | i133);
        int i135 = (~i121) & ((~i121) | i121);
        int i136 = i135 & iIdentityHashCode3;
        int i137 = (i135 | iIdentityHashCode3) & (~i136);
        int i138 = (i137 & i136) | (i137 ^ i136);
        int i139 = (i138 | (~i138)) & (~i138);
        int i140 = (i121 & iHashCode8) | (iHashCode8 ^ i121);
        int i141 = (i140 | (~i140)) & (~i140);
        int i142 = (i134 - (~(-(~(-(-(((i141 & i139) | (i139 ^ i141)) * (-45)))))))) - 2;
        int i143 = ~iHashCode8;
        int i144 = (i143 & i127) | ((~i143) & iIdentityHashCode3);
        int i145 = i143 & iIdentityHashCode3;
        int i146 = (i145 & i144) | (i144 ^ i145);
        int i147 = (i146 | (~i146)) & (~i146);
        int i148 = i125 & i147;
        int i149 = (i147 | i125) & (~i148);
        int i150 = (i149 & i148) | (i149 ^ i148);
        int i151 = i126 ^ iHashCode8;
        int i152 = iHashCode8 & i126;
        int i153 = (i152 & i151) | (i151 ^ i152);
        int i154 = (i153 | (~i153)) & (~i153);
        int i155 = i150 ^ i154;
        int i156 = i150 & i154;
        int i157 = -(-(((i156 & i155) | (i155 ^ i156)) * 45));
        int i158 = ((~i157) & i142) | ((~i142) & i157);
        int i159 = -(-((i157 & i142) << 1));
        int i160 = (i158 ^ i159) + ((i159 & i158) << 1);
        int i161 = i160 * 31;
        Integer num7 = this.amountFieldBgColor;
        if (num7 == null) {
            int i162 = J;
            int i163 = ((i162 | 57) << 1) - (i162 ^ 57);
            I = i163 % 128;
            int i164 = i163 % 2;
            iHashCode9 = 0;
        } else {
            iHashCode9 = num7.hashCode();
        }
        int iIdentityHashCode4 = System.identityHashCode(this);
        int i165 = iHashCode9 * 868;
        int i166 = -(-(i160 * 26908));
        int i167 = ((i165 ^ i166) | (i165 & i166)) << 1;
        int i168 = -((i166 & (~i165)) | ((~i166) & i165));
        int i169 = (i167 ^ i168) + ((i168 & i167) << 1);
        int i170 = ~iHashCode9;
        int i171 = ~iIdentityHashCode4;
        int i172 = ~((i171 & i170) | (i170 ^ i171));
        int i173 = ~i161;
        int i174 = ~iIdentityHashCode4;
        int i175 = ~((i173 ^ i174) | (i173 & i174));
        int i176 = ((~i175) & i172) | ((~i172) & i175);
        int i177 = i172 & i175;
        int i178 = -(~(((i177 & i176) | (i176 ^ i177)) * (-867)));
        int i179 = ((i169 & i178) + (i169 | i178)) - 1;
        int i180 = ~iHashCode9;
        int i181 = ~i161;
        int i182 = i181 | i161;
        int i183 = i173 & i182;
        int i184 = ~((i183 & i180) | (i180 ^ i183));
        int i185 = (i170 | iHashCode9) & (~iHashCode9);
        int i186 = ~i185;
        int i187 = (i174 & i185) | (iIdentityHashCode4 & i186);
        int i188 = i185 & iIdentityHashCode4;
        int i189 = (i187 ^ i188) | (i187 & i188);
        int i190 = (((~i189) | i189) & (~i189)) | i184;
        int i191 = (~i161) & i182;
        int i192 = (i191 & iIdentityHashCode4) | (i191 ^ iIdentityHashCode4);
        int i193 = (i192 | (~i192)) & (~i192);
        int i194 = i190 & i193;
        int i195 = -(~(-(-((((i190 | i193) & (~i194)) | i194) * (-1734)))));
        int i196 = ((i179 | i195) << 1) - (i195 ^ i179);
        int i197 = (i196 ^ (-1)) + (i196 << 1);
        int i198 = ((~i181) & i185) | (i181 & i186);
        int i199 = i185 & i181;
        int i200 = (i199 & i198) | (i198 ^ i199);
        int i201 = ~iIdentityHashCode4;
        int i202 = (i200 & i201) | ((~i201) & i200) | ((~i200) & i201);
        int i203 = (i202 | (~i202)) & (~i202);
        int i204 = i180 & i161;
        int i205 = (i161 | i180) & (~i204);
        int i206 = (i205 & i204) | (i205 ^ i204);
        int i207 = ~((i206 & iIdentityHashCode4) | (i206 ^ iIdentityHashCode4));
        int i208 = ((~i207) & i203) | ((~i203) & i207);
        int i209 = i207 & i203;
        int i210 = (i209 & i208) | (i208 ^ i209);
        int i211 = (iHashCode9 & i181) | (i181 ^ iHashCode9);
        int i212 = ~((i211 & iIdentityHashCode4) | (i211 ^ iIdentityHashCode4));
        int i213 = i210 & i212;
        int i214 = (i210 | i212) & (~i213);
        int i215 = ((i214 & i213) | (i214 ^ i213)) * 867;
        int i216 = (i197 | i215) << 1;
        int i217 = -(i215 ^ i197);
        int i218 = (i216 ^ i217) + ((i217 & i216) << 1);
        int i219 = i218 * 31;
        Integer num8 = this.amountFieldTextColor;
        if (num8 == null) {
            int i220 = J;
            int i221 = (((i220 | 84) << 1) - (i220 ^ 84)) - 1;
            I = i221 % 128;
            int i222 = i221 % 2;
            iHashCode10 = 0;
        } else {
            iHashCode10 = num8.hashCode();
        }
        int iIdentityHashCode5 = System.identityHashCode(this);
        int i223 = iHashCode10 * (-381);
        int i224 = -(-(i218 * 5952));
        int i225 = i223 & i224;
        int i226 = (i224 | i223) & (~i225);
        int i227 = -(-(i225 << 1));
        int i228 = ((i226 | i227) << 1) - (i226 ^ i227);
        int i229 = ~iHashCode10;
        int i230 = (i228 - (~((((~iHashCode10) | iHashCode10) & i229) * (-191)))) - 1;
        int i231 = i219 & iIdentityHashCode5;
        int i232 = (~i231) & (i219 | iIdentityHashCode5);
        int i233 = ~iIdentityHashCode5;
        int i234 = ~((i231 & i232) | (i232 ^ i231));
        int i235 = iHashCode10 ^ i234;
        int i236 = iHashCode10 & i234;
        int i237 = -(-(((i236 & i235) | (i235 ^ i236)) * Opcodes.ATHROW));
        int i238 = i230 | i237;
        int i239 = i238 << 1;
        int i240 = -((~(i237 & i230)) & i238);
        int i241 = (i239 & i240) + (i240 | i239);
        int i242 = i229 & i219;
        int i243 = ~(((i229 | i219) & (~i242)) | i242);
        int i244 = i233 & i219;
        int i245 = ((i219 | i233) & (~i244)) | i244;
        int i246 = (i245 | (~i245)) & (~i245);
        int i247 = i243 ^ i246;
        int i248 = i246 & i243;
        int i249 = (i241 - (~(-(~(-(-(((i248 & i247) | (i247 ^ i248)) * Opcodes.ATHROW))))))) - 2;
        int i250 = i249 * 31;
        Float f10 = this.amountFieldTextSizeSp;
        if (f10 == null) {
            int i251 = J;
            int i252 = (((i251 | 40) << 1) - (i251 ^ 40)) - 1;
            I = i252 % 128;
            iHashCode11 = i252 % 2 != 0 ? 1 : 0;
            int i253 = i251 ^ 33;
            int i254 = ((i251 & 33) | i253) << 1;
            int i255 = -i253;
            int i256 = (i254 & i255) + (i254 | i255);
            I = i256 % 128;
            int i257 = i256 % 2;
        } else {
            iHashCode11 = f10.hashCode();
        }
        int iIdentityHashCode6 = System.identityHashCode(this);
        int i258 = ((iHashCode11 * (-300)) - (~(i249 * 9362))) - 1;
        int i259 = iHashCode11 & i250;
        int i260 = (~i259) & (iHashCode11 | i250);
        int i261 = ~i250;
        int i262 = (i259 & i260) | (i260 ^ i259);
        int i263 = ~iIdentityHashCode6;
        int i264 = (i262 & iIdentityHashCode6) | (i262 & i263) | ((~i262) & iIdentityHashCode6);
        int i265 = -(-(((i264 | (~i264)) & (~i264)) * (-301)));
        int i266 = (i258 ^ i265) + ((i258 & i265) << 1);
        int i267 = ~i250;
        int i268 = i267 & iIdentityHashCode6;
        int i269 = (~i268) & (i267 | iIdentityHashCode6);
        int i270 = ~((i268 & i269) | (i269 ^ i268));
        int i271 = (~iIdentityHashCode6) & (i263 | iIdentityHashCode6);
        int i272 = i271 & iHashCode11;
        int i273 = (i271 | iHashCode11) & (~i272);
        int i274 = ~((i273 & i272) | (i273 ^ i272));
        int i275 = i270 & i274;
        int i276 = (i270 | i274) & (~i275);
        int i277 = (i266 - (~(-(~(((i276 & i275) | (i276 ^ i275)) * (-301)))))) - 2;
        int i278 = (i250 | i261) & i267;
        int i279 = ~iHashCode11;
        int i280 = (i279 & i263) | ((~i279) & iIdentityHashCode6);
        int i281 = iIdentityHashCode6 & i279;
        int i282 = ~((i281 & i280) | (i280 ^ i281));
        int i283 = -(~(-(-(((i278 & i282) | (i278 ^ i282)) * 301))));
        int i284 = (i277 & i283) + (i283 | i277);
        int i285 = ((i284 ^ (-1)) + (i284 << 1)) * 31;
        Integer num9 = this.detailsFieldBgColor;
        if (num9 == null) {
            int i286 = I;
            int i287 = (((i286 | 10) << 1) - (i286 ^ 10)) - 1;
            J = i287 % 128;
            int i288 = i287 % 2;
            System.identityHashCode(this);
            System.identityHashCode(this);
            iHashCode12 = 0;
        } else {
            iHashCode12 = num9.hashCode();
        }
        int i289 = -(~iHashCode12);
        int i290 = (((i285 & i289) + (i285 | i289)) - 1) * 31;
        Integer num10 = this.detailsFieldTextColor;
        if (num10 == null) {
            int i291 = I;
            int i292 = ((i291 ^ 29) | (i291 & 29)) << 1;
            int i293 = -(((~i291) & 29) | (i291 & (-30)));
            int i294 = (i292 & i293) + (i293 | i292);
            J = i294 % 128;
            int i295 = i294 % 2;
            iHashCode13 = 0;
        } else {
            iHashCode13 = num10.hashCode();
            int i296 = ((-1) << 1) - ((I + 42) ^ (-1));
            J = i296 % 128;
            int i297 = i296 % 2;
        }
        int i298 = i290 & iHashCode13;
        int i299 = (((iHashCode13 | i290) & (~i298)) + (i298 << 1)) * 31;
        Float f11 = this.detailsFieldTextSizeSp;
        if (f11 == null) {
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i300 = ~iIdentityHashCode7;
            int i301 = (~iIdentityHashCode7) | iIdentityHashCode7;
            int i302 = i300 & i301;
            int i303 = ~((i302 & (-1655989301)) | (1655989300 & i302) | ((~i302) & (-1655989301)));
            int i304 = 1117004800 & i303;
            int i305 = (i303 | 1117004800) & (~i304);
            int i306 = -(-(((i305 & i304) | (i305 ^ i304)) * (-712)));
            int i307 = (-328464572) & i306;
            int i308 = i307 + ((i306 ^ (-328464572)) | i307);
            int i309 = ~iIdentityHashCode7;
            int i310 = i301 & i309;
            int i311 = (i310 & 627759350) | (627759350 ^ i310);
            int i312 = i311 ^ (-1655989301);
            int i313 = i311 & (-1655989301);
            int i314 = ~((i313 & i312) | (i312 ^ i313));
            int i315 = iIdentityHashCode7 | (-538984501);
            int i316 = (i315 | (~i315)) & (~i315);
            int i317 = i314 ^ i316;
            int i318 = i316 & i314;
            int i319 = -(~(-(-(((i318 & i317) | (i317 ^ i318)) * (-712)))));
            int i320 = ((i308 ^ i319) + ((i319 & i308) << 1)) - 1;
            int i321 = i309 ^ (-1655989301);
            int i322 = i309 & (-1655989301);
            int i323 = ~((i321 & i322) | (i321 ^ i322));
            int i324 = 627759350 & i323;
            int i325 = (((i323 | 627759350) & (~i324)) | i324) * 712;
            int i326 = ((i320 | i325) << 1) - (i325 ^ i320);
            int iIdentityHashCode8 = System.identityHashCode(this);
            int i327 = (-1099218753) & iIdentityHashCode8;
            int i328 = (~i327) & ((-1099218753) | iIdentityHashCode8);
            int i329 = -(-(((i327 & i328) | (i328 ^ i327)) * 140));
            int i330 = ((~i329) & 1219723669) | ((-1219723670) & i329);
            int i331 = -(-((i329 & 1219723669) << 1));
            int i332 = (i330 ^ i331) + ((i331 & i330) << 1);
            int i333 = ~iIdentityHashCode8;
            int i334 = i333 ^ (-1099218753);
            int i335 = (-1099218753) & i333;
            int i336 = ~((i335 & i334) | (i334 ^ i335));
            int i337 = -(-(((i336 & 1099203584) | (1099203584 ^ i336)) * (-280)));
            int i338 = ((i332 | i337) << 1) - (i337 ^ i332);
            int i339 = (3685321 & i333) | ((~i333) & (-3685322));
            int i340 = i333 & (-3685322);
            int i341 = ~((i339 & i340) | (i339 ^ i340));
            int i342 = 3670153 & i341;
            int i343 = (i341 | 3670153) & (~i342);
            int i344 = (i343 & i342) | (i343 ^ i342);
            int i345 = (iIdentityHashCode8 & (-1099203585)) | ((-1099203585) ^ iIdentityHashCode8);
            int i346 = (i345 | (~i345)) & (~i345);
            int i347 = ((~i346) & i344) | ((~i344) & i346);
            int i348 = i346 & i344;
            int i349 = -(-(((i348 & i347) | (i347 ^ i348)) * 140));
            int i350 = i338 & i349;
            int i351 = ((i338 ^ i349) | i350) << 1;
            int i352 = -((i349 | i338) & (~i350));
            iHashCode14 = i326 <= ((i351 | i352) << 1) - (i352 ^ i351) ? 1 : 0;
        } else {
            iHashCode14 = f11.hashCode();
        }
        int i353 = -(-iHashCode14);
        int i354 = i299 & i353;
        int i355 = (i354 - (~((i299 ^ i353) | i354))) - 1;
        int i356 = i355 * 31;
        Integer num11 = this.pinGridBgColor;
        if (num11 == null) {
            int i357 = I;
            int i358 = i357 & 39;
            int i359 = (i358 - (~(-(-((i357 ^ 39) | i358))))) - 1;
            J = i359 % 128;
            int i360 = i359 % 2;
            iHashCode15 = 0;
        } else {
            iHashCode15 = num11.hashCode();
            int i361 = J;
            int i362 = i361 & 65;
            int i363 = (((i361 ^ 65) | i362) << 1) - ((i361 | 65) & (~i362));
            I = i363 % 128;
            int i364 = i363 % 2;
        }
        int iIdentityHashCode9 = System.identityHashCode(this);
        int i365 = iHashCode15 * 829;
        int i366 = i355 * 25699;
        int i367 = i365 & i366;
        int i368 = (i366 ^ i365) | i367;
        int i369 = (i367 ^ i368) + ((i368 & i367) << 1);
        int i370 = ~iHashCode15;
        int i371 = ~i356;
        int i372 = i370 & i371;
        int i373 = (i371 | i370) & (~i372);
        int i374 = ~((i373 & i372) | (i373 ^ i372));
        int i375 = ~iIdentityHashCode9;
        int i376 = i375 & iHashCode15;
        int i377 = (~i376) & (i375 | iHashCode15);
        int i378 = (i376 & i377) | (i377 ^ i376);
        int i379 = i378 ^ i356;
        int i380 = ~i356;
        int i381 = i378 & i356;
        int i382 = ~((i381 & i379) | (i379 ^ i381));
        int i383 = i374 ^ i382;
        int i384 = i374 & i382;
        int i385 = -(-(((i384 & i383) | (i383 ^ i384)) * (-828)));
        int i386 = i369 & i385;
        int i387 = -(-((i369 ^ i385) | i386));
        int i388 = (i386 & i387) + (i387 | i386);
        int i389 = (i370 & i356) | (iHashCode15 & i380);
        int i390 = iHashCode15 & i356;
        int i391 = (i389 & i390) | (i389 ^ i390);
        int i392 = i391 ^ i375;
        int i393 = i391 & i375;
        int i394 = ((i393 & i392) | (i392 ^ i393)) * (-828);
        int i395 = ((((~i394) & i388) | ((~i388) & i394)) - (~((i394 & i388) << 1))) - 1;
        int i396 = (~((i356 ^ iHashCode15) | i390)) * 828;
        int i397 = ((((i395 ^ i396) | (i395 & i396)) << 1) - ((i396 & (~i395)) | ((~i396) & i395))) * 31;
        Integer num12 = this.pinGridButtonTextColor;
        if (num12 == null) {
            int i398 = I;
            int i399 = i398 ^ 63;
            int i400 = -(-((i398 & 63) << 1));
            int i401 = (i399 ^ i400) + ((i400 & i399) << 1);
            J = i401 % 128;
            int i402 = i401 % 2;
            iHashCode16 = 0;
        } else {
            iHashCode16 = num12.hashCode();
        }
        int i403 = -(-iHashCode16);
        int i404 = ((i397 ^ i403) | (i397 & i403)) << 1;
        int i405 = -((i403 & (~i397)) | ((~i403) & i397));
        int i406 = ((i404 & i405) + (i405 | i404)) * 31;
        Integer num13 = this.pinGridButtonBgColor;
        if (num13 == null) {
            int i407 = I + 85;
            J = i407 % 128;
            int i408 = i407 % 2;
            iHashCode17 = 0;
        } else {
            iHashCode17 = num13.hashCode();
            System.identityHashCode(this);
            System.identityHashCode(this);
        }
        int i409 = -(-iHashCode17);
        int i410 = ((((~i409) & i406) | ((~i406) & i409)) - (~(-(-((i409 & i406) << 1))))) - 1;
        int i411 = i410 * 31;
        Float f12 = this.pinGridButtonNumFontSizeSp;
        if (f12 == null) {
            int i412 = I;
            int i413 = i412 & 77;
            int i414 = i412 | 77;
            int i415 = (i413 ^ i414) + ((i414 & i413) << 1);
            J = i415 % 128;
            iHashCode18 = i415 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode18 = f12.hashCode();
        }
        int iIdentityHashCode10 = System.identityHashCode(this);
        int i416 = iHashCode18 * 595;
        int i417 = -(-(i410 * (-36797)));
        int i418 = i416 & i417;
        int i419 = i418 + ((i417 ^ i416) | i418);
        int i420 = ~iHashCode18;
        int i421 = i420 & i411;
        int i422 = (~i421) & (i420 | i411);
        int i423 = ~i411;
        int i424 = (i421 & i422) | (i422 ^ i421);
        int i425 = (i424 | (~i424)) & (~i424);
        int i426 = ~iIdentityHashCode10;
        int i427 = ~iIdentityHashCode10;
        int i428 = i426 & (i427 | iIdentityHashCode10);
        int i429 = i428 & i411;
        int i430 = (~i429) & (i428 | i411);
        int i431 = ~((i429 & i430) | (i430 ^ i429));
        int i432 = i425 ^ i431;
        int i433 = i425 & i431;
        int i434 = ((i433 & i432) | (i432 ^ i433)) * (-1188);
        int i435 = (((~i434) & i419) | ((~i419) & i434)) + ((i434 & i419) << 1);
        int i436 = ~iHashCode18;
        int i437 = ~((i436 & i411) | (i436 ^ i411));
        int i438 = (i423 & i427) | ((~i423) & iIdentityHashCode10);
        int i439 = iIdentityHashCode10 & i423;
        int i440 = ~((i439 & i438) | (i438 ^ i439));
        int i441 = i437 & i440;
        int i442 = ((i440 | i437) & (~i441)) | i441;
        int i443 = (i428 & i420) | ((~i428) & iHashCode18);
        int i444 = i428 & iHashCode18;
        int i445 = ~((i443 & i444) | (i443 ^ i444));
        int i446 = i442 ^ i445;
        int i447 = i442 & i445;
        int i448 = -(-(((i447 & i446) | (i446 ^ i447)) * 594));
        int i449 = i435 & i448;
        int i450 = (i448 | i435) & (~i449);
        int i451 = -(-(i449 << 1));
        int i452 = (i450 ^ i451) + ((i450 & i451) << 1);
        int i453 = ~i411;
        int i454 = i453 & i427;
        int i455 = (~i454) & (i453 | i427);
        int i456 = ~((i454 & i455) | (i455 ^ i454));
        int i457 = (i411 | i423) & i453;
        int i458 = i457 & iHashCode18;
        int i459 = ((i457 | iHashCode18) & (~i458)) | i458;
        int i460 = (i459 | (~i459)) & (~i459);
        int i461 = i456 ^ i460;
        int i462 = i460 & i456;
        int i463 = (iHashCode18 & i427) | (i420 & i427) | ((~i427) & iHashCode18);
        int i464 = ((i462 & i461) | (i461 ^ i462) | ((i463 | (~i463)) & (~i463))) * 594;
        int i465 = i452 & i464;
        int i466 = (i464 ^ i452) | i465;
        int i467 = ((i465 ^ i466) + ((i466 & i465) << 1)) * 31;
        Integer num14 = this.cancelButtonIconDrawableId;
        if (num14 == null) {
            System.identityHashCode(this);
            System.identityHashCode(this);
            iHashCode19 = 0;
        } else {
            iHashCode19 = num14.hashCode();
        }
        int i468 = -(-iHashCode19);
        int i469 = (((i467 | i468) << 1) - (i468 ^ i467)) * 31;
        String str2 = this.cancelButtonText;
        if (str2 == null) {
            int i470 = I;
            int i471 = i470 & 105;
            int i472 = (i470 ^ 105) | i471;
            int i473 = ((i471 | i472) << 1) - (i472 ^ i471);
            J = i473 % 128;
            int i474 = i473 % 2;
            iHashCode20 = 0;
        } else {
            iHashCode20 = str2.hashCode();
            int i475 = J + 19;
            I = i475 % 128;
            int i476 = i475 % 2;
        }
        int i477 = -(-iHashCode20);
        int i478 = (i469 & i477) + (i477 | i469);
        int i479 = i478 * 31;
        Integer num15 = this.clearButtonIconDrawableId;
        if (num15 == null) {
            int i480 = I;
            int i481 = i480 ^ 49;
            int i482 = ((i480 & 49) | i481) << 1;
            int i483 = -i481;
            int i484 = (i482 & i483) + (i482 | i483);
            J = i484 % 128;
            iHashCode21 = i484 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode21 = num15.hashCode();
            int i485 = I;
            int i486 = (i485 & 29) + (i485 | 29);
            J = i486 % 128;
            int i487 = i486 % 2;
        }
        int iIdentityHashCode11 = System.identityHashCode(this);
        int i488 = iHashCode21 * (-432);
        int i489 = -(-(i478 * 13454));
        int i490 = ((((i488 ^ i489) | (i488 & i489)) << 1) - (~(-((i489 & (~i488)) | ((~i489) & i488))))) - 1;
        int i491 = ~iHashCode21;
        int i492 = ~iIdentityHashCode11;
        int i493 = i491 & i492;
        int i494 = (~i493) & (i491 | i492);
        int i495 = (i493 & i494) | (i494 ^ i493);
        int i496 = -(-((~((i495 & i479) | (i495 ^ i479))) * 433));
        int i497 = ((i490 ^ i496) | (i490 & i496)) << 1;
        int i498 = -(((~i490) & i496) | ((~i496) & i490));
        int i499 = (i497 ^ i498) + ((i498 & i497) << 1);
        int i500 = ~i479;
        int i501 = i500 & iIdentityHashCode11;
        int i502 = (i500 | iIdentityHashCode11) & (~i501);
        int i503 = (i502 & i501) | (i502 ^ i501);
        int i504 = (i503 | (~i503)) & (~i503);
        int i505 = ((~i504) & i491) | ((~i491) & i504);
        int i506 = i504 & i491;
        int i507 = (i499 - (~(-(-(((i506 & i505) | (i505 ^ i506)) * (-433)))))) - 1;
        int i508 = i491 & ((~iHashCode21) | iHashCode21);
        int i509 = ~((i508 & iIdentityHashCode11) | (i492 & i508) | ((~i508) & iIdentityHashCode11));
        int i510 = iHashCode21 & i479;
        int i511 = (i479 | iHashCode21) & (~i510);
        int i512 = ~((i511 & i510) | (i511 ^ i510));
        int i513 = i509 & i512;
        int i514 = (i512 | i509) & (~i513);
        int i515 = ((i514 & i513) | (i514 ^ i513)) * 433;
        int i516 = i507 & i515;
        int i517 = ((i507 ^ i515) | i516) << 1;
        int i518 = -((i515 | i507) & (~i516));
        int i519 = ((i517 | i518) << 1) - (i518 ^ i517);
        int i520 = i519 * 31;
        String str3 = this.clearButtonText;
        if (str3 == null) {
            int i521 = J;
            int i522 = (((i521 | 118) << 1) - (i521 ^ 118)) - 1;
            I = i522 % 128;
            int i523 = i522 % 2;
            iHashCode22 = 0;
        } else {
            iHashCode22 = str3.hashCode();
        }
        int iIdentityHashCode12 = System.identityHashCode(this);
        int i524 = iHashCode22 * 46;
        int i525 = -(~(i519 * 1426));
        int i526 = ((i524 ^ i525) + ((i525 & i524) << 1)) - 1;
        int i527 = ~i520;
        int i528 = ~iIdentityHashCode12;
        int i529 = i527 ^ i528;
        int i530 = i527 & i528;
        int i531 = ~((i529 & i530) | (i529 ^ i530));
        int i532 = iHashCode22 ^ i531;
        int i533 = i531 & iHashCode22;
        int i534 = -(~(-(-(((i533 & i532) | (i532 ^ i533)) * (-90)))));
        int i535 = ((i526 & i534) + (i526 | i534)) - 1;
        int i536 = ~i520;
        int i537 = (i527 | i520) & i536;
        int i538 = i537 & iIdentityHashCode12;
        int i539 = ~(((i537 | iIdentityHashCode12) & (~i538)) | i538);
        int i540 = iHashCode22 & i520;
        int i541 = ((i520 | iHashCode22) & (~i540)) | i540;
        int i542 = (i541 | (~i541)) & (~i541);
        int i543 = ((~i542) & i539) | ((~i539) & i542);
        int i544 = i542 & i539;
        int i545 = ((i544 & i543) | (i543 ^ i544)) * (-45);
        int i546 = ((~i545) & i535) | ((~i535) & i545);
        int i547 = (i545 & i535) << 1;
        int i548 = (i546 ^ i547) + ((i547 & i546) << 1);
        int i549 = (~iHashCode22) & ((~iHashCode22) | iHashCode22);
        int i550 = (i549 & i528) | ((~i549) & iIdentityHashCode12);
        int i551 = i549 & iIdentityHashCode12;
        int i552 = (i551 & i550) | (i550 ^ i551);
        int i553 = (i552 | (~i552)) & (~i552);
        int i554 = i536 & i553;
        int i555 = (i553 | i536) & (~i554);
        int i556 = (i555 & i554) | (i555 ^ i554);
        int i557 = ~iIdentityHashCode12;
        int i558 = ~((iHashCode22 & i557) | (i557 ^ iHashCode22));
        int i559 = i556 ^ i558;
        int i560 = i556 & i558;
        int i561 = -(-(((i560 & i559) | (i559 ^ i560)) * 45));
        int i562 = i548 & i561;
        int i563 = ((i561 | i548) & (~i562)) + (i562 << 1);
        int i564 = i563 * 31;
        Integer num16 = this.enterButtonIconDrawableId;
        if (num16 == null) {
            int i565 = J;
            int i566 = i565 & 1;
            int i567 = ((i565 ^ 1) | i566) << 1;
            int i568 = -((~i566) & (i565 | 1));
            int i569 = (i567 ^ i568) + ((i567 & i568) << 1);
            I = i569 % 128;
            int i570 = i569 % 2;
            int i571 = i565 & 119;
            int i572 = (i565 ^ 119) | i571;
            int i573 = (i571 ^ i572) + ((i572 & i571) << 1);
            I = i573 % 128;
            int i574 = i573 % 2;
            iHashCode23 = 0;
        } else {
            iHashCode23 = num16.hashCode();
            int i575 = I;
            int i576 = i575 & 81;
            int i577 = (i575 ^ 81) | i576;
            int i578 = (i576 & i577) + (i577 | i576);
            J = i578 % 128;
            int i579 = i578 % 2;
        }
        int iIdentityHashCode13 = System.identityHashCode(this);
        int i580 = iHashCode23 * (-494);
        int i581 = -(-(i563 * (-15314)));
        int i582 = i580 & i581;
        int i583 = (i581 ^ i580) | i582;
        int i584 = ((i582 | i583) << 1) - (i583 ^ i582);
        int i585 = iHashCode23 & i564;
        int i586 = i585 | ((~i585) & (iHashCode23 | i564));
        int i587 = ((i586 | (~i586)) & (~i586)) * (-495);
        int i588 = (i584 & i587) + (i587 | i584);
        int i589 = ~iIdentityHashCode13;
        int i590 = (iIdentityHashCode13 | (~iIdentityHashCode13)) & i589;
        int i591 = -(-(((i590 & iHashCode23) | (iHashCode23 ^ i590)) * 495));
        int i592 = (i588 ^ i591) + ((i591 & i588) << 1);
        int i593 = ~iHashCode23;
        int i594 = ~iHashCode23;
        int i595 = i593 & (i594 | iHashCode23);
        int i596 = (i564 | (~i564)) & (~i564);
        int i597 = ((~i596) & i595) | ((~i595) & i596);
        int i598 = i596 & i595;
        int i599 = (i598 & i597) | (i597 ^ i598);
        int i600 = (i599 | (~i599)) & (~i599);
        int i601 = (i589 & i594) | ((~i589) & iHashCode23);
        int i602 = i589 & iHashCode23;
        int i603 = ~((i602 & i601) | (i601 ^ i602));
        int i604 = i600 ^ i603;
        int i605 = i603 & i600;
        int i606 = -(~(((i605 & i604) | (i604 ^ i605)) * 495));
        int i607 = (i592 & i606) + (i606 | i592);
        int i608 = ((i607 ^ (-1)) + (i607 << 1)) * 31;
        String str4 = this.enterButtonText;
        if (str4 == null) {
            int iIdentityHashCode14 = System.identityHashCode(this);
            int i609 = (-1212190130) ^ iIdentityHashCode14;
            int i610 = (-1212190130) & iIdentityHashCode14;
            int i611 = (i609 & i610) | (i609 ^ i610);
            int i612 = i611 & (-1655494940);
            int i613 = (i611 | (-1655494940)) & (~i612);
            int i614 = -(-(((i613 & i612) | (i613 ^ i612)) * (-381)));
            int i615 = (-1223013296) & i614;
            int i616 = -(-((i614 ^ (-1223013296)) | i615));
            int i617 = (i615 & i616) + (i616 | i615);
            int i618 = (iIdentityHashCode14 | (~iIdentityHashCode14)) & (~iIdentityHashCode14);
            int i619 = i618 ^ (-1212190130);
            int i620 = i618 & (-1212190130);
            int i621 = ~((i620 & i619) | (i619 ^ i620));
            int i622 = 581718026 ^ i621;
            int i623 = i621 & 581718026;
            int i624 = (i617 - (~((((i623 & i622) | (i622 ^ i623)) | 138413216) * 381))) - 1;
            int i625 = i624 & 1087110733;
            int i626 = -(-((1087110733 ^ i624) | i625));
            int i627 = ((i625 | i626) << 1) - (i626 ^ i625);
            int iIdentityHashCode15 = System.identityHashCode(this);
            int i628 = ~iIdentityHashCode15;
            int i629 = (-1153714700) & i628;
            int i630 = (i628 | (-1153714700)) & (~i629);
            int i631 = ((-1) << 1) - ((1185406221 - (~(-(~((~((i630 & i629) | (i630 ^ i629))) * 979))))) ^ (-1));
            int i632 = -(~(((1836258449 ^ iIdentityHashCode15) | (1836258449 & iIdentityHashCode15)) * (-979)));
            int i633 = ((i631 & i632) + (i631 | i632)) - 1;
            int i634 = (-1153714700) & iIdentityHashCode15;
            int i635 = ((-1153714700) | iIdentityHashCode15) & (~i634);
            int i636 = ~((i635 & i634) | (i635 ^ i634));
            int i637 = ~iIdentityHashCode15;
            int i638 = ~((i637 & 1836258449) | (i637 ^ 1836258449));
            int i639 = i636 & i638;
            int i640 = (i638 | i636) & (~i639);
            int i641 = -(-(((i640 & i639) | (i640 ^ i639)) * 979));
            iHashCode24 = i627 <= (i633 & i641) + (i641 | i633) ? 1 : 0;
        } else {
            iHashCode24 = str4.hashCode();
            int i642 = J;
            int i643 = (((i642 | 73) << 1) - (~(-(((~i642) & 73) | (i642 & (-74)))))) - 1;
            I = i643 % 128;
            int i644 = i643 % 2;
        }
        int i645 = -(-iHashCode24);
        int i646 = ((i608 & i645) - (~(-(-(i608 | i645))))) - 1;
        int i647 = i646 * 31;
        Integer num17 = this.dynamicButtonBackgroundColor;
        if (num17 == null) {
            int i648 = J;
            int i649 = (i648 & (-122)) | ((~i648) & 121);
            int i650 = -(-((i648 & 121) << 1));
            int i651 = ((i649 | i650) << 1) - (i650 ^ i649);
            I = i651 % 128;
            int i652 = i651 % 2;
            iHashCode25 = 0;
        } else {
            iHashCode25 = num17.hashCode();
            System.identityHashCode(this);
            System.identityHashCode(this);
        }
        int iIdentityHashCode16 = System.identityHashCode(this);
        int i653 = iHashCode25 * (-344);
        int i654 = -(~(i646 * (-10664)));
        int i655 = ((i653 & i654) + (i654 | i653)) - 1;
        int i656 = ~iHashCode25;
        int i657 = ~i647;
        int i658 = i647 | (~i647);
        int i659 = i657 & i658;
        int i660 = ((~i659) & i656) | ((~i656) & i659);
        int i661 = i659 & i656;
        int i662 = ~((i661 & i660) | (i660 ^ i661));
        int i663 = i656 | iHashCode25;
        int i664 = (~iHashCode25) & i663;
        int i665 = i664 & iIdentityHashCode16;
        int i666 = (i664 | iIdentityHashCode16) & (~i665);
        int i667 = ~iIdentityHashCode16;
        int i668 = ~((i666 & i665) | (i666 ^ i665));
        int i669 = i662 & i668;
        int i670 = (i662 | i668) & (~i669);
        int i671 = ((i670 & i669) | (i670 ^ i669)) * 345;
        int i672 = (((i655 ^ i671) | (i655 & i671)) << 1) - (((~i655) & i671) | ((~i671) & i655));
        int i673 = (~iIdentityHashCode16) & (i667 | iIdentityHashCode16);
        int i674 = ~((i656 & i673) | (i656 ^ i673));
        int i675 = i658 & i657;
        int i676 = (i675 & iHashCode25) | (i675 ^ iHashCode25);
        int i677 = (i676 | (~i676)) & (~i676);
        int i678 = i674 & i677;
        int i679 = -(-((((i677 | i674) & (~i678)) | i678) * 345));
        int i680 = i672 & i679;
        int i681 = i680 + ((i679 ^ i672) | i680);
        int i682 = (~iHashCode25) & i663;
        int i683 = i682 ^ i657;
        int i684 = i682 & i657;
        int i685 = (i684 & i683) | (i683 ^ i684);
        int i686 = i685 & iIdentityHashCode16;
        int i687 = (i685 | iIdentityHashCode16) & (~i686);
        int i688 = -(-((~((i687 & i686) | (i687 ^ i686))) * 345));
        int i689 = ((i681 ^ i688) + ((i688 & i681) << 1)) * 31;
        Integer num18 = this.dynamicButtonTextColor;
        if (num18 == null) {
            int iIdentityHashCode17 = System.identityHashCode(this);
            int i690 = ~iIdentityHashCode17;
            int i691 = ~iIdentityHashCode17;
            int i692 = i690 & (i691 | iIdentityHashCode17);
            int i693 = ((~i692) & (-817436785)) | (817436784 & i692);
            int i694 = i692 & (-817436785);
            int i695 = ~((i694 & i693) | (i693 ^ i694));
            int i696 = (i691 & 276349648) | ((-276349649) & iIdentityHashCode17);
            int i697 = 276349648 & iIdentityHashCode17;
            int i698 = ~((i696 & i697) | (i696 ^ i697));
            int i699 = ((~i698) & i695) | ((~i695) & i698);
            int i700 = i695 & i698;
            int i701 = (((i700 & i699) | (i699 ^ i700)) * 1150) - 1346370178;
            int i702 = 276349648 ^ iIdentityHashCode17;
            int i703 = 276349648 & iIdentityHashCode17;
            int i704 = ~((i703 & i702) | (i702 ^ i703));
            int i705 = ~iIdentityHashCode17;
            int i706 = ~(((-276349649) & i705) | (i705 ^ (-276349649)));
            int i707 = ((~i706) & i704) | ((~i704) & i706);
            int i708 = i704 & i706;
            int i709 = -(~(-(-(((i708 & i707) | (i707 ^ i708)) * (-575)))));
            int i710 = ((i701 ^ i709) + ((i701 & i709) << 1)) - 1;
            int i711 = (-817436785) & iIdentityHashCode17;
            int i712 = ~(((iIdentityHashCode17 | (-817436785)) & (~i711)) | i711);
            int i713 = ~(817436784 | i705);
            int i714 = -(-(((i712 & i713) | (i712 ^ i713)) * 575));
            int i715 = i710 & i714;
            int i716 = ((i710 ^ i714) | i715) << 1;
            int i717 = -((i714 | i710) & (~i715));
            int i718 = (i716 ^ i717) + ((i717 & i716) << 1);
            int iIdentityHashCode18 = System.identityHashCode(this);
            int i719 = (2038118838 ^ iIdentityHashCode18) | (2038118838 & iIdentityHashCode18);
            int i720 = ((i719 | (~i719)) & (~i719)) * TypedValues.CycleType.TYPE_EASING;
            int i721 = (-1431984453) & i720;
            int i722 = (((-1431984453) ^ i720) | i721) << 1;
            int i723 = -((i720 | (-1431984453)) & (~i721));
            int i724 = ((i722 | i723) << 1) - (i723 ^ i722);
            int i725 = i724 & (-1332067256);
            int i726 = -(-(((-1332067256) ^ i724) | i725));
            int i727 = (i725 & i726) + (i726 | i725);
            int i728 = ~iIdentityHashCode18;
            int i729 = i728 & 2038118838;
            int i730 = ~(((i728 | 2038118838) & (~i729)) | i729);
            int i731 = 676010256 & i730;
            int i732 = (i730 | 676010256) & (~i731);
            int i733 = ((i732 & i731) | (i732 ^ i731)) * TypedValues.CycleType.TYPE_EASING;
            int i734 = i727 | i733;
            int i735 = i734 << 1;
            int i736 = -((~(i733 & i727)) & i734);
            iHashCode26 = i718 > ((i735 | i736) << 1) - (i736 ^ i735) ? 1 : 0;
        } else {
            iHashCode26 = num18.hashCode();
        }
        int i737 = i689 & iHashCode26;
        int iE2 = b.e((iHashCode26 | i689) & (~i737), ~(-(-(i737 << 1))), 1, 31);
        Float f13 = this.dynamicButtonTextSizeSp;
        if (f13 == null) {
            int i738 = J;
            int i739 = i738 ^ 115;
            int i740 = ((((i738 & 115) | i739) << 1) - (~(-i739))) - 1;
            I = i740 % 128;
            int i741 = i740 % 2;
            iHashCode27 = 0;
        } else {
            iHashCode27 = f13.hashCode();
        }
        int i742 = -(-iHashCode27);
        int i743 = ((iE2 ^ i742) | (iE2 & i742)) << 1;
        int i744 = -(((~iE2) & i742) | ((~i742) & iE2));
        int i745 = ((i743 & i744) + (i744 | i743)) * 31;
        Integer num19 = this.dynamicButtonIconTextSpacingDp;
        if (num19 == null) {
            int i746 = J + 116;
            int i747 = (i746 ^ (-1)) + (i746 << 1);
            I = i747 % 128;
            int i748 = i747 % 2;
            iHashCode28 = 0;
        } else {
            iHashCode28 = num19.hashCode();
            System.identityHashCode(this);
            System.identityHashCode(this);
        }
        int i749 = ((~iHashCode28) & i745) | ((~i745) & iHashCode28);
        int i750 = -(-((iHashCode28 & i745) << 1));
        int i751 = (i749 & i750) + (i750 | i749);
        int i752 = i751 * 31;
        String str5 = this.tooFewDigitsMessage;
        if (str5 == null) {
            int i753 = I;
            int i754 = ((i753 | 95) << 1) - (i753 ^ 95);
            J = i754 % 128;
            int i755 = i754 % 2;
            iHashCode29 = 0;
        } else {
            iHashCode29 = str5.hashCode();
            int i756 = J;
            int i757 = i756 & 39;
            int i758 = i757 + ((i756 ^ 39) | i757);
            I = i758 % 128;
            int i759 = i758 % 2;
        }
        int iIdentityHashCode19 = System.identityHashCode(this);
        int i760 = iHashCode29 * 624;
        int i761 = i751 * (-19282);
        int i762 = i760 & i761;
        int i763 = (i761 ^ i760) | i762;
        int i764 = ((i762 | i763) << 1) - (i763 ^ i762);
        int i765 = ~i752;
        int i766 = i765 | iHashCode29;
        int i767 = ((~((i766 & iIdentityHashCode19) | (i766 ^ iIdentityHashCode19))) * 623) + i764;
        int i768 = (~iIdentityHashCode19) & ((~iIdentityHashCode19) | iIdentityHashCode19);
        int i769 = ~iHashCode29;
        int i770 = ~iHashCode29;
        int i771 = i769 & (i770 | iHashCode29);
        int i772 = i771 & i752;
        int i773 = (i771 | i752) & (~i772);
        int i774 = ~((i773 & i772) | (i773 ^ i772));
        int i775 = i768 & i774;
        int i776 = (i768 | i774) & (~i775);
        int i777 = -(-(((i776 & i775) | (i776 ^ i775)) * (-623)));
        int i778 = i767 & i777;
        int i779 = ((i767 ^ i777) | i778) << 1;
        int i780 = -((i777 | i767) & (~i778));
        int i781 = (i779 & i780) + (i780 | i779);
        int i782 = (i765 & i770) | ((~i765) & iHashCode29);
        int i783 = i765 & iHashCode29;
        int i784 = ~((i782 & i783) | (i782 ^ i783));
        int i785 = (i752 | i765) & (~i752);
        int i786 = i785 & iIdentityHashCode19;
        int i787 = (i785 | iIdentityHashCode19) & (~i786);
        int i788 = (i787 & i786) | (i787 ^ i786);
        int i789 = (i788 | (~i788)) & (~i788);
        int i790 = (i789 & i784) | (i784 ^ i789);
        int i791 = ~((iHashCode29 ^ iIdentityHashCode19) | (iHashCode29 & iIdentityHashCode19));
        int i792 = i790 & i791;
        int i793 = (i790 | i791) & (~i792);
        int i794 = ((i793 & i792) | (i793 ^ i792)) * 623;
        int i795 = ((i781 ^ i794) | (i781 & i794)) << 1;
        int i796 = -((i794 & (~i781)) | ((~i794) & i781));
        int i797 = ((i795 ^ i796) + ((i796 & i795) << 1)) * 31;
        Integer num20 = this.progressBarColor;
        if (num20 == null) {
            int i798 = I;
            int i799 = i798 & 105;
            int i800 = i799 + ((i798 ^ 105) | i799);
            J = i800 % 128;
            int i801 = i800 % 2;
            iHashCode30 = 0;
        } else {
            iHashCode30 = num20.hashCode();
            int i802 = I;
            int i803 = i802 ^ 73;
            int i804 = ((i802 & 73) | i803) << 1;
            int i805 = -i803;
            int i806 = ((i804 | i805) << 1) - (i804 ^ i805);
            J = i806 % 128;
            int i807 = i806 % 2;
        }
        int i808 = -(-iHashCode30);
        int i809 = i797 ^ i808;
        int i810 = ((i808 & i797) | i809) << 1;
        int i811 = -i809;
        int i812 = ((i810 | i811) << 1) - (i810 ^ i811);
        int i813 = i812 * 31;
        boolean z10 = this.immersiveMode;
        ?? r3 = z10;
        if (z10) {
            int i814 = I;
            int i815 = ((i814 & 104) + (i814 | 104)) - 1;
            J = i815 % 128;
            int i816 = i815 % 2;
            r3 = 1;
        }
        int iIdentityHashCode20 = System.identityHashCode(this);
        int i817 = r3 * (-183);
        int i818 = -(-(i812 * 5735));
        int i819 = i817 & i818;
        int i820 = -(-((i818 ^ i817) | i819));
        int i821 = ((i819 | i820) << 1) - (i820 ^ i819);
        int i822 = ~r3;
        int i823 = (((i813 ^ i822) | (i813 & i822)) * (-368)) + i821;
        int i824 = ~i813;
        int i825 = r3 & i824;
        int i826 = (~i825) & (r3 | i824);
        int i827 = (i825 & i826) | (i826 ^ i825);
        int i828 = ~iIdentityHashCode20;
        int i829 = ((~i828) & i827) | ((~i827) & i828);
        int i830 = i827 & i828;
        int i831 = -(-(((i830 & i829) | (i829 ^ i830)) * 184));
        int i832 = ((i823 | i831) << 1) - (i823 ^ i831);
        int i833 = i822 & i824;
        int i834 = (~i833) & (i822 | i824);
        int i835 = ~((i833 & i834) | (i834 ^ i833));
        ?? r10 = i828 & r3;
        int i836 = ((i828 | r3) & (~(r10 == true ? 1 : 0))) | (r10 == true ? 1 : 0);
        int i837 = (i836 | (~i836)) & (~i836);
        int i838 = i835 ^ i837;
        int i839 = i837 & i835;
        int i840 = (i839 & i838) | (i838 ^ i839);
        int i841 = (i822 & i813) | ((i824 & r3) == true ? 1 : 0);
        int i842 = i813 & r3;
        int i843 = ~((i842 & i841) | (i841 ^ i842));
        int i844 = ((~i843) & i840) | ((~i840) & i843);
        int i845 = i843 & i840;
        int i846 = -(-(((i845 & i844) | (i844 ^ i845)) * 184));
        int i847 = ((~i846) & i832) | ((~i832) & i846);
        int i848 = (i846 & i832) << 1;
        int i849 = (((i847 | i848) << 1) - (i848 ^ i847)) * 31;
        String str6 = this.revealSystemBarToastMessage;
        if (str6 == null) {
            int i850 = I;
            int i851 = ((((i850 ^ 81) | (i850 & 81)) << 1) - (~(-(((~i850) & 81) | (i850 & (-82)))))) - 1;
            J = i851 % 128;
            iHashCode31 = i851 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode31 = str6.hashCode();
        }
        int i852 = ((i849 & iHashCode31) + (iHashCode31 | i849)) * 31;
        PinViewports pinViewports = this.pinViewports;
        if (pinViewports == null) {
            int i853 = I;
            int i854 = ((i853 | 66) << 1) - (i853 ^ 66);
            int i855 = (i854 ^ (-1)) + (i854 << 1);
            J = i855 % 128;
            int i856 = i855 % 2;
            iHashCode32 = 0;
        } else {
            iHashCode32 = pinViewports.hashCode();
        }
        return (i852 & iHashCode32) + (i852 | iHashCode32);
    }

    @NotNull
    public final String toString() {
        int i10 = I;
        int i11 = i10 & 13;
        int i12 = (((i10 ^ 13) | i11) << 1) - ((i10 | 13) & (~i11));
        int i13 = i12 % 128;
        J = i13;
        int i14 = i12 % 2;
        int i15 = ((i13 ^ 124) + ((i13 & 124) << 1)) - 1;
        I = i15 % 128;
        int i16 = i15 % 2;
        return "ppc";
    }

    public /* synthetic */ PinPadConfiguration(PinPadType pinPadType, Integer num, Integer num2, Integer num3, String str, Integer num4, Float f6, Integer num5, Integer num6, Integer num7, Integer num8, Float f10, Integer num9, Integer num10, Float f11, Integer num11, Integer num12, Integer num13, Float f12, Integer num14, String str2, Integer num15, String str3, Integer num16, String str4, Integer num17, Integer num18, Float f13, Integer num19, String str5, Integer num20, boolean z10, String str6, PinViewports pinViewports, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? PinPadType.STANDARD : pinPadType, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : num2, (i10 & 8) != 0 ? null : num3, (i10 & 16) != 0 ? null : str, (i10 & 32) != 0 ? null : num4, (i10 & 64) != 0 ? null : f6, (i10 & 128) != 0 ? null : num5, (i10 & 256) != 0 ? null : num6, (i10 & 512) != 0 ? null : num7, (i10 & 1024) != 0 ? null : num8, (i10 & 2048) != 0 ? null : f10, (i10 & 4096) != 0 ? null : num9, (i10 & 8192) != 0 ? null : num10, (i10 & 16384) != 0 ? null : f11, (i10 & 32768) != 0 ? null : num11, (i10 & 65536) != 0 ? null : num12, (i10 & 131072) != 0 ? null : num13, (i10 & 262144) != 0 ? null : f12, (i10 & 524288) != 0 ? null : num14, (i10 & 1048576) != 0 ? null : str2, (i10 & 2097152) != 0 ? null : num15, (i10 & 4194304) != 0 ? null : str3, (i10 & 8388608) != 0 ? null : num16, (i10 & 16777216) != 0 ? null : str4, (i10 & 33554432) != 0 ? null : num17, (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? null : num18, (i10 & 134217728) != 0 ? null : f13, (i10 & 268435456) != 0 ? null : num19, (i10 & PKIFailureInfo.duplicateCertReq) != 0 ? null : str5, (i10 & 1073741824) != 0 ? null : num20, (i10 & Integer.MIN_VALUE) != 0 ? true : z10, (i11 & 1) != 0 ? null : str6, (i11 & 2) != 0 ? null : pinViewports);
    }

    @JvmOverloads
    public PinPadConfiguration() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, -1, 3, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType) {
        this(pinPadType, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, -2, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num) {
        this(pinPadType, num, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, -4, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2) {
        this(pinPadType, num, num2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, -8, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3) {
        this(pinPadType, num, num2, num3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, -16, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str) {
        this(pinPadType, num, num2, num3, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, -32, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4) {
        this(pinPadType, num, num2, num3, str, num4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, -64, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4, @Nullable Float f6) {
        this(pinPadType, num, num2, num3, str, num4, f6, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, -128, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4, @Nullable Float f6, @ColorInt @Nullable Integer num5) {
        this(pinPadType, num, num2, num3, str, num4, f6, num5, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, InputDeviceCompat.SOURCE_ANY, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4, @Nullable Float f6, @ColorInt @Nullable Integer num5, @ColorInt @Nullable Integer num6) {
        this(pinPadType, num, num2, num3, str, num4, f6, num5, num6, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, -512, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4, @Nullable Float f6, @ColorInt @Nullable Integer num5, @ColorInt @Nullable Integer num6, @ColorInt @Nullable Integer num7) {
        this(pinPadType, num, num2, num3, str, num4, f6, num5, num6, num7, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, -1024, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4, @Nullable Float f6, @ColorInt @Nullable Integer num5, @ColorInt @Nullable Integer num6, @ColorInt @Nullable Integer num7, @ColorInt @Nullable Integer num8) {
        this(pinPadType, num, num2, num3, str, num4, f6, num5, num6, num7, num8, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, -2048, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4, @Nullable Float f6, @ColorInt @Nullable Integer num5, @ColorInt @Nullable Integer num6, @ColorInt @Nullable Integer num7, @ColorInt @Nullable Integer num8, @Nullable Float f10) {
        this(pinPadType, num, num2, num3, str, num4, f6, num5, num6, num7, num8, f10, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, -4096, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4, @Nullable Float f6, @ColorInt @Nullable Integer num5, @ColorInt @Nullable Integer num6, @ColorInt @Nullable Integer num7, @ColorInt @Nullable Integer num8, @Nullable Float f10, @ColorInt @Nullable Integer num9) {
        this(pinPadType, num, num2, num3, str, num4, f6, num5, num6, num7, num8, f10, num9, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, -8192, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4, @Nullable Float f6, @ColorInt @Nullable Integer num5, @ColorInt @Nullable Integer num6, @ColorInt @Nullable Integer num7, @ColorInt @Nullable Integer num8, @Nullable Float f10, @ColorInt @Nullable Integer num9, @ColorInt @Nullable Integer num10) {
        this(pinPadType, num, num2, num3, str, num4, f6, num5, num6, num7, num8, f10, num9, num10, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, -16384, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4, @Nullable Float f6, @ColorInt @Nullable Integer num5, @ColorInt @Nullable Integer num6, @ColorInt @Nullable Integer num7, @ColorInt @Nullable Integer num8, @Nullable Float f10, @ColorInt @Nullable Integer num9, @ColorInt @Nullable Integer num10, @Nullable Float f11) {
        this(pinPadType, num, num2, num3, str, num4, f6, num5, num6, num7, num8, f10, num9, num10, f11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, -32768, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4, @Nullable Float f6, @ColorInt @Nullable Integer num5, @ColorInt @Nullable Integer num6, @ColorInt @Nullable Integer num7, @ColorInt @Nullable Integer num8, @Nullable Float f10, @ColorInt @Nullable Integer num9, @ColorInt @Nullable Integer num10, @Nullable Float f11, @ColorInt @Nullable Integer num11) {
        this(pinPadType, num, num2, num3, str, num4, f6, num5, num6, num7, num8, f10, num9, num10, f11, num11, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, SupportMenu.CATEGORY_MASK, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4, @Nullable Float f6, @ColorInt @Nullable Integer num5, @ColorInt @Nullable Integer num6, @ColorInt @Nullable Integer num7, @ColorInt @Nullable Integer num8, @Nullable Float f10, @ColorInt @Nullable Integer num9, @ColorInt @Nullable Integer num10, @Nullable Float f11, @ColorInt @Nullable Integer num11, @ColorInt @Nullable Integer num12) {
        this(pinPadType, num, num2, num3, str, num4, f6, num5, num6, num7, num8, f10, num9, num10, f11, num11, num12, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, -131072, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4, @Nullable Float f6, @ColorInt @Nullable Integer num5, @ColorInt @Nullable Integer num6, @ColorInt @Nullable Integer num7, @ColorInt @Nullable Integer num8, @Nullable Float f10, @ColorInt @Nullable Integer num9, @ColorInt @Nullable Integer num10, @Nullable Float f11, @ColorInt @Nullable Integer num11, @ColorInt @Nullable Integer num12, @ColorInt @Nullable Integer num13) {
        this(pinPadType, num, num2, num3, str, num4, f6, num5, num6, num7, num8, f10, num9, num10, f11, num11, num12, num13, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, -262144, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4, @Nullable Float f6, @ColorInt @Nullable Integer num5, @ColorInt @Nullable Integer num6, @ColorInt @Nullable Integer num7, @ColorInt @Nullable Integer num8, @Nullable Float f10, @ColorInt @Nullable Integer num9, @ColorInt @Nullable Integer num10, @Nullable Float f11, @ColorInt @Nullable Integer num11, @ColorInt @Nullable Integer num12, @ColorInt @Nullable Integer num13, @Nullable Float f12) {
        this(pinPadType, num, num2, num3, str, num4, f6, num5, num6, num7, num8, f10, num9, num10, f11, num11, num12, num13, f12, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, -524288, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4, @Nullable Float f6, @ColorInt @Nullable Integer num5, @ColorInt @Nullable Integer num6, @ColorInt @Nullable Integer num7, @ColorInt @Nullable Integer num8, @Nullable Float f10, @ColorInt @Nullable Integer num9, @ColorInt @Nullable Integer num10, @Nullable Float f11, @ColorInt @Nullable Integer num11, @ColorInt @Nullable Integer num12, @ColorInt @Nullable Integer num13, @Nullable Float f12, @DrawableRes @Nullable Integer num14) {
        this(pinPadType, num, num2, num3, str, num4, f6, num5, num6, num7, num8, f10, num9, num10, f11, num11, num12, num13, f12, num14, null, null, null, null, null, null, null, null, null, null, null, false, null, null, -1048576, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4, @Nullable Float f6, @ColorInt @Nullable Integer num5, @ColorInt @Nullable Integer num6, @ColorInt @Nullable Integer num7, @ColorInt @Nullable Integer num8, @Nullable Float f10, @ColorInt @Nullable Integer num9, @ColorInt @Nullable Integer num10, @Nullable Float f11, @ColorInt @Nullable Integer num11, @ColorInt @Nullable Integer num12, @ColorInt @Nullable Integer num13, @Nullable Float f12, @DrawableRes @Nullable Integer num14, @Nullable String str2) {
        this(pinPadType, num, num2, num3, str, num4, f6, num5, num6, num7, num8, f10, num9, num10, f11, num11, num12, num13, f12, num14, str2, null, null, null, null, null, null, null, null, null, null, false, null, null, -2097152, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4, @Nullable Float f6, @ColorInt @Nullable Integer num5, @ColorInt @Nullable Integer num6, @ColorInt @Nullable Integer num7, @ColorInt @Nullable Integer num8, @Nullable Float f10, @ColorInt @Nullable Integer num9, @ColorInt @Nullable Integer num10, @Nullable Float f11, @ColorInt @Nullable Integer num11, @ColorInt @Nullable Integer num12, @ColorInt @Nullable Integer num13, @Nullable Float f12, @DrawableRes @Nullable Integer num14, @Nullable String str2, @DrawableRes @Nullable Integer num15) {
        this(pinPadType, num, num2, num3, str, num4, f6, num5, num6, num7, num8, f10, num9, num10, f11, num11, num12, num13, f12, num14, str2, num15, null, null, null, null, null, null, null, null, null, false, null, null, -4194304, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4, @Nullable Float f6, @ColorInt @Nullable Integer num5, @ColorInt @Nullable Integer num6, @ColorInt @Nullable Integer num7, @ColorInt @Nullable Integer num8, @Nullable Float f10, @ColorInt @Nullable Integer num9, @ColorInt @Nullable Integer num10, @Nullable Float f11, @ColorInt @Nullable Integer num11, @ColorInt @Nullable Integer num12, @ColorInt @Nullable Integer num13, @Nullable Float f12, @DrawableRes @Nullable Integer num14, @Nullable String str2, @DrawableRes @Nullable Integer num15, @Nullable String str3) {
        this(pinPadType, num, num2, num3, str, num4, f6, num5, num6, num7, num8, f10, num9, num10, f11, num11, num12, num13, f12, num14, str2, num15, str3, null, null, null, null, null, null, null, null, false, null, null, -8388608, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4, @Nullable Float f6, @ColorInt @Nullable Integer num5, @ColorInt @Nullable Integer num6, @ColorInt @Nullable Integer num7, @ColorInt @Nullable Integer num8, @Nullable Float f10, @ColorInt @Nullable Integer num9, @ColorInt @Nullable Integer num10, @Nullable Float f11, @ColorInt @Nullable Integer num11, @ColorInt @Nullable Integer num12, @ColorInt @Nullable Integer num13, @Nullable Float f12, @DrawableRes @Nullable Integer num14, @Nullable String str2, @DrawableRes @Nullable Integer num15, @Nullable String str3, @DrawableRes @Nullable Integer num16) {
        this(pinPadType, num, num2, num3, str, num4, f6, num5, num6, num7, num8, f10, num9, num10, f11, num11, num12, num13, f12, num14, str2, num15, str3, num16, null, null, null, null, null, null, null, false, null, null, ViewCompat.MEASURED_STATE_MASK, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4, @Nullable Float f6, @ColorInt @Nullable Integer num5, @ColorInt @Nullable Integer num6, @ColorInt @Nullable Integer num7, @ColorInt @Nullable Integer num8, @Nullable Float f10, @ColorInt @Nullable Integer num9, @ColorInt @Nullable Integer num10, @Nullable Float f11, @ColorInt @Nullable Integer num11, @ColorInt @Nullable Integer num12, @ColorInt @Nullable Integer num13, @Nullable Float f12, @DrawableRes @Nullable Integer num14, @Nullable String str2, @DrawableRes @Nullable Integer num15, @Nullable String str3, @DrawableRes @Nullable Integer num16, @Nullable String str4) {
        this(pinPadType, num, num2, num3, str, num4, f6, num5, num6, num7, num8, f10, num9, num10, f11, num11, num12, num13, f12, num14, str2, num15, str3, num16, str4, null, null, null, null, null, null, false, null, null, -33554432, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4, @Nullable Float f6, @ColorInt @Nullable Integer num5, @ColorInt @Nullable Integer num6, @ColorInt @Nullable Integer num7, @ColorInt @Nullable Integer num8, @Nullable Float f10, @ColorInt @Nullable Integer num9, @ColorInt @Nullable Integer num10, @Nullable Float f11, @ColorInt @Nullable Integer num11, @ColorInt @Nullable Integer num12, @ColorInt @Nullable Integer num13, @Nullable Float f12, @DrawableRes @Nullable Integer num14, @Nullable String str2, @DrawableRes @Nullable Integer num15, @Nullable String str3, @DrawableRes @Nullable Integer num16, @Nullable String str4, @ColorInt @Nullable Integer num17) {
        this(pinPadType, num, num2, num3, str, num4, f6, num5, num6, num7, num8, f10, num9, num10, f11, num11, num12, num13, f12, num14, str2, num15, str3, num16, str4, num17, null, null, null, null, null, false, null, null, -67108864, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4, @Nullable Float f6, @ColorInt @Nullable Integer num5, @ColorInt @Nullable Integer num6, @ColorInt @Nullable Integer num7, @ColorInt @Nullable Integer num8, @Nullable Float f10, @ColorInt @Nullable Integer num9, @ColorInt @Nullable Integer num10, @Nullable Float f11, @ColorInt @Nullable Integer num11, @ColorInt @Nullable Integer num12, @ColorInt @Nullable Integer num13, @Nullable Float f12, @DrawableRes @Nullable Integer num14, @Nullable String str2, @DrawableRes @Nullable Integer num15, @Nullable String str3, @DrawableRes @Nullable Integer num16, @Nullable String str4, @ColorInt @Nullable Integer num17, @ColorInt @Nullable Integer num18) {
        this(pinPadType, num, num2, num3, str, num4, f6, num5, num6, num7, num8, f10, num9, num10, f11, num11, num12, num13, f12, num14, str2, num15, str3, num16, str4, num17, num18, null, null, null, null, false, null, null, -134217728, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4, @Nullable Float f6, @ColorInt @Nullable Integer num5, @ColorInt @Nullable Integer num6, @ColorInt @Nullable Integer num7, @ColorInt @Nullable Integer num8, @Nullable Float f10, @ColorInt @Nullable Integer num9, @ColorInt @Nullable Integer num10, @Nullable Float f11, @ColorInt @Nullable Integer num11, @ColorInt @Nullable Integer num12, @ColorInt @Nullable Integer num13, @Nullable Float f12, @DrawableRes @Nullable Integer num14, @Nullable String str2, @DrawableRes @Nullable Integer num15, @Nullable String str3, @DrawableRes @Nullable Integer num16, @Nullable String str4, @ColorInt @Nullable Integer num17, @ColorInt @Nullable Integer num18, @Nullable Float f13) {
        this(pinPadType, num, num2, num3, str, num4, f6, num5, num6, num7, num8, f10, num9, num10, f11, num11, num12, num13, f12, num14, str2, num15, str3, num16, str4, num17, num18, f13, null, null, null, false, null, null, -268435456, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4, @Nullable Float f6, @ColorInt @Nullable Integer num5, @ColorInt @Nullable Integer num6, @ColorInt @Nullable Integer num7, @ColorInt @Nullable Integer num8, @Nullable Float f10, @ColorInt @Nullable Integer num9, @ColorInt @Nullable Integer num10, @Nullable Float f11, @ColorInt @Nullable Integer num11, @ColorInt @Nullable Integer num12, @ColorInt @Nullable Integer num13, @Nullable Float f12, @DrawableRes @Nullable Integer num14, @Nullable String str2, @DrawableRes @Nullable Integer num15, @Nullable String str3, @DrawableRes @Nullable Integer num16, @Nullable String str4, @ColorInt @Nullable Integer num17, @ColorInt @Nullable Integer num18, @Nullable Float f13, @Nullable Integer num19) {
        this(pinPadType, num, num2, num3, str, num4, f6, num5, num6, num7, num8, f10, num9, num10, f11, num11, num12, num13, f12, num14, str2, num15, str3, num16, str4, num17, num18, f13, num19, null, null, false, null, null, -536870912, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4, @Nullable Float f6, @ColorInt @Nullable Integer num5, @ColorInt @Nullable Integer num6, @ColorInt @Nullable Integer num7, @ColorInt @Nullable Integer num8, @Nullable Float f10, @ColorInt @Nullable Integer num9, @ColorInt @Nullable Integer num10, @Nullable Float f11, @ColorInt @Nullable Integer num11, @ColorInt @Nullable Integer num12, @ColorInt @Nullable Integer num13, @Nullable Float f12, @DrawableRes @Nullable Integer num14, @Nullable String str2, @DrawableRes @Nullable Integer num15, @Nullable String str3, @DrawableRes @Nullable Integer num16, @Nullable String str4, @ColorInt @Nullable Integer num17, @ColorInt @Nullable Integer num18, @Nullable Float f13, @Nullable Integer num19, @Nullable String str5) {
        this(pinPadType, num, num2, num3, str, num4, f6, num5, num6, num7, num8, f10, num9, num10, f11, num11, num12, num13, f12, num14, str2, num15, str3, num16, str4, num17, num18, f13, num19, str5, null, false, null, null, -1073741824, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4, @Nullable Float f6, @ColorInt @Nullable Integer num5, @ColorInt @Nullable Integer num6, @ColorInt @Nullable Integer num7, @ColorInt @Nullable Integer num8, @Nullable Float f10, @ColorInt @Nullable Integer num9, @ColorInt @Nullable Integer num10, @Nullable Float f11, @ColorInt @Nullable Integer num11, @ColorInt @Nullable Integer num12, @ColorInt @Nullable Integer num13, @Nullable Float f12, @DrawableRes @Nullable Integer num14, @Nullable String str2, @DrawableRes @Nullable Integer num15, @Nullable String str3, @DrawableRes @Nullable Integer num16, @Nullable String str4, @ColorInt @Nullable Integer num17, @ColorInt @Nullable Integer num18, @Nullable Float f13, @Nullable Integer num19, @Nullable String str5, @ColorInt @Nullable Integer num20) {
        this(pinPadType, num, num2, num3, str, num4, f6, num5, num6, num7, num8, f10, num9, num10, f11, num11, num12, num13, f12, num14, str2, num15, str3, num16, str4, num17, num18, f13, num19, str5, num20, false, null, null, Integer.MIN_VALUE, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4, @Nullable Float f6, @ColorInt @Nullable Integer num5, @ColorInt @Nullable Integer num6, @ColorInt @Nullable Integer num7, @ColorInt @Nullable Integer num8, @Nullable Float f10, @ColorInt @Nullable Integer num9, @ColorInt @Nullable Integer num10, @Nullable Float f11, @ColorInt @Nullable Integer num11, @ColorInt @Nullable Integer num12, @ColorInt @Nullable Integer num13, @Nullable Float f12, @DrawableRes @Nullable Integer num14, @Nullable String str2, @DrawableRes @Nullable Integer num15, @Nullable String str3, @DrawableRes @Nullable Integer num16, @Nullable String str4, @ColorInt @Nullable Integer num17, @ColorInt @Nullable Integer num18, @Nullable Float f13, @Nullable Integer num19, @Nullable String str5, @ColorInt @Nullable Integer num20, boolean z10) {
        this(pinPadType, num, num2, num3, str, num4, f6, num5, num6, num7, num8, f10, num9, num10, f11, num11, num12, num13, f12, num14, str2, num15, str3, num16, str4, num17, num18, f13, num19, str5, num20, z10, null, null, 0, 3, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PinPadConfiguration(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4, @Nullable Float f6, @ColorInt @Nullable Integer num5, @ColorInt @Nullable Integer num6, @ColorInt @Nullable Integer num7, @ColorInt @Nullable Integer num8, @Nullable Float f10, @ColorInt @Nullable Integer num9, @ColorInt @Nullable Integer num10, @Nullable Float f11, @ColorInt @Nullable Integer num11, @ColorInt @Nullable Integer num12, @ColorInt @Nullable Integer num13, @Nullable Float f12, @DrawableRes @Nullable Integer num14, @Nullable String str2, @DrawableRes @Nullable Integer num15, @Nullable String str3, @DrawableRes @Nullable Integer num16, @Nullable String str4, @ColorInt @Nullable Integer num17, @ColorInt @Nullable Integer num18, @Nullable Float f13, @Nullable Integer num19, @Nullable String str5, @ColorInt @Nullable Integer num20, boolean z10, @Nullable String str6) {
        this(pinPadType, num, num2, num3, str, num4, f6, num5, num6, num7, num8, f10, num9, num10, f11, num11, num12, num13, f12, num14, str2, num15, str3, num16, str4, num17, num18, f13, num19, str5, num20, z10, str6, null, 0, 2, null);
        Intrinsics.checkNotNullParameter(pinPadType, "");
    }
}
