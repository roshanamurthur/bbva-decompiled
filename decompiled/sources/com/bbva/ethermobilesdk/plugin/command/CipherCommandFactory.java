package com.bbva.ethermobilesdk.plugin.command;

import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.ethermobilesdk.plugin.command.factory.Base64ToHexCommand;
import com.bbva.ethermobilesdk.plugin.command.factory.HexToBase64Command;
import com.bbva.ethermobilesdk.plugin.command.factory.RSAKeyPairCommand;
import com.bbva.ethermobilesdk.plugin.command.hash.HashCommand;
import com.bbva.ethermobilesdk.plugin.command.hmac.HmacCommand;
import com.bbva.ethermobilesdk.plugin.command.jwe.JweDecryptCommand;
import com.bbva.ethermobilesdk.plugin.command.jwe.JweEncryptCommand;
import com.bbva.ethermobilesdk.plugin.command.jwe.JweRSAKeyPairCommand;
import com.bbva.ethermobilesdk.plugin.command.pincipher.PinCipherDecryptCommand;
import com.bbva.ethermobilesdk.plugin.command.pincipher.PinCipherEncryptCommand;
import com.bbva.ethermobilesdk.plugin.command.pincipher.PinCipherEncryptFromConfigCommand;
import com.bbva.ethermobilesdk.plugin.command.pincipher.PinCipherGenerateKeyPairCommand;
import com.bbva.ethermobilesdk.plugin.command.rsa.RsaDecryptCommand;
import com.bbva.ethermobilesdk.plugin.command.rsa.RsaEncryptCommand;
import com.bbva.ethermobilesdk.plugin.command.symmetric.SymmetricKeyCommand;
import kotlin.Metadata;
import z6.a;
import z6.b;
import z6.c;
import z6.d;
import z6.e;
import z6.f;
import z6.g;
import z6.l;
import z6.o;
import z6.p;
import z6.q;
import z6.r;
import z6.s;
import z6.t;
import z6.u;
import z6.v;

/* JADX INFO: compiled from: CipherCommandFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/command/CipherCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "()V", "cipher-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CipherCommandFactory extends CommandFactory {
    public CipherCommandFactory() {
        int i10 = 2;
        addCommandProvider(PinCipherGenerateKeyPairCommand.ID, new a(i10));
        int i11 = 1;
        addCommandProvider(PinCipherEncryptFromConfigCommand.ID, new v(1));
        addCommandProvider(PinCipherEncryptCommand.ID, new b(1));
        addCommandProvider(PinCipherDecryptCommand.ID, new q6.a(2));
        addCommandProvider(RsaEncryptCommand.ID, new q6.b(2));
        addCommandProvider(RsaDecryptCommand.ID, new c(i11));
        addCommandProvider(RSAKeyPairCommand.ID, new d(i11));
        addCommandProvider(SymmetricKeyCommand.ID, new e(i11));
        addCommandProvider("encrypt", new f(1));
        addCommandProvider("decrypt", new g(1));
        addCommandProvider(HashCommand.ID, new l(i10));
        addCommandProvider(HmacCommand.ID, new o(i10));
        addCommandProvider("salt", new p(i10));
        addCommandProvider(Base64ToHexCommand.ID, new q(i11));
        addCommandProvider(HexToBase64Command.ID, new r(i11));
        addCommandProvider(JweRSAKeyPairCommand.ID, new s(i11));
        addCommandProvider(JweDecryptCommand.ID, new t(i11));
        addCommandProvider(JweEncryptCommand.ID, new u(1));
    }
}
