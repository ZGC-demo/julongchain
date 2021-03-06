/*
 * Copyright Dingxuan. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

		 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package org.bcia.julongchain.core.common.smartcontractprovider;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 签名的智能合约数据
 *
 * @author sunzongyu
 * @date 2018/05/09
 * @company Dingxuan
 */
public class SignedSDSData implements Serializable {
    private byte[] codeHash = new byte[0];
    private byte[] metaDataHash = new byte[0];
    private byte[] signatureHash = new byte[0];

    @Override
    public boolean equals(Object obj) {
        return obj instanceof SignedSDSData &&
                Arrays.equals(this.codeHash, ((SignedSDSData) obj).getCodeHash()) &&
                Arrays.equals(this.metaDataHash, ((SignedSDSData) obj).getMetaDataHash()) &&
                Arrays.equals(this.signatureHash, ((SignedSDSData) obj).getSignatureHash());
    }

    public byte[] getCodeHash() {
        return codeHash;
    }

    public void setCodeHash(byte[] codeHash) {
        this.codeHash = codeHash;
    }

    public byte[] getMetaDataHash() {
        return metaDataHash;
    }

    public void setMetaDataHash(byte[] metaDataHash) {
        this.metaDataHash = metaDataHash;
    }

    public byte[] getSignatureHash() {
        return signatureHash;
    }

    public void setSignatureHash(byte[] signatureHash) {
        this.signatureHash = signatureHash;
    }
}
